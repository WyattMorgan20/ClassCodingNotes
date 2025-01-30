package com.example.thevault;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class SettingsFragment extends Fragment {

    private Button changeMaxBTN, changeMinBTN;
    private TextView changeMaxET, changeMinET;
    private MainViewModel mViewModel;

    public static SettingsFragment newInstance() {
        return new SettingsFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_settings, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(MainViewModel.class);
        // TODO: Use the ViewModel
        changeMaxBTN = getView().findViewById(R.id.changeMax);
        changeMinBTN = getView().findViewById(R.id.changeMin);
        changeMaxET = getView().findViewById(R.id.changeMaxET);
        changeMinET = getView().findViewById(R.id.changeMinET);

        changeMaxBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mViewModel.changeMax(changeMaxET);
            }
        });

        changeMinBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mViewModel.changeMin(changeMinET);
            }
        });

    }

}