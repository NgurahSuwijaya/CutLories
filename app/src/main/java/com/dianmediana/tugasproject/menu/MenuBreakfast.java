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

public class MenuBreakfast extends AppCompatActivity {

    ArrayList<DataModelRecipe> dataholder;
    MyAdapterRecipe adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_breakfast);
        getSupportActionBar().hide();

        ImageView back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuBreakfast.this, MainActivity.class);
                startActivity(intent);
            }
        });
        getData();
    }

    private void prosesRecyclerViewAdapter() {
        RecyclerView recyclerView = findViewById(R.id.breakfastView);
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
                ("https://i0.wp.com/resepkoki.id/wp-content/uploads/2020/02/Resep-Bubur-Ayam-Cirebon.jpg",
                        "Bubur Ayam",
                        "200 kkal",
                        "45 menit",
                        "4 porsi",
                        "- 4 sdm minyak goreng\n- 2 cm lengkuas, memarkan\n- 1 batang serai, memarkan\n- 200 g fillet paha ayam, potong 2 cm\n- 400 g kangkung, potong 3 cm\n- 300 ml kaldu ayam\n- 200 g beras pulen, cuci bersih\n- 1.5 L kaldu ayam\n- 1 sdt garam\n- 1 sdt merica bubuk",
                        "1. Tumis bumbu halus, tambahkan lengkuas dan serai. Tumis hingga harum, masukkan ayam, aduk hingga berubah warna. \n\n2. Masukkan kangkung dan kaldu, aduk hingga matang, angkat, sisihkan. \n\n3. Masak bubur hingga menjadi kental dan bertekstur halus dan matang, sisihkan. \n\n4. Tuang bubur ke dalam mangkuk, tambahkan ayam tumis dan pelengkap. Sajikan hangat.")
        );

        dataholder.add(new DataModelRecipe
                ("https://i0.wp.com/resepkoki.id/wp-content/uploads/2017/11/Resep-Pancake-pisang.jpg",
                        "Pancake Oat Pisang",
                        "170 kkal",
                        "20 menit",
                        "3 porsi",
                        "- 5 sdm oatmeal\n- 1 buah pisang\n- 1/2 sdm baking powder \n- 1/2 gelas susu cair\n- Margarin secukupnya \nPelengkap: madu, potongan pisang dan buah blueberries",
                        "1. Masukkan oatmeal, pisang, dan susu cair ke dalam blender. Blender sampai semua bahan tercampur halus. Tuang adonan dalam wadah baru dan tambahkan baking powder. Aduk sampai merata  \n\n2. Siapkan teflon anti lengket. Lalu panaskan teflon dengan api paling kecil. Tuang margarin ke teflon secukupnya. \n\n3. Tuang margarin ke teflon secukupnya. Tuang 1 sendok sayur adonan ke teflon. Tunggu sampai adonan terlihat semakin padat dan sampingnya berwarna kuning kecokelatan. Lalu balik adonan. Ulangi langkah tersebut sampai adonan habis. \n\n4. Tambahkan hiasan atau bahan lain, seperti madu, pisang yang dipotong-potong, dan blueberries. Pancake oat pisang siap dinikmati.")
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
                        "1. Cuci beras shirataki sebanyak dua kali bilasan. Tiriskan. Rebus dengan air mendidih selama 10 sampai 20 menit atau hingga mengembang dan warnanya berubah. Sisihkan. \n\n2. Cairkan kacang polong beku dengan menggunakan microwave selama 30 detik. Sisihkan. \n\n3. Panaskan minyak zaitun, masukkan daun bawang dan wortel. Tumis selama tiga sampai lima menit.  Tambahkan telur kocok, aduk-aduk hingga tercampur dengan sayuran.\n\n4. Masukkan nasi shirataki dan kacang polong. Bumbui dengan garam dan lada secukupnya. Tumis selama dua sampai tiga menit, matikan api dan sajikan.")
        );

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
                ("https://cdns.klimg.com/merdeka.com/i/w/news/2020/06/16/1188018/content_images/670x335/20200616120450-1-8-resep-makanan-sehat-untuk-diet-rendah-kalori-dan-bernutrisi-tinggi-007-ayu-isti.jpg",
                        "Alpukat Telur Panggang",
                        "300 kkal",
                        "30 menit",
                        "1 porsi",
                        "- 1 buah alpukat\n- 1 butir telur ayam\n- Oregano secukupnya\n- Merica bubuk secukupnya",
                        "1. Potong buah alpukat menjadi dua, kemudian buang bijinya \n\n2. Masukan telur ke dalam cekungan buah alpukat. \n\n3. Masukkan ke dalam oven, panggang 15-20 menit. \n\n4. Taburkan oregano dan merica bubuk, \n\n5. Baked egg avocado siap untuk disajikan.")
        );

        dataholder.add(new DataModelRecipe
                ("https://cdns.klimg.com/merdeka.com/i/w/news/2020/06/16/1188018/content_images/670x335/20200616120451-1-8-resep-makanan-sehat-untuk-diet-rendah-kalori-dan-bernutrisi-tinggi-006-ayu-isti.jpg",
                        "Tahu Kukus Tuna",
                        "188 kkal",
                        "35 menit",
                        "3 porsi",
                        "- 1 kg daging ikan tuna\n- 1/4 kg tepung terigu\n- tahu pong secukupnya\n- 1/2 kg tepung tapioka\n 5 siung bawang putih (haluskan)\n garam secukupnya\n lada bubuk secukupnya\n 1 bungkus penyedap rasa ayam\n es batu secukupnya",
                        "1. Cuci daging ikan tuna dengan air bersih yang mengalir. Hilangkan duri dan kulit tuna. Kemudian haluskan dengan di blender atau ditumbuk. \n\n2. Campurkan dengan tepung terigu, tapioka, garam, lada, penyedap rasa. Aduk semua bahan hingga rata, kemudian masukkan es batu secukupnya, sambil terus diuleni. \n\n3. Masukkan adonan ke dalam tahu pong satu per satu sesuai selera. Jika sudah dimasukkan ke dalam tahu, kukus tahu pada panci dengan api sedang. Kukus selama 25 menit. \n\n4. Jika sudah matang, buka tutup panci dan biarkan tahu tuna dingin. Jika ingin menikmati goreng dengan minyak panas dan menggunakan api sedang. Tahu tuna dapat bertahan lama, bila disimpan di freezer.")
        );

        dataholder.add(new DataModelRecipe
                ("https://image.freepik.com/free-photo/yogurt-oatmeal-with-fresh-berries-chia-seeds_80090-2188.jpg",
                        "Oatmeal Yoghurt",
                        "207 kkal",
                        "15 menit",
                        "1 porsi",
                        "- 4 sdm oatmeal\n- 4 sdm air panas\n- 100 ml susu cair\n- 3 sdm yogurt\n buah-buahan sesuai selera",
                        "1. Campurkan oatmeal dan air panas hingga empuk. \n\n2. Bisa juga dimasak sebentar, jika menggunakan oat utuh. \n\n3. Tuang susu dan yogurt ke dalam oatmeal. \n\n4. Aduk rata, tambahkan buah-buahan sesuai selera.")
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
        ("https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fstatic.onecms.io%2Fwp-content%2Fuploads%2Fsites%2F44%2F2019%2F08%2F26232751%2F3748796.jpg",
                "Creamsicle Smoothie",
                "184 kkal",
                "5 menit",
                "2 porsi",
                "- 1 cangkir air kelapa murni dingin, tanpa tambahan gula atau rasa \n- 1 cangkir yogurt Yunani nonfat vanili\n- 1 cangkir potongan mangga beku atau segar\n- 3 sendok makan konsentrat jus jeruk beku\n- 2 cangkir es",
                "1. Blender air kelapa, yogurt, mangga, konsentrat jus jeruk dan es dalam blender hingga halus.")
        );

        dataholder.add(new DataModelRecipe
                ("https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fstatic.onecms.io%2Fwp-content%2Fuploads%2Fsites%2F44%2F2019%2F02%2F28%2F6417938.jpg",
                        "Kue Peach Cobbler",
                        "211 kkal",
                        "55 menit",
                        "12 porsi",
                        "- 1 (16 ons) paket irisan persik beku, dicairkan (sekitar 3 cangkir)\n- 3 sendok makan gula merah muda\n- 1/8 sendok teh garam\n- 1 sendok makan jus lemon\n- 1 kotak campuran kue kuning organik \n- 3/4 cangkir susu murni\n- 1/4 cangkir minyak kanola atau minyak anggur",
                        "1. Panaskan oven hingga 350 derajat F. Lapisi ringan loyang kaca 13-by-9 inci dengan semprotan memasak. \n\n2. Campurkan persik, gula merah, dan garam dalam panci sedang; didihkan dengan api sedang. Angkat dari api dan aduk dalam jus lemon. Transfer ke loyang yang sudah disiapkan. \n\n3. Kocok campuran kue, susu, dan minyak dalam mangkuk sedang. Tuang adonan di atas campuran persik, menyebar untuk menutupi buah persik sebanyak mungkin. \n\n4. Panggang kue sampai keemasan dan tusuk gigi yang dimasukkan di tengah keluar bersih, 28 hingga 30 menit. Biarkan dingin selama 15 menit sebelum disajikan.")
        );

        dataholder.add(new DataModelRecipe
                ("https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fstatic.onecms.io%2Fwp-content%2Fuploads%2Fsites%2F44%2F2018%2F02%2F21%2F5177837.jpg",
                        "Kue Brownies Double Chocolate",
                        "113 kkal",
                        "30 menit",
                        "16 porsi",
                        "- Semprotan memasak anti lengket\n- 1/4 cangkir mentega atau margarin\n- 2/3 cangkir gula pasir\n- 1/2 cangkir air dingin\n- 1 sendok teh vanili\n- 1 cangkir tepung serbaguna\n- 1/4 cangkir bubuk kakao tanpa pemakan\n- 1 sendok teh baking powder\n- 1/4 cangkir potongan cokelat semisweet miniatur\n- 2 sendok teh gula bubuk yang diayak",
                        "1. Panaskan oven hingga 350 derajat F. Lapisi ringan bagian bawah loyang 9x9x2 inci dengan semprotan memasak antilengket, berhati-hatilah untuk tidak melapisi sisi wajan. \n\n2. Dalam panci sedang, lelehkan mentega; angkat dari api. Aduk gula pasir, air dan vanili. Aduk tepung terigu, bubuk kakao, dan baking powder hingga dikombinasikan. Aduk dalam potongan cokelat. Tuang adonan ke dalam wajan yang sudah disiapkan. \n\n3. Panggang selama 15 hingga 18 menit atau sampai tusuk gigi yang dimasukkan di dekat pusat keluar bersih. Dinginkan di rak kawat. Angkat dari wajan. Potong menjadi 16 bar. Taburi dengan gula bubuk.")
        );

        dataholder.add(new DataModelRecipe
                ("https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fstatic.onecms.io%2Fwp-content%2Fuploads%2Fsites%2F44%2F2018%2F03%2F27%2F5467915.jpg",
                        "Microwave Blueberry Cobbler",
                        "198 kkal",
                        "10 menit",
                        "1 porsi",
                        "- 4 sendok teh gandum memasak cepat\n- 1 1/2 sendok teh tepung gandum utuh\n- 1 1/2 sendok teh gula merah kemasan\n- 1/2 sendok teh biji rami utuh\n- 1/4 sendok teh kayu manis bubuk\n- Garam secukupnya\n- 1 1/2 sendok teh mentega dingin dan tidak tersalsalkan\n- 2/3 cangkir blueberry segar\n- 1/2 sendok teh biji chia utuh\n- 1 sendok makan cahaya beku dicambuk topping makanan penutup\n- Kayu manis secukupnya",
                        "1. Dalam mangkuk aman microwave kecil, gabungkan gandum, tepung, 1 sendok teh gula merah, biji rami, 1/4 sendok teh kayu manis, dan garam. Tambahkan mentega. Menggunakan jari-jari Anda, uleni bersama-sama sampai dikombinasikan secara menyeluruh; Sisihkan. \n\n2. Dalam cangkir microwave-aman 8 ons atau ramekin 10 ons, gabungkan blueberry, sisa 1/2 sendok teh gula merah, dan biji chia. Menggunakan garpu, tumbuk campuran berry. \n\n3. Tempatkan campuran gandum dan campuran berry berdampingan di microwave. Masak dengan daya 50% (sedang) selama 1 1/2 menit. Hapus campuran berry dari microwave. Masak campuran gandum tambahan 10 hingga 15 detik pada daya 100% (tinggi). Biarkan dingin 1 menit. Aduk campuran gandum. \n\n4. Tuangkan campuran gandum di atas campuran berry. Atas dengan topping kocok dan kayu manis.")
        );

        dataholder.add(new DataModelRecipe
                ("https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fstatic.onecms.io%2Fwp-content%2Fuploads%2Fsites%2F44%2F2019%2F08%2F26232655%2F3747401.jpg",
                        "Empanaditas Nanas",
                        "68 kkal",
                        "1 jam 15 menit",
                        "1 porsi",
                        "- 1 cangkir tepung kue gandum utuh\n- 1/2 cangkir jagung\n- 1/4 cangkir gula pasir\n- 1 1/2 sendok teh baking powder\n- 1/2 sendok teh garam\n- 2 sendok makan keju krim berkurang lemak, (Neufchâtel), dipotong-potong kecil\n- 2 sendok makan minyak canola\n- 4 sendok makan susu rendah lemak\n- 1 1/2 cangkir nanas segar cincang\n- 1/3 cangkir nanas atau aprikot\n- 2 sendok makan remah roti kering polos\n- 1/4 sendok teh kayu manis bubuk",
                        "1. Kocok tepung, jagung, gula, baking powder dan garam dalam mangkuk besar. Tambahkan krim keju dan minyak dan blender dengan jari-jari Anda sampai remah-remah. Taburkan campuran dengan susu, 1 sendok makan sekaligus, dan aduk dengan garpu sampai adonan baru saja bersatu - campuran masih akan sedikit remah. Uleni beberapa kali dalam mangkuk, lalu berubah menjadi permukaan tepung ringan dan uleni beberapa kali lagi sampai adonan bersatu. Bagilah dalam setengah dan bentuk menjadi 2 cakram. Bungkus dalam plastik dan dinginkan sampai dingin, setidaknya 30 menit atau hingga 2 hari. \n\n2. Campurkan nanas dan pengawet dalam panci kecil. Didihkan dengan api sedang dan masak, aduk sering, sampai sirup, 12 hingga 15 menit. Tumbuk nanas menjadi potongan-potongan kecil dengan tumbuk kentang atau garpu. Angkat dari api; aduk remah roti dan kayu manis. \n\n3. Panaskan oven hingga 350 derajat F. Lapisi loyang dengan semprotan memasak. \n\n4. Pada permukaan yang terigu dengan baik, gulung satu cakram adonan sekaligus ke dalam lingkaran setebal 1/8 inci. Potong lingkaran adonan menggunakan pemotong kue bulat 3 inci. Ulangi dengan adonan yang tersisa, rolling kembali sisanya seperlunya, untuk membuat 24 lingkaran. \n\n5. Tempatkan 1 sendok teh nanas mengisi tengah setiap lingkaran. Lipat menjadi dua, tekan tepi bersama-sama dan jepit dengan garpu. Tempatkan di loyang yang sudah disiapkan. \n\n6. Panggang empanaditas sampai keemasan, 12 hingga 15 menit. Transfer ke rak kawat dan biarkan sedikit dingin. Sajikan hangat atau pada suhu kamar, dibersihkan dengan gula penganan, jika diinginkan.")
        );

        dataholder.add(new DataModelRecipe
                ("https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fstatic.onecms.io%2Fwp-content%2Fuploads%2Fsites%2F44%2F2019%2F02%2F03%2F6343096.jpg",
                        "Bar Strawberry-Oat Streusel",
                        "168 kkal",
                        "2 menit",
                        "12 porsi",
                        "- 1 1/3 cangkir gandum gulung kuno\n- 1/2 cangkir jagung\n- 1/2 cangkir gula merah muda kemasan\n- 6 sendok makan tepung serbaguna\n- 6 sendok makan tepung gandum utuh putih\n- 1/4 sendok teh baking soda\n- 1/4 sendok teh kayu manis bubuk\n- 1/4 sendok teh garam\n- 1/3 cangkir mentega unsalted, meleleh\n- 1 1/3 cangkir stroberi segar cincang halus\n- 3 sendok makan pengawet stroberi\n- 2 sendok makan gula pasir\n- 1/2 sendok teh tepung maizena",
                        "1. Panaskan oven hingga 350 derajat F. Lapisi loyang 8 inci persegi dengan kertas perkamen, tinggalkan overhang 2 inci di dua sisi. Mantel dengan semprotan memasak. \n\n2. Campurkan gandum, gula merah, tepung serba guna, tepung gandum utuh, soda kue, kayu manis, dan garam dalam mangkuk besar. Aduk dalam mentega cair. Tekan dengan kuat 2 cangkir campuran gandum ke bagian bawah wajan yang disiapkan. (Pesan sisanya untuk topping.) Panggang sampai harum dan atur, sekitar 20 menit. Transfer ke rak kawat. \n\n3. Campurkan stroberi, pengawet, gula pasir, dan tepung maizena dalam mangkuk sedang. Sebarkan campuran secara merata di atas kerak. Taburi dengan campuran gandum yang dipesan. \n\n4. Panggang sampai topping berwarna keemasan dan isiannya menggelegak, sekitar 35 menit. Biarkan dingin di wajan selama 5 menit. Menggunakan perkamen yang terlalu besar, angkat bar dengan hati-hati dari wajan. Transfer ke rak kawat untuk mendinginkan sepenuhnya, sekitar 1 jam. Potong menjadi 12 bar.")
        );

        dataholder.add(new DataModelRecipe
                ("https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fstatic.onecms.io%2Fwp-content%2Fuploads%2Fsites%2F44%2F2018%2F02%2F23%2F5180252.jpg",
                        "Milkshake Cokelat Halus",
                        "191 kkal",
                        "10 menit",
                        "2 porsi",
                        "- 8 ons tahu gaya sutra ringan\n- 2 sendok makan bubuk kakao\n- 1 sendok makan gula \n- 1/2 sendok teh vanili\n- 1 cangkir es krim vanili ringan\n- 1 cangkir es batu",
                        "1. Dalam blender, kombinasikan tahu, bubuk kakao, gula, dan vanili. Tutup dan blender hingga halus. \n\n2. Ketika blender bekerja, tambahkan es krim dalam sendok kecil melalui pembukaan di tutupnya; tambahkan es batu, satu per satu, sampai konsistensi halus dan diinginkan. Tuang ke dalam gelas dingin untuk disajikan.")
        );

        dataholder.add(new DataModelRecipe
                ("https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fstatic.onecms.io%2Fwp-content%2Fuploads%2Fsites%2F44%2F2016%2F07%2F12%2F3759444.jpg",
                        "Smoothie Semangka-Mangga",
                        "176 kkal",
                        "5 menit",
                        "2 porsi",
                        "- 1 cangkir semangka cincang\n- 1 cangkir potongan mangga beku\n- 1/2 pisang sedang beku\n- 1 cangkir yogurt polos rendah lemak",
                        "1. Campurkan semangka, mangga, pisang, dan yogurt dalam blender. Haluskan sampai halus.")
        );

        dataholder.add(new DataModelRecipe
                ("https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fstatic.onecms.io%2Fwp-content%2Fuploads%2Fsites%2F44%2F2021%2F02%2F03%2Fstrawberry-banana-smoothies-2000.jpg",
                        "Smoothie Stroberi-Pisang",
                        "54 kkal",
                        "15 menit",
                        "8 porsi",
                        "- 4 cangkir irisan stroberi segar\n- 1 pisang sedang, diiris\n- 1 (6 ons) wadah vanili yogurt rendah lemak\n- 1 cangkir es batu\n- 1 buah kiwi, dikupas dan diiris (Opsional)",
                        "1. Dalam blender, kombinasikan stroberi, pisang, dan yogurt; tutup dan blender hingga halus. Dengan blender berjalan, tambahkan es batu, satu per satu, melalui lubang di tutupnya; blender hingga halus. Tuangkan ke dalam 8 gelas kecil. Jika diinginkan, hiasi dengan buah kiwi; segera melayani.")
        );

        prosesRecyclerViewAdapter();
    }
}