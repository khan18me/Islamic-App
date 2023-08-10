package com.example.islamicapp.dua;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.islamicapp.R;


public class MainActivityDua extends AppCompatActivity {
    Button btnD, btnND, btnH;
    ImageView backpress;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_dua);


        btnD = findViewById(R.id.btnD);
        btnND = findViewById(R.id.btnND);
        btnH = findViewById(R.id.btnH);

        backpress=findViewById(R.id.back_press);


        btnD.setOnClickListener(v -> {
            Intent newActivity = new Intent(MainActivityDua.this, daytoday.class);
            startActivity(newActivity);

        });
        btnND.setOnClickListener(v -> {
            Intent newActivity = new Intent(MainActivityDua.this, daytoday.class);
            startActivity(newActivity);

        });
        btnH.setOnClickListener(v -> {
            Intent newActivity = new Intent(MainActivityDua.this,daytoday.class);
            startActivity(newActivity);

        });


        backpress.setOnClickListener(v -> MainActivityDua.super.onBackPressed());
    }
}