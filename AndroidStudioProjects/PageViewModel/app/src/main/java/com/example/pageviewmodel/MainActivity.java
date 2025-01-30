package com.example.pageviewmodel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    PageViewModel pvm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewModelProvider.Factory vmf = new ViewModelProvider.NewInstanceFactory();
        ViewModelProvider vmp = new ViewModelProvider(this, vmf);
        pvm = vmp.get(PageViewModel.class);

        Button incBTN =  findViewById(R.id.incBTN);
        incBTN.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                TextView numTV = findViewById(R.id.numTV);
                int val = Integer.valueOf(numTV.getText().toString());
                pvm.setIndex(val + 1);
            }
        });

        pvm.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                TextView numTV = findViewById(R.id.numTV);
                numTV.setText(s);
            }
        });
    }
}