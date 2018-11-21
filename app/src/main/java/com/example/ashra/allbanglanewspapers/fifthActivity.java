package com.example.ashra.allbanglanewspapers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class fifthActivity extends AppCompatActivity {

   private WebView fifthWebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);

        fifthWebView = (WebView) findViewById(R.id.fifthWebViewId);

        WebSettings webSettings = fifthWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        fifthWebView.setWebViewClient(new WebViewClient());
        fifthWebView.loadUrl("http://www.dailynayadiganta.com/");
    }
}




