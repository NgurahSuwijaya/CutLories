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

public class MenuLunch extends AppCompatActivity {

    ArrayList<DataModelRecipe> dataholder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_lunch);
        getSupportActionBar().hide();

        ImageView back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuLunch.this, MainActivity.class);
                startActivity(intent);
            }
        });

//        getData();
    }

    private void prosesRecyclerViewAdapter() {
        RecyclerView recyclerView = findViewById(R.id.lunchView);
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
//                ("https://cdns.klimg.com/merdeka.com/i/w/news/2020/06/16/1188018/content_images/670x335/20200616120453-1-8-resep-makanan-sehat-untuk-diet-rendah-kalori-dan-bernutrisi-tinggi-004-ayu-isti.jpg",
//                        "Sup Kacang Merah",
//                        "230 kkal",
//                        "20 menit",
//                        "3 porsi",
//                        "- 500 gram kacang merah\n- 300 gram daging sapi\n- 2 batang daun bawang\n- 2 batang seledri\n- 1 buah tomat\n- 1 buah kentang\n- 6 siung bawang putih, haluskan\n- 1 ruas jahe, haluskan\n- 1/4 bagian pala, haluskan\n- Garam dan merica secukupnya.",
//                        "1. Rebus daging sampai empuk, potong dadu. \n\n2. Cuci bersih kacang, masukkan ke dalam air kaldu daging. \n\n3. Masukkan bumbu halus, irisan kentang, dan daging sapi ke dalam rebusan kacang merah. Masak hingga kacang empuk. \n\n4. Masukkan irisan daun bawang dan tomat. Aduk sebentar. Sajikan.")
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
//                ("https://images.immediate.co.uk/production/volatile/sites/30/2020/08/recipe-image-legacy-id-488563_11-7eac2f9.jpg?quality=90&webp=true&resize=440,400",
//                        "Buncis India & Sup Sayuran",
//                        "168 kkal",
//                        "35 menit",
//                        "4 porsi",
//                        "- 1 sdm minyak sayur\n- 1 bawang besar, cincang\n- 1 sdt jahe akar segar parut halus\n- 1 siung bawang putih, cincang\n- 1 sdm garam masala\n- 850ml stok sayuran\n- 2 wortel besar, seperempat panjang dan cincang\n- 400g dapat buncis Dikeringkan\n- 100g kacang hijau Cincang",
//                        "1. Panaskan minyak dalam panci sedang, lalu tambahkan bawang, jahe, dan bawang putih. Goreng selama 2 menit, lalu tambahkan garam masala, beri waktu 1 menit lagi, lalu tambahkan stok dan wortel. Didihkan selama 10 menit, lalu tambahkan buncis. Gunakan blender tongkat untuk whizz sup sedikit. Aduk kacang dan didihkan selama 3 menit. Kemas ke dalam termos atau, jika Anda punya microwave di tempat kerja, dinginkan dan panaskan untuk makan siang. Bagus dengan roti naan.")
//        );
//
//        dataholder.add(new DataModelRecipe
//                ("https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fimages.media-allrecipes.com%2Fuserphotos%2F6211920.jpg&w=767&h=767&c=sc&poi=face&q=85",
//                        "Sup Diet Kubis",
//                        "133 kkal",
//                        "55 menit",
//                        "6 porsi",
//                        "- 2 sendok makan minyak zaitun extra-virgin\n- 1 bawang sedang, cincang\n- 2 wortel sedang, cincang\n- 2 tangkai seledri, cincang\n- 1 paprika merah sedang, cincang\n- 2 siung bawang putih, cincang\n- 1 1/2 sendok teh bumbu Italia\n- 1/2 sendok teh lada bubuk\n- 1/4 sendok teh garam\n- 8 cangkir kaldu sayuran rendah natrium\n- 1 kubis hijau kepala sedang, dibelah dua dan diiris\n- 1 tomat besar, cincang\n- 2 sendok teh cuka anggur putih",
//                        "1. Panaskan minyak dalam panci besar dengan api sedang. Tambahkan bawang, wortel, dan seledri. Masak, aduk, sampai sayuran mulai melunak, 6 hingga 8 menit. Tambahkan paprika, bawang putih, bumbu Italia, merica dan garam dan masak, aduk, selama 2 menit. \n\n2. Tambahkan kaldu, kubis dan tomat; meningkatkan panas menjadi sedang-tinggi dan didihkan. Kurangi panas untuk mempertahankan penutup dan memasak yang mendidih, sebagian hingga semua sayuran empuk, 15 hingga 20 menit lagi. Angkat dari api dan aduk cuka.")
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
//                ("https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fimages.media-allrecipes.com%2Fuserphotos%2F4609284.jpg&w=767&h=767&c=sc&poi=face&q=85",
//                        "Mie Sup Miso dengan Udang",
//                        "230 kkal",
//                        "25 menit",
//                        "3 porsi",
//                        "- 4 sendok makan miso putih\n- 6 sendok mirin\n- 3 sendok cuka beras tanpa lemak\n- 1 1/2 cangkir kacang polong merah yang diiris secara diagonal (sekitar 5 ons)\n- 9 ons udang\n- 1 1/2 sendok wakame kering\n- 1 1/2 cangkir mie soba hijau yang dimasak\n- 3 sendok makan daun bawang iris tipis\n- K1 (3 inci) kotak kombu yang dikeringkan, dipotong menjadi 3 strip yang sama\n- 3 cangkir air yang sangat panas, bagi",
//                        "1. Tambahkan 1 sendok makan ditambah 1 sendok teh miso, 2 sendok teh mirin dan 1 sendok teh cuka ke masing-masing tiga botol pengalengan 1 1/2 pint. Lapisan 1/2 cangkir kacang polong salju, 3 ons udang, 1/2 sendok teh wakame dan 1/2 cangkir mie ke dalam setiap toples. Atas masing-masing dengan 1 daun bawang sendok meja. Muat satu potong kombu antara bahan-bahan dan sisi masing-masing toples. Tutup dan dinginkan hingga 3 hari. \n\n2. Untuk menyiapkan setiap toples: Tambahkan 1 cangkir air yang sangat panas ke dalam toples, tutup dan kocok dengan sangat baik untuk melarutkan miso. Buka dan microwave di High dengan kenaikan 1 menit sampai panas mengepul, total 2 hingga 3 menit. Buang kombu. Aduk untuk memastikan miso dibubarkan. Diamkan beberapa menit sebelum makan.")
//        );
//
//        dataholder.add(new DataModelRecipe
//                ("https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fstatic.onecms.io%2Fwp-content%2Fuploads%2Fsites%2F44%2F2019%2F08%2F26232435%2F3749030.jpg",
//                        "Pie Mini Krim Berry",
//                        "33 kkal",
//                        "15 menit",
//                        "15 porsi",
//                        "- 1/4 cangkir krim kocok\n- 2 sendok teh gula\n- 1/4 cangkir yogurt Yunani nonfat vanili\n- 15 cangkir phyllo mini beku\n- 15 blueberry segar\n- 15 raspberry segar",
//                        "1. Kocok krim dalam mangkuk kecil sampai puncak lembut terbentuk. Tambahkan gula; kocok sampai kaku. Lipat dalam yogurt. Bagi krim yogurt di antara cangkir phyllo, simpan cangkir di nampan plastik mereka. Atas masing-masing dengan 1 blueberry dan 1 raspberry. Sajikan segera, atau dinginkan hingga 4 jam.")
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
//
//        dataholder.add(new DataModelRecipe
//                ("https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fstatic.onecms.io%2Fwp-content%2Fuploads%2Fsites%2F44%2F2018%2F09%2F14%2F5749833.jpg",
//                        "Kue Labu Double Chocolate",
//                        "196 kkal",
//                        "1 jam 30 menit",
//                        "12 porsi",
//                        "- 1 1/4 cangkir tepung gandum putih\n- 1/4 cangkir bubuk kakao\n- 1 1/2 sendok teh bumbu pai labu\n- 1 sendok teh baking powder\n- 1/2 sendok teh baking soda\n- 21/4 sendok teh garam\n- 1 cangkir pure labu tanpa lemak\n- 2/3 cangkir gula merah muda\n- 1/4 cangkir mentega cair\n- 1/4 cangkir buttermilk\n- 2 telur besar\n- 1 sendok teh ekstrak vanili\n- 1/2 cangkir keripik cokelat pahit",
//                        "1. Panaskan oven hingga 350 derajat F. Lapisi loyang 9-by-5 inci dengan semprotan memasak. \n\n2. Kocok tepung, kakao, bumbu pai labu, baking powder, baking soda dan garam dalam mangkuk sedang. \n\n3. Kocok pure labu, gula merah, mentega, buttermilk, telur, dan vanili dalam mangkuk besar. Tambahkan bahan kering dan aduk dengan sendok kayu sampai baru dikombinasikan. Lipat dalam keripik cokelat. \n\n4. Transfer adonan ke loyang yang sudah disiapkan, menyebar secara merata. Panggang sampai tusuk gigi dimasukkan ke tengah roti keluar bersih, 40 hingga 50 menit. Biarkan dingin di wajan di rak kawat selama 10 menit. Jalankan pisau di sekitar tepi dan lepaskan ke rak kawat. Biarkan dingin setidaknya 20 menit sebelum mengiris.")
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
//        prosesRecyclerViewAdapter();
//    }
}