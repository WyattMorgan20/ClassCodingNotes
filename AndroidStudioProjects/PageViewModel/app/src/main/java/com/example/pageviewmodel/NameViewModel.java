package com.example.pageviewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;

import java.util.function.Function;

import kotlin.jvm.functions.Function1;

public class NameViewModel extends ViewModel {
    private MutableLiveData<String> name = new MutableLiveData<>();
    private LiveData<String> lName = Transformations.map(mName, new Function1<Object, String>()){

    }

    public void setmName(String name){
        mName.setValue(name);
    }

    public LiveData<String> getlName(){
        return lName;
    }
}
