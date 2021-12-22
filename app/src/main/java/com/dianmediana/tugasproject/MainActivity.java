package com.dianmediana.tugasproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.dianmediana.tugasproject.user.AboutUs;
import com.dianmediana.tugasproject.user.ProfileFragment;
import com.etebarian.meowbottomnavigation.MeowBottomNavigation;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    MeowBottomNavigation bottomNavigation;
    SharedPreferences userPref;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userPref = getApplicationContext().getSharedPreferences("user", Context.MODE_PRIVATE);

        this.getSupportActionBar().setTitle("Cutlories");

        this.getSupportActionBar().setBackgroundDrawable(getResources().getDrawable(R.drawable.login_button_bk));

        this.getSupportActionBar().setDisplayOptions( getSupportActionBar().DISPLAY_SHOW_TITLE
                | getSupportActionBar().DISPLAY_SHOW_HOME
                | getSupportActionBar().DISPLAY_SHOW_CUSTOM
                | getSupportActionBar().DISPLAY_USE_LOGO);

        bottomNavigation=findViewById(R.id.bottom_navigation);

        bottomNavigation.add(new MeowBottomNavigation.Model(1,R.drawable.ic_recipe));
        bottomNavigation.add(new MeowBottomNavigation.Model(2,R.drawable.ic_recommendation));
        bottomNavigation.add(new MeowBottomNavigation.Model(3,R.drawable.ic_tips));
        bottomNavigation.add(new MeowBottomNavigation.Model(4,R.drawable.ic_profile));

        bottomNavigation.setOnShowListener(new MeowBottomNavigation.ShowListener() {
            @Override
            public void onShowItem(MeowBottomNavigation.Model item) {
                Fragment fragment = null;
                switch (item.getId()) {
                    case 1:
                        fragment = new RecipeFragment();
                        break;
                    case 2:
                        fragment = new RecommendationFragment();
                        break;
                    case 3:
                        fragment = new TipsFragment();
                        break;
                    case 4:
                        fragment = new ProfileFragment();
                        break;
                }
                loadFragment(fragment);
            }
        });

        bottomNavigation.show(1, true);

        bottomNavigation.setOnClickMenuListener(new MeowBottomNavigation.ClickListener() {
            @Override
            public void onClickItem(MeowBottomNavigation.Model item) {
//                Toast.makeText(getApplicationContext()
//                , "You Clicked " + item.getIcon()
//                ,Toast.LENGTH_SHORT).show();
            }
        });

        bottomNavigation.setOnReselectListener(new MeowBottomNavigation.ReselectListener() {
            @Override
            public void onReselectItem(MeowBottomNavigation.Model item) {
//                Toast.makeText(getApplicationContext()
//                        , "You Reselected " + item.getIcon()
//                        ,Toast.LENGTH_SHORT).show();
            }
        });

//        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, new RecommendationFragment()).commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        getMenuInflater().inflate(R.menu.main,menu);

//        MenuItem menuItem = menu.findItem(R.id.action_search);
//
//        final SearchView searchView = (SearchView) MenuItemCompat.getActionView(menuItem);
//        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
//            @Override
//            public boolean onQueryTextSubmit(String query){
//                searchView.clearFocus();
//                return false;
//            }
//
//            @Override
//            public boolean onQueryTextChange(String newText) {
//                return false;
//            }
//        });
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
// user clicked a menu-item from ActionBar
        int id = item.getItemId();

        if (id == R.id.about) {
            Intent intent = new Intent(MainActivity.this, AboutUs.class);
            startActivity(intent);
            return true;
        }
        else if (id == R.id.logout) {
            Log.d("sebelum SR", "ayam: ");
            StringRequest request = new StringRequest(Request.Method.GET, Constant.LOGOUT, response -> {
                Log.d("sebelum SR", "ayam:2 ");
                try {
                    JSONObject object = new JSONObject(response);
                    Log.d("sebelum SR", String.valueOf(object));
                    if (object.getBoolean("success")){
                        Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                        startActivity(intent);
                    }
                } catch (JSONException e){
                    Toast.makeText(MainActivity.this, "Logout Failed", Toast.LENGTH_SHORT).show();
                    e.printStackTrace();
                }
            },error -> {
                Toast.makeText(MainActivity.this, "Logout Failed", Toast.LENGTH_SHORT).show();
                error.printStackTrace();
            }){
                @Override
                public Map<String, String> getHeaders() throws AuthFailureError {
                    String token = userPref.getString("token","");
                    Log.d("TOKENNNNNNNN", token);
                    HashMap<String,String> map = new HashMap<>();
                    map.put("Authorization","Bearer "+token);
                    return map;
                }
            };

            RequestQueue queue = Volley.newRequestQueue(getApplicationContext());
            queue.add(request);
        }
        return false;
    }

    private void loadFragment(Fragment fragment) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.frame_layout,fragment)
                .commit();
    }
}