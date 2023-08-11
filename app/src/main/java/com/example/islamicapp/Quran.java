package com.example.islamicapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;


public class Quran extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran);

        RelativeLayout relativeLayout1 = findViewById(R.id.arabic_quran);
        RelativeLayout relativeLayout2 = findViewById(R.id.tarjuma_quran);
        RelativeLayout relativeLayout3 = findViewById(R.id.english_quran);
        RelativeLayout relativeLayout4 = findViewById(R.id.hindi_quran);
        relativeLayout1.setOnClickListener(onClickListener);
        relativeLayout2.setOnClickListener(onClickListener);
        relativeLayout3.setOnClickListener(onClickListener);
        relativeLayout4.setOnClickListener(onClickListener);

    }
    View.OnClickListener onClickListener = view -> {
        Intent intent = null;
        switch (view.getId()) {
            case R.id.arabic_quran:
                intent = new Intent(Quran.this, arabic_quran.class);
                break;
            case R.id.tarjuma_quran:
                intent = new Intent(Quran.this, Quran.class);
                break;
            case R.id.english_quran:
                intent = new Intent(Quran.this, Quran.class);
                break;
            case R.id.hindi_quran:
                intent = new Intent(Quran.this, MainActivity.class);
                break;
            }
        if (intent != null) {
            startActivity(intent);
        }

    };
}
