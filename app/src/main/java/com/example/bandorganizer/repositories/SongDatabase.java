package com.example.bandorganizer.repositories;


import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

import com.example.bandorganizer.models.Song;
import com.example.bandorganizer.models.User;
import com.example.bandorganizer.tools.Converters;
import com.example.bandorganizer.tools.SongDao;
import com.example.bandorganizer.tools.UserDao;

@Database(entities = Song.class, exportSchema = false, version = 1)
@TypeConverters({Converters.class})
public abstract class SongDatabase extends RoomDatabase {
    private static final String DB_NAME = "dbSong";
    private static SongDatabase instance;

    public static synchronized SongDatabase getInstance(Context context){
        if (instance == null){
            instance = Room.databaseBuilder(
                    context.getApplicationContext(), SongDatabase.class,DB_NAME)
                    .fallbackToDestructiveMigration()
                    .build();
        }
        return instance;
    }
    public abstract SongDao songDao();
}
