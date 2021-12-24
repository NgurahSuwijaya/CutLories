package com.dianmediana.tugasproject.user;

import static android.app.Activity.RESULT_OK;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;

import android.provider.MediaStore;
import android.util.Base64;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
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
import com.dianmediana.tugasproject.Constant;
import com.dianmediana.tugasproject.EditProfileActivity;
import com.dianmediana.tugasproject.MainActivity;
import com.dianmediana.tugasproject.RegisterActivity;
import com.dianmediana.tugasproject.main.HitungBerat;
import com.dianmediana.tugasproject.R;
import com.dianmediana.tugasproject.model.DataModelUsers;
import com.dianmediana.tugasproject.sqlite.DbHelper;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;

public class ProfileFragment extends Fragment implements View.OnClickListener {

    private ImageButton imageButtonHitung;
    private Button buttonEdit;
    private TextView name, email;
    private ArrayList<DataModelUsers> users = new ArrayList<>();
    SharedPreferences userPref;
    DbHelper db;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        db = new DbHelper(getActivity());
        imageButtonHitung = view.findViewById(R.id.hitung);
        name = view.findViewById(R.id.textViewNameProfile);
        email = view.findViewById(R.id.textViewEmailProfile);
        buttonEdit = view.findViewById(R.id.cirChangeProfileButton);
        imageButtonHitung.setOnClickListener(this);

        //mengambil data dari database dan ditampilkan yaitu username dan email
        users = db.readAllData();
        String DbName = users.get(0).getName();
        String DbEmail = users.get(0).getEmail();

        name.setText(DbName);
        email.setText(DbEmail);

        buttonEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext().getApplicationContext(), EditProfileActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_profile_new, container, false);
        return view;
    }

    @Override
    public void onClick(View v) {
        imageButtonHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), HitungBerat.class);
                startActivity(intent);
            }
        });
    }
}