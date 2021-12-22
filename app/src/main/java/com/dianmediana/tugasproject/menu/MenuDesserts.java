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

public class MenuDesserts extends AppCompatActivity {

    ArrayList<DataModelRecipe> dataholder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_desserts);
        getSupportActionBar().hide();

        ImageView back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuDesserts.this, MainActivity.class);
                startActivity(intent);
            }
        });

        getData();
    }

    private void prosesRecyclerViewAdapter() {
        RecyclerView recyclerView = findViewById(R.id.dessertsView);
        MyAdapterRecipe adapter = new MyAdapterRecipe(dataholder, this);
        recyclerView.setAdapter(adapter);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setHasFixedSize(true);
    }

    private void getData() {

        dataholder = new ArrayList<>();
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
                ("https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fstatic.onecms.io%2Fwp-content%2Fuploads%2Fsites%2F44%2F2019%2F08%2F26232435%2F3749030.jpg",
                        "Pie Mini Krim Berry",
                        "33 kkal",
                        "15 menit",
                        "15 porsi",
                        "- 1/4 cangkir krim kocok\n- 2 sendok teh gula\n- 1/4 cangkir yogurt Yunani nonfat vanili\n- 15 cangkir phyllo mini beku\n- 15 blueberry segar\n- 15 raspberry segar",
                        "1. Kocok krim dalam mangkuk kecil sampai puncak lembut terbentuk. Tambahkan gula; kocok sampai kaku. Lipat dalam yogurt. Bagi krim yogurt di antara cangkir phyllo, simpan cangkir di nampan plastik mereka. Atas masing-masing dengan 1 blueberry dan 1 raspberry. Sajikan segera, atau dinginkan hingga 4 jam.")
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
                ("https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fstatic.onecms.io%2Fwp-content%2Fuploads%2Fsites%2F44%2F2018%2F09%2F14%2F5749833.jpg",
                        "Kue Labu Double Chocolate",
                        "196 kkal",
                        "1 jam 30 menit",
                        "12 porsi",
                        "- 1 1/4 cangkir tepung gandum putih\n- 1/4 cangkir bubuk kakao\n- 1 1/2 sendok teh bumbu pai labu\n- 1 sendok teh baking powder\n- 1/2 sendok teh baking soda\n- 21/4 sendok teh garam\n- 1 cangkir pure labu tanpa lemak\n- 2/3 cangkir gula merah muda\n- 1/4 cangkir mentega cair\n- 1/4 cangkir buttermilk\n- 2 telur besar\n- 1 sendok teh ekstrak vanili\n- 1/2 cangkir keripik cokelat pahit",
                        "1. Panaskan oven hingga 350 derajat F. Lapisi loyang 9-by-5 inci dengan semprotan memasak. \n\n2. Kocok tepung, kakao, bumbu pai labu, baking powder, baking soda dan garam dalam mangkuk sedang. \n\n3. Kocok pure labu, gula merah, mentega, buttermilk, telur, dan vanili dalam mangkuk besar. Tambahkan bahan kering dan aduk dengan sendok kayu sampai baru dikombinasikan. Lipat dalam keripik cokelat. \n\n4. Transfer adonan ke loyang yang sudah disiapkan, menyebar secara merata. Panggang sampai tusuk gigi dimasukkan ke tengah roti keluar bersih, 40 hingga 50 menit. Biarkan dingin di wajan di rak kawat selama 10 menit. Jalankan pisau di sekitar tepi dan lepaskan ke rak kawat. Biarkan dingin setidaknya 20 menit sebelum mengiris.")
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
        ("https://image.freepik.com/free-photo/yogurt-oatmeal-with-fresh-berries-chia-seeds_80090-2188.jpg",
                "Oatmeal Yoghurt",
                "207 kkal",
                "15 menit",
                "1 porsi",
                "- 4 sdm oatmeal\n- 4 sdm air panas\n- 100 ml susu cair\n- 3 sdm yogurt\n buah-buahan sesuai selera",
                "1. Campurkan oatmeal dan air panas hingga empuk. \n\n2. Bisa juga dimasak sebentar, jika menggunakan oat utuh. \n\n3. Tuang susu dan yogurt ke dalam oatmeal. \n\n4. Aduk rata, tambahkan buah-buahan sesuai selera.")
        );

        prosesRecyclerViewAdapter();
    }
}