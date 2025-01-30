package com.example.planet;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //private ArrayList<String> data;
    PlanetAdapter planetServer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        planetServer = new PlanetAdapter();
        RecyclerView planetRV = findViewById(R.id.planetRV);
        planetRV.setAdapter(planetServer);
        LinearLayoutManager myManager = new LinearLayoutManager(this);
        planetRV.setLayoutManager(myManager);
        Button addBTN = findViewById(R.id.addBTN);
        addBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText nameET = findViewById(R.id.nameET);
                EditText distanceET = findViewById(R.id.distanceET);
                String name = nameET.getText().toString();
                int distance = Integer.parseInt(distanceET.getText().toString());
                Model.Planet p = new Model.Planet("Jupiter", 234244);
                Model.getModel().thePlanets.add(p);
                planetServer.notifyItemInserted(Model.getModel().thePlanets.size()-1);
            }
        });

        Button removeBTN = findViewById(R.id.removeBTN);
        removeBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText indexET = findViewById(R.id.indexET);
                int index = Integer.parseInt(indexET.getText().toString());
                try{
                    Model.getModel().thePlanets.remove(index);
                    planetServer.notifyItemRemoved(index);
                }
                catch(Exception e){
                    Toast.makeText(getApplicationContext(), "Enter pindex within range", Toast.LENGTH_LONG).show();
                }

            }
        });

        Button updateBTN = findViewById(R.id.updateBTN);
        updateBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText nameET = findViewById(R.id.nameET);
                EditText distanceET = findViewById(R.id.distanceET);
                String name = nameET.getText().toString();
                int distance = Integer.parseInt(distanceET.getText().toString());
                EditText indexET = findViewById(R.id.indexET);
                int index = Integer.parseInt(indexET.getText().toString());
                Model.getModel().thePlanets.set(index, new Model.Planet(name, distance));
                planetServer.notifyItemChanged(index);
            }
        });


    }
}