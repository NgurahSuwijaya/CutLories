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

public class MenuSupper extends AppCompatActivity {

    ArrayList<DataModelRecipe> dataholder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_supper);
        getSupportActionBar().hide();

        ImageView back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuSupper.this, MainActivity.class);
                startActivity(intent);
            }
        });

        getData();
    }

    private void prosesRecyclerViewAdapter() {
        RecyclerView recyclerView = findViewById(R.id.supperView);
        MyAdapterRecipe adapter = new MyAdapterRecipe(dataholder, this);
        recyclerView.setAdapter(adapter);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setHasFixedSize(true);
    }

    private void getData() {

        dataholder = new ArrayList<>();
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
                ("https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fstatic.onecms.io%2Fwp-content%2Fuploads%2Fsites%2F44%2F2019%2F09%2F13%2F7104344.jpg",
                        "Salad Gorgonzola",
                        "207 kkal",
                        "10 menit",
                        "4 porsi",
                        "- 2 sendok makan minyak zaitun\n- 2 sendok makan jus lemon segar (dari 1 lemon)\n- 2 sendok madu\n- 1 sendok thyme segar cincang\n- 1 sendok mustard Dijon\n- 1/2 sendok lada hitam\n- 1/4 sendok garam kosher\n- 4 cangkir selada bayi campuran\n- 1 pir Bosc matang sedang, diiris tipis\n- 1/4 cangkir keju Gorgonzola yang dihanyuhkan\n- 1/4 cangkir kenari panggang, cincang kasar\n- 1/4 cangkir kismis emas",
                        "1. Kocok bersama minyak, jus lemon, madu, thyme, mustard, merica dan garam dalam mangkuk besar. Tambahkan selada dan toss lembut untuk digabungkan. Atas dengan irisan pir, Gorgonzola, kenari dan kismis. Sajikan segera.")
        );

        dataholder.add(new DataModelRecipe
                ("https://www.tasteofhome.com/wp-content/uploads/2017/10/exps182562_SD163575D10_13_4b.jpg",
                        "Wortel Panggang",
                        "88 kkal",
                        "30 menit",
                        "4 porsi",
                        "- 3 sendok makan minyak zaitun\n- 12 wortel\n- 1 1/4 sendok teh garam \n- 1/2 sendok teh lada hitam yang baru digiling\n- 2 sdm peterseli",
                        "1. Panaskan oven sampai 400 derajat F. \n\n2. Jika wortel tebal, potonglah setengahnya; jika tidak, biarkan. \n\n3. Iris wortel secara diagonal sekitar 1 1/2 inci. \n\n4. Masukkan ke dalam mangkuk dengan minyak zaitun, garam, dan merica.\n\n5. Panggang di oven selama 20 menit, sampai kecoklatan dan empuk.\n\n6. Hias dengan peterseli.\n\n7. Sajikan!")
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

        dataholder.add(new DataModelRecipe
                ("https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fimages.media-allrecipes.com%2Fuserphotos%2F5143673.jpg&w=596&h=596&c=sc&poi=face&q=85",
                        "Salad Brokoli dengan Bacon",
                        "246 kkal",
                        "20 menit",
                        "5 porsi",
                        "- 1/2 cangkir mayones\n- 1 sendok makan mustard gandum utuh\n- 1 sendok makan cuka sari\n- 1 siung kecil bawang putih, parut\n- 1 sendok teh gula\n- 1/4 sendok teh lada bubuk\n- 4 cangkir mahkota brokoli cincang halus\n- 1 cangkir kembang kol cincang halus\n- 1/4 cangkir bawang merah cincang halus\n- 3 iris daging asap yang dimasak, cincang (1/4 cangkir)\n- 3 sendok makan biji bunga matahari, dipanggang",
                        "1. Kocok mayones, mustard, cuka, bawang putih, gula, dan merica dalam mangkuk besar. Tambahkan brokoli, kembang kol, bawang, bacon, dan biji bunga matahari. Aduk ke mantel.")
        );

        prosesRecyclerViewAdapter();
    }
}