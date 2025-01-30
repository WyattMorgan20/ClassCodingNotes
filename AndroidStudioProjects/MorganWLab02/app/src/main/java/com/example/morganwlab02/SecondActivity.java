package com.example.morganwlab02;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView nameTV = (TextView)findViewById(R.id.NameTV);
        TextView emailTV = (TextView)findViewById(R.id.EmailTV);

        Intent ini = getIntent();
        String name = ini.getStringExtra("Name: ");
        String email = ini.getStringExtra("Email: ");

        nameTV.setText(name);
        emailTV.setText(email);
    }

    public void onClickEditBTN(View v){
        Intent ini = new Intent(this, MainActivity.class);
        startActivity(ini);
    }
}
