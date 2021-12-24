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
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.dianmediana.tugasproject.sqlite.DbHelper;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class RegisterActivity extends AppCompatActivity{
    private boolean isAllFieldsChecked = false;
    private EditText name, weight, height, email ,password;
    private TextView seekMeter;
    private RadioGroup radioGender;
    private RadioButton radioMale, radioFemale;
    DbHelper db;
    private Button btnLogin;
    private SeekBar seekBarAge;
    private CheckBox checkBoxTop, checkBoxMid, checkBoxBot;
    private String getsName, getsGender, getsPass, getsEmail, getsWeight, getsHeight, getsAge, getsBody;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        db = new DbHelper(this);
        name = findViewById(R.id.editTextRegisterName);
        weight = findViewById(R.id.editTextRegisterWeight);
        height = findViewById(R.id.editTextRegisterHeight);
        email = findViewById(R.id.editTextRegisterEmail);
        password = findViewById(R.id.editTextRegisterPassword);
        btnLogin = findViewById(R.id.cirRegisterButton);

        checkBoxBot = findViewById(R.id.checkBoxRegisterBodyBottom);
        checkBoxMid = findViewById(R.id.checkBoxRegisterBodyMid);
        checkBoxTop = findViewById(R.id.checkBoxRegisterBodyTop);

        radioGender = findViewById(R.id.radioGroupRegisterGender);
        radioMale = findViewById(R.id.radioButtonRegisterMale);
        radioFemale = findViewById(R.id.radioButtonRegisterFemale);

        seekBarAge  = findViewById(R.id.seekBarAge);
        seekMeter = findViewById(R.id.textViewMeter);

        //seek bar
        seekBarAge.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                getsAge = (String.valueOf(i));
                seekMeter.setText(getsAge);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Validasi Input Kosong
                isAllFieldsChecked = CheckAllFields();
                if(isAllFieldsChecked) {
                    getsName = name.getText().toString();
                    getsPass = password.getText().toString();
                    getsEmail = email.getText().toString();
                    getsWeight = weight.getText().toString();
                    getsHeight = height.getText().toString();

                    //Gender radio button
                    int selectedGender = radioGender.getCheckedRadioButtonId();
                    if (selectedGender == radioMale.getId()) {
                        getsGender = radioMale.getText().toString();
                    } else if (selectedGender == radioFemale.getId()) {
                        getsGender = radioFemale.getText().toString();
                    }
                    //role Checkbox
                    getsBody = "";
                    if (checkBoxTop.isChecked()) {
                        getsBody = getsBody + "Top; ";
                    }
                    if (checkBoxMid.isChecked()) {
                        getsBody = getsBody + "Mid; ";
                    }
                    if (checkBoxBot.isChecked()) {
                        getsBody = getsBody + "Bottom; ";
                    }
                    getsBody = getsBody + ".";
                    register();
                }
            }
        });
        changeStatusBarColor();
    }
    //method validasi input kosong
    private boolean CheckAllFields(){
        if (name.length() == 0) {
            name.setError("Must be Filled");
            return false;
        }
        if (password.length() == 0) {
            password.setError("Must be Filled");
            return false;
        }
        if (email.length() == 0) {
            email.setError("Must be Filled");
            return false;
        }
        if (weight.length() == 0) {
            weight.setError("Must be Filled");
            return false;
        }
        if (height.length() == 0) {
            height.setError("Must be Filled");
            return false;
        }
        if (radioGender.getCheckedRadioButtonId() == -1) {
            radioFemale.setError("Please Chose ur Gender");
            return false;
        }

        if (!checkBoxTop.isChecked() && !checkBoxMid.isChecked() && !checkBoxBot.isChecked()) {
            Toast.makeText(RegisterActivity.this,"Please Choose ur Body Target ",Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }
    //Method register
    public void register(){
        //Request Api Login ke Laravel dengan Address Constant -> Register
        StringRequest request = new StringRequest(Request.Method.POST, Constant.REGISTER, response -> {
            try {
                JSONObject object = new JSONObject(response);
                if (object.getBoolean("success")){

                    //Input data user ke shared preferences table users di ambil dari response API
                    JSONObject user = object.getJSONObject("user");
                    SharedPreferences userPref = getApplication().getSharedPreferences("user", Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor = userPref.edit();
                    editor.putString("token",object.getString("token"));
                    editor.putString("id",user.getString("id"));
                    editor.putBoolean("isLoggedIn", true);

                    //Input data user ke database tabel users diamhbil dari response API
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
                    editor.apply();

                    Toast.makeText(RegisterActivity.this, "Register success.", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(RegisterActivity.this, MainActivity.class);
                    startActivity(intent);
                }
            }catch(JSONException e){
                e.printStackTrace();
            }
        },error -> {
            error.printStackTrace();
        }){
            //input parameter login yaitu semua data user
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                HashMap<String,String> map = new HashMap<>();
                map.put("email",getsEmail);
                map.put("password",getsPass);
                map.put("name",getsName);
                map.put("age",getsAge);
                map.put("gender",getsGender);
                map.put("bodyWeight",getsWeight);
                map.put("bodyHeight",getsHeight);
                map.put("partOfDreamBody",getsBody);
                return map;
            }
        };

        RequestQueue queue = Volley.newRequestQueue(RegisterActivity.this);
        queue.add(request);
    }


    public void changeStatusBarColor() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(getResources().getColor(R.color.register_bk_color));
        }
    }

    public void onLoginClick(View view) {
        startActivity(new Intent(this, LoginActivity.class));
        overridePendingTransition(R.anim.slide_in_left, android.R.anim.slide_out_right);
    }

    public void Masuk(View view) {
        Intent intent = new Intent(RegisterActivity.this, MainActivity.class);
        startActivity(intent);
    }
}