package com.bukunmi.journalapp.addrecord;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;

import com.bukunmi.journalapp.data.AppDatabase;

public class AddRecordViewModelFactory extends ViewModelProvider.NewInstanceFactory {

    private final AppDatabase mDb;
    private final int mTaskId;

    public AddRecordViewModelFactory(AppDatabase mDb, int mTaskId) {
        this.mDb = mDb;
        this.mTaskId = mTaskId;
    }


    @Override
    public <T extends ViewModel> T create(Class<T> modelClass) {

        return (T) new AddRecordViewModel(mDb, mTaskId);
    }
}
