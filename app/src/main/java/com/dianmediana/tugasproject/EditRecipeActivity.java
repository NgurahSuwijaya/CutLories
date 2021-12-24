package com.dianmediana.tugasproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.dianmediana.tugasproject.sqlite.DbHelper;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;

public class EditRecipeActivity extends AppCompatActivity {

    private EditText recipeName, recipeCalories, recipeDuration, recipePortion ,recipeMaterial, recipeProcedure;
    private Button btnEdit;
    private Bitmap bitmap = null;
    private SharedPreferences userPref;
    private String id_recipe, stringName, stringCalories, stringDuration, stringPortion, stringMaterial, stringProcedure;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_recipe);
        getSupportActionBar().hide();

        userPref = getApplicationContext().getSharedPreferences("user", Context.MODE_PRIVATE);
        recipeName = findViewById(R.id.editTextEditRecipeName);
        recipeCalories = findViewById(R.id.editTextEditRecipeCalories);
        recipeDuration = findViewById(R.id.editTextEditRecipeDuration);
        recipePortion = findViewById(R.id.editTextEditRecipePortion);
        recipeMaterial = findViewById(R.id.editTextEditRecipeMaterials);
        recipeProcedure = findViewById(R.id.editTextEditRecipeProcedure);
        btnEdit = findViewById(R.id.cirEditRecipeButton);

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

        Log.d("TAG1234", String.valueOf(id));

        id_recipe = String.valueOf(id);
        recipeName.setText(nama);
        recipeCalories.setText(desc);
        recipeDuration.setText(waktu);
        recipePortion.setText(porsi);
        recipeMaterial.setText(bahan);
        recipeProcedure.setText(proses);

        btnEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stringName = recipeName.getText().toString();
                stringCalories = recipeCalories.getText().toString();
                stringPortion = recipePortion.getText().toString();
                stringDuration = recipeDuration.getText().toString();
                stringMaterial = recipeMaterial.getText().toString();
                stringProcedure = recipeProcedure.getText().toString();
                editRecipe();
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void editRecipe(){
        StringRequest request = new StringRequest(Request.Method.POST, Constant.UPDATE_BREAKFAST, response -> {
            try {
                JSONObject object = new JSONObject(response);
                Log.d("asdasd", String.valueOf(object));
                if (object.getBoolean("success")){

                    Toast.makeText(EditRecipeActivity.this, "Edit success.", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(EditRecipeActivity.this, MainActivity.class);
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
                map.put("id", id_recipe);
                map.put("breakfast_name",stringName);
                map.put("calories",stringCalories);
                map.put("time",stringDuration);
                map.put("portion",stringDuration);
                map.put("materials", stringMaterial);
                map.put("how_to_cook",stringProcedure);
//                map.put("photo_recipe", bitmapToString(bitmap));
                return map;
            }
        };

        RequestQueue queue = Volley.newRequestQueue(EditRecipeActivity.this);
        queue.add(request);
    }
    private String bitmapToString(Bitmap bitmap) {
        if (bitmap!=null){
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
            byte []array = byteArrayOutputStream.toByteArray();
            return Base64.encodeToString(array, Base64.DEFAULT);
        }
        return "";
    }
}