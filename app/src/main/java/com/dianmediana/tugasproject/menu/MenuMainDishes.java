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

public class MenuMainDishes extends AppCompatActivity {

    ArrayList<DataModelRecipe> dataholder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_main_dishes);
        getSupportActionBar().hide();

        ImageView back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuMainDishes.this, MainActivity.class);
                startActivity(intent);
            }
        });

        getData();
    }

    private void prosesRecyclerViewAdapter() {
        RecyclerView recyclerView = findViewById(R.id.main_dishesView);
        MyAdapterRecipe adapter = new MyAdapterRecipe(dataholder, this);
        recyclerView.setAdapter(adapter);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setHasFixedSize(true);
    }

    private void getData() {

        dataholder = new ArrayList<>();
        dataholder.add(new DataModelRecipe
                ("https://i0.wp.com/resepkoki.id/wp-content/uploads/2020/02/Resep-Bubur-Ayam-Cirebon.jpg",
                        "Bubur Ayam",
                        "200 kkal",
                        "45 menit",
                        "4 porsi",
                        "- 4 sdm minyak goreng\n- 2 cm lengkuas, memarkan\n- 1 batang serai, memarkan\n- 200 g fillet paha ayam, potong 2 cm\n- 400 g kangkung, potong 3 cm\n- 300 ml kaldu ayam\n- 200 g beras pulen, cuci bersih\n- 1.5 L kaldu ayam\n- 1 sdt garam\n- 1 sdt merica bubuk",
                        "1. Tumis bumbu halus, tambahkan lengkuas dan serai. Tumis hingga harum, masukkan ayam, aduk hingga berubah warna. \n\n2. Masukkan kangkung dan kaldu, aduk hingga matang, angkat, sisihkan. \n\n3. Masak bubur hingga menjadi kental dan bertekstur halus dan matang, sisihkan. \n\n4. Tuang bubur ke dalam mangkuk, tambahkan ayam tumis dan pelengkap. Sajikan hangat.")
        );

        dataholder.add(new DataModelRecipe
                ("https://cdn.yummy.co.id/content-images/images/20200508/HZ5sbHlHWh95ivBzKufzyV9gUMV9e6mm-31353838393132393536d41d8cd98f00b204e9800998ecf8427e_800x800.jpg",
                        "Sayur Bening Bayam",
                        "120 kkal",
                        "35 menit",
                        "2 porsi",
                        "- 1/4 daging ayam, potong kecil\n- 2 buah wortel\n- 1 bonggol brokoli\n- 1 siung bawang putih, geprek\n- 1 ruas jahe iris tipis\n- 1 sdm bumbu dasar putih\n- 1 tangkai daun bawang\n- 650 ml air\n- Garam, merica dan kaldu jamur",
                        "1. 1/4 daging ayam cuci bersih kemudian rebus hingga mengeluarkan buih, buang buihnya dan cuci bersih ayam. Baru didihkan 650ml air, setelah mendidih masukan ayam, bawang putih geprek dan jahe. \n\n2. Tambahkan 1 sdm bumbu dasar putih dan wortel. Masak hingga ayam dan wortel empuk. Baru masukan brokoli dan beri bumbu (garam, merica dan kaldu jamur) sambil test rasa. \n\n3. TJika semua sayur sudah masak, diakhir tambahkan daun bawang dan minyak bawang putih 1 sdm. Sayur sop bening siap disajikan bersama nasi hangat.")
        );

        dataholder.add(new DataModelRecipe
                ("https://doyanresep.com/wp-content/uploads/2020/05/resep-tumis-kangkung.jpg",
                        "Tumis Kangkung",
                        "110 kkal",
                        "25 menit",
                        "1 porsi",
                        "- Kangkung 3 ikat, siangi atau petiki daunnya, lalu cuci bersih\n- Cabai merah 2 buah, iris serong\n- Tomat merah 1 buah, potong-potong\n- Gula pasir 1/2 sendok teh\n- Garam 1 sendok teh\n- Air 50 mili liter\n- Minyak untuk menumis 3 sendok makan\n- Bawang merah 5 siung (iris halus)\n- Bawang putih 2 siung (iris halus)\n- Cabai merah keriting 4 buah\n- Cabai rawit 3 buah\n- Terasi bakar 1 sendok teh",
                        "1. Panaskan minyak goreng, tumis bumbu iris hingga tercium aroma wangi sedap. \n\n2. LMasukkan bumbu halusnya, oseng sebentar. Lalu masukkan cabai merah, tomat, gula dan garam. Aduk hingga setengah layu. \n\n3. Masukkan kangkung, gunakan api besar lalu aduk-aduk hingga layu. \n\n4. Tuang air, aduk kembali hingga bumbu merata. Masak sebentar saja, lalu angkat.")
        );

        dataholder.add(new DataModelRecipe
                ("https://th.bing.com/th/id/R9537d47eaca7b700c40c2ed0730cb90c?rik=8WO%2bqP%2fpcZb9BQ&riu=http%3a%2f%2f3.bp.blogspot.com%2f-7KAE855PopQ%2fU5fsMYs0N2I%2fAAAAAAAABes%2fsPKyQWatGAM%2fs1600%2forakariksayurtelurasin1.jpg",
                        "Telur Orak-Arik",
                        "197 kkal",
                        "10 menit",
                        "1 porsi",
                        "- minyak kelapa\n- sayuran (kacang panjang, wortel, jagung atau sayuran lainnya)\n- telur ayam\n- cabai merah (opsional/sesuai selera)\n- garam secukupnya\n- minyak goreng secukupnya",
                        "1. Tumis semua sayuran dan campur dengan cabai yang sudah dipotong kecil kalau ingin memakai cabai. \n\n2. Masukkan telur. \n\n3.  Beri sedikit garam sesuai selera. \n\n4. Goreng telur orak arik dan campur dengan sayuran yang sudah ditumis.\n\n5. Telur orak arik sayuran siap disajikan.")
        );

        dataholder.add(new DataModelRecipe
                ("https://i.pinimg.com/originals/ce/20/f7/ce20f74d216e6a6174b0c5d3ffe1c1df.jpg",
                        "Nasi Goreng Shirataki",
                        "125 kkal",
                        "10 menit",
                        "3 orang",
                        "- 32 gram kacang polong beku\n- 250 gram beras shirataki\n- 1 sdm minyak zaitun\n-  64 gram daun bawang cincang\n-  64 gram wortel parut\n- 1 butir telur, kocok lepas\n- Garam dan lada bubuk secukupnya",
                        "1. Cuci beras shirataki sebanyak dua kali bilasan. Tiriskan. Rebus dengan air mendidih selama 10 sampai 20 menit atau hingga mengembang dan warnanya berubah. Sisihkan. \n\n2.  2. Cairkan kacang polong beku dengan menggunakan microwave selama 30 detik. Sisihkan. \n\n3.  3. Panaskan minyak zaitun, masukkan daun bawang dan wortel. Tumis selama tiga sampai lima menit.  Tambahkan telur kocok, aduk-aduk hingga tercampur dengan sayuran.\n\n4. 4. Masukkan nasi shirataki dan kacang polong. Bumbui dengan garam dan lada secukupnya. Tumis selama dua sampai tiga menit, matikan api dan sajikan.")
        );

        dataholder.add(new DataModelRecipe
                ("https://cdns.klimg.com/merdeka.com/i/w/news/2020/06/16/1188018/content_images/670x335/20200616120455-1-8-resep-makanan-sehat-untuk-diet-rendah-kalori-dan-bernutrisi-tinggi-002-ayu-isti.jpg",
                        "Grilled Chicken",
                        "226 kkal",
                        "1 jam 30 menit",
                        "4 porsi",
                        "- Paha ayam\n- Tepung roti\n- Garlic powder\n- Telur\n- Buttermilk\n- Garam\n- Merica",
                        "1. Panaskan oven hingga 220C serta alasi papan panggangan dengan baking parchment dan alumunium foil. \n\n2. Aduk rata adonan tepung roti, garlic powder, garam, dan merica. \n\n3. Siapkan adonan terpisah berupa campuran telur dan buttermilk. \n\n4. Campurkan paha ayam dengan adonan telur dan setelahnya tepung roti. Pastikan semuanya berlumur dengan baik. \n\n5. Panggang ayam selama kurang lebih 1 jam lalu sajikan.")
        );

        dataholder.add(new DataModelRecipe
                ("https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fstatic.onecms.io%2Fwp-content%2Fuploads%2Fsites%2F44%2F2020%2F04%2F10%2F7945837.jpg",
                        "Kerang Saus Caper-Butter",
                        "224 kkal",
                        "20 menit",
                        "4 porsi",
                        "- 1 pon kerang laut kering, otot samping yang tangguh dihilangkan\n- 1 sendok makan minyak zaitun extra-virgin\n- 1 tomat ceri pint\n- 1/2 cangkir anggur putih kering\n- 2 sendok makan caper, dibilas\n- 3 sendok makan mentega unsalted\n- 1/4 sendok teh lada bubuk\n- Peterseli segar cincang untuk hiasan",
                        "1. Keringkan kerang. Panaskan minyak dalam wajan besi cor besar dengan api sedang-tinggi. Tambahkan kerang dan masak, balik sekali, sampai kecoklatan di kedua sisi, total sekitar 5 menit. Transfer ke piring dan tenda dengan foil untuk tetap hangat. \n\n2. Tambahkan tomat ke wajan dan masak, aduk sekali, sampai kecoklatan di satu sisi dan mulai meledak, 2 hingga 3 menit. Tambahkan anggur dan caper; masak, aduk, dan goreskan bit kecoklatan, sampai anggur berkurang setengahnya, sekitar 1 menit. Angkat dari api dan aduk mentega dan merica. Sajikan saus di atas kerang, dihiasi dengan peterseli, jika diinginkan.")
        );

        dataholder.add(new DataModelRecipe
        ("https://inquiringchef.com/wp-content/uploads/2020/02/Recipe-22.jpg",
                "Thai Basil Chicken",
                "157 kkal",
                "20 menit",
                "3 porsi",
                "- 1 1/4 dada ayam tanpa kulit & tulang, diiris tipis-tipis\n- 2 sdm saus tiram\n- 2 sdm kecap manis\n- 5 siung bawang putih, cincang\n- cabai secukupnya\n- 2 sendok teh minyak sayur\n- 3 cangkir daun Thailand segar atau daun kemangi biasa\n- Nasi matang",
                "1. Marinated ayam dengan saus tiram dan kecap selama 10 menit. \n\n2. Panaskan wajan anti lengket dengan api sedang lalu tambahkan minyak, bawang putih serta cabai saat sudah panas dan masak selama kurang lebih 30 detik. \n\n3. Naikkan api dari sedang ke tinggi lalu masukkan ayam yang dimarinated tadi, masak sampai matang sekitar 4 menit. \n\n4. Tambahkan basil dan masak sampai layu, sekitar 1 menit. \n\n5. Sajikan dengan nasi hangat!")
        );

        dataholder.add(new DataModelRecipe
                ("https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fimages.media-allrecipes.com%2Fuserphotos%2F4609284.jpg&w=767&h=767&c=sc&poi=face&q=85",
                        "Mie Sup Miso dengan Udang",
                        "230 kkal",
                        "25 menit",
                        "3 porsi",
                        "- 4 sendok makan miso putih\n- 6 sendok mirin\n- 3 sendok cuka beras tanpa lemak\n- 1 1/2 cangkir kacang polong merah yang diiris secara diagonal (sekitar 5 ons)\n- 9 ons udang\n- 1 1/2 sendok wakame kering\n- 1 1/2 cangkir mie soba hijau yang dimasak\n- 3 sendok makan daun bawang iris tipis\n- K1 (3 inci) kotak kombu yang dikeringkan, dipotong menjadi 3 strip yang sama\n- 3 cangkir air yang sangat panas, bagi",
                        "1. Tambahkan 1 sendok makan ditambah 1 sendok teh miso, 2 sendok teh mirin dan 1 sendok teh cuka ke masing-masing tiga botol pengalengan 1 1/2 pint. Lapisan 1/2 cangkir kacang polong salju, 3 ons udang, 1/2 sendok teh wakame dan 1/2 cangkir mie ke dalam setiap toples. Atas masing-masing dengan 1 daun bawang sendok meja. Muat satu potong kombu antara bahan-bahan dan sisi masing-masing toples. Tutup dan dinginkan hingga 3 hari. \n\n2. Untuk menyiapkan setiap toples: Tambahkan 1 cangkir air yang sangat panas ke dalam toples, tutup dan kocok dengan sangat baik untuk melarutkan miso. Buka dan microwave di High dengan kenaikan 1 menit sampai panas mengepul, total 2 hingga 3 menit. Buang kombu. Aduk untuk memastikan miso dibubarkan. Diamkan beberapa menit sebelum makan.")
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