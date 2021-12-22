package com.dianmediana.tugasproject;

import androidx.appcompat.app.AppCompatActivity;

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

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class LoginActivity extends AppCompatActivity{
    public EditText email,password;
    public Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(getResources().getColor(R.color.register_bk_color));
        }

        setContentView(R.layout.activity_login);

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
        StringRequest request = new StringRequest(Request.Method.POST, Constant.LOGIN,response -> {
            try {
                JSONObject object = new JSONObject(response);
                if (object.getBoolean("success")){
                    JSONObject user = object.getJSONObject("user");
                    SharedPreferences userPref = getApplication().getSharedPreferences("user", Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor = userPref.edit();
                    editor.putString("token",object.getString("token"));
                    editor.putString("id",user.getString("id"));
                    editor.putString("name",user.getString("name"));
                    editor.putString("age",user.getString("age"));
                    editor.putString("bodyHeight",user.getString("bodyHeight"));
                    editor.putString("bodyWeight",user.getString("bodyWeight"));
                    editor.putString("gender",user.getString("gender"));
                    editor.putString("email",user.getString("email"));
                    editor.putString("partOfDreamBody",user.getString("partOfDreamBody"));
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