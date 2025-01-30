package com.example.thevault;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {

    private MutableLiveData<Integer> storageMax = new MutableLiveData<>();
    private MutableLiveData<Integer> storageMin = new MutableLiveData<>();
    private MutableLiveData<Integer> currentStorage = new MutableLiveData<>();
    private LiveData<String> reportStorageMax = Transformations.map(storageMax, input -> "Maximum bottles: " + input);
    private LiveData<String> reportstorageMin = Transformations.map(storageMin, input -> "Minimum bottles: " + input);
    private LiveData<String> reportCurrentStorage = Transformations.map(currentStorage, input -> "Current Number: " + input);

    public void changeMax(int newMax){
        if(newMax == 0){
            storageMax.setValue(newMax);
        }
        else if(newMax > storageMax.getValue()){
            storageMax.setValue(newMax);
        }

    }

    public void changeMin(int newMin){
        if(newMin == 0 && newMin < storageMax.getValue()){
            storageMin.setValue(newMin);
        }
        else if(newMin < storageMin.getValue()){
            storageMin.setValue(newMin);
        }
    }

    public void reset(){
        storageMin.setValue(0);
        storageMax.setValue(5);
        currentStorage.setValue(0);
    }

    public Boolean increment(){
        currentStorage.setValue(currentStorage.getValue() + 1);;
        if(storageMax.getValue() < currentStorage.getValue()){
            return true;
        }
        else if(storageMin.getValue() > currentStorage.getValue()){
            return true;
        }
        else{
            return false;
        }
    }

    public void decrement(){
        currentStorage.setValue(currentStorage.getValue() - 1);;
    }




}