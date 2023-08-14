package com.pyaraislam.islamicapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.islamicapp.R;

public class Tasbih extends AppCompatActivity {


    private ImageView imageView;
    private Button btnPrevious, btnNext;

    private int[] imageResources = {
            R.drawable.slider1,
            R.drawable.slider2,
            R.drawable.slider3,
            R.drawable.slider4

    };
    private int currentImageIndex = 0;
    TextView counterText;
    Button plusBtn;
    Button resetBtn;
    int counter;

    View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            switch (view.getId()) {

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

        imageView = findViewById(R.id.imageView);
        btnPrevious = findViewById(R.id.btnPrevious);
        btnNext = findViewById(R.id.btnNext);

        setImage(imageResources[currentImageIndex]);

        btnPrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPreviousImage();
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showNextImage();
            }
        });
    }

    private void setImage(int imageResource) {
        imageView.setImageResource(imageResource);
    }

    private void showPreviousImage() {
        if (currentImageIndex > 0) {
            currentImageIndex--;
            setImage(imageResources[currentImageIndex]);
        }
    }

    private void showNextImage() {
        if (currentImageIndex < imageResources.length - 1) {
            currentImageIndex++;
            setImage(imageResources[currentImageIndex]);
        }

    }
}