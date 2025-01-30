package com.example.morganwprogram5;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;

public class DeadViewModel extends ViewModel {
    private MutableLiveData<Integer> rac = new MutableLiveData<>();
    private LiveData<String> racoonText = Transformations.map(rac, input -> "Dead Racoons: " + input);
    private MutableLiveData<Integer> op = new MutableLiveData<>();
    private LiveData<String> opossumText = Transformations.map(op, input -> "Dead Opossums: " + input);;
    private MutableLiveData<Integer> others = new MutableLiveData<>();
    private LiveData<String> otherText = Transformations.map(others, input -> "Dead Others: " + input);;

    public void initialize(){
        rac.setValue(0);
        op.setValue(0);
        others.setValue(0);
    }
    public void racIncrease(){
        rac.setValue(rac.getValue() + 1);
    }

    public void opIncrease(){
        op.setValue(op.getValue() + 1);
    }

    public void otherIncrease(){
        others.setValue(others.getValue() + 1);
    }

}
