package com.example.explicitintent;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private ActivityResultLauncher<Intent> mStartForResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("Main Activity", "onCreate function is called");
        setContentView(R.layout.activity_main);

        Button sendBTN = findViewById(R.id.button);
        sendBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Second_Activity.class);
                EditText editText = findViewById(R.id.message);
                String text = editText.getText().toString();
                intent.putExtra("msg", text);
                //startActivity(intent);
                mStartForResult.launch(intent);
            }
        });

        mStartForResult
                = registerForActivityResult(
                new ActivityResultContracts.StartActivityForResult(),
                new ActivityResultCallback<ActivityResult>() {
                    @Override
                    public void onActivityResult(ActivityResult result) {
                        if (result.getResultCode() == Activity.RESULT_OK) {
                            Intent intent = result.getData();
                            int mresult = intent.getIntExtra("result",-1);
                            Log.d("result", String.format("Result is %d", mresult));
                        }
                    }
                });
    }

    @Override
    public void onStart(){
        super.onStart();
        Log.d("Main Activity", "onStart function is called");
    }

    @Override
    public void onResume(){
        super.onResume();
        Log.d("Main Activity", "onResume function is called");
    }

    @Override
    public void onPause(){
        super.onPause();
        Log.d("Main Activity", "onPause is called");
    }

    @Override
    public void onStop(){
        super.onStop();
        Log.d("Main Activty", "onStop is called");
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.d("Main Activity", "onDestroy is called");
    }



}