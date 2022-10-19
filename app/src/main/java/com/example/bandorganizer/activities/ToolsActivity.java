package com.example.bandorganizer.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.bandorganizer.R;
import com.example.bandorganizer.fragments.NewCalEntry;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class ToolsActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    Button btnNewTermin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showtools);

        bottomNavigationView = findViewById(R.id.bottom_navigation);
        btnNewTermin = findViewById(R.id.btn_newtermin);

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
        btnNewTermin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openNewActivity();
            }
        });
    }
    public void openNewActivity(){
        Intent intent = new Intent(this, NewCalEntry.class);
        startActivity(intent);
    }
}
