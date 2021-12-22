package com.dianmediana.tugasproject;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class TipsWebView extends AppCompatActivity {

    WebView webview;
    TextView txtmsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips_web_view);
        getSupportActionBar().hide();

//        ImageView back = findViewById(R.id.back);
//        back.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(TipsWebView.this,TipsFragment.class);
//                startActivity(intent);
//            }
//        });

        webview = findViewById(R.id.webview1);
        txtmsg = findViewById(R.id.txtMsg);

        getIncomingExtra();
    }

    private void getIncomingExtra() {
        //hasExtra akan mnegcek nilai boolen (true atau false)
        if(getIntent().hasExtra("webview") && getIntent().hasExtra("source")) {
            //mengambil nilai string, dimasukkan dalam variabel
            String web = getIntent().getStringExtra("webview");
            String sumber = getIntent().getStringExtra("source");

//            Log.d("gambarnya", String.valueOf(gambar));
//            Log.d("namanya", nama);
//            Log.d("detailnya", detail);

            setDataActivity(web, sumber);
        }
    }

    private void setDataActivity(String web, String sumber) {
        webview.loadUrl(web);
        txtmsg.setText(sumber);
    }
}