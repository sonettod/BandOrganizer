package com.example.bandorganizer.repositories;


import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

import com.example.bandorganizer.models.User;
import com.example.bandorganizer.tools.Converters;
import com.example.bandorganizer.tools.UserDao;

@Database(entities = User.class, exportSchema = false, version = 1)
@TypeConverters({Converters.class})
public abstract class UserDatabase extends RoomDatabase {
    private static final String DB_NAME = "dbUser";
    private static UserDatabase instance;

    public static synchronized UserDatabase getInstance(Context context){
        if (instance == null){
            instance = Room.databaseBuilder(context.getApplicationContext(), UserDatabase.class,DB_NAME)
                    .fallbackToDestructiveMigration()
                    .build();
        }
        return instance;
    }
    public abstract UserDao userDao();
}
