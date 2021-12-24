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

public class CreateRecipeActivity extends AppCompatActivity {
    private boolean isAllFieldsChecked = false;
    private EditText recipeName, recipeCalories, recipeDuration, recipePortion ,recipeMaterial, recipeProcedure;
    private Button btnCreate;
    private Bitmap bitmap = null;
    private SharedPreferences userPref;
    private DbHelper db;
    private String stringName, stringCalories, stringDuration, stringPortion, stringMaterial, stringProcedure;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_recipe);
        getSupportActionBar().hide();
        userPref = getApplicationContext().getSharedPreferences("user", Context.MODE_PRIVATE);

        db = new DbHelper(CreateRecipeActivity.this);

        recipeName = findViewById(R.id.editTextEditRecipeName);
        recipeCalories = findViewById(R.id.editTextEditRecipeCalories);
        recipeDuration = findViewById(R.id.editTextEditRecipeDuration);
        recipePortion = findViewById(R.id.editTextEditRecipePortion);
        recipeMaterial = findViewById(R.id.editTextEditRecipeMaterials);
        recipeProcedure = findViewById(R.id.editTextEditRecipeProcedure);
        btnCreate = findViewById(R.id.cirCreateRecipeButton);

        btnCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("asdasd", "String.valueOf(object)");
                isAllFieldsChecked = CheckAllFields();
                if(isAllFieldsChecked) {
                    stringName = recipeName.getText().toString();
                    stringCalories = recipeCalories.getText().toString();
                    stringDuration = recipeDuration.getText().toString();
                    stringPortion = recipePortion.getText().toString();
                    stringMaterial = recipeMaterial.getText().toString();
                    stringProcedure = recipeProcedure.getText().toString();
                    Log.d("asdasd", "String.valueOf(object)");
                    createRecipe();
                }
            }
        });

        ImageView back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CreateRecipeActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
    private void createRecipe(){
        StringRequest request = new StringRequest(Request.Method.POST, Constant.ADD_BREAKFAST, response -> {
            try {
                JSONObject object = new JSONObject(response);
                Log.d("asdasd", String.valueOf(object));
                if (object.getBoolean("success")){
                    JSONObject breakfast = object.getJSONObject("breakfast");
                    ContentValues values = new ContentValues();
                    values.put(DbHelper.row_id_breakfast, breakfast.getString("id"));
                    values.put(DbHelper.row_user_id, breakfast.getString("id_user"));
                    values.put(DbHelper.row_name_breakfast, breakfast.getString("breakfast_name"));
                    values.put(DbHelper.row_calories, breakfast.getString("calories"));
                    values.put(DbHelper.row_duration, breakfast.getString("time"));
                    values.put(DbHelper.row_portion, breakfast.getString("portion"));
                    values.put(DbHelper.row_materials, breakfast.getString("materials"));
                    values.put(DbHelper.row_procedure, breakfast.getString("how_to_cook"));
                    db.insertBreakfast(values);

                    Toast.makeText(CreateRecipeActivity.this, "Register success.", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(CreateRecipeActivity.this, MainActivity.class);
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
                String id = userPref.getString("id","");
                map.put("id_user",id);
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

        RequestQueue queue = Volley.newRequestQueue(CreateRecipeActivity.this);
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

    private boolean CheckAllFields(){
        if (recipeName.length() == 0) {
            recipeName.setError("Must be Filled");
            return false;
        }
        if (recipeCalories.length() == 0) {
            recipeCalories.setError("Must be Filled");
            return false;
        }
        if (recipeDuration.length() == 0) {
            recipeDuration.setError("Must be Filled");
            return false;
        }
        if (recipePortion.length() == 0) {
            recipePortion.setError("Must be Filled");
            return false;
        }
        if (recipeMaterial.length() == 0) {
            recipeMaterial.setError("Must be Filled");
            return false;
        }
        if (recipeProcedure.length() == 0) {
            recipeProcedure.setError("Must be Filled");
            return false;
        }
        return true;
    }
}