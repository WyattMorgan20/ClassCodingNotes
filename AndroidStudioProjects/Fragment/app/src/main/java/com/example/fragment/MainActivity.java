package com.example.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button CSBTN = findViewById(R.id.CSBTN);
        CSBTN.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                CS csfrag = CS.newInstance("name", "name");
                FragmentManager fragmgr = getSupportFragmentManager();
                FragmentTransaction fragtrans = fragmgr.beginTransaction();
                fragtrans.replace(R.id.fragmentContainerView5, csfrag).commit();
            }
        });

        Button ISBTN = findViewById(R.id.ISBTN);
        CSBTN.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                IS isfrag = IS.newInstance("name", "name");
                FragmentManager fragmgr = getSupportFragmentManager();
                FragmentTransaction fragtrans = fragmgr.beginTransaction();
                fragtrans.replace(R.id.fragmentContainerView5, isfrag).commit();
            }
        });

        Button daBTN = findViewById(R.id.DABTN);
        CSBTN.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                DA dafrag = DA.newInstance("name", "name");
                FragmentManager fragmgr = getSupportFragmentManager();
                FragmentTransaction fragtrans = fragmgr.beginTransaction();
                fragtrans.replace(R.id.fragmentContainerView5, dafrag).commit();
            }
        });
    }
}