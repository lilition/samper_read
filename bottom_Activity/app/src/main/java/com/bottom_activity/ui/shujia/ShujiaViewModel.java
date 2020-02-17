package com.bottom_activity.ui.shujia;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ShujiaViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ShujiaViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is shujia fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}