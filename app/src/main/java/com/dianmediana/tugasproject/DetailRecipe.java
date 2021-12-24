package com.dianmediana.tugasproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailRecipe extends AppCompatActivity {

    ImageView fotoMakanan;
    TextView namaMakanan, descMakanan, waktuSajian, porsiSajian, alatBahan, caraMasak;
    Button btnUpdate, btnDelete;
    int id_user;
    private SharedPreferences userPref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_recipe);
        getSupportActionBar().hide();
        userPref = getApplicationContext().getSharedPreferences("user", Context.MODE_PRIVATE);
        id_user = Integer.parseInt(userPref.getString("id",""));
        fotoMakanan = findViewById(R.id.img1);
        namaMakanan = findViewById(R.id.t1);
        descMakanan = findViewById(R.id.t2);
        waktuSajian = findViewById(R.id.t3);
        porsiSajian = findViewById(R.id.t4);
        alatBahan = findViewById(R.id.ab);
        caraMasak = findViewById(R.id.cm);
        btnDelete = findViewById(R.id.buttonDeleteRecipe);
        btnUpdate = findViewById(R.id.buttonUpdateRecipe);

        ImageView back = findViewById(R.id.back);

        Intent intent = getIntent();

        //mengambil nilai string, dimasukkan dalam variabel
        int id_user_recipe = intent.getIntExtra("id_user", 0);
        int id = intent.getIntExtra("id", 0);
        String foto = intent.getStringExtra("foto_makanan");
        String nama = intent.getStringExtra("nama_makanan");
        String desc = intent.getStringExtra("desc_makanan");
        String waktu = intent.getStringExtra("waktu_sajian");
        String porsi = intent.getStringExtra("porsi_sajian");
        String bahan = intent.getStringExtra("alat_bahan");
        String proses = intent.getStringExtra("cara_masak");

        Glide.with(this).asBitmap().load(foto).into(fotoMakanan);
        namaMakanan.setText(nama);
        descMakanan.setText(desc);
        waktuSajian.setText(waktu);
        porsiSajian.setText(porsi);
        alatBahan.setText(bahan);
        caraMasak.setText(proses);

        Log.d("id_user", String.valueOf(id_user_recipe));
        Log.d("id_", String.valueOf(id_user));

        if(id_user!=id_user_recipe){
            btnUpdate.setVisibility(View.GONE);
            btnDelete.setVisibility(View.GONE);
        }

        btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DetailRecipe.this, EditRecipeActivity.class);
                intent.putExtra("id", id);
                intent.putExtra("id_user", id_user_recipe);
                intent.putExtra("foto_makanan", foto);
                intent.putExtra("nama_makanan", nama);
                intent.putExtra("desc_makanan", desc);
                intent.putExtra("waktu_sajian", waktu);
                intent.putExtra("porsi_sajian", porsi);
                intent.putExtra("alat_bahan", bahan);
                intent.putExtra("cara_masak", proses);
                startActivity(intent);

            }
        });


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}