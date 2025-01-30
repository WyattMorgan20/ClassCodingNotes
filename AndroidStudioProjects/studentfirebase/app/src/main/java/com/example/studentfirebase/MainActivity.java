package com.example.studentfirebase;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {
    FirebaseDatabase database;
    DatabaseReference studentEndPoint;

    DatabaseReference dbroot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addBTN = findViewById(R.id.addBTN);
        addBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Thread addThread = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        database = FirebaseDatabase.getInstance();
                        dbroot = database.getReference();
                        EditText firstNameET = findViewById(R.id.firstNameET);
                        String firstName = firstNameET.getText().toString();
                        EditText lastNameET = findViewById(R.id.lastNameET);
                        String lastName = lastNameET.getText().toString();
                        EditText genderET = findViewById(R.id.genderET);
                        String gender = genderET.getText().toString();
                        studentEndPoint = dbroot.child("students");
                        Log.d("FB instance", "Database instance is created");
                        // Add a student to a firebase
                        Student s = new Student( firstName,lastName, gender);
                        studentEndPoint.push().setValue(s);
                    }
                });
            }
        });

        Button deleteBTN = findViewById(R.id.deleteBTN);
        deleteBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Thread updateThread = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        database = FirebaseDatabase.getInstance();
                        dbroot = database.getReference();
                        studentEndPoint = dbroot.child("students");
                        EditText firstNameET = findViewById(R.id.firstNameET);
                        String firstName = firstNameET.getText().toString();
                        Log.d("FB instance", "Database instance is created");
                        //Update on Firebase
                        Query updateQ = studentEndPoint.orderByChild("firstName").equalTo(firstName);
                        updateQ.addListenerForSingleValueEvent(new ValueEventListener() {
                            @Override
                            public void onDataChange(@NonNull DataSnapshot snapshot) {
                                for(DataSnapshot s: snapshot.getChildren()){
                                    DataSnapshot firstName = s.child("firstName");
                                    firstName.getRef().setValue("Shyam");
                                }
                            }

                            @Override
                            public void onCancelled(@NonNull DatabaseError error) {

                            }
                        });
                    }
                });
            }
        });




        Button updateBTN = findViewById(R.id.updateBTN);
        updateBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Thread removeThread = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        database = FirebaseDatabase.getInstance();
                        dbroot = database.getReference();
                        EditText firstNameET = findViewById(R.id.firstNameET);
                        EditText lastNameET = findViewById(R.id.lastNameET);
                        String firstName = firstNameET.getText().toString();
                        String lastName = lastNameET.getText().toString();
                        studentEndPoint = dbroot.child("students");
                        Log.d("FB instance", "Database instance is created");
                        Log.d("FB add", "A student is added");
                        // Delete a student from a firebase
                        Query removeQ = studentEndPoint.orderByChild("firstName").equalTo(firstName);
                        removeQ.addListenerForSingleValueEvent(new ValueEventListener() {
                            @Override
                            public void onDataChange(@NonNull DataSnapshot snapshot) {
                                for(DataSnapshot s : snapshot.getChildren()){
                                    DataSnapshot firstName = s.child("lastName");
                                    lastName.getRef().setValue(lastName);
                                }
                            }

                            @Override
                            public void onCancelled(@NonNull DatabaseError error) {

                            }
                        });
                    }
                });
            }
        });

        Log.d("FB delete", "All the data are deleted");

        Button displayBTN = findViewById(R.id.displayBTN);
        displayBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                database = FirebaseDatabase.getInstance();
                dbroot = database.getReference();
                studentEndPoint = dbroot.child("students");
                Query displayQ = studentEndPoint.orderByChild("firstName");
                TextView displayTV = findViewById(R.id.displayTV);

                displayQ.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        String textData = "";
                        for (DataSnapshot data: snapshot.getChildren()){
                            DataSnapshot firstName = data.child("firstName");
                            DataSnapshot lastName = data.child("lastName");
                            DataSnapshot gender = data.child("gender");
                            textData += firstName.getValue() + ","
                                    + lastName.getValue() + "," + gender.getValue() + "\n";
                        }
                        displayTV.setText(textData);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
            }
        });

        Log.d("FB update", "A student data is updated");
        // Read data from databases
        Query displayQ = studentEndPoint.orderByChild("firstName");
        displayQ.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String data = "";
                for(DataSnapshot s: snapshot.getChildren()){
                    DataSnapshot firstName = s.child("firstName");
                    DataSnapshot lastName = s.child("lastName");
                    DataSnapshot gender = s.child("gender");
                    data += firstName.getValue() + " " + lastName.getValue() + " " + gender.getValue() + "\n";
                }
                Log.d("FB display", data);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }
}