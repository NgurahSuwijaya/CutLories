package com.dianmediana.tugasproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.bumptech.glide.Glide;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;

public class DetailRecipe extends AppCompatActivity {

    ImageView fotoMakanan;
    TextView namaMakanan, descMakanan, waktuSajian, porsiSajian, alatBahan, caraMasak;
    Button btnUpdate, btnDelete;
    int id_user;
    int id_recipe;
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
        id_recipe = intent.getIntExtra("id", 0);
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
                intent.putExtra("id", id_recipe);
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

        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                deleteRecipe();
            }
        });


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
    private void deleteRecipe(){
        StringRequest request = new StringRequest(Request.Method.POST, Constant.DELETE_BREAKFAST, response -> {
            try {
                JSONObject object = new JSONObject(response);
                Log.d("asdasd", String.valueOf(object));
                if (object.getBoolean("success")){

                    Toast.makeText(DetailRecipe.this, "Delete success.", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(DetailRecipe.this, MainActivity.class);
                    startActivity(intent);
                }
            }catch(JSONException e){
                e.printStackTrace();
            }
        },error -> {
            error.printStackTrace();
        }){
            @Override
            public Map<String, String> getHeaders() throws AuthFailureError {
                String token = userPref.getString("token","");
                Log.d("TOKEN", token);
                HashMap<String,String> map = new HashMap<>();
                map.put("Authorization","Bearer "+token);
                return map;
            }

            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                HashMap<String,String> map = new HashMap<>();
                map.put("id", String.valueOf(id_recipe));
//                map.put("photo_recipe", bitmapToString(bitmap));
                return map;
            }
        };

        RequestQueue queue = Volley.newRequestQueue(DetailRecipe.this);
        queue.add(request);
    }
}