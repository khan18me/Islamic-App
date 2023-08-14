package com.pyaraislam.islamicapp;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.example.islamicapp.R;


public class Quran extends AppCompatActivity {

    private RelativeLayout tarjuma_quran, english_quran, hindi_quran;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran);

        tarjuma_quran = findViewById(R.id.tarjuma_quran);
        tarjuma_quran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPdf();
            }
        });
        english_quran = findViewById(R.id.english_quran);
        english_quran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPdf2();
            }
        });
        hindi_quran = findViewById(R.id.hindi_quran);
        hindi_quran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPdf3();
            }
        });


    



        RelativeLayout relativeLayout1 = findViewById(R.id.arabic_quran);


        relativeLayout1.setOnClickListener(onClickListener);



    }

    private void openPdf() {

            String pdfUrl = "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/tarjuma.pdf?alt=media&token=8c7da606-8ad4-449e-a0e0-d7e4dffc7b59"; // Replace with the actual URL
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setDataAndType(Uri.parse(pdfUrl), "application/pdf");
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

            try {
                startActivity(intent);
            } catch (ActivityNotFoundException e) {
                // Handle no PDF viewer installed error
                e.printStackTrace();
            }
        }
    private void openPdf2() {

        String pdfUrl = "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/englishquran.pdf?alt=media&token=d1669e27-7dfa-4a01-843f-1f9ccf6de2e1"; // Replace with the actual URL
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setDataAndType(Uri.parse(pdfUrl), "application/pdf");
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

        try {
            startActivity(intent);
        } catch (ActivityNotFoundException e) {
            // Handle no PDF viewer installed error
            e.printStackTrace();
        }
    }
    private void openPdf3() {

        String pdfUrl = "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/hindiquran.pdf?alt=media&token=57793121-a477-4184-8c38-c25cd852a562"; // Replace with the actual URL
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setDataAndType(Uri.parse(pdfUrl), "application/pdf");
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

        try {
            startActivity(intent);
        } catch (ActivityNotFoundException e) {
            // Handle no PDF viewer installed error
            e.printStackTrace();
        }
    }



    View.OnClickListener onClickListener = view -> {
        Intent intent = null;
        switch (view.getId()) {
            case R.id.arabic_quran:
                intent = new Intent(Quran.this, arabic_quran.class);
                break;
            }
        if (intent != null) {
            startActivity(intent);
        }

    };



}
