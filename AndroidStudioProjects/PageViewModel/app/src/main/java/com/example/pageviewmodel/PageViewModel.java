package com.example.pageviewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;

import java.util.function.Function;

import kotlin.jvm.functions.Function1;

public class PageViewModel extends ViewModel {
    private MutableLiveData<Integer> mIndex = new MutableLiveData<>();
    private LiveData<String> mText = (LiveData<String>) Transformations.map(mIndex, new Function<Integer, String>() {
        @Override
        public String invoke(Integer integer) {
            return integer.toString();
        }
    });

    public void setIndex(int index){
        mIndex.setValue(index);
    }

    public LiveData<String> getText(){
        return mText;
    }
}
