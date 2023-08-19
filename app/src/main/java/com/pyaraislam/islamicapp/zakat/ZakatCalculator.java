package com.pyaraislam.islamicapp.zakat;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.islamicapp.R;

public class ZakatCalculator extends AppCompatActivity {
    TextView ToUnderline;
    EditText GoldPrice,TotalPrice;
    TextView Result1,Result2;
    float InputGold, InputTotal;

    ImageView backpress1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zakat_calculator);
        setContentView(R.layout.activity_zakat_calculator);
        ToUnderline= findViewById(R.id.underlinelink);
        ToUnderline.setPaintFlags(ToUnderline.getPaintFlags() |  Paint.UNDERLINE_TEXT_FLAG);


        backpress1=findViewById(R.id.back_press);
        backpress1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ZakatCalculator.super.onBackPressed();
            }
        });
    }

    public void LocalPriceGold(View v) {
        Intent intent = new Intent(this, com.pyaraislam.islamicapp.GoldPrice.class);
        startActivity(intent);
    }



    @SuppressLint("SetTextI18n")
    public  void CalculateZakat(View v){
        GoldPrice=findViewById(R.id.inputgoldprice);
        TotalPrice=findViewById(R.id.inputtotalprice);
        Result1=findViewById(R.id.zakatresult1);
        Result2=findViewById(R.id.zakatresult2);
        if (GoldPrice.getText().toString().equals("") || TotalPrice.getText().toString().equals("")) return;
        InputGold=Float.parseFloat(GoldPrice.getText().toString());
        InputTotal=Float.parseFloat(TotalPrice.getText().toString());

        double nissab = InputGold*85.05;
        String result = getString(R.string.nissab) +" "+ nissab;
        String zakat ;
        if (nissab>InputTotal){
            zakat =getString(R.string.nozakat);
            Result1.setText(zakat);
            Result2.setText(result);
        }else{
            float zakatprice = (float) (InputTotal*0.025);
            zakat= getString(R.string.zakatprice) +" "+ zakatprice ;
            Result1.setText(zakat);
            Result2.setText(result);
        }
    }
}