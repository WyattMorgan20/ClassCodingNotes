package com.example.studentroomdatabase;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;


public class AlertInfo extends DialogFragment {

    private String firstName;
    private String lastName;

    private AlertInfo alertI;

    public AlertInfo(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public void onAttach(Activtiy act){
        super.onAttach(act);
        alertI = (ResponseInterface) act;
    }

    public interface ResponseInterface{
        void response(boolean res);

    }

    public Dialog onCreateDialog(Bundle sis){
        super.onCreateDialog(sis);
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Confirm Your Profile Information");
        builder.setMessage("FirstName: " + firstName + "\n" + "LastName:" + lastName);
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                alertI.response(true);
            }
        });

        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                alertI.response(false);
            }
        });

        return builder.create();



    }
}
