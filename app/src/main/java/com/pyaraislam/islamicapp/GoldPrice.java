package com.pyaraislam.islamicapp;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.islamicapp.R;

public class GoldPrice extends AppCompatActivity {
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gold_price);
        if(NetworkConnectivity.isNetworkStatusAvailable(getApplicationContext())) {
            webView = (WebView) findViewById(R.id.webview);
            webView.setWebViewClient(new WebViewClient());
            webView.loadUrl("http://goldpricez.com/calculator/gold-rates");
            WebSettings webSettings = webView.getSettings();
            webSettings.setJavaScriptEnabled(true);

        } else {
            Toast.makeText(getApplicationContext(), getString(R.string.internetfirst), Toast.LENGTH_SHORT).show();
        }

    }
    @Override
    public void onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack();
        } else {
            super.onBackPressed();
        }
    }
}