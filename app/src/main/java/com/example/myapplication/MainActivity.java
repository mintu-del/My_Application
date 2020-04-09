package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

 private WebView mywebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         //Adding webview in onCreate()
        mywebView = (WebView) findViewById(R.id.WebView);
        WebSettings webSettings = mywebView.getSettings();
        //Enabling java scripts
        webSettings.setJavaScriptEnabled(true);

        // loading webpage
        mywebView.loadUrl("https://ssnwa.in/");

        // Open  other webpages inside the app
        mywebView.setWebViewClient(new WebViewClient());
    }
        //Navigating web page history
    @Override
    public void onBackPressed() {
        if(mywebView.canGoBack()){
            mywebView.goBack();
        }
        else{
            super.onBackPressed();
        }
    }
}

