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

public class MenuDinner extends AppCompatActivity {

    ArrayList<DataModelRecipe> dataholder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_dinner);
        getSupportActionBar().hide();

        ImageView back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuDinner.this, MainActivity.class);
                startActivity(intent);
            }
        });

//        getData();
    }

    private void prosesRecyclerViewAdapter() {
        RecyclerView recyclerView = findViewById(R.id.dinnerView);
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
//                ("https://cdns.klimg.com/merdeka.com/i/w/news/2020/06/16/1188018/content_images/670x335/20200616120455-1-8-resep-makanan-sehat-untuk-diet-rendah-kalori-dan-bernutrisi-tinggi-002-ayu-isti.jpg",
//                        "Grilled Chicken",
//                        "226 kkal",
//                        "1 jam 30 menit",
//                        "4 porsi",
//                        "- Paha ayam\n- Tepung roti\n- Garlic powder\n- Telur\n- Buttermilk\n- Garam\n- Merica",
//                        "1. Panaskan oven hingga 220C serta alasi papan panggangan dengan baking parchment dan alumunium foil. \n\n2. Aduk rata adonan tepung roti, garlic powder, garam, dan merica. \n\n3. Siapkan adonan terpisah berupa campuran telur dan buttermilk. \n\n4. Campurkan paha ayam dengan adonan telur dan setelahnya tepung roti. Pastikan semuanya berlumur dengan baik. \n\n5. Panggang ayam selama kurang lebih 1 jam lalu sajikan.")
//        );
//
//        dataholder.add(new DataModelRecipe
//                ("https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fstatic.onecms.io%2Fwp-content%2Fuploads%2Fsites%2F44%2F2020%2F04%2F10%2F7945837.jpg",
//                        "Kerang & Tomat Ceri dengan Saus Caper-Butter",
//                        "224 kkal",
//                        "20 menit",
//                        "4 porsi",
//                        "- 1 pon kerang laut kering, otot samping yang tangguh dihilangkan\n- 1 sendok makan minyak zaitun extra-virgin\n- 1 tomat ceri pint\n- 1/2 cangkir anggur putih kering\n- 2 sendok makan caper, dibilas\n- 3 sendok makan mentega unsalted\n- 1/4 sendok teh lada bubuk\n- Peterseli segar cincang untuk hiasan",
//                        "1. Keringkan kerang. Panaskan minyak dalam wajan besi cor besar dengan api sedang-tinggi. Tambahkan kerang dan masak, balik sekali, sampai kecoklatan di kedua sisi, total sekitar 5 menit. Transfer ke piring dan tenda dengan foil untuk tetap hangat. \n\n2. Tambahkan tomat ke wajan dan masak, aduk sekali, sampai kecoklatan di satu sisi dan mulai meledak, 2 hingga 3 menit. Tambahkan anggur dan caper; masak, aduk, dan goreskan bit kecoklatan, sampai anggur berkurang setengahnya, sekitar 1 menit. Angkat dari api dan aduk mentega dan merica. Sajikan saus di atas kerang, dihiasi dengan peterseli, jika diinginkan.")
//        );
//
//        dataholder.add(new DataModelRecipe
//                ("https://cdn-image.realsimple.com/sites/default/files/styles/portrait_435x518/public/1475604166/herb-fingerlings.jpg?itok=z12R6f8v",
//                        "Oven-Roasted Garlic Herb Parmesan Potatoes",
//                        "99 kkal",
//                        "55 menit",
//                        "4 porsi",
//                        "- 2 sendok makan minyak zaitun atau sesuai kebutuhan\n- 2 sdm keju parut\n- 1/2 sendok teh garam\n- 1/2 sendok teh bubuk bawang putih\n- 1/4 sendok teh bubuk lada hitam\n- 2 pon kentang",
//                        "1. Panaskan oven sampai 400 derajat F lalu tutup panci dengan kertas aluminium foil. \n\n2. Campur minyak, keju parut, garam, bubuk bawang putih, dan lada hitam dalam mangkuk. \n\n3. Balurkan kentang dengan bahan-bahan tadi. \n\n4. Atur kentang ke dalam loyang yang sudah disiapkan. \n\n5. Panggang dalam oven yang sudah dipanaskan selama 15 sampai 20 menit. \n\n6. Balik kentang dan lanjutkan panggang sampai renyah dan berwarna keemasan sekitar 15 sampai 20 menit. \n\n7. Saijkan!")
//        );
//
//        dataholder.add(new DataModelRecipe
//                ("https://inquiringchef.com/wp-content/uploads/2020/02/Recipe-22.jpg",
//                        "Thai Basil Chicken",
//                        "157 kkal",
//                        "20 menit",
//                        "3 porsi",
//                        "- 1 1/4 dada ayam tanpa kulit & tulang, diiris tipis-tipis\n- 2 sdm saus tiram\n- 2 sdm kecap manis\n- 5 siung bawang putih, cincang\n- cabai secukupnya\n- 2 sendok teh minyak sayur\n- 3 cangkir daun Thailand segar atau daun kemangi biasa\n- Nasi matang",
//                        "1. Marinated ayam dengan saus tiram dan kecap selama 10 menit. \n\n2. Panaskan wajan anti lengket dengan api sedang lalu tambahkan minyak, bawang putih serta cabai saat sudah panas dan masak selama kurang lebih 30 detik. \n\n3. Naikkan api dari sedang ke tinggi lalu masukkan ayam yang dimarinated tadi, masak sampai matang sekitar 4 menit. \n\n4. Tambahkan basil dan masak sampai layu, sekitar 1 menit. \n\n5. Sajikan dengan nasi hangat!")
//        );
//
//        dataholder.add(new DataModelRecipe
//                ("https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fstatic.onecms.io%2Fwp-content%2Fuploads%2Fsites%2F44%2F2019%2F11%2F28%2F7376183.jpg",
//                        "Mediterranean Stew",
//                        "191 kkal",
//                        "6 jam 45 menit",
//                        "6 porsi",
//                        "- 2 (14 ons) kaleng tomat dadu panggang api tanpa garam\n- 3 cangkir kaldu sayuran rendah natrium\n- 1 cangkir bawang cincang kasar\n- 3/4 cangkir wortel cincang\n- 4 siung bawang putih, cincang\n- 1 sendok teh oregano kering\n- 3/4 sendok teh garam\n- 1/2 sendok teh cabai merah yang dihancurkan\n- 1/4 sendok teh lada bubuk\n- 1 (15 ons) buncis, dibilas, dibagi\n- 1 tandan kangkung lacinato\n- 1 sendok makan jus lemon\n- 3 sendok makan minyak zaitun extra-virgin\n- Daun kemangi segar, robek jika besar\n- 6 irisan lemon (Opsional).",
//                        "1. Campurkan tomat, kaldu, bawang merah, wortel, bawang putih, oregano, garam, cabai merah yang dihancurkan dan merica dalam kompor lambat 4-quart. Tutup dan masak di Low selama 6 jam. \n\n2. Ukur 1/4 cangkir cairan memasak dari slow cooker ke dalam mangkuk kecil. Tambahkan 2 sendok makan buncis; tumbuk dengan garpu sampai halus. \n\n3. Tambahkan buncis tumbuk, kangkung, jus lemon dan sisa buncis utuh ke dalam campuran dalam slow cooker. Aduk untuk menggabungkan. Tutup dan masak di Low sampai kangkung empuk, sekitar 30 menit. \n\n4. Bagi rebusan secara merata menjadi 6 mangkuk; gerimis dengan minyak. Hiasi dengan kemangi. Sajikan dengan irisan lemon, jika diinginkan.")
//        );
//
//        dataholder.add(new DataModelRecipe
//                ("https://www.themealdb.com/images/media/meals/jcr46d1614763831.jpg",
//                        "Sup Wortel & Ketumbar",
//                        "115 kkal",
//                        "40 menit",
//                        "4 porsi",
//                        "- 1 sdm minyak sayur\n- 1 bawang, cincang\n- 1 sdt ketumbar tanah\n- 1 kentang Cincang\n- Wortel 450g, dikupas dan dicincang\n- sayuran atau ayam\n- segenggam ketumbar",
//                        "1. Panaskan 1 sdm minyak sayur dalam wajan besar,tambahkan 1 bawang cincang, lalu goreng selama 5 menit sampai lunak. \n\n2. Aduk dalam 1 sdt ketumbar tanah dan 1 kentang cincang, lalu masak selama 1 menit. \n\n3. Tambahkan wortel 450g yang dikupas dan dicincang dan 1,2l sayuran atau kaldu ayam, didihkan, lalu kecilkan api. \n\n4. Tutup dan masak selama 20 menit sampai wortel empuk. \n\n5. Tip ke pengolah makanan dengan segenggam ketumbar kemudian blitz sampai halus (Anda mungkin perlu melakukan ini dalam dua batch). Kembali ke wajan, cicipi, tambahkan garam jika perlu, lalu panaskan kembali untuk disajikan.")
//        );
//
//        dataholder.add(new DataModelRecipe
//                ("https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fstatic.onecms.io%2Fwp-content%2Fuploads%2Fsites%2F44%2F2020%2F01%2F02%2F7551492.jpg",
//                        "Flat-Belly Soup",
//                        "161 kkal",
//                        "20 menit",
//                        "6 porsi",
//                        "- 1 sendok makan minyak zaitun extra-virgin\n- 2 cangkir labu cincang\n- 1 cangkir bawang cincang\n- 3/4 cangkir irisan parsnip (1/3 inci)\n- 3 sendok bawang putih cincang halus\n- 1 1/2 sendok jahe segar cincang halus\n- 1 sendok tanah kunyit\n- 1/2 sendok tanah jintan\n- 1/2 sendok garam\n- 6 cangkir kaldu rendah natrium\n- 1 (15 ons) tak bisa garam tomat rebusan\n- 3 cangkir bertangi dan cincang chard pelangi\n- 1 (15 ons) bisa buncis yang tak tersal masalah, dibilas\n- 1 sendok makan cuka sari\n- 1 sendok makan peterseli daun datar segar",
//                        "1. Panaskan minyak dalam panci besar berat dengan api sedang-tinggi. Tambahkan squash, bawang dan parsnip; masak, aduk sesekali, sampai mulai melunak, sekitar 5 menit. Tambahkan bawang putih, jahe, kunyit, jinten dan garam; masak, aduk terus, sampai harum, sekitar 1 menit. \n\n2. Tambahkan kaldu dan tomat; Didihkan. Mengurangi panas menjadi sedang; didihkan sampai sayuran empuk, 8 hingga 10 menit. Tambahkan chard dan buncis; masak, aduk sesekali, sampai chard berwarna hijau cerah dan mulai melunak, sekitar 2 menit. \n\n3. Angkat dari api; aduk cuka. Taburi dengan peterseli dan sajikan segera.")
//        );
//
//        prosesRecyclerViewAdapter();
//    }
}