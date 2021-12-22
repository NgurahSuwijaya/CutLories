package com.dianmediana.tugasproject.user;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;

import com.dianmediana.tugasproject.MainActivity;
import com.dianmediana.tugasproject.R;

public class AboutUs extends AppCompatActivity {

    WebView webview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
        getSupportActionBar().hide();

        ImageView back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AboutUs.this, MainActivity.class);
                startActivity(intent);
            }
        });

        demo2TryLocallyStoreHtmlPage();
    }

    @SuppressLint("SetJavaScriptEnabled")
    private void   demo2TryLocallyStoreHtmlPage(){
        webview = (WebView)findViewById(R.id.webview1);
        webview.getSettings().setJavaScriptEnabled(true);
        webview.setWebViewClient(new WebViewClient());
        webview.loadUrl("file:///android_asset/AboutPage.html");
    }
}