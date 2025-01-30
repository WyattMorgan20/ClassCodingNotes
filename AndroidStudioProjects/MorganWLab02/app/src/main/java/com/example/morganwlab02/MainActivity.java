package com.example.morganwlab02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText NameET = (EditText)findViewById(R.id.NameET);
        EditText EmailET = (EditText)findViewById(R.id.EmailET);
        Button saveBTN = findViewById(R.id.SaveBTN);

        saveBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = NameET.getText().toString();
                String email = EmailET.getText().toString();

                Intent ini = new Intent(MainActivity.this, SecondActivity.class);

                ini.putExtra("Name: ", name);
                ini.putExtra("Email: ", email);

                startActivity(ini);
            }
        });
    }
}