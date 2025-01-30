package com.example.studentfirebase;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class LogIn extends AppCompatActivity {
    FirebaseAuth mAuth;

    EditText loginEmailET;

    EditText loginPassET;

    String email;

    String password;

    @Override
    protected void onStart(){
        super.onStart();
        FirebaseUser currentUser;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        loginEmailET = findViewById(R.id.emailET);
        loginPassET = findViewById(R.id.passET);

        //Instantiate auth
        mAuth = FirebaseAuth.getInstance();
        Button login = findViewById(R.id.loginBTN);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Try getting the text from the inputs
                email = loginEmailET.getText().toString();
                password = loginPassET.getText().toString();

                //Firebase magic code
                mAuth.signInWithEmailAndPassword(email, password). addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful())
                            Log.d("Okay", "Login successful");
                        else{
                            Log.d("Error", "Login unsuccessful");
                        }
                    }
                });
            }
        });
        Button logout = findViewById(R.id.registerBTN);
        logout.setOnClickListener(view -> {
            email = loginEmailET.getText().toString();
            password = loginPassET.getText().toString();
            mAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if(task.isSuccessful());
                }
            })
        });

    }
}