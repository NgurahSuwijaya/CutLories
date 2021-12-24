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

public class MenuAppetizers extends AppCompatActivity {
    ArrayList<DataModelRecipe> dataholder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_appetizers);
        getSupportActionBar().hide();

        ImageView back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuAppetizers.this, MainActivity.class);
                startActivity(intent);
            }
        });

//        getData();
    }

    private void prosesRecyclerViewAdapter() {
        RecyclerView recyclerView = findViewById(R.id.appetizersView);
        MyAdapterRecipe adapter = new MyAdapterRecipe(dataholder, this);
        recyclerView.setAdapter(adapter);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setHasFixedSize(true);
    }

//    private void getData() {
//
//        dataholder = new ArrayList<>();
//        dataholder.add(new DataModelRecipe
//                (1,"https://cdns.klimg.com/merdeka.com/i/w/news/2020/06/16/1188018/content_images/670x335/20200616120450-1-8-resep-makanan-sehat-untuk-diet-rendah-kalori-dan-bernutrisi-tinggi-007-ayu-isti.jpg",
//                        "Alpukat Telur Panggang",
//                        "300 kkal",
//                        "30 menit",
//                        "1 porsi",
//                        "- 1 buah alpukat\n- 1 butir telur ayam\n- Oregano secukupnya\n- Merica bubuk secukupnya",
//                        "1. Potong buah alpukat menjadi dua, kemudian buang bijinya \n\n2. Masukan telur ke dalam cekungan buah alpukat. \n\n3. Masukkan ke dalam oven, panggang 15-20 menit. \n\n4. Taburkan oregano dan merica bubuk, \n\n5. Baked egg avocado siap untuk disajikan.")
//        );
//
//        dataholder.add(new DataModelRecipe
//                (2,"https://cdns.klimg.com/merdeka.com/i/w/news/2020/06/16/1188018/content_images/670x335/20200616120451-1-8-resep-makanan-sehat-untuk-diet-rendah-kalori-dan-bernutrisi-tinggi-006-ayu-isti.jpg",
//                        "Tahu Kukus Tuna",
//                        "188 kkal",
//                        "35 menit",
//                        "3 porsi",
//                        "- 1 kg daging ikan tuna\n- 1/4 kg tepung terigu\n- tahu pong secukupnya\n- 1/2 kg tepung tapioka\n 5 siung bawang putih (haluskan)\n garam secukupnya\n lada bubuk secukupnya\n 1 bungkus penyedap rasa ayam\n es batu secukupnya",
//                        "1. Cuci daging ikan tuna dengan air bersih yang mengalir. Hilangkan duri dan kulit tuna. Kemudian haluskan dengan di blender atau ditumbuk. \n\n2. Campurkan dengan tepung terigu, tapioka, garam, lada, penyedap rasa. Aduk semua bahan hingga rata, kemudian masukkan es batu secukupnya, sambil terus diuleni. \n\n3. Masukkan adonan ke dalam tahu pong satu per satu sesuai selera. Jika sudah dimasukkan ke dalam tahu, kukus tahu pada panci dengan api sedang. Kukus selama 25 menit. \n\n4. Jika sudah matang, buka tutup panci dan biarkan tahu tuna dingin. Jika ingin menikmati goreng dengan minyak panas dan menggunakan api sedang. Tahu tuna dapat bertahan lama, bila disimpan di freezer.")
//        );
//
//        dataholder.add(new DataModelRecipe
//                (3,"https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fstatic.onecms.io%2Fwp-content%2Fuploads%2Fsites%2F44%2F2016%2F06%2F03%2F7798756.jpg",
//                        "Salad Tortellini",
//                        "255 kkal",
//                        "40 menit",
//                        "8 porsi",
//                        "- 1 pon tortellini keju segar atau beku, lebih disukai gandum utuh\n- 1 cangkir tomat kering\n- 1 14 ons artichoke hati, dibilas dan seperempat\n- 1 7-ons toples paprika merah panggang, dibilas dan dicincang\n- 1 cangkir tomat ceri, dibelah dua, atau 2 tomat matang, cincang\n- 4 daun bawang, cincang kasar\n- 1/2 cangkir kemangi segar cincang halus\n- 1 ons prosciutto, dipangkas (opsional)\n- 1/8 sendok teh garam\n- Lada yang baru digiling, secukupnya\n- Arugula, untuk penyajian (opsional)\n- 2 tomat matang, dibelah dua\n- 2 sendok makan cuka anggur merah\n- 1 sendok makan minyak zaitun extra-virgin\n- 1 sendok teh oregano kering\n- 1 siung bawang putih, cincang",
//                        "1. Didihkan air di panci besar. Masak tortellini sampai hanya empuk, 8 hingga 12 menit atau sesuai dengan petunjuk paket. Tiriskan dan bilas di bawah air dingin. Transfer ke mangkuk besar. \n\n2. Sementara itu, letakkan tomat kering matahari dalam mangkuk kecil dan tutup dengan lebih banyak air mendidih. Diamkan selama 30 menit. Tiriskan dan potong kasar. \n\n3. Tambahkan tomat kering matahari ke tortellini bersama dengan hati artichoke, paprika merah panggang, tomat, daun bawang, kemangi dan prosciutto, jika digunakan. Bumbui dengan garam dan merica. \n\n4. Untuk menyiapkan Tomato Vinaigrette: Bekerja di atas mangkuk, gosok bagian tomat di sisi berlubang besar dari parutan kotak sampai hanya kulit yang tersisa. Buang kulitnya. Tambahkan cuka, minyak, oregano, bawang putih, garam dan merica ke jus tomat dan kocok sampai tercampur. \n\n5. Tambahkan Tomato Vinaigrette ke salad dan toss tortellini. Sajikan salad di atas tempat tidur arugula, jika diinginkan.")
//        );
//
//        dataholder.add(new DataModelRecipe
//                (4,"https://cdn-image.realsimple.com/sites/default/files/styles/portrait_435x518/public/1475604166/herb-fingerlings.jpg?itok=z12R6f8v",
//                        "Oven-Roasted Garlic Herb Parmesan Potatoes",
//                        "99 kkal",
//                        "55 menit",
//                        "4 porsi",
//                        "- 2 sendok makan minyak zaitun atau sesuai kebutuhan\n- 2 sdm keju parut\n- 1/2 sendok teh garam\n- 1/2 sendok teh bubuk bawang putih\n- 1/4 sendok teh bubuk lada hitam\n- 2 pon kentang",
//                        "1. Panaskan oven sampai 400 derajat F lalu tutup panci dengan kertas aluminium foil. \n\n2. Campur minyak, keju parut, garam, bubuk bawang putih, dan lada hitam dalam mangkuk. \n\n3. Balurkan kentang dengan bahan-bahan tadi. \n\n4. Atur kentang ke dalam loyang yang sudah disiapkan. \n\n5. Panggang dalam oven yang sudah dipanaskan selama 15 sampai 20 menit. \n\n6. Balik kentang dan lanjutkan panggang sampai renyah dan berwarna keemasan sekitar 15 sampai 20 menit. \n\n7. Saijkan!")
//        );
//
//        dataholder.add(new DataModelRecipe
//                (5,"https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fstatic.onecms.io%2Fwp-content%2Fuploads%2Fsites%2F44%2F2019%2F09%2F13%2F7104344.jpg",
//                        "Salad Gorgonzola",
//                        "207 kkal",
//                        "10 menit",
//                        "4 porsi",
//                        "- 2 sendok makan minyak zaitun\n- 2 sendok makan jus lemon segar (dari 1 lemon)\n- 2 sendok madu\n- 1 sendok thyme segar cincang\n- 1 sendok mustard Dijon\n- 1/2 sendok lada hitam\n- 1/4 sendok garam kosher\n- 4 cangkir selada bayi campuran\n- 1 pir Bosc matang sedang, diiris tipis\n- 1/4 cangkir keju Gorgonzola yang dihanyuhkan\n- 1/4 cangkir kenari panggang, cincang kasar\n- 1/4 cangkir kismis emas",
//                        "1. Kocok bersama minyak, jus lemon, madu, thyme, mustard, merica dan garam dalam mangkuk besar. Tambahkan selada dan toss lembut untuk digabungkan. Atas dengan irisan pir, Gorgonzola, kenari dan kismis. Sajikan segera.")
//        );
//
//        dataholder.add(new DataModelRecipe
//                ("https://www.tasteofhome.com/wp-content/uploads/2017/10/exps182562_SD163575D10_13_4b.jpg",
//                        "Wortel Panggang",
//                        "88 kkal",
//                        "30 menit",
//                        "4 porsi",
//                        "- 3 sendok makan minyak zaitun\n- 12 wortel\n- 1 1/4 sendok teh garam \n- 1/2 sendok teh lada hitam yang baru digiling\n- 2 sdm peterseli",
//                        "1. Panaskan oven sampai 400 derajat F. \n\n2. Jika wortel tebal, potonglah setengahnya; jika tidak, biarkan. \n\n3. Iris wortel secara diagonal sekitar 1 1/2 inci. \n\n4. Masukkan ke dalam mangkuk dengan minyak zaitun, garam, dan merica.\n\n5. Panggang di oven selama 20 menit, sampai kecoklatan dan empuk.\n\n6. Hias dengan peterseli.\n\n7. Sajikan!")
//        );
//
//        dataholder.add(new DataModelRecipe
//                ("https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fstatic.onecms.io%2Fwp-content%2Fuploads%2Fsites%2F44%2F2019%2F08%2F26231119%2F3921638.jpg",
//                        "Panini Tuna Mediterania",
//                        "275 kkal",
//                        "25 menit",
//                        "4 porsi",
//                        "- 2 kaleng 6 ons bongkahan tuna ringan, dikeringkan\n- 1 tomat prem, cincang\n- 1/4 cangkir keju feta hancur\n- 2 sendok makan cincang hati artichoke diasinkan\n- 2 sendok makan bawang merah cincang\n- 1 sendok makan zaitun Kalamata yang diadu cincang\n- 1 sendok teh caper, dibilas dan dicincang\n- 1 sendok teh jus lemon\n- 1/2 Lada yang baru digiling, secukupnya\n- 2 sendok teh minyak canola\n- 8 iris roti gandum utuh",
//                        "1. Memiliki empat kaleng 15 ons dan wajan sedang (bukan antilengket) yang siap di dekat kompor. \n\n2. Tempatkan tuna dalam mangkuk sedang dan serpihan dengan garpu. Tambahkan tomat, feta, artichoke, bawang, zaitun, caper, jus lemon dan merica; aduk untuk menggabungkan. Bagi campuran tuna di antara 4 iris roti (masing-masing sekitar 1/2 cangkir). Atas dengan roti yang tersisa. \n\n3. Panaskan 1 sendok teh minyak canola dalam wajan antilengket besar dengan api sedang. Tempatkan 2 panini di wajan. Tempatkan wajan sedang di atas panini, lalu timbang dengan kaleng. Masak panini sampai keemasan di satu sisi, sekitar 2 menit. Kurangi api menjadi sedang-rendah, balikkan panini, ganti wajan dan kaleng atas, dan masak sampai sisi kedua berwarna keemasan, 1 hingga 3 menit lagi. Ulangi dengan 1 sendok teh minyak dan panini yang tersisa.")
//        );
//
//        dataholder.add(new DataModelRecipe
//                ("https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fimages.media-allrecipes.com%2Fuserphotos%2F4027926.jpg&w=767&h=767&c=sc&poi=face&q=85",
//                        "Kalkun Kale Bungkus",
//                        "293 kkal",
//                        "10 menit",
//                        "1 porsi",
//                        "- 1 sendok makan saus cranberry\n- 1 sendok teh Dijon mustard\n- 3 daun kangkung lacinato sedang\n- 3 irisan kalkun deli (sekitar 3 ons)\n- 6 irisan bawang merah tipis\n- 1 pir matang, potong menjadi 9 irisan",
//                        "1. Campur saus cranberry dan mustard dalam mangkuk kecil. Tersebar di daun kangkung. Atas setiap daun dengan sepotong kalkun, 2 iris bawang merah dan 3 iris pir. Gulung setiap daun ke dalam bungkus. Potong setiap bungkus menjadi dua, jika diinginkan.")
//        );
//
//        dataholder.add(new DataModelRecipe
//                ("https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fimages.media-allrecipes.com%2Fuserphotos%2F4499611.jpg&w=767&h=767&c=sc&poi=face&q=85",
//                        "Secangkir Mie Kari Ayam",
//                        "235 kkal",
//                        "15 menit",
//                        "3 porsi",
//                        "- 3 sendok pasta bouillon ayam natrium halus, bagi-bagi\n- 6 sendok pasta kari merah, bagi-bagi\n- 6 sendok makan santan, sendok\n- 1 1/2 cangkir campuran yang diseruankan tumis beku, bagi\n- 9 ons cincang cincang hingga tulang, dada ayam tanpa kulit, bagi\n- 1 1/2 cangkir mie zucchini spiral, berbagi\n- 3 sendok ketumbar cincang, bagi\n- 3 cangkir air yang sangat panas, bagi",
//                        "1. Tambahkan 1 sendok teh pasta bouillon, 2 sendok teh pasta kari dan 2 sendok makan santan ke masing-masing tiga botol pengalengan 1 1/2 pint. Lapisan 1/2 cangkir sayuran, 3 ons ayam dan 1/2 cangkir mie di setiap toples. Atas masing-masing dengan 1 sendok teh cilantro. Tutup dan dinginkan hingga 3 hari. \n\n2. Untuk menyiapkan satu toples mie: Tambahkan 1 cangkir air yang sangat panas ke dalam stoples. Tutup dan kocok untuk digabungkan. Buka dan microwave di High dengan kenaikan 1 menit sampai panas mengepul, total 2 hingga 3 menit. Diamkan 5 menit. Aduk sebelum makan.")
//        );
//
//        dataholder.add(new DataModelRecipe
//                ("https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fimages.media-allrecipes.com%2Fuserphotos%2F6817070.jpg&w=767&h=767&c=sc&poi=face&q=85",
//                        "Greek Stuffed Portobello Mushrooms",
//                        "151 kkal",
//                        "25 menit",
//                        "4 porsi",
//                        "- 3 sendok makan minyak zaitun extra-virgin, dibagi\n- 1 siung bawang putih, cincang\n- 1/2 sendok teh lada, dibagi\n- 1/4 sendok teh garam\n- 4 jamur portobello (sekitar 14 ons), dibersihkan\n- 1 cangkir bayam cincang\n- 1/2 cangkir tomat ceri seperempat\n- 1/3 cangkir keju feta hancur\n- 2 sendok makan zaitun Kalamata\n- 1 sendok makan oregano segar cincang",
//                        "1. Panaskan oven hingga 400 derajat F. \n\n2. Campurkan 2 sendok makan minyak, bawang putih, 1/4 sendok teh merica dan garam dalam mangkuk kecil. Menggunakan sikat silikon, lapisi jamur di seluruh dengan campuran minyak. Tempatkan di atas loyang berbingkai besar dan panggang sampai jamur sebagian besar lembut, 8 hingga 10 menit. \n\n3. Sementara itu, kombinasikan bayam, tomat, feta, zaitun, oregano dan sisanya 1 sendok makan minyak dalam mangkuk sedang. Setelah jamur melunak, angkat dari oven dan isi dengan campuran bayam. Panggang sampai tomat layu, sekitar 10 menit.")
//        );
//
//        dataholder.add(new DataModelRecipe
//                ("https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fimages.media-allrecipes.com%2Fuserphotos%2F5143673.jpg&w=596&h=596&c=sc&poi=face&q=85",
//                        "Salad Brokoli dengan Bacon",
//                        "246 kkal",
//                        "20 menit",
//                        "5 porsi",
//                        "- 1/2 cangkir mayones\n- 1 sendok makan mustard gandum utuh\n- 1 sendok makan cuka sari\n- 1 siung kecil bawang putih, parut\n- 1 sendok teh gula\n- 1/4 sendok teh lada bubuk\n- 4 cangkir mahkota brokoli cincang halus\n- 1 cangkir kembang kol cincang halus\n- 1/4 cangkir bawang merah cincang halus\n- 3 iris daging asap yang dimasak, cincang (1/4 cangkir)\n- 3 sendok makan biji bunga matahari, dipanggang",
//                        "1. Kocok mayones, mustard, cuka, bawang putih, gula, dan merica dalam mangkuk besar. Tambahkan brokoli, kembang kol, bawang, bacon, dan biji bunga matahari. Aduk ke mantel.")
//        );
//
//        prosesRecyclerViewAdapter();
//    }
}