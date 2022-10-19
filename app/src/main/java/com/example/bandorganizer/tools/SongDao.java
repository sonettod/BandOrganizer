package com.example.bandorganizer.tools;



import androidx.room.Dao;
import androidx.room.Query;

import com.example.bandorganizer.models.Song;
import com.example.bandorganizer.models.User;

import java.util.List;

@Dao
public interface SongDao {
    @Query("Select * from tblSong")
    List<Song> getSongList();

   /* @Query("select * from tblUser where bandlist IN bandList")
    MutableLiveData<List<User>> getBandUserList(List<Band> bandList);*/
}
