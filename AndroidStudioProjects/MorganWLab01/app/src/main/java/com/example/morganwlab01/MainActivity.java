package com.example.morganwlab01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button calculateBTN;
    Button clearBTN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calculateBTN = findViewById(R.id.calculateBTN);
        clearBTN = findViewById(R.id.clearBTN);
        calculateBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateBMI();
            }
        });

        clearBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
            }
        });

    }

    public void calculateBMI() {
        EditText WeightET = findViewById(R.id.WeightET);
        int weight = Integer.parseInt(WeightET.getText().toString());
        EditText HeightET = findViewById(R.id.HeightET);
        int height = Integer.parseInt(HeightET.getText().toString());
        float bmi = ((float) weight / ((float) height * height)) * 10000;
        TextView displayTV = findViewById(R.id.displayTV);
        TextView displayTV2 = findViewById(R.id.displayTV2);


        String weightClass;
        if(bmi < 18.5){
            weightClass = "Underweight";
        } else if (bmi > 18.5 && bmi < 25) {
            weightClass = "Normal";
        } else if (bmi > 25 && bmi < 30) {
            weightClass = "Overweight";
        }
        else{
            weightClass = "Obese";
        }
        displayTV.setText(String.valueOf(bmi));
        displayTV2.setText(weightClass);
    }

    public void clear(){
        EditText WeightET = findViewById(R.id.WeightET);
        WeightET.getText().clear();
        EditText HeightET = findViewById(R.id.HeightET);
        HeightET.getText().clear();
    }
}


