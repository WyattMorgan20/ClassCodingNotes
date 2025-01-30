package com.example.explicitintents;

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
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ActivityResultLauncher<Intent> mStartForResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button sendBTN = findViewById(R.id.sendBTN);
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
                            Log.d("result", String.format("Result is %d",mresult));
                            // Handle the Intent
                        }
                    }
                });
    }
    /*
    public void sendOnClick(View view){
        Intent intent = new Intent(this, Second_Activity.class);
        EditText editText = findViewById(R.id.message);
        String text = editText.getText().toString();
        intent.putExtra("msg", text);
        //startActivity(intent);
        mStartForResult.launch(intent);

    }
*/

/*
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 1) {
            if(resultCode == Activity.RESULT_OK){
                String result=data.getStringExtra("result");
            }
            if (resultCode == Activity.RESULT_CANCELED) {
                // Write your code if there's no result
            }
        }
    } //onActivityResult
    */

}