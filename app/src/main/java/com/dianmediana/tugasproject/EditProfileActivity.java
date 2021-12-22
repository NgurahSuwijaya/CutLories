package com.dianmediana.tugasproject;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.BlockingDeque;

public class EditProfileActivity extends AppCompatActivity {

    private ImageView imageViewProfile;
    private EditText editTextName, editTextAge, editTextWeight, editTextHeight;
    private CheckBox checkBoxBottom, checkBoxMid, checkBoxTop;
    private Button buttonEdit;
    private RadioGroup radioGroupGender;
    private RadioButton radioButtonMale, radioButtonFemale;
    private TextView textViewSelectPhoto, textViewNameProfile;
    private static final int GALLERY_ADD_PROFILE = 1;
    private SharedPreferences userPref;
    private Bitmap bitmap = null;
    private ProgressDialog progressDialog;
    private String stringGetName, stringGetAge, stringGetWeight, stringGetHeight, stringGetBody, stringGetGender;
    private String stringSetName, stringSetAge, stringSetWeight, stringSetHeight, stringSetBody, stringSetGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);
        getSupportActionBar().hide();
        progressDialog = new ProgressDialog(this);
        userPref = getApplicationContext().getSharedPreferences("user", Context.MODE_PRIVATE);
        textViewNameProfile = findViewById(R.id.textViewNameProfile);
        editTextAge= findViewById(R.id.editTextProfileAge);
        editTextName= findViewById(R.id.editTextProfileName);
        editTextWeight= findViewById(R.id.editTextProfileWeight);
        editTextHeight= findViewById(R.id.editTextProfileHeight);
        checkBoxBottom= findViewById(R.id.checkBoxProfileBottom);
        checkBoxMid= findViewById(R.id.checkBoxProfileMid);
        checkBoxTop= findViewById(R.id.checkBoxProfileTop);
        buttonEdit= findViewById(R.id.changeProfileButton);
        textViewSelectPhoto = findViewById(R.id.textViewChangePhoto);
        imageViewProfile = findViewById(R.id.imageEditProfileEdit);
        radioButtonFemale = findViewById(R.id.radioButtonProfileFemale);
        radioButtonMale = findViewById(R.id.radioButtonProfileMale);
        radioGroupGender = findViewById(R.id.radioGroupProfileGender);

        stringSetName = userPref.getString("name","");
        stringSetAge= userPref.getString("age",""); ;
        stringSetWeight= userPref.getString("bodyWeight","");;
        stringSetHeight= userPref.getString("bodyHeight","");;
        stringSetBody= userPref.getString("partOfDreamBody","");;
        stringSetGender= userPref.getString("gender","");;

        editTextName.setText(stringSetName);
        editTextAge.setText(stringSetAge);
        editTextWeight.setText(stringSetWeight);
        editTextHeight.setText(stringSetHeight);

        if(stringSetGender.equals("Male")){
            radioButtonMale.setChecked(true);
        }else if(stringSetGender.equals("Female")){
            radioButtonFemale.setChecked(true);
        }

        String[] splitRole = stringSetBody.split(";");
        for(int i=0; i<=splitRole.length-2; i++) {
            if (splitRole[i].replaceAll("\\s+", "").equals("Bottom")) {
                checkBoxBottom.setChecked(true);
            } else if (splitRole[i].replaceAll("\\s+", "").equals("Top")){
                checkBoxTop.setChecked(true);
            } else if (splitRole[i].replaceAll("\\s+", "").equals("Mid")){
                checkBoxMid.setChecked(true);
            }
        }

        stringGetBody = "";
        if(checkBoxMid.isChecked()){
            stringGetBody = stringGetBody + "Mid; ";
        }
        if(checkBoxTop.isChecked()){
            stringGetBody = stringGetBody + "Top; ";
        }
        if(checkBoxBottom.isChecked()){
            stringGetBody = stringGetBody + "Bottom; ";
        }

        textViewSelectPhoto.setOnClickListener(v-> {
            Intent intent = new Intent(Intent.ACTION_PICK);
            intent.setType("image/*");
            startActivityForResult(intent, GALLERY_ADD_PROFILE);
        });

        buttonEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editUserProfile();
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==GALLERY_ADD_PROFILE && requestCode==RESULT_OK){
            Uri imgUri = data.getData();
            imageViewProfile.setImageURI(imgUri);

            try {
                bitmap = MediaStore.Images.Media.getBitmap(getContentResolver(),imgUri);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void editUserProfile(){
        progressDialog.setMessage("Saving");
        progressDialog.show();
        stringGetName = editTextName.getText().toString().trim();
        stringGetAge = editTextAge.getText().toString().trim();
        stringGetWeight = editTextWeight.getText().toString().trim();
        stringGetHeight = editTextHeight.getText().toString().trim();

        //Gender radio button
        int selectedGender = radioGroupGender.getCheckedRadioButtonId();
        stringGetGender="";
        if (selectedGender == radioButtonMale.getId()) {
            stringGetGender = radioButtonMale.getText().toString().trim();
        } else if (selectedGender == radioButtonFemale.getId()) {
            stringGetGender = radioButtonFemale.getText().toString().trim();
        }

        Log.d("gender", stringGetGender);
        //role Checkbox
        stringGetBody = "";
        if (checkBoxTop.isChecked()) {
            stringGetBody = stringGetBody + "Top; ";
        }
        if (checkBoxMid.isChecked()) {
            stringGetBody = stringGetBody + "Mid; ";
        }
        if (checkBoxBottom.isChecked()) {
            stringGetBody = stringGetBody + "Bottom; ";
        }
        stringGetBody = stringGetBody + ".";

        Log.d("ageeeeeggege", stringGetAge);
        Log.d("nqnqnenqen", stringGetName);

        StringRequest request = new StringRequest(Request.Method.POST, Constant.EDIT_PROFILE, response -> {
            try {
                JSONObject object = new JSONObject(response);
                Log.d("TAG", String.valueOf(object));
                if (object.getBoolean("success")){
                    SharedPreferences.Editor editor = userPref.edit();
                    editor.putString("name",object.getString("name"));
                    editor.putString("age",object.getString("age"));
                    editor.putString("bodyHeight",object.getString("bodyHeight"));
                    editor.putString("bodyWeight",object.getString("bodyWeight"));
                    editor.putString("gender",object.getString("gender"));
                    editor.putString("photo",object.getString("photo"));
                    editor.putString("partOfDreamBody",object.getString("partOfDreamBody"));
                    editor.apply();
                    Toast.makeText(EditProfileActivity.this, "Edit Success.", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(EditProfileActivity.this, MainActivity.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(EditProfileActivity.this, "MACAMDLDLL", Toast.LENGTH_SHORT).show();
                }
            }catch (JSONException e){
                e.printStackTrace();
                Toast.makeText(EditProfileActivity.this, "TOLTOL", Toast.LENGTH_SHORT).show();
                progressDialog.dismiss();
            }
            Toast.makeText(EditProfileActivity.this, "GBLK", Toast.LENGTH_SHORT).show();
            progressDialog.dismiss();
        },error -> {
            error.printStackTrace();
            Toast.makeText(EditProfileActivity.this, "Easdasdss.", Toast.LENGTH_SHORT).show();
            progressDialog.dismiss();
        }){
            @Override
            public Map<String, String> getHeaders() throws AuthFailureError {
                String token = userPref.getString("token","");
                Log.d("TOKENNNNNNNN", token);
                HashMap<String,String> map = new HashMap<>();
                map.put("Authorization","Bearer "+token);
                return map;
            }

            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                HashMap<String,String> map = new HashMap<>();
                map.put("name",stringGetName);
                map.put("age",stringGetAge);
                map.put("gender", stringGetGender);
                map.put("bodyWeight",stringGetWeight);
                map.put("bodyHeight",stringGetHeight);
                map.put("partOfDreamBody", stringGetBody);
                map.put("photo", bitmapToString(bitmap));
                return map;
            }
        };
        RequestQueue queue = Volley.newRequestQueue(EditProfileActivity.this);
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