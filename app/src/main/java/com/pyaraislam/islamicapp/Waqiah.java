package com.pyaraislam.islamicapp;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.islamicapp.R;

public class Waqiah extends AppCompatActivity {
    ImageView backpress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_waqiah);

        backpress=findViewById(R.id.back_press);
        backpress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Waqiah.super.onBackPressed();
            }
        });

        WebView webView1 = findViewById(R.id.webView1);
        String video1 = "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/KuU3Cpg-KtY\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>";
        webView1.loadData(video1, "text/html","utf-8");
        webView1.getSettings().setJavaScriptEnabled(true);
        webView1.setWebChromeClient(new WebChromeClient());

        WebView webView2 = findViewById(R.id.webView2);
        String video2 = "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/DaKJy8rQ6RE\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>";
        webView2.loadData(video2, "text/html","utf-8");
        webView2.getSettings().setJavaScriptEnabled(true);
        webView2.setWebChromeClient(new WebChromeClient());

        WebView webView3 = findViewById(R.id.webView3);
        String video3 = "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/g1KZL0xzzVs\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>>";
        webView3.loadData(video3, "text/html","utf-8");
        webView3.getSettings().setJavaScriptEnabled(true);
        webView3.setWebChromeClient(new WebChromeClient());

        WebView webView4 = findViewById(R.id.webView4);
        String video4 = "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/HlCqzDSF4o0\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>";
        webView4.loadData(video4, "text/html","utf-8");
        webView4.getSettings().setJavaScriptEnabled(true);
        webView4.setWebChromeClient(new WebChromeClient());

        WebView webView5 = findViewById(R.id.webView5);
        String video5 = "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/dkamI1hOW9w\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>";
        webView5.loadData(video5, "text/html","utf-8");
        webView5.getSettings().setJavaScriptEnabled(true);
        webView5.setWebChromeClient(new WebChromeClient());

        WebView webView6 = findViewById(R.id.webView6);
        String video6 = "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/nw5SQUo9eyc\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>";
        webView6.loadData(video6, "text/html","utf-8");
        webView6.getSettings().setJavaScriptEnabled(true);
        webView6.setWebChromeClient(new WebChromeClient());

        WebView webView7 = findViewById(R.id.webView7);
        String video7 = "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/x8nEgDlP4CY\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>";
        webView7.loadData(video7, "text/html","utf-8");
        webView7.getSettings().setJavaScriptEnabled(true);
        webView7.setWebChromeClient(new WebChromeClient());

        WebView webView8 = findViewById(R.id.webView8);
        String video8 = "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/5XBr8Q27PCA\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>";
        webView8.loadData(video8, "text/html","utf-8");
        webView8.getSettings().setJavaScriptEnabled(true);
        webView8.setWebChromeClient(new WebChromeClient());
    }
}