package com.example.ashra.allbanglanewspapers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class eighthActivity extends AppCompatActivity {

    private WebView eighthWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eighth);

        eighthWebView = (WebView) findViewById(R.id.eighthWebViewId);

        WebSettings webSettings = eighthWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        eighthWebView.setWebViewClient(new WebViewClient());
        eighthWebView.loadUrl("http://www.ittefaq.com.bd/");
    }
}
