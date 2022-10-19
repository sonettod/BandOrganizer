package com.example.bandorganizer.viewmodels;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.bandorganizer.models.Song;
import com.example.bandorganizer.repositories.SongDatabase;
import com.example.bandorganizer.tools.SongDao;

import java.io.Closeable;
import java.util.List;

public class RepertoriumActivityViewModel extends ViewModel {

    //Liste von Songs als MutableLiveData
    private MutableLiveData<List<Song>> mSongs;

    public LiveData<List<Song>> getSongs(){
        return mSongs;
    }

    public RepertoriumActivityViewModel(@NonNull Application application){
        super((Closeable) application);

        mSongs = (MutableLiveData<List<Song>>) SongDatabase
                .getInstance(application.getApplicationContext())
                .songDao()
                .getSongList();
    }
}
