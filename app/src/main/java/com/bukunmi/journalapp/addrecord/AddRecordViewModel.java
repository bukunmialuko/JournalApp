package com.bukunmi.journalapp.addrecord;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import com.bukunmi.journalapp.data.AppDatabase;
import com.bukunmi.journalapp.data.RecordEntry;

public class AddRecordViewModel  extends ViewModel{

    private LiveData<RecordEntry> record;

    public AddRecordViewModel(AppDatabase database, int recordId) {
        record = database.recordDao().loadRecordById(recordId);
    }

    public LiveData<RecordEntry> getRecord() {
        return record;
    }
}
