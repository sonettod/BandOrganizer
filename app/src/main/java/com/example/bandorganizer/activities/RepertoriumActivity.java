package com.example.bandorganizer.activities;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import com.example.bandorganizer.R;
import com.example.bandorganizer.models.Song;
import com.example.bandorganizer.viewmodels.RepertoriumActivityViewModel;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.List;

public class RepertoriumActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    FloatingActionButton flbtnNewSong;
    private RepertoriumActivityViewModel  mRepertoriumActivityViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showrepertorium);

        mRepertoriumActivityViewModel = new ViewModelProvider(this).get(RepertoriumActivityViewModel.class);

        mRepertoriumActivityViewModel.getSongs().observe(this, new Observer<List<Song>>() {
            @Override
            public void onChanged(List<Song> songs) {
                //Create Adapter
                // mAdapter.notifyDataSetChanged();
            }
        });



        bottomNavigationView = findViewById(R.id.bottom_navigation);

        bottomNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.page_Calendar:
                    setContentView(R.layout.activity_showcalender);
                    return true;
                case R.id.page_Repertorium:
                    setContentView(R.layout.activity_showrepertorium);
                    return true;
                case R.id.page_Tools:
                    setContentView(R.layout.activity_showtools);
                    return true;
            }
            return false;
        });

    }
}
