package com.example.ashra.allbanglanewspapers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class firstActivity extends AppCompatActivity {

    private WebView firstWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);


        firstWebView = (WebView) findViewById(R.id.firstWebViewId);

        WebSettings webSettings = firstWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        firstWebView.setWebViewClient(new WebViewClient());
        firstWebView.loadUrl("https://www.prothomalo.com/");

    }
}
