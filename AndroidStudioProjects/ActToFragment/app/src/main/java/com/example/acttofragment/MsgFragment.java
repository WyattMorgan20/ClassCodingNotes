package com.example.acttofragment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;

public class MsgFragment extends AppCompatActivity {

    IMessage myActivity;

    public interface IMessage{
        public void message(String firstName, String lastName);
    }

    public void onAttach(Context act){
        super.onAttach();
        myActivity = (IMessage) act;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_msg_fragment);
    }

    @Override
    public View onCreateView(LayoutInflater){

    }

    public void updateText(String firstName, String lastName){
        firstTV.setText(firstName);
        lastTV.setText(lastName);
    }

//    public void fragSendBTN(View view){
//        EditText firstNameET = getView().findViewByID(R.id.fragFirstNameET);
//        EditText lastNameET = getView().findViewById(R.id.fragLastNameET);
//        String firstName = firstNameET.getText().toString();
//        String lastName = lastNameET.getText().toString();
//        myActivity.message(firstName, lastName);
//    }
}