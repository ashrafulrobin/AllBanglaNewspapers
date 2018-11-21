package com.example.ashra.allbanglanewspapers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class fourthActivity extends AppCompatActivity {

    private WebView fourthWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        fourthWebView = (WebView) findViewById(R.id.fourthWebViewId);

        WebSettings webSettings = fourthWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        fourthWebView.setWebViewClient(new WebViewClient());

        fourthWebView.loadUrl("http://www.bd-pratidin.com/");
    }
}
