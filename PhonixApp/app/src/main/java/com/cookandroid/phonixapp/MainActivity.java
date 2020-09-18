package com.cookandroid.phonixapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Window;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    public WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        webView = (WebView) findViewById(R.id.webView);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        webView.loadUrl("http://192.168.219.133:8088/test/");
        // 192.168.219.149 를 자기 ip주소로 변경해주세요!
        webView.setWebViewClient(new WebViewClient());
    }
        @Override
        public void onBackPressed() {
            if(webView.canGoBack()) {
                webView.goBack();
            } else {
                super.onBackPressed();
            }
        }
}
