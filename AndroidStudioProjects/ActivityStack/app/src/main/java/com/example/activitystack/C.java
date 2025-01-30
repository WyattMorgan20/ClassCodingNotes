package com.example.activitystack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class C extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);
    }

    public void onClickMBTN(View v){
        Intent ini = new Intent(this, MainActivity.class);
        ini.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(ini);
    }
}