package com.example.activitystack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class B extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        final int duration = 4;
        Toast.makeText(getApplicationContext(), "Previous activity was Main", Toast.LENGTH_LONG).show();
    }

    public void onClickCBTN(View v){
        Intent ini = new Intent(this, C.class);
        startActivity(ini);
    }
}