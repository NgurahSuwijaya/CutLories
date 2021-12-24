package com.dianmediana.tugasproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.dianmediana.tugasproject.sqlite.DbHelper;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class LoginActivity extends AppCompatActivity{
    public EditText email,password;
    public Button btnLogin;
    DbHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(getResources().getColor(R.color.register_bk_color));
        }

        setContentView(R.layout.activity_login);
        db = new DbHelper(this);
        email = findViewById(R.id.editTextEmail);
        password = findViewById(R.id.editTextPassword);
        btnLogin = findViewById(R.id.cirLoginButton);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(view.getId() == R.id.cirLoginButton){

                    String ambilUsername = email.getText().toString().trim();
                    String ambilPassword = password.getText().toString().trim();

                    if (ambilUsername.length()>0 && ambilPassword.length()>0){

                        login();

                    }else  if (ambilUsername.equals("") || ambilPassword.equals("")) {
                        Toast.makeText(LoginActivity.this, "Data tidek boleh kosong!", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(LoginActivity.this, "Username atau password salah.", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }

    public void login(){
        //Request Api Login ke Laravel dengan Address Constant -> Login
        StringRequest request = new StringRequest(Request.Method.POST, Constant.LOGIN,response -> {
            try {
                JSONObject object = new JSONObject(response);
                if (object.getBoolean("success")){
                    JSONObject user = object.getJSONObject("user");

                    //Input data user ke shared preferences table users di ambil dari response API
                    SharedPreferences userPref = getApplication().getSharedPreferences("user", Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor = userPref.edit();
                    editor.putString("token",object.getString("token"));
                    editor.putString("id",user.getString("id"));

                    //Input data user ke database tabel users di ambil dari response API
                    db.deleteAll();
                    ContentValues values = new ContentValues();
                    values.put(DbHelper.row_name, user.getString("name"));
                    values.put(DbHelper.row_age, user.getString("age"));
                    values.put(DbHelper.row_gender, user.getString("gender"));
                    values.put(DbHelper.row_email, user.getString("email"));
                    values.put(DbHelper.row_height, user.getString("bodyHeight"));
                    values.put(DbHelper.row_weight, user.getString("bodyWeight"));
                    values.put(DbHelper.row_body, user.getString("partOfDreamBody"));

                    db.insertUsers(values);

                    editor.putBoolean("isLoggedIn", true);
                    editor.apply();

                    Toast.makeText(LoginActivity.this, "Login Success", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);
                }
            } catch (JSONException e){
                Toast.makeText(LoginActivity.this, "Login Failed", Toast.LENGTH_SHORT).show();
                e.printStackTrace();
            }
        },error -> {
            Toast.makeText(LoginActivity.this, "Login Failed", Toast.LENGTH_SHORT).show();
            error.printStackTrace();
        }){
            //input parameter login yaitu email dan password
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                HashMap<String,String> map = new HashMap<>();
                map.put("email",email.getText().toString().trim());
                map.put("password",password.getText().toString().trim());
                return map;
            }
        };

        RequestQueue queue = Volley.newRequestQueue(getApplicationContext());
        queue.add(request);
    }

    public void onLoginClick(View view) {
        startActivity(new Intent(this, RegisterActivity.class));
        overridePendingTransition(R.anim.slide_in_right, R.anim.stay);
    }

    public void Masuk(View view) {
        Intent intent = new Intent(LoginActivity.this, MainActivity.class);
        startActivity(intent);
    }
}