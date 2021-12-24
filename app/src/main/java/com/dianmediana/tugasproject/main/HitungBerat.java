package com.dianmediana.tugasproject.main;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.dianmediana.tugasproject.menu.MenuIdeal;
import com.dianmediana.tugasproject.menu.MenuObese;
import com.dianmediana.tugasproject.menu.MenuOverweight;
import com.dianmediana.tugasproject.menu.MenuUnderweight;
import com.dianmediana.tugasproject.R;

public class HitungBerat extends AppCompatActivity implements View.OnClickListener{

    EditText edbb, edtinggi;
    TextView  edimt, edket;
    Button bthitung, btnrekomendasi;
    Double vbb, vtinggi, vimt ;
    String vket;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung_berat);
        getSupportActionBar().hide();

        edbb = (EditText)findViewById(R.id.edbb);
        edtinggi = (EditText)findViewById(R.id.edtinggi);
        edimt = (TextView)findViewById(R.id.edimt);
        edket = (TextView)findViewById(R.id.edket);
        bthitung = (Button) findViewById(R.id.bthitung);
        btnrekomendasi = (Button) findViewById(R.id.btnrekomendasi);

        btnrekomendasi.setOnClickListener(this);
    }

    public void hitung(View view) {
        vbb = Double.parseDouble(edbb.getText().toString());
        vtinggi = Double.parseDouble(edtinggi.getText().toString());

        vimt = vbb / ((vtinggi/100)*(vtinggi/100));

        if (vimt < 18.5){
            vket = "Berat Badan Kurang";
        }
        else if (vimt >= 18.5 && vimt <=24.9){
            vket = "Berat Badan Ideal";
        }
        else if (vimt >= 25 && vimt <=29.9){
            vket = "Berat Badan Berlebih";
        }
        else if (vimt > 30){
            vket = "Sangat Gemuk, Anda Harus Diet";
        }
        else {
            vket = "Sangat Gemuk, Anda Harus Diet";
        }
        edimt.setText(""+vimt);
        edket.setText(""+vket);
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.btnrekomendasi){
            if (vimt < 18.5){
                Intent intent = new Intent(HitungBerat.this, MenuUnderweight.class);
                startActivity(intent);
            }
            else if (vimt >= 18.5 && vimt <=24.9){
                Intent intent = new Intent(HitungBerat.this, MenuIdeal.class);
                startActivity(intent);
            }
            else if (vimt >= 25 && vimt <=29.9){
                Intent intent = new Intent(HitungBerat.this, MenuOverweight.class);
                startActivity(intent);
            }
            else {
                Intent intent = new Intent(HitungBerat.this, MenuObese.class);
                startActivity(intent);
            }
        }
    }

    public void rekomendasi(View view) {
        getIntent();
    }
}