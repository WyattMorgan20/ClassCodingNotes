package com.example.acttofragment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements MsgFragment.IMessage{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    onCreate(){

    }

    public void updateText(String firstName, String lastName){
        firstTV.setText(firstName);
        lastTV.setText(lastName);
    }

    public void fragSendBTN(View view){

    }

    @Override
    public void message(String firstName, String lastName){
        TextView firstNameTV = findViewById(R.id.fragFirstNameTV);
        TextView lastNameTV = findViewById(R.id.fragFirstNameTV);
        firstNameTV.setText(firstName);
        lastNameTV.setText(lastName);
    }

}