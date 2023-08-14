package com.pyaraislam.islamicapp.namaz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.islamicapp.R;

public class Wuzu extends AppCompatActivity {
    ImageView backpress1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.islamicapp.R.layout.activity_wuzu);

        backpress1=findViewById(R.id.back_press1);
        backpress1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Wuzu.super.onBackPressed();
            }
        });
    }
}