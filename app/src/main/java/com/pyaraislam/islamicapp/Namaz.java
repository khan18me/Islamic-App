package com.pyaraislam.islamicapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.example.islamicapp.R;
import com.pyaraislam.islamicapp.namaz.Wuzu;
import com.pyaraislam.islamicapp.namaz.ghusl;
import com.pyaraislam.islamicapp.namaz.namaz_proc;
import com.pyaraislam.islamicapp.namaz.rakats;

public class Namaz extends AppCompatActivity {
    Button  btnW, btnN, btnG, btnR;
    ImageView backpress;

    RelativeLayout wuzu,ghusl,prayer,rakat;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_namaz);


        wuzu = findViewById(R.id.wuzu);
        ghusl = findViewById(R.id.ghusl);
        prayer = findViewById(R.id.prayer);
        rakat = findViewById(R.id.rakat);

        wuzu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newActivity = new Intent(Namaz.this, Wuzu.class);
                startActivity(newActivity);
            }
        });
        ghusl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newActivity = new Intent(Namaz.this, ghusl.class);
                startActivity(newActivity);
            }
        });
        prayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newActivity = new Intent(Namaz.this, namaz_proc.class);
                startActivity(newActivity);
            }
        });
        rakat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newActivity = new Intent(Namaz.this, rakats.class);
                startActivity(newActivity);

            }
        });



        btnW = findViewById(R.id.btnW);
        btnN = findViewById(R.id.btnN);
        btnG = findViewById(R.id.btnG);
        btnR = findViewById(R.id.btnR);
        backpress=findViewById(R.id.back_press);

       btnW.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent newActivity = new Intent(Namaz.this, Wuzu.class);
               startActivity(newActivity);

           }
       });
        btnN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newActivity = new Intent(Namaz.this, namaz_proc.class);
                startActivity(newActivity);

            }
        });
        btnG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newActivity = new Intent(Namaz.this, ghusl.class);
                startActivity(newActivity);

            }
        });
        btnR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newActivity = new Intent(Namaz.this, rakats.class);
                startActivity(newActivity);

            }
        });

        backpress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Namaz.super.onBackPressed();
            }
        });
    }


}