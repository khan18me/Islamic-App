package com.pyaraislam.islamicapp.namaz;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.islamicapp.R;

public class ghusl extends AppCompatActivity {

    ImageView backpress1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ghusl);

        backpress1=findViewById(R.id.back_press1);
        backpress1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ghusl.super.onBackPressed();
            }
        });
    }
}