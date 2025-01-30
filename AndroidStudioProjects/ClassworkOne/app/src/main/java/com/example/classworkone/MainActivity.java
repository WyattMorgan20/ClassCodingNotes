package com.example.classworkone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addBEvent(View v){
        EditText textET = findViewById(R.id.textET);
        String text = textET.getText().toString();
        text = text + "B";
        textET.setText(text);
    }

    public void reducecEvent(View v){
        EditText textET = findViewById(R.id.textET);
        String text = textET.getText().toString();
        text = text.substring(1, text.length()-1);
        textET.setText(text);

    }
}