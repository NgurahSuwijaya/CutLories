package com.dianmediana.tugasproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailRecommendation extends AppCompatActivity {

    ImageView image;
    TextView header, desc, recommend, avoid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_recommendation);
        getSupportActionBar().hide();

//        ImageView back = findViewById(R.id.back);
//        back.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(DetailRecommendation.this,MainActivity.class);
//                startActivity(intent);
//            }
//        });

        image = findViewById(R.id.gambar);
        header = findViewById(R.id.judul);
        desc = findViewById(R.id.awalan);
        recommend = findViewById(R.id.rekomendasi);
        avoid = findViewById(R.id.pantangan);

        getIncomingExtra();
    }

    private void getIncomingExtra() {
        //hasExtra akan mnegcek nilai boolen (true atau false)
        if(getIntent().hasExtra("gambar") && getIntent().hasExtra("judul") && getIntent().hasExtra("awalan") && getIntent().hasExtra("rekomendasi") && getIntent().hasExtra("pantangan")) {
            //mengambil nilai string, dimasukkan dalam variabel
            int gambar = getIntent().getIntExtra("gambar",0);
            String judul = getIntent().getStringExtra("judul");
            String awalan = getIntent().getStringExtra("awalan");
            String rekomendasi = getIntent().getStringExtra("rekomendasi");
            String pantangan = getIntent().getStringExtra("pantangan");

//            Log.d("gambarnya", String.valueOf(gambar));
//            Log.d("namanya", nama);
//            Log.d("detailnya", detail);

            setDataActivity(gambar, judul, awalan, rekomendasi, pantangan);
        }
    }
    //data dikirimkan kedalam method setDataActivity
    private void setDataActivity(int gambar, String judul, String awalan, String rekomendasi, String pantangan) {
        //memasukkan data ke dalam objek pada layout detail
        image.setImageResource(Integer.parseInt(String.valueOf(gambar)));
        header.setText(judul);
        desc.setText(awalan);
        recommend.setText(rekomendasi);
        avoid.setText(pantangan);
    }
}