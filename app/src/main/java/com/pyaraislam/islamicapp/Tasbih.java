package com.pyaraislam.islamicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.islamicapp.R;

public class Tasbih extends AppCompatActivity {

    TextView counterText;
    Button plusBtn;
    Button resetBtn;
    int counter;

     View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            switch (view.getId()){

                case R.id.plusbtn:
                    plusCounter();
                    break;
                case R.id.resetbtn:
                    initCounter();
                    break;
            }

        }

        private void initCounter() {
            counter = 0;
            counterText.setText(counter + "");

        }

        private void plusCounter() {
            counter++;
            counterText.setText(counter + "");
        }
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tasbih);
        counterText = (TextView) findViewById(R.id.countertxt);
        plusBtn = (Button) findViewById(R.id.plusbtn);
        plusBtn.setOnClickListener(clickListener);
        resetBtn = (Button) findViewById(R.id.resetbtn);
        resetBtn.setOnClickListener(clickListener);



    }
}