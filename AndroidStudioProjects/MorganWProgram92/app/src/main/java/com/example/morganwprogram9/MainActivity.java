package com.example.morganwprogram9;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    private FirebaseAuth mAuth;
    private EditText emailET, passwordET;
    private Button loginBTN, registerBTN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginBTN = findViewById(R.id.LoginBTN);
        registerBTN = findViewById(R.id.RegisterBTN);

        mAuth = FirebaseAuth.getInstance();

        registerBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                registerUser();
            }
        });

        loginBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginUser();
            }
        });


    }

    public void registerUser() {
        String email = emailET.getText().toString();
        String password = passwordET.getText().toString();

        mAuth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(MainActivity.this, task -> {
                if(task.isSuccessful()) {
                    Toast.makeText(MainActivity.this, "Registration Successful", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "Registration Failed", Toast.LENGTH_SHORT).show();
                }
        });
    }

    public void loginUser() {
        String email = emailET.getText().toString();
        String password = passwordET.getText().toString();

        mAuth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(MainActivity.this, task -> {
                if(task.isSuccessful()) {
                    Toast.makeText(MainActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(MainActivity.this, NoteActivity.class));
                }
                else {
                    Toast.makeText(MainActivity.this, "Login Failed", Toast.LENGTH_SHORT).show();
                }
        });
    }
}