package com.example.ashra.allbanglanewspapers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class thirdActivity extends AppCompatActivity {

    private WebView thirdWebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        thirdWebView = (WebView) findViewById(R.id.thirdWebViewId);

        WebSettings webSettings = thirdWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        thirdWebView.setWebViewClient(new WebViewClient());
        thirdWebView.loadUrl("https://www.jugantor.com/");
    }
}
