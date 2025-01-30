package com.example.morganwprogram5;

import android.view.animation.Transformation;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {
    private MutableLiveData<Integer> living = new MutableLiveData<>();
    private LiveData<String> livingText = Transformations.map(living, input -> "Living Sightings: " + input);
    private MutableLiveData<Integer> dead = new MutableLiveData<>();
    private LiveData<String> deadText = Transformations.map(dead, input -> "Dead Sightings: " + input);

    public void initialize(){
        living.setValue(0);
        dead.setValue(0);
    }

    public void livingIncrease(){
        living.setValue(living.getValue() + 1);
    }

    public void deadIncrease(){
        living.setValue(living.getValue() + 1);
    }

}
