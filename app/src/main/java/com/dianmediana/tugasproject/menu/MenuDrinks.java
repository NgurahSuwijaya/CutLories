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

public class MenuDrinks extends AppCompatActivity {

    ArrayList<DataModelRecipe> dataholder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_drinks);
        getSupportActionBar().hide();

        ImageView back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuDrinks.this, MainActivity.class);
                startActivity(intent);
            }
        });

//        getData();
    }

    private void prosesRecyclerViewAdapter() {
        RecyclerView recyclerView = findViewById(R.id.drinksView);
        MyAdapterRecipe adapter = new MyAdapterRecipe(dataholder, this);
        recyclerView.setAdapter(adapter);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setHasFixedSize(true);
    }
//
//    private void getData() {
//
//        dataholder = new ArrayList<>();
//        dataholder.add(new DataModelRecipe
//                ("https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fstatic.onecms.io%2Fwp-content%2Fuploads%2Fsites%2F44%2F2019%2F08%2F26232751%2F3748796.jpg",
//                        "Creamsicle Smoothie",
//                        "184 kkal",
//                        "5 menit",
//                        "2 porsi",
//                        "- 1 cangkir air kelapa murni dingin, tanpa tambahan gula atau rasa \n- 1 cangkir yogurt Yunani nonfat vanili\n- 1 cangkir potongan mangga beku atau segar\n- 3 sendok makan konsentrat jus jeruk beku\n- 2 cangkir es",
//                        "1. Blender air kelapa, yogurt, mangga, konsentrat jus jeruk dan es dalam blender hingga halus.")
//        );
//
//        dataholder.add(new DataModelRecipe
//                ("https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fstatic.onecms.io%2Fwp-content%2Fuploads%2Fsites%2F44%2F2018%2F02%2F23%2F5180252.jpg",
//                        "Milkshake Cokelat Halus",
//                        "191 kkal",
//                        "10 menit",
//                        "2 porsi",
//                        "- 8 ons tahu gaya sutra ringan\n- 2 sendok makan bubuk kakao\n- 1 sendok makan gula \n- 1/2 sendok teh vanili\n- 1 cangkir es krim vanili ringan\n- 1 cangkir es batu",
//                        "1. Dalam blender, kombinasikan tahu, bubuk kakao, gula, dan vanili. Tutup dan blender hingga halus. \n\n2. Ketika blender bekerja, tambahkan es krim dalam sendok kecil melalui pembukaan di tutupnya; tambahkan es batu, satu per satu, sampai konsistensi halus dan diinginkan. Tuang ke dalam gelas dingin untuk disajikan.")
//        );
//
//        dataholder.add(new DataModelRecipe
//                ("https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fstatic.onecms.io%2Fwp-content%2Fuploads%2Fsites%2F44%2F2019%2F08%2F26232635%2F6060589.jpg",
//                        "Smoothie Super Berry",
//                        "118 kkal",
//                        "10 menit",
//                        "4 porsi",
//                        "- 2 cangkir stroberi beku tanpa dilepas\n- 1 cangkir raspberry beku tanpa dilepas\n- 1 cangkir blackberry segar atau blueberry\n- 1 cangkir daun bayam segar\n- 1 cangkir jus delima\n- 3 sendok makan bubuk protein rasa vanili bebas gula, bubuk protein kedelai atau bubuk susu kering nonfat.",
//                        "1. Campurkan stroberi, raspberry, blackberry, bayam, jus delima, dan bubuk protein dalam blender. Tutup dan blender hingga halus. Tuang ke dalam gelas untuk disajikan.")
//        );
//
//        dataholder.add(new DataModelRecipe
//                ("https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fstatic.onecms.io%2Fwp-content%2Fuploads%2Fsites%2F44%2F2021%2F03%2F03%2Fstrawberry-basil-shrub-cocktail-2000.jpg",
//                        "Koktail Strawberry-Basil Shrub",
//                        "198 kkal",
//                        "1 minggu 1 hari",
//                        "16 porsi",
//                        "- 2 cangkir stroberi, lambung dan dibelah dua\n- 1 cangkir gula pasir\n- 1 cangkir cuka rosé atau 1/2 cangkir setiap anggur merah dan cuka anggur putih\n- 1 sprig besar kemangi segar\n- Es batu\n- 2 ons gin\n- 1 ons elderflower liqueur, seperti St. Germain\n- 3 garis putus-putus pahit oranye, seperti Angostura\n- Soda klub atau air seltzer\n- 1 tangkai kemangi segar untuk hiasan",
//                        "1. Untuk menyiapkan shrub: Tuangkan air mendidih di atas stoples quart dan tutup untuk mensterilkan. Diamkan selama 10 menit, lalu kosong dan biarkan dingin. \n\n2. Tambahkan stroberi dan gula ke dalam toples; gunakan sendok kayu untuk menumbuk buah beri sampai gemuk. Tutup dan diamkan pada suhu kamar selama 24 jam. \n\n3. Tambahkan cuka dan tangkai kemangi. Tutup dan kocok dengan lembut sampai gula larut. Pendinginan selama 1 minggu. \n\n4. Saring campuran melalui saringan halus, tekan pada pada padatan dengan sendok kayu untuk mengekstrak cairan. Cuci dan istirahatkan toples dan tutupnya. Kembalikan semak ke toples. \n\n5. Untuk menyiapkan koktail: Isi gelas highball dengan es. Tambahkan gin, minuman beralur, pahit dan 1 oz. semak; aduk untuk menggabungkan. Atas dengan percikan soda klub (atau seltzer). Hiasi dengan kemangi, jika diinginkan.")
//        );
//
//        dataholder.add(new DataModelRecipe
//                ("https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fstatic.onecms.io%2Fwp-content%2Fuploads%2Fsites%2F44%2F2016%2F07%2F12%2F3759444.jpg",
//                        "Smoothie Semangka-Mangga",
//                        "176 kkal",
//                        "5 menit",
//                        "2 porsi",
//                        "- 1 cangkir semangka cincang\n- 1 cangkir potongan mangga beku\n- 1/2 pisang sedang beku\n- 1 cangkir yogurt polos rendah lemak",
//                        "1. Campurkan semangka, mangga, pisang, dan yogurt dalam blender. Haluskan sampai halus.")
//        );
//
//        dataholder.add(new DataModelRecipe
//                ("https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fstatic.onecms.io%2Fwp-content%2Fuploads%2Fsites%2F44%2F2021%2F02%2F03%2Fstrawberry-banana-smoothies-2000.jpg",
//                        "Smoothie Stroberi-Pisang",
//                        "54 kkal",
//                        "15 menit",
//                        "8 porsi",
//                        "- 4 cangkir irisan stroberi segar\n- 1 pisang sedang, diiris\n- 1 (6 ons) wadah vanili yogurt rendah lemak\n- 1 cangkir es batu\n- 1 buah kiwi, dikupas dan diiris (Opsional)",
//                        "1. Dalam blender, kombinasikan stroberi, pisang, dan yogurt; tutup dan blender hingga halus. Dengan blender berjalan, tambahkan es batu, satu per satu, melalui lubang di tutupnya; blender hingga halus. Tuangkan ke dalam 8 gelas kecil. Jika diinginkan, hiasi dengan buah kiwi; segera melayani.")
//        );
//
//        dataholder.add(new DataModelRecipe
//                ("https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fstatic.onecms.io%2Fwp-content%2Fuploads%2Fsites%2F44%2F2019%2F03%2F08%2F6440442.jpg",
//                        "Smoothie Strawberry-Nanas",
//                        "255 kkal",
//                        "5 menit",
//                        "1 porsi",
//                        "- 1 cangkir stroberi beku\n- 3/4 cangkir susu almond dingin\n- 1 cangkir nanas segar cincang\n- 1 sendok makan mentega almond",
//                        "1. Campurkan stroberi, nanas, susu almond, dan mentega almond dalam blender. Proses sampai halus, tambahkan lebih banyak susu almond, jika diperlukan, untuk konsistensi yang diinginkan. Layani segera.")
//        );
//
//        prosesRecyclerViewAdapter();
//    }
}