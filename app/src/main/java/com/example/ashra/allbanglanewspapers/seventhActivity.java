package com.example.ashra.allbanglanewspapers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class seventhActivity extends AppCompatActivity {

    private WebView seventhWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seventh);

        seventhWebView = (WebView) findViewById(R.id.seventhWebViewId);

        WebSettings webSettings = seventhWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        seventhWebView.setWebViewClient(new WebViewClient());
        seventhWebView.loadUrl("http://dainikamadershomoy.com/");
    }
}
