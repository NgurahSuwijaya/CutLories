package com.dianmediana.tugasproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailRecipe extends AppCompatActivity {

    ImageView fotoMakanan;
    TextView namaMakanan, descMakanan, waktuSajian, porsiSajian, alatBahan, caraMasak;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_recipe);
        getSupportActionBar().hide();

//        ImageView back = findViewById(R.id.back);
//        back.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(DetailRecipeBreakfast.this,MenuBreakfast.class);
//                startActivity(intent);
//            }
//        });

//        ImageView share = findViewById(R.id.sharebtn);
//        share.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(Intent.ACTION_SEND);
//                intent.setType("text/plain");
//                String Body = "Body here";
//                String Sub = "Subject here";
//                intent.putExtra(Intent.EXTRA_TEXT,Sub);
//                intent.putExtra(Intent.EXTRA_TEXT,Body);
//                startActivity(Intent.createChooser(intent,"Share using"));
//            }
//        });

        fotoMakanan = findViewById(R.id.img1);
        namaMakanan = findViewById(R.id.t1);
        descMakanan = findViewById(R.id.t2);
        waktuSajian = findViewById(R.id.t3);
        porsiSajian = findViewById(R.id.t4);
        alatBahan = findViewById(R.id.ab);
        caraMasak = findViewById(R.id.cm);

        //mengambil data
        getIncomingExtra();
    }

    private void getIncomingExtra() {
        //hasExtra akan mnegcek nilai boolen (true atau false)
        if(getIntent().hasExtra("foto_makanan") && getIntent().hasExtra("nama_makanan") && getIntent().hasExtra("desc_makanan") && getIntent().hasExtra("waktu_sajian") && getIntent().hasExtra("porsi_sajian") && getIntent().hasExtra("alat_bahan") && getIntent().hasExtra("cara_masak")) {
            //mengambil nilai string, dimasukkan dalam variabel
            String foto = getIntent().getStringExtra("foto_makanan");
            String nama = getIntent().getStringExtra("nama_makanan");
            String desc = getIntent().getStringExtra("desc_makanan");
            String waktu = getIntent().getStringExtra("waktu_sajian");
            String porsi = getIntent().getStringExtra("porsi_sajian");
            String bahan = getIntent().getStringExtra("alat_bahan");
            String proses = getIntent().getStringExtra("cara_masak");

            setDataActivity(foto, nama, desc, waktu, porsi, bahan, proses);
        }
    }
    //data dikirimkan kedalam method setDataActivity
    private void setDataActivity(String foto, String nama, String desc, String waktu, String porsi, String bahan, String proses) {
        //memasukkan data ke dalam objek pada layout detail
        Glide.with(this).asBitmap().load(foto).into(fotoMakanan);
        namaMakanan.setText(nama);
        descMakanan.setText(desc);
        waktuSajian.setText(waktu);
        porsiSajian.setText(porsi);
        alatBahan.setText(bahan);
        caraMasak.setText(proses);
    }
}