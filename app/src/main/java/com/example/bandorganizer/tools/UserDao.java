package com.example.bandorganizer.tools;



import androidx.lifecycle.MutableLiveData;
import androidx.room.Dao;
import androidx.room.Query;

import com.example.bandorganizer.models.Band;
import com.example.bandorganizer.models.User;

import java.util.List;

@Dao
public interface UserDao {
    @Query("Select * from tblUser")
    List<User> getUserList();

   /* @Query("select * from tblUser where bandlist IN bandList")
    MutableLiveData<List<User>> getBandUserList(List<Band> bandList);*/
}
