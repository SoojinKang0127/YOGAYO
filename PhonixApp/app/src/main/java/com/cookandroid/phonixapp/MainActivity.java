package com.cookandroid.phonixapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    public WebView webView;
    private SensorManager sensorManager;
    private Sensor sensor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        webView = (WebView) findViewById(R.id.webView);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        webView.loadUrl("http://192.168.219.128:8080/test/");
        // 192.168.219.149 를 자기 ip주소로 변경해주세요!
        webView.setWebViewClient(new WebViewClient());
        Log.d("i","create");
        sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        sensor = sensorManager.getDefaultSensor(Sensor.TYPE_GRAVITY);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR);
    }
        @Override
        public void onBackPressed() {
            if(webView.canGoBack()) {
                webView.goBack();
            } else {
                super.onBackPressed();
            }
        }

        @Override
        public void onConfigurationChanged(@NonNull Configuration newConfig){
            super.onConfigurationChanged(newConfig);
            System.out.println("돌아");
            Log.d("i","hi");
        }
}
