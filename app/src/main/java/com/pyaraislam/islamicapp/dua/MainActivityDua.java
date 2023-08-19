package com.pyaraislam.islamicapp.dua;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.example.islamicapp.R;


public class MainActivityDua extends AppCompatActivity {
    Button btnD, btnND, btnH;
    ImageView backpress;

    RelativeLayout d2d,prayerdua,healthdua;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_dua);


        d2d = findViewById(R.id.d2d);
        prayerdua = findViewById(R.id.prayerdua);
        healthdua = findViewById(R.id.healthdua);


        d2d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newActivity = new Intent(MainActivityDua.this, daytoday.class);
                startActivity(newActivity);

            }
        });

        prayerdua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newActivity = new Intent(MainActivityDua.this, prayer.class);
                startActivity(newActivity);
            }
        });
        healthdua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newActivity = new Intent(MainActivityDua.this,health_more.class);
                startActivity(newActivity);
            }
        });

        btnD = findViewById(R.id.btnD);
        btnND = findViewById(R.id.btnND);
        btnH = findViewById(R.id.btnH);

        backpress=findViewById(R.id.back_press);
        backpress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivityDua.super.onBackPressed();
            }
        });


        btnD.setOnClickListener(v -> {
            Intent newActivity = new Intent(MainActivityDua.this, daytoday.class);
            startActivity(newActivity);

        });
        btnND.setOnClickListener(v -> {
            Intent newActivity = new Intent(MainActivityDua.this, prayer.class);
            startActivity(newActivity);

        });
        btnH.setOnClickListener(v -> {
            Intent newActivity = new Intent(MainActivityDua.this,health_more.class);
            startActivity(newActivity);

        });


        backpress.setOnClickListener(v -> MainActivityDua.super.onBackPressed());
    }
}