package com.example.bandorganizer.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.bandorganizer.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class CalendarActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showcalender);

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
