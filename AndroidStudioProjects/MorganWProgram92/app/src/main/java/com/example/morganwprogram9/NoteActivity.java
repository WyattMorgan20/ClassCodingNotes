package com.example.morganwprogram9;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

public class NoteActivity extends AppCompatActivity {

    private DatabaseReference mDatabase;
    private EditText titleET, descriptionET, tagsET;

    private Button createBTN, retrieveBTN, updateBTN, deleteBTN, logoutBTN;

    private TextView displayTV;

    private FirebaseAuth mAuth;

    private FirebaseUser currentUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note);


        createBTN = findViewById(R.id.CreateBTN);
        retrieveBTN = findViewById(R.id.RetrieveBTN);
        updateBTN = findViewById(R.id.UpdateBTN);
        deleteBTN = findViewById(R.id.DeleteBTN);
        logoutBTN = findViewById(R.id.LogoutBTN);

        titleET = findViewById(R.id.TitleET);
        descriptionET = findViewById(R.id.DescriptionET);
        tagsET = findViewById(R.id.TagsET);
        displayTV = findViewById(R.id.DisplayTV);
        currentUser = mAuth.getCurrentUser();

        mDatabase = FirebaseDatabase.getInstance().getReference();
        mAuth = FirebaseAuth.getInstance();
        currentUser = mAuth.getCurrentUser();

        createBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    addNote(v);
                } catch (Exception e) {
                    Log.e("NoteActivity", "Error adding note", e);
                    Toast.makeText(NoteActivity.this, "Error Adding Note", Toast.LENGTH_SHORT).show();
                }
            }
        });

        retrieveBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    retrieveNotesByName(v);
                } catch (Exception e) {
                    Log.e("NoteActivity", "Error retrieving notes", e);
                    Toast.makeText(NoteActivity.this, "Error retrieving Notes", Toast.LENGTH_SHORT).show();
                }

            }
        });

        updateBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    updateNotes(v);
                } catch (Exception e) {
                    Log.e("NoteActivity", "Error updating notes", e);
                    Toast.makeText(NoteActivity.this, "Error updating Notes", Toast.LENGTH_SHORT).show();
                }

            }
        });

        deleteBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    deleteNotes(v);
                } catch (Exception e) {
                    Log.e("NoteActivity", "Error deleting notes", e);
                    Toast.makeText(NoteActivity.this, "Error deleting Notes", Toast.LENGTH_SHORT).show();
                }

            }
        });

        logoutBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    logOut(v);
                } catch (Exception e) {
                    Log.e("NoteActivity", "Error Logging Out", e);
                    Toast.makeText(NoteActivity.this, "Error Logging Out", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }

    public void addNote(View view){
                String title = titleET.getText().toString();
                String description = descriptionET.getText().toString();
                String tags = tagsET.getText().toString();
                
                if(title.isEmpty() || description.isEmpty()){
                    Toast.makeText(this, "Title and Description can't be empty", Toast.LENGTH_SHORT).show();
                }
                
                String email = currentUser.getEmail().replace(".com", "");
                String noteID = mDatabase.child("notes").child(email).push().getKey();
                Note note = new Note(title, description, tags);
         
        mDatabase.child("notes").child(email).child(noteID)
                .setValue(note).addOnSuccessListener(aVoid -> {
                    Toast.makeText(this, "Note added", Toast.LENGTH_SHORT).show();
                    titleET.setText("");
                    descriptionET.setText("");
                    tagsET.setText("");
                })
                .addOnFailureListener(e -> {
                    Toast.makeText(this, "Failed adding note", Toast.LENGTH_SHORT).show();
        });
    }

    public void retrieveNotesByName(View view){
        String email = currentUser.getEmail().replace(".com", "");
        mDatabase.child("notes").child(email).addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                displayTV.setText("");
                for (DataSnapshot noteSnapshot: snapshot.getChildren()){
                    Note note = noteSnapshot.getValue(Note.class);
                    String noteInfo = "Title: " + note.getTitle() + "\nDescription: " + note.getDescription() + "\nTags: " + note.getTags() + "\n\n";
                    displayTV.append(noteInfo);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(NoteActivity.this, "Error retrieving notes", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void updateNotes(View view) {
        String title = titleET.getText().toString();
        String description = descriptionET.getText().toString();

        if (title.isEmpty() || description.isEmpty()) {
            Toast.makeText(this, "Title and Description can't be empty", Toast.LENGTH_SHORT).show();
            return;
        }

        String email = currentUser.getEmail().replace(".com", "");
        Query query = mDatabase.child("notes").child(email).orderByChild("title").equalTo(title);
        query.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for (DataSnapshot noteSnapshot : snapshot.getChildren()) {
                    String noteKey = noteSnapshot.getKey();
                    mDatabase.child("notes").child(email).child(noteKey).child("description").setValue(description)
                            .addOnSuccessListener(aVoid -> Toast.makeText(NoteActivity.this, "Note updated", Toast.LENGTH_SHORT).show())
                            .addOnFailureListener(e -> Toast.makeText(NoteActivity.this, "Failed to update note", Toast.LENGTH_SHORT).show());
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(NoteActivity.this, "Error updating note", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void deleteNotes(View view) {
        String title = titleET.getText().toString();

        if (title.isEmpty()) {
            Toast.makeText(this, "Title can't be empty", Toast.LENGTH_SHORT).show();
            return;
        }

        String email = currentUser.getEmail().replace(".com", "");
        Query query = mDatabase.child("notes").child(email).orderByChild("title").equalTo(title);
        query.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for (DataSnapshot noteSnapshot : snapshot.getChildren()) {
                    String noteKey = noteSnapshot.getKey();
                    mDatabase.child("notes").child(email).child(noteKey).removeValue()
                            .addOnSuccessListener(aVoid -> Toast.makeText(NoteActivity.this, "Note deleted", Toast.LENGTH_SHORT).show())
                            .addOnFailureListener(e -> Toast.makeText(NoteActivity.this, "Failed to delete note", Toast.LENGTH_SHORT).show());
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(NoteActivity.this, "Error deleting note", Toast.LENGTH_SHORT).show();
            }
        });
    }


    public void logOut(View view){
        mAuth.signOut();
        Intent intent = new Intent(NoteActivity.this, MainActivity.class);
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }
}

