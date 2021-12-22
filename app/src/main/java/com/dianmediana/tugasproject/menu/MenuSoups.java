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

public class MenuSoups extends AppCompatActivity {

    ArrayList<DataModelRecipe> dataholder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_soups);
        getSupportActionBar().hide();

        ImageView back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuSoups.this, MainActivity.class);
                startActivity(intent);
            }
        });

        getData();
    }

    private void prosesRecyclerViewAdapter() {
        RecyclerView recyclerView = findViewById(R.id.soupsView);
        MyAdapterRecipe adapter = new MyAdapterRecipe(dataholder, this);
        recyclerView.setAdapter(adapter);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setHasFixedSize(true);
    }

    private void getData() {

        dataholder = new ArrayList<>();
        dataholder.add(new DataModelRecipe
                ("https://images.immediate.co.uk/production/volatile/sites/30/2020/08/recipe-image-legacy-id-488467_11-9b2e34a.jpg?quality=90&webp=true&resize=375,341",
                        "Kaldu Ayam dan Jamur Thailand",
                        "179 kkal",
                        "15 menit",
                        "4 porsi",
                        "- 1 ayam\n- 1 sdm pasta kasi merah Thailand\n- 1 sdm saus ikan Thailand\n- 2 sdt gula\n- 100g jamur Portobello,diiris",
                        "1. Tip stok ke dalam panci, lalu aduk dalam pasta kari, saus ikan, gula, air jeruk nipis dan sebagian besar semangat. Didihkan, lalu tambahkan jamur dan putih dari bawang musim semi. Tutup, lalu didihkan selama 2 menit. \n\n2. Aduk ayam dan sebagian besar hijau bawang musim semi untuk memanaskan dengan lembut, lalu sajikan sajikan yang dipancarkan ke dalam mangkuk dan tersebar dengan sisa kulit jeruk nipis. Sajikan dengan tambahan air jeruk nipis, gula, dan saus ikan di samping sehingga semua orang dapat menyesuaikan mangkuk mereka sendiri.")
        );

        dataholder.add(new DataModelRecipe
                ("https://cdns.klimg.com/merdeka.com/i/w/news/2020/06/16/1188018/content_images/670x335/20200616120453-1-8-resep-makanan-sehat-untuk-diet-rendah-kalori-dan-bernutrisi-tinggi-004-ayu-isti.jpg",
                        "Sup Kacang Merah",
                        "230 kkal",
                        "20 menit",
                        "3 porsi",
                        "- 500 gram kacang merah\n- 300 gram daging sapi\n- 2 batang daun bawang\n- 2 batang seledri\n- 1 buah tomat\n- 1 buah kentang\n- 6 siung bawang putih, haluskan\n- 1 ruas jahe, haluskan\n- 1/4 bagian pala, haluskan\n- Garam dan merica secukupnya.",
                        "1. Rebus daging sampai empuk, potong dadu. \n\n2. Cuci bersih kacang, masukkan ke dalam air kaldu daging. \n\n3. Masukkan bumbu halus, irisan kentang, dan daging sapi ke dalam rebusan kacang merah. Masak hingga kacang empuk. \n\n4. Masukkan irisan daun bawang dan tomat. Aduk sebentar. Sajikan.")
        );

        dataholder.add(new DataModelRecipe
                ("https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fstatic.onecms.io%2Fwp-content%2Fuploads%2Fsites%2F44%2F2019%2F11%2F28%2F7376183.jpg",
                        "Mediterranean Stew",
                        "191 kkal",
                        "6 jam 45 menit",
                        "6 porsi",
                        "- 2 (14 ons) kaleng tomat dadu panggang api tanpa garam\n- 3 cangkir kaldu sayuran rendah natrium\n- 1 cangkir bawang cincang kasar\n- 3/4 cangkir wortel cincang\n- 4 siung bawang putih, cincang\n- 1 sendok teh oregano kering\n- 3/4 sendok teh garam\n- 1/2 sendok teh cabai merah yang dihancurkan\n- 1/4 sendok teh lada bubuk\n- 1 (15 ons) buncis, dibilas, dibagi\n- 1 tandan kangkung lacinato\n- 1 sendok makan jus lemon\n- 3 sendok makan minyak zaitun extra-virgin\n- Daun kemangi segar, robek jika besar\n- 6 irisan lemon (Opsional).",
                        "1. Campurkan tomat, kaldu, bawang merah, wortel, bawang putih, oregano, garam, cabai merah yang dihancurkan dan merica dalam kompor lambat 4-quart. Tutup dan masak di Low selama 6 jam. \n\n2. Ukur 1/4 cangkir cairan memasak dari slow cooker ke dalam mangkuk kecil. Tambahkan 2 sendok makan buncis; tumbuk dengan garpu sampai halus. \n\n3. Tambahkan buncis tumbuk, kangkung, jus lemon dan sisa buncis utuh ke dalam campuran dalam slow cooker. Aduk untuk menggabungkan. Tutup dan masak di Low sampai kangkung empuk, sekitar 30 menit. \n\n4. Bagi rebusan secara merata menjadi 6 mangkuk; gerimis dengan minyak. Hiasi dengan kemangi. Sajikan dengan irisan lemon, jika diinginkan.")
        );

        dataholder.add(new DataModelRecipe
                ("https://images.immediate.co.uk/production/volatile/sites/30/2020/08/soup-2981d19.png?quality=90&webp=true&resize=440,400",
                        "Sup Wortel & Tomat",
                        "175 kkal",
                        "1 jam 30 menit",
                        "8 porsi",
                        "- 3 sdm minyak zaitun\n- 2 bawang, cincang\n- 2 batang seledri, cincang\n- 1 1/4kg wortel, diiris\n- 250g kentang tepung Potong dadu\n- 5 daun salam (segar atau kering)\n- 500g carton passata\n- Tomat ceri 750g\n- Sayuran\n- 1 sdm gula\n- 1 sdm cuka anggur merah\n- 250ml susu murni",
                        "1. Masukkan minyak, bawang, dan seledri ke dalam panci terbesar Anda dan masak dengan lembut sampai lunak. Tambahkan wortel dan kentang selama beberapa menit, lalu tambahkan semua bahan yang tersisa, selain susu, dengan 1 liter air. Didihkan. Tutup dan didihkan selama 30 menit, lalu buka dan didihkan selama 20-30 menit. \n\n2. Siapkan daun salam dan haluskan dengan blender. Tambahkan susu dan air sebanyak yang Anda butuhkan. Bumbui secukupnya, hangatkan dan sajikan dengan roti salib panas Cheesy (lihat 'berjalan dengan baik'). Dapat dibuat dan didingin hingga 2 hari ke depan - atau beku selama 1 bulan, lalu panaskan kembali dengan lembut.")
        );

        dataholder.add(new DataModelRecipe
                ("https://www.themealdb.com/images/media/meals/jcr46d1614763831.jpg",
                        "Sup Wortel & Ketumbar",
                        "115 kkal",
                        "40 menit",
                        "4 porsi",
                        "- 1 sdm minyak sayur\n- 1 bawang, cincang\n- 1 sdt ketumbar tanah\n- 1 kentang Cincang\n- Wortel 450g, dikupas dan dicincang\n- sayuran atau ayam\n- segenggam ketumbar",
                        "1. Panaskan 1 sdm minyak sayur dalam wajan besar,tambahkan 1 bawang cincang, lalu goreng selama 5 menit sampai lunak. \n\n2. Aduk dalam 1 sdt ketumbar tanah dan 1 kentang cincang, lalu masak selama 1 menit. \n\n3. Tambahkan wortel 450g yang dikupas dan dicincang dan 1,2l sayuran atau kaldu ayam, didihkan, lalu kecilkan api. \n\n4. Tutup dan masak selama 20 menit sampai wortel empuk. \n\n5. Tip ke pengolah makanan dengan segenggam ketumbar kemudian blitz sampai halus (Anda mungkin perlu melakukan ini dalam dua batch). Kembali ke wajan, cicipi, tambahkan garam jika perlu, lalu panaskan kembali untuk disajikan.")
        );

        dataholder.add(new DataModelRecipe
                ("https://images.immediate.co.uk/production/volatile/sites/30/2020/08/recipe-image-legacy-id-488563_11-7eac2f9.jpg?quality=90&webp=true&resize=440,400",
                        "Buncis India & Sup Sayuran",
                        "168 kkal",
                        "35 menit",
                        "4 porsi",
                        "- 1 sdm minyak sayur\n- 1 bawang besar, cincang\n- 1 sdt jahe akar segar parut halus\n- 1 siung bawang putih, cincang\n- 1 sdm garam masala\n- 850ml stok sayuran\n- 2 wortel besar, seperempat panjang dan cincang\n- 400g dapat buncis Dikeringkan\n- 100g kacang hijau Cincang",
                        "1. Panaskan minyak dalam panci sedang, lalu tambahkan bawang, jahe, dan bawang putih. Goreng selama 2 menit, lalu tambahkan garam masala, beri waktu 1 menit lagi, lalu tambahkan stok dan wortel. Didihkan selama 10 menit, lalu tambahkan buncis. Gunakan blender tongkat untuk whizz sup sedikit. Aduk kacang dan didihkan selama 3 menit. Kemas ke dalam termos atau, jika Anda punya microwave di tempat kerja, dinginkan dan panaskan untuk makan siang. Bagus dengan roti naan.")
        );

        dataholder.add(new DataModelRecipe
        ("https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fimages.media-allrecipes.com%2Fuserphotos%2F6211920.jpg&w=767&h=767&c=sc&poi=face&q=85",
                "Sup Diet Kubis",
                "133 kkal",
                "55 menit",
                "6 porsi",
                "- \n- 2 sendok makan minyak zaitun extra-virgin\n- 1 bawang sedang, cincang\n- 2 wortel sedang, cincang\n- 2 tangkai seledri, cincang\n- 1 paprika merah sedang, cincang\n- 2 siung bawang putih, cincang\n- 1 1/2 sendok teh bumbu Italia\n- 1/2 sendok teh lada bubuk\n- 1/4 sendok teh garam\n- 8 cangkir kaldu sayuran rendah natrium\n- 1 kubis hijau kepala sedang, dibelah dua dan diiris\n- 1 tomat besar, cincang\n- 2 sendok teh cuka anggur putih",
                "1. Panaskan minyak dalam panci besar dengan api sedang. Tambahkan bawang, wortel, dan seledri. Masak, aduk, sampai sayuran mulai melunak, 6 hingga 8 menit. Tambahkan paprika, bawang putih, bumbu Italia, merica dan garam dan masak, aduk, selama 2 menit. \n\n2. Tambahkan kaldu, kubis dan tomat; meningkatkan panas menjadi sedang-tinggi dan didihkan. Kurangi panas untuk mempertahankan penutup dan memasak yang mendidih, sebagian hingga semua sayuran empuk, 15 hingga 20 menit lagi. Angkat dari api dan aduk cuka.")
        );

        dataholder.add(new DataModelRecipe
                ("https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fstatic.onecms.io%2Fwp-content%2Fuploads%2Fsites%2F44%2F2020%2F01%2F02%2F7551492.jpg",
                        "Flat-Belly Soup",
                        "161 kkal",
                        "20 menit",
                        "6 porsi",
                        "- 1 sendok makan minyak zaitun extra-virgin\n- 2 cangkir labu cincang\n- 1 cangkir bawang cincang\n- 3/4 cangkir irisan parsnip (1/3 inci)\n- 3 sendok bawang putih cincang halus\n- 1 1/2 sendok jahe segar cincang halus\n- 1 sendok tanah kunyit\n- 1/2 sendok tanah jintan\n- 1/2 sendok garam\n- 6 cangkir kaldu rendah natrium\n- 1 (15 ons) tak bisa garam tomat rebusan\n- 3 cangkir bertangi dan cincang chard pelangi\n- 1 (15 ons) bisa buncis yang tak tersal masalah, dibilas\n- 1 sendok makan cuka sari\n- 1 sendok makan peterseli daun datar segar",
                        "1. Panaskan minyak dalam panci besar berat dengan api sedang-tinggi. Tambahkan squash, bawang dan parsnip; masak, aduk sesekali, sampai mulai melunak, sekitar 5 menit. Tambahkan bawang putih, jahe, kunyit, jinten dan garam; masak, aduk terus, sampai harum, sekitar 1 menit. \n\n2. Tambahkan kaldu dan tomat; Didihkan. Mengurangi panas menjadi sedang; didihkan sampai sayuran empuk, 8 hingga 10 menit. Tambahkan chard dan buncis; masak, aduk sesekali, sampai chard berwarna hijau cerah dan mulai melunak, sekitar 2 menit. \n\n3. Angkat dari api; aduk cuka. Taburi dengan peterseli dan sajikan segera.")
        );

        prosesRecyclerViewAdapter();
    }
}