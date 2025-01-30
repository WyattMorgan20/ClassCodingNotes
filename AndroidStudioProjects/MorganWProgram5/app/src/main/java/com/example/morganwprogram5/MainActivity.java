package com.example.morganwprogram5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private MainViewModel MainViewModel;
    private DeadViewModel DeadViewModel;
    private TextView titleTV, liveTV, deadTV;
    private Button liveBTN, deadBTN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MainViewModel = MainViewModel;

        titleTV = findViewById(R.id.titleTV);
        liveTV = findViewById(R.id.liveTV);
        deadTV = findViewById(R.id.deadTV);
        liveBTN = findViewById(R.id.liveBTN);
        deadBTN = findViewById(R.id.deadBTN);

        liveBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, new LivingAnimalFragment()).commit();
            }
        });

        deadBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, new DeadAnimalFragment()).commit();
            }
        });

        if (savedInstanceState == null){
            getSupportFragmentManager().beginTransaction().add(R.id.fragmentContainer, new LivingAnimalFragment()).commit();
        }



    }




}