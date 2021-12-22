package com.dianmediana.tugasproject.menu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.dianmediana.tugasproject.MainActivity;
import com.dianmediana.tugasproject.R;
import com.dianmediana.tugasproject.adapter.MyAdapterRecipe;
import com.dianmediana.tugasproject.model.DataModelRecipe;

import java.util.ArrayList;

public class MenuUnderweight extends AppCompatActivity {

    ArrayList<DataModelRecipe> dataholder;
    MyAdapterRecipe adapter;
//    EditText txt_search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_underweight);
        getSupportActionBar().hide();

        ImageView back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuUnderweight.this, MainActivity.class);
                startActivity(intent);
            }
        });
        getData();
    }

    private void prosesRecyclerViewAdapter() {
        RecyclerView recyclerView = findViewById(R.id.underweightView);
        MyAdapterRecipe adapter = new MyAdapterRecipe(dataholder, this);
        recyclerView.setAdapter(adapter);
//        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setHasFixedSize(true);
    }

    private void getData() {

        dataholder = new ArrayList<>();
        dataholder.add(new DataModelRecipe
                ("https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fstatic.onecms.io%2Fwp-content%2Fuploads%2Fsites%2F44%2F2019%2F08%2F26231119%2F3921638.jpg",
                        "Panini Tuna Mediterania",
                        "275 kkal",
                        "25 menit",
                        "4 porsi",
                        "- 2 kaleng 6 ons bongkahan tuna ringan, dikeringkan\n- 1 tomat prem, cincang\n- 1/4 cangkir keju feta hancur\n- 2 sendok makan cincang hati artichoke diasinkan\n- 2 sendok makan bawang merah cincang\n- 1 sendok makan zaitun Kalamata yang diadu cincang\n- 1 sendok teh caper, dibilas dan dicincang\n- 1 sendok teh jus lemon\n- 1/2 Lada yang baru digiling, secukupnya\n- 2 sendok teh minyak canola\n- 8 iris roti gandum utuh",
                        "1. Memiliki empat kaleng 15 ons dan wajan sedang (bukan antilengket) yang siap di dekat kompor. \n\n2. Tempatkan tuna dalam mangkuk sedang dan serpihan dengan garpu. Tambahkan tomat, feta, artichoke, bawang, zaitun, caper, jus lemon dan merica; aduk untuk menggabungkan. Bagi campuran tuna di antara 4 iris roti (masing-masing sekitar 1/2 cangkir). Atas dengan roti yang tersisa. \n\n3. Panaskan 1 sendok teh minyak canola dalam wajan antilengket besar dengan api sedang. Tempatkan 2 panini di wajan. Tempatkan wajan sedang di atas panini, lalu timbang dengan kaleng. Masak panini sampai keemasan di satu sisi, sekitar 2 menit. Kurangi api menjadi sedang-rendah, balikkan panini, ganti wajan dan kaleng atas, dan masak sampai sisi kedua berwarna keemasan, 1 hingga 3 menit lagi. Ulangi dengan 1 sendok teh minyak dan panini yang tersisa.")
        );

        dataholder.add(new DataModelRecipe
                ("https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fimages.media-allrecipes.com%2Fuserphotos%2F4027926.jpg&w=767&h=767&c=sc&poi=face&q=85",
                        "Kalkun Kale Bungkus",
                        "293 kkal",
                        "10 menit",
                        "1 porsi",
                        "- 1 sendok makan saus cranberry\n- 1 sendok teh Dijon mustard\n- 3 daun kangkung lacinato sedang\n- 3 irisan kalkun deli (sekitar 3 ons)\n- 6 irisan bawang merah tipis\n- 1 pir matang, potong menjadi 9 irisan",
                        "1. Campur saus cranberry dan mustard dalam mangkuk kecil. Tersebar di daun kangkung. Atas setiap daun dengan sepotong kalkun, 2 iris bawang merah dan 3 iris pir. Gulung setiap daun ke dalam bungkus. Potong setiap bungkus menjadi dua, jika diinginkan.")
        );

        dataholder.add(new DataModelRecipe
                ("https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fstatic.onecms.io%2Fwp-content%2Fuploads%2Fsites%2F44%2F2019%2F03%2F08%2F6440442.jpg",
                        "Smoothie Strawberry-Nanas",
                        "255 kkal",
                        "5 menit",
                        "1 porsi",
                        "- 1 cangkir stroberi beku\n- 3/4 cangkir susu almond dingin\n- 1 cangkir nanas segar cincang\n- 1 sendok makan mentega almond",
                        "1. Campurkan stroberi, nanas, susu almond, dan mentega almond dalam blender. Proses sampai halus, tambahkan lebih banyak susu almond, jika diperlukan, untuk konsistensi yang diinginkan. Layani segera.")
        );

        dataholder.add(new DataModelRecipe
                ("https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fstatic.onecms.io%2Fwp-content%2Fuploads%2Fsites%2F44%2F2016%2F06%2F03%2F7798756.jpg",
                        "Salad Tortellini",
                        "255 kkal",
                        "40 menit",
                        "8 porsi",
                        "- 1 pon tortellini keju segar atau beku, lebih disukai gandum utuh\n- 1 cangkir tomat kering\n- 1 14 ons artichoke hati, dibilas dan seperempat\n- 1 7-ons toples paprika merah panggang, dibilas dan dicincang\n- 1 cangkir tomat ceri, dibelah dua, atau 2 tomat matang, cincang\n- 4 daun bawang, cincang kasar\n- 1/2 cangkir kemangi segar cincang halus\n- 1 ons prosciutto, dipangkas (opsional)\n- 1/8 sendok teh garam\n- Lada yang baru digiling, secukupnya\n- Arugula, untuk penyajian (opsional)\n- 2 tomat matang, dibelah dua\n- 2 sendok makan cuka anggur merah\n- 1 sendok makan minyak zaitun extra-virgin\n- 1 sendok teh oregano kering\n- 1 siung bawang putih, cincang",
                        "1. Didihkan air di panci besar. Masak tortellini sampai hanya empuk, 8 hingga 12 menit atau sesuai dengan petunjuk paket. Tiriskan dan bilas di bawah air dingin. Transfer ke mangkuk besar. \n\n2. Sementara itu, letakkan tomat kering matahari dalam mangkuk kecil dan tutup dengan lebih banyak air mendidih. Diamkan selama 30 menit. Tiriskan dan potong kasar. \n\n3. Tambahkan tomat kering matahari ke tortellini bersama dengan hati artichoke, paprika merah panggang, tomat, daun bawang, kemangi dan prosciutto, jika digunakan. Bumbui dengan garam dan merica. \n\n4. Untuk menyiapkan Tomato Vinaigrette: Bekerja di atas mangkuk, gosok bagian tomat di sisi berlubang besar dari parutan kotak sampai hanya kulit yang tersisa. Buang kulitnya. Tambahkan cuka, minyak, oregano, bawang putih, garam dan merica ke jus tomat dan kocok sampai tercampur. \n\n5. Tambahkan Tomato Vinaigrette ke salad dan toss tortellini. Sajikan salad di atas tempat tidur arugula, jika diinginkan.")
        );


        dataholder.add(new DataModelRecipe
                ("https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fimages.media-allrecipes.com%2Fuserphotos%2F6551853.jpg&w=767&h=767&c=sc&poi=face&q=85",
                        "Salad Pasta Zucchini",
                        "299 kkal",
                        "15 menit",
                        "4 porsi",
                        "- 5 sendok makan minyak zaitun extra-virgin\n- 3 sendok makan cuka anggur merah\n- 2 sendok makan oregano segar cincang\n- 2 sendok teh dijon mustard\n- 1/4 sendok teh cabai merah yang dihancurkan\n- 1 bawang merah kecil, cincang\n- 1 siung bawang putih, parut\n- 16 ons mie zucchini spiral\n- 3 cangkir tomat ceri yang dibelah dua\n- 1/3 cangkir zaitun Kalamata\n- 3/4 cangkir keju Parmesan",
                        "1. Kocok minyak, cuka, oregano, mustard, cabai merah yang dihancurkan, bawang merah dan bawang putih dalam mangkuk besar. Tambahkan mie zucchini, tomat, zaitun, dan setengah Parmesan; terlemosok dengan lembut ke mantel. Bagi secara merata di antara 4 mangkuk; taburi dengan Parmesan yang tersisa.")
        );

        prosesRecyclerViewAdapter();
    }
}