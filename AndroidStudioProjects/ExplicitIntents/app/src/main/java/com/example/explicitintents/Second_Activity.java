package com.example.explicitintents;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Second_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        //Bundle bundle = getIntent().getExtras();
        Intent ini = getIntent();
        String text = ini.getStringExtra("msg");
        //int x = ini.getIntExtra("x", 0);
        if(text == null)
            text = "Default";
        TextView textView = findViewById(R.id.displayTV);
        textView.setText(text);

        Button getBackBTN = findViewById(R.id.getBackBTN);
        getBackBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ini = new Intent();
                ini.putExtra("result", 10);
                setResult(Activity.RESULT_OK, ini);
                finish();
            }
        });

    }
}