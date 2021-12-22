package com.dianmediana.tugasproject;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dianmediana.tugasproject.adapter.MyAdapterRecommendation;
import com.dianmediana.tugasproject.model.DataModelRecommendation;

import java.util.ArrayList;


public class RecommendationFragment extends Fragment {

    RecyclerView recyclerView;
    ArrayList<DataModelRecommendation> dataholder;
    MyAdapterRecommendation adapter;
//    EditText search;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_recommendation, container, false);
        recyclerView =  view.findViewById((R.id.recview));
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        dataholder = new ArrayList<>();

//        search = view.findViewById(R.id.searchAction);
//        search.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
//
//            }
//
//            @Override
//            public void onTextChanged(CharSequence s, int start, int before, int count) {
//
//            }
//
//            @Override
//            public void afterTextChanged(Editable s) {
//                filter(s.toString());
//            }
//        });

        DataModelRecommendation ob1;
        ob1 = new DataModelRecommendation(
                R.drawable.diabetes,
                "Kelebihan Gula Darah",
                "\t\t\t\t\tAda beberapa jenis makanan untuk penderita diabetes yang baik dan buruk untuk dikonsumsi. Hal ini penting untuk diketahui guna menjaga kadar gula dalam darah tetap normal dan stabil. Oleh karena itu, penderita diabetes dianjurkan untuk lebih cermat dalam mengonsumsi makanan.",
                "A. Makanan untuk Penderita Diabetes yang Dianjurkan \n\n\t\t\t\t\tSelain dengan obat-obatan, diabetes juga perlu ditangani dengan mengikuti pola makan khusus yang disebut terapi nutrisi medis. Melalui terapi ini, penderita diabetes dianjurkan untuk mengonsumsi makanan bergizi yang rendah lemak dan kalori agar kadar gula darah tetap terkontrol. Berikut ini adalah beberapa contoh pilihan makanan yang baik untuk penderita diabetes:\n" +
                        "\n" +
                        "1. Makanan yang terbuat dari biji-bijian utuh atau karbohidrat kompleks, seperti nasi merah, ubi panggang, oatmeal, roti gandum,dan sereal dari biji-bijian utuh\n" +
                        "2. Daging tanpa lemak atau ayam tanpa kulit\n" +
                        "3. Sayuran, seperti brokoli dan bayam, serta diproses dengan cara direbus, dikukus, dipanggang, atau dikonsumsi mentah\n" +
                        "4. Buah-buahan segar dan bila ingin mengolahnya menjadi jus, sebaiknya jangan ditambah gula\n" +
                        "5. Kacang-kacangan, termasuk kacang kedelai dalam bentuk tahu yang dikukus, dimasak untuk sup, atau ditumis\n" +
                        "6. Telur\n" +
                        "7. Produk olahan susu rendah lemak, seperti yoghurt\n" +
                        "8. Berbagai jenis ikan, seperti tuna, salmon, sarden dan makarel, tetapi hindari ikan dengan kadar merkuri tinggi,misalnya ikan tongkol",
                "B. Makanan untuk Penderita Diabetes yang Harus Dihindari \n\n\t\t\t\t\tBagi sebagian besar masyarakat Indonesia, belum puas rasanya jika menu hidangan tidak dilengkapi dengan nasi putih. Padahal, bagi penderita diabetes, makanan pokok ini sebaiknya dihindari karena mengandung kadar gula yang tinggi dibandingkan dengan sumber karbohidrat lainnya. Selain nasi putih, ada beberapa jenis makanan lain yang harus dihindari agar kadar gula darah tetap terjaga, di antaranya:\n" +
                        "\n" +
                        "1. Roti tawar putih\n" +
                        "2. Makanan yang terbuat dari tepung terigu\n" +
                        "3. Sayuran yang dimasak dengan tambahan garam, keju, mentega, dan saus dalam jumlah banyak\n" +
                        "4. Buah-buahan kaleng yang mengandung banyak gula\n" +
                        "5. Sayuran kaleng yang mengandung garam tinggi\n" +
                        "6. Daging berlemak dan kulit ayam\n" +
                        "7. Produk susu tinggi lemak\n" +
                        "8. Makanan yang digoreng, seperti ayam goreng, ikan goreng, pisang goreng, dan kentang goreng\n" +
                        "9. Makanan dan minuman mengandung gula tinggi, seperti kue, sirop, dan soda");
        dataholder.add(ob1);

        DataModelRecommendation ob2;
        ob2 = new DataModelRecommendation(
                R.drawable.asam_urat,
                "Asam Urat",
                "\t\t\t\t\tPenderita asam urat dianjurkan untuk lebih cermat dalam memilih makanan. Nah, ada beberapa pilihan makanan untuk penderita asam urat yang bisa meringankan gejala asam urat dan mencegahnya kambuh kembali.",
                "A. Makanan yang boleh dikonsumsi lebih banyak  \n\n\t\t\t\t\tMeski penderita asam urat harus membatasi konsumsi berbagai jenis makanan, bukan berarti kebutuhan nutrisi harian menjadi tidak terpenuhi. Berikut ini adalah beberapa jenis makanan yang dapat dikonsumsi untuk meringankan gejala asam urat dan mencegahnya kambuh kembali:\n" +
                        "\n" +
                        "1. Buah-buahan segar, termasuk jeruk, melon, dan apel\n" +
                        "2. Sayuran, seperti wortel dan tomat\n" +
                        "3. Makanan sumber karbohidrat kompleks, seperti kentang dan beras merah\n" +
                        "4. Susu, keju, atau yoghurt rendah lemak dan tanpa pemanis tambahan",
                "B. Makanan yang perlu dihindari  \n\n\t\t\t\t\tAda beberapa jenis makanan yang perlu dihindari oleh penderita asam urat, di antaranya:\n" +
                        "\n" +
                        "1. Daging merah, termasuk daging sapi, daging kambing, dan daging bebek\n" +
                        "2. Berbagai jenis jeroan, seperti hati, otak, ginjal, dan jantung\n" +
                        "3. Ikan, misalnya ikan sarden, tuna, dan tongkol\n" +
                        "4. Makanan laut, seperti kerang, kepiting, dan udang\n" +
                        "5. Beberapa jenis sayuran, seperti bayam, jamur, kembang kol, kacang polong, kacang panjang, dan kacang merah\n" +
                        "\n\t\t\t\t\tSelain berbagai daftar makanan di atas, makanan yang mengandung karbohidrat sederhana atau gula, seperti roti putih, kue, dan biskuit, juga perlu dihindari. Ini dikarenakan jenis makanan tersebut bisa meningkatkan kadar asam urat. Anda juga disarankan untuk tidak mengonsumsi minuman beralkohol guna mencegah asam urat kambuh kembali atau semakin parah.");
        dataholder.add(ob2);

        DataModelRecommendation ob3;
        ob3 = new DataModelRecommendation(
                R.drawable.liver,
                "Liver",
                "\t\t\t\t\tApa saja jenis makanan yang boleh dikonsumsi bagi penderita liver ? dan jenis makanan apa yang harus dihindari bagi penderita penyakit liver ? Perlu diketahui bahwa pola makan yang dapat memicu terjadinya penyakit liver adalah jenis makanan yang mengandung banyak lemak, sehingga mengakibatkan penumpukan lemak berlebih yang pada akhirnya menjadi kristal diempedu yang mengakibatkan luka dan jika terdapat kuman maka akan menimbulkan infeksi atau radang.",
                "A. Rekomendasi Makanan Untuk Penderita Liver \n\n\t\t\t\t\tMakanan yang diperbolehkan bagi penderita liver sebaiknya memilih jenis makanan dalam proses memasaknya melalui penguapan, dikukus atau direbus. Proses memasak makana dengan sistem uap/penguapan sangat baik untuk kesehatan, baik bagi penderita liver itu sendiri juga menghindari penyakit lain seperti kanker, tumor, asam urat, dan sejenisnya. Kenapa demikian ? Sebab jenis memasak dengan proses ini akan terhindar dari lemak yang bisa memicu penyakit kolesterol yang mengakibatkan rematik dan asam urat.\n" + "\n" +
                        "1.Konsumsi sayuran segar. Antara lain : Kubis, leunca, buncis, wortel, pare, brokoli, sambung nyawa, bit, dan bawang putih.\n" +
                        "2. Konsumsi Jus Buah. Antara lain : Belimbing manis, apel malang, jeruk, pepaya, jambu biji, tomat.\n" +
                        "3. Jangan mengkonsumsi makanan yang di panggang, makanan yang digoreng berulang kali, nasi kemarin.\n" +
                        "4. Hindari asap rokok.\n" +
                        "5. Apabila menegkonsumsi sayuran yang dimasak sendiri, bisa ditambahkan bumbu dari tanaman herbal seperti pegagan, sambung nyawa, mahkota dewa, daun salam.\n" +
                        "6. Perbanyak minum air putih\n" +
                        "7. Hindari stres dan tingkatkan keyakinan untuk sembuh.\n" + "\n" +
                        "\t\t\t\t\tMakanan sakit liver menurut para ahli ilmu kedokteran terbaik adalah susu. Susu bagi penderita liver merupakan makanan wajib yang harus dikonsumsi dengan takaran 1 liter susu setiap hari. Buah dan sayuran juga wajib dikonsumsi setiap hari bagi yang menderita sakit liver, dan idealnya mengkpnsumsi buah dan sayuran sebanyak 1 kg perhari. Jadi minum susu serta buah dan sayuran adalah wajib bagi penderita liver sebab buah dan sayuran serta susu merupakan obat penyembuh sakit liver alami. Selain jenis makanan diatas, makanan yang boleh dikonsumsi bagi penderita liver antara lain ayam kampung beserta telurnya, ikan laut, ikan tawar, dan kacang hijau.",
                "B. Rekomendasi Makanan yang Harus Dihindari Untuk Penderita Liver \n\n\t\t\t\t\tPenderita liver wajib menghindari jenis makanan gorengan, dibakar, diasap atau dipanggang seperti sate dan sejenisnya, sebab makanan dengan proses diasap dan digoreng tidak bisa lepas dari adanya unsur lemak, dan lemak itu sendiri bagi penderita liver akan merangsang hati untuk bekerja keras dalam kondisi tidak sehat (sakit).\n" + "\n" +
                        "1. Jenis makanan yang harus dihindari bagi yang menderita sakit liver adalah sejenis makanan rempah-rempah yang bersifat pedas dan asam seperti : merica, ketumbar, bawang, cabai, lengkuas, pala, cuka, asam jawa, belimbing wuluh, dan sejenis makanan yang bisa merangsang asam lambung sehingga hati menjadi nyeri.\n" +
                        "2. Beberapa jenis buah-buahan seperti durian, nanas, nangka, anggur\n" +
                        "3. Hindari daging sapi, daging kambing, atau daging ayam yang berlemak.\n" +
                        "4. Hindari makanan seafood seperti udang, cumi-cumi, kepiting, kerangHindari makanan dan minuman yang mengandung alkohol dan bahan pengawet.");
        dataholder.add(ob3);

        DataModelRecommendation ob4;
        ob4 = new DataModelRecommendation(
                R.drawable.maag,
                "Maag",
                "\t\t\t\t\t Makanan untuk penderita maag sangat penting diperhatikan. Maag merupakan gangguan lambung yang umum ditemui. Maag terjadi ketika lapisan perut dan lambung meradang.Salah satu pemicu maag adalah makanan. Setiap gigitan makanan dan setiap tegukan cairan akan memengaruhi kinerja saluran pencernaan. Maka dari itu penting memerhatikan makanan untuk penderita maag.\n" +
                        "\t\t\t\t\tMakanan untuk penderita maag ini bisa membantu mengelola asam lambung dan mengurangi gejala yang ada. Makanan untuk penderita maag juga bisa melawan naiknya asam lambung penyebab maag. Berikut makanan untuk penderita maag yang dirangkum Liputan6.com dari berbagai sumber",
                "A. Makanan untuk penderita maag\n" + "\n" +
                        "\n1. Makanan kaya serat\n" + "\t\t\t\t\tMakanan untuk penderita maag yang pertama adalah serat. Pola makan berbasis serat dapat membantu menyembuhkan maag. Serat dapat mempercepat proses penyembuhan dan mengurangi risiko mengembangkan maag di masa depan. Serat juga dapat membantu mencegah radang lambung berkembang. Makanan yang mengandung serat dalam jumlah yang sehat adalah sayur dan buah-buahan." +
                        "\n\n2. Makanan kaya probiotik\n" + "\t\t\t\t\tProbiotik merupakan organisme hidup yang membantu mengembalikan keseimbangan bakteri di saluran pencernaan. Selain membantu mencapai kesehatan usus yang optimal, makanan dengan probiotik dapat membantu mengobati masalah lambung." +
                        "\n\n3. Oatmeal\n" + "\t\t\t\t\tOatmeal merupakan pilihan cepat, enak, dan bisa menjadi sarapan yang sempurna jika memiliki maag. Oatmeal terdiri dari biji-bijian utuh dan sumber serat yang sangat baik. Diet tinggi serat telah dikaitkan dengan risiko penurunan asam lambung. Oatmeal juga mengenyangkan dan membantu kelancaran pencernaan." +
                        "\n\n4. Jahe\n" + "\t\t\t\t\tJahe telah lama digunakan untuk mengobati masalah pencernaan karena sifatnya yang menenangkan. Jahe memiliki efek anti-inflamasi yang dapat membantu memerangi gejala refluks asam. Jahe bisa mengurangi kemungkinan asam lambung mengalir naik ke kerongkongan." +
                        "\n\n5. Susu berbasis nabati\n" + "\t\t\t\t\tPenderita maag harus menghindari susu tinggi lemak. Salah satu alternatif dari susu ini adalah susu berbasis nabati. Jenis susu lain bisa tinggi kandungan lemaknya dan beberapa makanan berlemak tinggi malah bisa memperparah maag. Susu almond, atau jenis susu nabati lainnya seperti kedelai, rami, kacang mete, atau kelapa bisa jadi alternatif susu untuk penderita maag." +
                        "\n\n6. Lidah buaya\n" + "\t\t\t\t\tLidah buaya bisa membantu membantu menenangkan saluran pencernaan. Menurut penelitian dari Journal of Environmental Science and Health, minum jus lidah buaya dapat membantu mencegah naiknya asam lambung, karena dapat mengurangi peradangan." +
                        "\n\n7. Pisang\n" + "\t\t\t\t\tPisang dapat membantu menurunkan kadar gula darah setelah makan dan dapat mengurangi nafsu makan dengan memperlambat pengosongan perut. Pisang juga tinggi serat dan pati resisten yang dapat memberi makan bakteri usus menguntungkan." +
                        "\n\n8. Pepaya\n" + "\t\t\t\t\tEnzim papain dalam pepaya dapat menyehatkan pencernaan dan membantu tubuh menyerap protein dengan mudah. Sifat ini dapat mencegah naiknya asam lambung. Pepaya juga kaya serat dan kadar air, keduanya membantu mencegah sembelit dan meningkatkan keteraturan dan saluran pencernaan yang sehat." +
                        "\n\n9. Apel\n" + "\t\t\t\t\tApel dapat mengurangi asam lambung dan menenangkan perut. Apel merupakan sumber kalsium, magnesium, dan kalium yang baik. Diperkirakan bahwa mineral alkali ini dapat membantu meredakan gejala refluks asam. Apel mengandung pektin, sejenis serat yang bertindak sebagai prebiotik, makanan untuk probiotik." +
                        "\n\n10. Bawang putih\n" + "\t\t\t\t\tEkstrak bawang putih telah terbukti menghambat pertumbuhan H. pylori dalam uji laboratorium, hewan, dan manusia. Bawang putih memiliki sifat antimikroba dan antibakteri, yang membuatnya membantu dalam memerangi infeksi." ,
                "B. Pantangan makan penderita maag \n\n\t\t\t\t\tSelain mengonsumsi makanan untuk penderita maag, penting juga menjauhi pantangannya. Makanan dan minuman ini bisa menjadi pemicu atau penyebab maag kumat atau bertambah buruk. Makanan-makanan yang harus dihindari penderita maag meliputi:" +
                        "\n\n1. Makanan berlemak\n" + "\t\t\t\t\tMakanan berlemak yang mengandung lemak dapat menyebabkan heartburn dan naiknya asam lambung. Makanan berlemak juga cenderung lebih sulit dicerna dan memperlambat pengosongan perut. Makanan berlemak diantaranya adalah santan, gorengan daging merah, keju, hingga susu full fat." +
                        "\n\n2. Makanan pedas\n" + "\t\t\t\t\tMakanan pedas dapat memicu maag menjadi lebih parah. Makanan pedas seperti cabai atau lada secara teratur dapat meningkatkan gejala GERD." +
                        "\n\n3. Makanan asam\n" + "\t\t\t\t\tMakanan asam tidak boleh dikonsumsi penderita GERD terutama saat perut kosong. Makanan asam seperti jeruk, nanas, saus tomat, atau lemon bisa mengiritasi kerongkongan dan menyebabkan ketidaknyamanan." +
                        "\n\n4. Makanan asin\n" + "\t\t\t\t\tMengonsumsi terlalu banyak garam selama periode waktu tertentu dapat meningkatkan risiko naiknya asam lambung." +
                        "\n\n5. Kafein\n" + "\t\t\t\t\tKafein diketahui dapat memicu asam lambung naik yang menyebabkan GERD." +
                        "\n\n6. Soda\n" + "\t\t\t\t\tSoda dan minuman berkarbonasi lainnya adalah beberapa penyebab utama refluks asam. Gelembung karbonasi mengembang di dalam perut, dan peningkatan tekanannya berkontribusi terhadap kenaikan asam lambung."
                );
        dataholder.add(ob4);

        DataModelRecommendation ob5;
        ob5 = new DataModelRecommendation(
                R.drawable.kolesterol,
                "Kolesterol Tinggi",
                "\t\t\t\t\tSeseorang yang memiliki kadar kolesterol yang tinggi sangat dianjurkan untuk berhati-hati dalam mengkonsumsi makanan. Hal ini karena ada beberapa pantangan yang tidak boleh dilanggar dan juga ada banyak anjuran makanan sehat yang harus dikonsumsi. \n\t\t\t\t\tMemiliki kadar kolesterol yang terlalu banyak tentunya akan sangat berbahaya bagi tubuh kita. Oleh karena itu, di bawah ini akan dipaparkan mengenai menu makanan sehat yang bisa dikonsumsi saat kadar kolesterol meninggi, serta pantangannya.",
                "A. Rekomendasi Makanan Sehat dan Bergizi Bagi Penderita Kolesterol \n\n\t\t\t\t\tDi antara jenis makanan bergizi yang dapat dikonsumsi oleh penderita kolesterol adalah sebagai berikut:" +
                        "\n\n1. Kentang\n" + "\t\t\t\t\tMakanan sehat dan bergizi yang pertama yang dapat dijadikan sebagai penurun kadar kolesterol adalah kentang. Satu kentang ini memiliki lima gram serat larut yang tentunya berfungsi untuk menurunkan kadar kolesterol di dalam tubuh. \n\t\t\t\t\tNamun, perlu diingat bahwa kita harus memperhatikan cara mengolahnya. Tidak dianjurkan bagi penderita kolesterol tinggi untuk mengonsumsi kentang goreng karena hal tersebut dapat mengandung kadar lemak yang cukup tinggi. Oleh karena itu, konsumsilah kentang panggang atau kentang rebus." +
                        "\n\n2. Bawang Putih dan Bawang Merah\n" + "\t\t\t\t\tSyarat makanan sehat untuk penderita kolesterol tinggi adalah adanya bawang merah dan bawang putih. Bawang putih ini memastikan kita terhindar dari kolesterol jahat dan juga menjaga darah. Bawang merah juga berperan penting sebagai makanan bagi penderita kolesterol tinggi karena kandungan antioksidan di dalamnya." +
                        "\n\n3. Kacang\n" + "\t\t\t\t\tMakanan sehat untuk penderita kolesterol tinggi yang lainnya adalah kacang. Kandungan lemak tak jenuh tunggal dan magnesium di dalamnya mampu berperan dalam kesehatan jantung. Jika seseorang rutin mengonsumsi kacang-kacangan, maka akan terhindari dari risiko penyakit jantung dan juga penyakit lainnya. Sehingga hal tersebut juga memberikan dampak yang baik bagi persendian seseorang." +
                        "\n\n4. Teh\n" + "\t\t\t\t\tTeh juga termasuk ke dalam rekomendasi makanan yang bisa dikonsumsi oleh penderita kolesterol tinggi. Kandungan antioksidan di dalamnya sangat baik bagi pembuluh darah dan juga dapat mencegah pembekuan darah, apalagi ketika disajikan dingin ataupun panas. Antioksidan dari teh juga mampu mengurangi kolesterol dan juga tekanan darah. Anda dapat mengonsumsinya setiap hari agar tubuh menjadi sehat dan terhindar dari berbagai penyakit." +
                        "\n\n5. Bayam\n" + "\t\t\t\t\tSiapa, sih, yang tidak mengenal bayam? Sayuran yang termasuk ke dalam makanan sehat dan bergizi ini mampu menurunkan kadar kolesterol. Hal ini tentu saja karena kandungan lutein di dalamnya. Lutein ini bisa disebut sebagai sinar matahari kuning yang dapat ditemukan di dalam kuning telur dan juga sayuran berdaun hijau gelap. " +
                        "\n\n6. Alpukat\n" + "\t\t\t\t\tAlpukat yang memiliki beragam manfaat mulai dari kecantikan hingga penurun kadar kolesterol ini banyak ditemukan di Indonesia. Oleh karena itu, makanan penurun kadar kolesterol tinggi selanjutnya adalah alpukat. Alpukat ini juga sangat baik untuk jantung karena mengandung lemak tak jenuh tunggal dan dapat meningkatkan kolesterol baik, kemudian menurunkan kadar kolesterol yang jahat. Oleh karena itu, konsumsilah alpukat jika ingin menurunkan kadar kolesterol yang tinggi." +
                        "\n\n7. Beras dan Biji-bijian\n" + "\t\t\t\t\tMakanan sehat yang menurunkan kolesterol tinggi adalah beras dan biji-bijian. Hal ini bisa kita temukan dengan mudah karena termasuk ke dalam makanan yang pokok. Baik beras, kacang-kacangan, dan juga roti sama-sama mengandung pati. Tidak hanya itu, jenis makanan tersebut tidak mengandung kadar kolesterol di dalamnya. Hal itu tentu saja jika kita tidak menambahkan bahan lainnya yang mengandung lemak ketika mengolahnya." +
                        "\n\n8. Tahu\n" + "\t\t\t\t\tTahu juga dipercaya sebagai makanan sehat dan bergizi yang mampu menurunkan kadar kolesterol yang tinggi. Namun, kita harus benar-benar dalam mengolah dan memasaknya sehingga tahu tersebut mampu menjadi pengganti yang baik untuk daging di banyak hidangan. Selain bermanfaat untuk kolesterol, tahu ini juga memiliki cita rasa yang lezat di dalam setiap hidangan sehingga sangat direkomendasikan." +
                        "\n\n9. Jamur\n" + "\t\t\t\t\tMakanan bagi penderita kadar kolesterol tinggi adalah jamur. Hal ini karena jamur merupakan salah satu pilihan yang bebas dari kolesterol. Namun, ketika kita mengonsumsinya, pastikan bahwa jamur tersebut tidak dicampurkan dengan bahan yang mengandung lemak agar tetap aman dalam penyajiannya." +
                        "\n\n10. Ikan dan Asam Lemak Omega 3\n" + "\t\t\t\t\tIkan adalah salah satu hewan yang mengandung minyak dan kandungan asam lemak Omega 3 di dalamnya dinilai efektif ketika mengurangi kadar trigliserida. Hal ini juga dapat mengurangi risiko terhadap tekanan darah dan juga penggumpalan darah. Dua porsi ikan sangat direkomendasikan setiap minggunya. Bakarlah atau panggang ikan untuk mendapatkan manfaat terbaik sebagai makanan penurun kolesterol yang satu ini." +
                        "\n\n11. Minyak Zaitun\n" + "\t\t\t\t\tMinyak Zaitun juga ternyata masuk ke dalam salah satu makanan sehat yang mampu membantu kita dalam menurunkan kadar kolesterol yang tinggi. Kandungan lemak jenuhnya lebih rendah daripada mentega. Sehingga hal ini menjadikannya sebagai alternatif dari makanan untuk menurunkan kolesterol. ",
                "B. Makanan Penyebab Kolesterol \n\n\t\t\t\t\tBerikut daftar makanan penyebab kolesterol tinggi yang wajib kamu hindari kalau kadar kolesterol LDL kamu sudah tinggi." +
                        "\n\n1. Telur\n" + "\t\t\t\t\tTelur merupakan salah satu makanan sederhana yang sangat kaya akan nutrisi di dalamnya. Sayangnya, telur juga mengandung kolesterol tinggi yang tinggi. Dalam satu butir telur, terdapat sekitar 185-200 miligram (mg) kolesterol. \n\t\t\t\t\tSebagian besar kolesterol yang terkandung dalam telur ini terdapat pada bagian kuning telurnya, sementara bagian putih telur rendah akan kolesterol." +
                        "\n\n2. Produk Susu\n" + "\t\t\t\t\tLemak yang terkandung dalam produk susu merupakan lemak jenuh yang berdampak buruk pada kolesterol. Lemak jenuh yang ada pada produk susu antara lain asam laurat dan asam miristat, kedua asam lemak jenuh ini berpotensi meningkatkan kolesterol jahat LDL. \n\t\t\t\t\tSalah satu produk susu yang tinggi kolesterol adalah keju. Per 100 gram (g) keju, terdapat sekitar 95 mg kolesterol. Jika tetap ingin mengonsumsi susu, pilihlah produk susu rendah dan bebas lemak, atau hasil fermentasi seperti yogurt." +
                        "\n\n3. Makanan Laut\n" + "\t\t\t\t\tMakanan laut seperti kerang, udang dan lobster sebenarnya padat akan nutrisi yang baik bagi kesehatan. Protein, vitamin B, zat besi dan selenium yang tinggi bersumber dari makanan laut tersebut. Hanya saja, kalau dikonsumsi terlalu banyak, dapat menyebabkan kadar kolesterol meroket naik. Sebagai contoh, setiap 85 gram udang mengandung 166 mg kolesterol, angka ini sudah lebih dari 50% asupan kolesterol harian seharusnya." +
                        "\n\n4. Daging Olahan\n" + "\t\t\t\t\tMakan selanjutnya yang harus kamu hindari kalau kamu memiliki kolesterol tinggi adalah daging olahan. Yang dimaksud dengan daging olahan adalah daging yang telah diproses dengan cara diawetkan, diasap, digarami atau ditambahkan bahan lain guna meningkatkan citarasa ataupun agar daging awet lebih lama. \n\t\t\t\t\tBeberapa hasil olahan daging adalah sosis, bacon, ham, daging kornet dan masih banyak lainnya. Selain tidak bagus untuk penderita kolesterol tinggi, daging olahan juga dapat memicu penyakit jantung dan kanker." +
                        "\n\n5. Jeroan\n" + "\t\t\t\t\tJeroan yang paling sering ditemukan antara lain usus, lidah, babat, hati, paru, jantung, limpa dan otak. Mengonsumsi jeroan dalam porsi yang wajar sebenarnya sangatlah tidak berbahaya sebab banyak kandungan vitamin dan mineral di dalamnya. \n\t\t\t\t\tMemang semua yang berlebihan tidak pernah baik bagi kesehatan. Per 100 g jeroan mengandung 200 mg kolesterol yang sudah mencakup 70% dari kebutuhan per hari." +
                        "\n\n6. Kulit\n" + "\t\t\t\t\tKulit yang dimaksud di sini bisa kulit ayam, sapi atau kikil yang mengandung lemak jenuh. Seperti yang telah disebutkan di atas, lemak jenuh merupakan kandungan yang sangat jahat bagi penderita kolesterol tinggi. Jadi, sebaiknya ketika makan ayam atau sapi yang masih ada kulitnya, langsung pisahkan atau buang karena itu sangat tidak baik bagi kesehatan." +
                        "\n\n7. Sarden\n" + "\t\t\t\t\tIkan sarden atau ikan lemuru polos menyumbang kolesterol sebanyak 131 mg per 92 gr. Belum lagi ditambah bahan-bahan lain dalam sarden kaleng instan yang biasa kamu beli, tentu kadar kolesterolnya lebih tinggi lagi. \n\t\t\t\t\tMasih ada lagi tambahan kolesterol dari minyak goreng yang digunakan untuk mengolah kembali sarden. Jika kadar kolesterol jahat dalam tubuhmu sudah lumayan tinggi, lebih baik jika kamu mengonsumsi sarden segar." +
                        "\n\n8. Gorengan\n" + "\t\t\t\t\tMakanan yang digoreng memang perlu dijadikan pantangan orang dengan kolesterol tinggi. Hidangan gorengan selain tinggi kolesterol, juga tinggi kalori. Terlebih lagi kalau makanan tersebut digoreng menggunakan minyak sayur atau margarin, akan lebih berbahaya karena kedua bahan tersebut mengandung lemak trans yang bisa memicu penyakit jantung." +
                        "\n\n9. Makanan Cepat Saji\n" + "\t\t\t\t\tSudah rendah nutrisi, kaya akan lemak trans pula. Selain itu, makanan siap saji juga dapat menyebabkan lemak perut menumpuk, mudah terjadi peradangan dan mengganggu regulasi darah. Oleh sebab itu, tidak hanya untuk pengidap kolesterol tinggi, untuk yang kolesterolnya normal pun sebaiknya menghindari hidangan siap saji." +
                        "\n\n10. Makanan Manis\n" + "\t\t\t\t\tSeperti rangkaian makanan yang ditutup dengan makanan manis, daftar makanan penyebab kolesterol tinggi kali ini juga akan ditutup dengan makanan manis sebagai makanan yang patut dihindari. \n\t\t\t\t\tJika kamu menganggap kalau kolesterol hanya diasosiasikan dengan makanan berminyak, kamu salah besar. Makanan manis seperti camilan, es krim, aneka kue juga tinggi akan kolesterol, gula, lemak jahat dan kalori.");
        dataholder.add(ob5);

        DataModelRecommendation ob6;
        ob6 = new DataModelRecommendation(
                R.drawable.anemia,
                "Anemia",
                "\t\t\t\t\tTerdapat berbagai macam penyebab anemia, mulai dari kekurangan zat besi sampai masalah genetik (keturunan). Saat didagnosis anemia, proses pengantaran oksigen dan nutrisi ke semua sel dan jaringan tubuh menjadi terganggu. Muncullah berbagai keluhan, seperti mudah lelah, pusing, hingga kulit pucat. Secara umum, beberapa makanan penambah darah bisa membantu mengatasi anemia. Apa saja makanan yang baik untuk penambah darah dan pantangannya?",
                "A. Sumber makanan penambah darah untuk anemia \n\n\t\t\t\t\tTubuh membutuhkan asupan vitamin, mineral, dan nutrisi tertentu dalam jumlah cukup agar bisa terus memproduksi sel darah merah yang sehat. Mengonsumsi jenis makanan yang bernutrisi juga dapat membantu Anda terhindar dari kurang darah dan komplikasi yang mungkin muncul akibat anemia. Berikut adalah beberapa jenis makanan yang berguna untuk penambah darah bagi orang anemia." +
                        "\n\n1. Makanan tinggi zat besi\n" + "\t\t\t\t\tMakanan tinggi zat besi penting sebagai penambah darah untuk anemia. Zat besi membantu produksi hemoglobin yang dibutuhkan sel darah merah. Makanan penambah darah dengan asupan zat gizi paling banyak bisa Anda dapatkan dari sumber hewani, seperti daging merah, unggas seperti ayam, jeroan seperti hati sapi, dan makanan laut seperti tiram dan ikan." +
                        "\n\n2. Makanan kaya tembaga (copper)\n" + "\t\t\t\t\tMakanan yang mengandung mineral tembaga merupakan salah satu asupan penting untuk penambah darah. Mineral tembaga berfungsi untuk untuk membantu tubuh meningkatkan produksi sel darah merah. Ketika kadarnya rendah, tubuh menyerap zat besi dalam jumlah yang sedikit. Akibatnya produksi hemoglobin dalam sel darah merah berkurang. Anda pun mengalami anemia defisiensi zat besi. akanan penambah darah yang tinggi mineral tembaga untuk orang anemia bisa didapatkan dari gandum utuh, kacang-kacangan, daging unggas seperti ayam dan ebbek, makanan laut seperti udang dan kepiting, serta buah ceri dan coklat." +
                        "\n\n3. Makanan tinggi asam folat\n" + "\t\t\t\t\tAsam folat atau vitamin B9 adalah nutrisi yang bisa membantu meningkatkan jumlah sel darah merah dalam tubuh. Untuk itu, pengidap anemia wajib makan makanan yang mengandung asam folat tinggi, seperti kacang polong, kacang merah, kacang hijau, jerosan seperti hati, sayur hijau seperti bayam dan brokoli." +
                        "\n\n4. Makanan kaya vitamin B12\n" + "\t\t\t\t\tVitamin B12 mampu meningkatkan fungsi sumsum tulang agar lebih banyak menghasilkan sel darah merah normal. Apabila kekurangan vitamin B12, bentuk sel darah merah yang dihasilkan bisa abnormal; cenderung oval dan tidak bulat pipih. Sel darah merah yang tidak berkembang sempurna juga lebih cepat mati. Nah, orang yang memiliki anemia dapat menjadikan makanan tinggi vitamin B12 sebagai penambah darah, seperti jeroan seperti hati sapi, ikan, daging merah, telur, susu dan produk olahannya, sereah, buah-buahan, serta sayur sayuran." +
                        "\n\n5. Makanan mengandung vitamin B6\n" + "\t\t\t\t\tMirip seperti vitamin B12, vitamin B6 juga bisa membantu pembentukan sel darah merah. Makanan penambah darah yang tinggi kandungan B6, meliputi nasi, gandum, sereal, kacang-kacangan, daging sapi, kambing, domba, dan ayam." +
                        "\n\n6. Makanan tinggi vitamin A\n" + "\t\t\t\t\tKekurangan vitamin A umumnya dapat memicu gejala anemia. Hubungan antara vitamin A dengan anemia belum jelas. Namun yang pasti, defisiensi vitamin A dapat menghambat tubuh menghasilkan sel darah merah yang sehat. \n\t\t\t\t\tKurang vitamin A dalam tubuh juga berisiko menyebabkan penyerapan zat besi menjadi tidak sempurna. Ini akan memengaruhi produksi sel darah merah. Beberapa makanan penambah darah untuk anemia yang tinggi vitamin B6, yaitu susu sapi dan produk olahannya (termasuk susu murni), telur ayam, hati sapi atau ayam, serta sayuran brwarna cerah seperti tomat, wortel, brokoli dan ubi jalar." +
                        "\n\n7. Makanan mengandung vitamin C\n" + "\t\t\t\t\tVitamin C adalah salah satu nutrisi yang penting untuk Anda yang punya anemia. Vitamin C membantu proses penyerapan zat besi dalam tubuh. Peningkatan zat besi dalam darah dapat membantu sumsum tulang untuk memproduksi lebih banyak sel darh merah sehat yang mengandung hemoglobin. Anda bisa mendapatkan makanan penambah darah yang mengandung vitamin C dari jeruk, paprika, stroberi, dan tomat." +
                        "\n\n8. Makanan mengandung vitamin E\n" + "\t\t\t\t\tMeski sangat jarang terjadi, kasus kekurangan vitamin E nyatanya juga dapat meningkatkan risiko anemia hemolitik. Anemia hemolitik adalah jenis anemia yang terjadi ketika sel darah merah menjadi rapuh dan lebih cepat mati. \n\t\t\t\t\tVitamin E punya fungsi penting untuk melindungi membran sel darah merah dari kerusakan oksidatif (akibat radikal bebas). Untuk mencegah anemia, Anda bisa mengonsumsi makanan yang mengandung vitamin E, seperti minyak nabati (seperti minyak gandum, minyak kacang, dan minyak zaitun), kacang-kacangan, biji-bijian, susu, sayuran seperti bayam dan paprika merah, serat buah alpukat.",
                "B. Pantangan Makanan yang Harus Diketahui Pasien Anemia \n\n" +
                        "1. Makanan yang mengandung tanin\n" + "\t\t\t\t\tTanin adalah zat alami yang ditemukan dalam banyak sumber makanan nabati, seperti teh hitam dan teh hijau, kopi, anggur, sorgum, serta jagung. Minum kopi diktehaui dapat menyebabkan penyerapan zat besi terhambat. Sebuah kajian yang dilansir di The American Journal of Clinical Nutrition menemukan bahwa satu cangkir kopi dapat mengurangi penyerapan zat besi hingga 39 persen. \n\t\t\t\t\tPenelitian lain juga membuktikan bahwa meminum satu bungkus kopi instan dapat mengurangi penyerapan zat besi 60-90 persen. Apabila memiliki anemia, sebisa mungkin hindari makanan dan minuman yang mengandung tanin." +
                        "\n\n2. Makanan yang mengandung gluten\n" + "\t\t\t\t\tBagi Anda yang memiliki anemia dan penyakit Celiac secara bersamaan, hindari makan makanan yang mengandung gluten. Bagi orang dengan penyakit Celiac, gluten dapat merusak lapisan dinding usus sehingga mencegah nutrisi seperti folat dan zat besi diserap oleh tubuh. Gluten umumnya ditemukan dalam gandum hitam." +
                        "\n\n3. Makanan yang mengandung fitat\n" + "\t\t\t\t\tFitat atau phytic acid adalah zat yang ditemukan pada makanan tinggi serat, seperti beras merah. Fitat memiliki sifat menghambat penyerapan zat besi. Menurut Linus Pauling Institute, 5-10 mg fitat saja sudah dapat menghambat penyerapan zat besi hingga 50 persen. Jadi Anda harus menghindari makanan mengandung fitat untuk mencegah ini untuk mencegah gejala anemia bertambah buruk. \n\t\t\t\t\tBeberapa contoh makanan tinggi fitat antara lain kacang almon, gandum utuh, biji bunga matahari, dan kacang-kacangan tertentu, seperti kacang kedelai. Sumber makanan tinggi fitat dapat meningkatkan risiko defisiensi zat besi dan zink. Namun, Anda dapat menyiasatinya dengan merendam kacang atau butiran gandum selama beberapa saat dan menyangrai sebelum mengolahnya.");
        dataholder.add(ob6);

        DataModelRecommendation ob7;
        ob7 = new DataModelRecommendation(
                R.drawable.darah_tinggi,
                "Darah Tinggi",
                "\t\t\t\t\tHipertensi atau tekanan darah tinggi merupakan salah satu penyakit yang tidak boleh dianggap remeh. Pasalnya, hipertensi dapat muncul tiba-tiba dan menimbulkan penyakit lain yang lebih serius, seperti stroke atau penyakit jantung. Meski demikian,  seorang penderita hipertensi dapat berupaya mengontrol tekanan darahnya dengan cara menerapkan pola hidup sehat. Mulai dari memilih menu makanan untuk penderita tekanan darah tinggi, menghitung kalorinya, dan memantau porsinya. Tidak hanya itu, seorang penderita hipertensi juga harus menerapkan pola hidup sehat. \n\t\t\t\t\tNah, dengan menjalani pola makan sehat, setidaknya dapat mengurangi risiko terjadinya hipertensi. Yuk, kita simak bagaiamana cara merancang menu makanan yang tepat bagi penderita hipertensi!",
                "A. Makanan Sehat untuk Pasien Darah Tinggi \n\n\t\t\t\t\tBerikut ini adalah menu makanan yang ampuh menurunkan tekanan darah tinggi Anda." +
                        "\n\n1. Bawang Putih\n" + "\t\t\t\t\tBumbu rempah-rempah satu ini sangat ampuh menurunkan tekanan darah tinggi seseorang secara alami dan sudah digunakan selama berabad-abad untuk mengobati berbagai penyakit termasuk hipertensi. Kandungan minyak Dialil trisulfida dalam bawang putih mampu melindungi jantung. Selain itu, bawang putih juga dapat meningkatkan jumlah oksida nitrat yang ada dalam tubuh. Tahukah Anda, oksida nitrat berguna untuk membuat vasodilatasi atau pelebaran arteri sehingga mampu mengurangi risiko tekanan darah tinggi. " +
                        "\n\n2. Buah Beri (Berry)\n" + "\t\t\t\t\tSiapa sih yang tidak suka buah berry? Bagi Anda yang hobi mengonsumsi buah-buahan, termasuk berry dan kebetulan menderita hipertensi, sebaiknya gunakan kesempatan ini untuk lebih rutin memakannya. Pasalnya, kandungan senyawa flavonoid dalam beri-berian seperti blueberry ini terbukti ampuh menurunkan tekanan darah dan mencegah terjadinya hipertensi. \n\t\t\t\t\tApalagi, saat ini banyak penjual yang menawarkan menu buah-buahan (salad) dengan harga yang terjangkau. Jika perlu, mintalah secara khusus menu buah berry seperti blueberry, raspberry, atau strawberry. Jika ingin meraciknya sendiri juga lebih baik. Anda dapat membuat menu makanan untuk penderita darah tinggi kedalam sereal." +
                        "\n\n3. Pisang\n" + "\t\t\t\t\tAda beragam jenis pisang yang tumbuh disekitar kita dan dijual dengan harga yang terjangkau. Menariknya, dalam buah yang sangat mudah ditemukan ini, terkandung karbohidrat, vitamin C, potasium, kalium, dan serat yang baik bagi tubuh. Jadi, daripada mengonsumsi suplemen untuk mendapatkan kandungan dalam pisang, lebih baik langsung makan buah pisang ini. Kandungan potassium yang alami dalam pisang mampu menstabilkan tekanan darah dan mencegah terjadinya lonjakan darah tinggi. Buah ini dapat dikonsumsi langsung atau diolah menjadi bentuk lain seperti salad atau dicampurkan dalam sereal." +
                        "\n\n4. Ikan Berlemak yang Segar\n" + "\t\t\t\t\tIngat, masakan ikan yang cocok bagi penderita darah tinggi harus segar, bukan dalam bentuk asinan atau awetan. Beberapa jenis ikan seperti salmon dan trout mengandung vitamin D dan asam lemak omega 3 yang baik untuk menurunkan tekanan darah tinggi dan kolesterol. Perhatikan cara pengolahannya supaya meniadakan garam. Lebih baik lagi jika dipepes daripada digoreng atau dibakar." +
                        "\n\n5. Cokelat Hitam\n" + "\t\t\t\t\tBerdasarkan penelitian yang dipublikasikan BMJ Journals Heart tahun 2015, kebiasaan mengonsumsi cokelat hitam sebanyak 100 gram perhari mampu menurunkan risiko penyakit kardiovaskular. Anda dapat memilih cokelat ini sebagai pengganti gula dalam hidangan menu makanan sehat hipertensi.",
                "Perhatikan Asupan Kalori dan Porsi Makan \n\t\t\t\t\tLangkah awal untuk mendapatkan menu makanan sehat bagi hipertensi adalah memperhatikan asupan kalori dan porsi makannya. Jika Anda terbiasa makan dalam porsi besar, ditambah kalori yang tinggi, maka dapat memicu kelebihan berat badan atau obesitas. Obesitas ini pada akhirnya akan memicu hipertensi, bahkan memperburuk kondisi kesehatannya. Tidak mau bukan hal ini terjadi pada Anda? Oleh karena itu, mulailah untuk mengubah kebiasaan tersebut secara perlahan dengan mulai mencatat apa saja yang dimakan setiap hari dalam buku. Catat makanan dan minuman yang dikonsumsi, berapa kali Anda makan berserta waktunya, termasuk porsi detailnya. \n\t\t\t\t\tDari catatan tersebut, akan membantu menyadarkan Anda seberapa banyak asupan makanan yang dikonsumsi setiap hari. Jadi, Anda dapat segera berniat untuk mengurangi kalori dan porsi makanan guna mengontrol tekanan darah sekaligus menurunkan berat badan." +
                "\n\nHindari Garam atau Natrium" + "\n\t\t\t\t\tSelain membatasi asupan makanan yang dikonsumsi setiap hari, seorang penderita hipertensi juga wajib menghindari makanan yang mengandung garam tinggi. Semakin sedikit garam yang dimakan, maka akan semakin baik dalam mengontrol tekanan darah Anda. Berikut ini tips dalam membatasi asupan garam dalam menu makanan. Kurangi kadar garam yang dikonsumsi menjadi 2300 mg per hari. Lebih pastinya, Anda bisa tanyakan kepada dokter, berapakah kadar garam yang sebaiknya dimakan setiap harinya. ");
        dataholder.add(ob7);

        DataModelRecommendation ob8;
        ob8 = new DataModelRecommendation(
                R.drawable.asma,
                "Asma",
                "\t\t\t\t\tAsma adalah penyakit yang berhubungan dengan pernapasan. Meski begitu, pengidap asma tetap harus cermat memilah-milih makanan yang dikonsumsi setiap hari. Tidak banyak yang menyadari bahwa pemilihan makanan sangat berkaitan dengan risiko kambuhnya asma. Salah memilih makanan dapat membuat gejala asma kambuh sewaktu-waktu, lho! Lantas, apa saja makanan yang boleh untuk penderita asma dan yang tidak?",
                "A. Makanan yang baik untuk penderita asma \n\n\t\t\t\t\tSebenarnya tidak ada jenis makanan tertentu yang benar-benar ampuh untuk mengobati penyakit asma. Namun, selektif memilih makanan dapat membantu mengendalikan asma dengan mencegah kekambuhan asma. Berikut beberapa pilihan makanan yang baik dikonsumsi untuk penderita asma :" +
                        "\n\n1. Asam lemak omega-3\n" + "\t\t\t\t\tLemak tidak selalu buruk untuk tubuh. Asalkan cermat memilih jenis makanannya, lemak justru dapat membawa manfaat kesehatan. \n\t\t\t\t\tMenurut sebuah studi yang diterbitkan dalam Allergology International, lemak yang berasal dari tumbuhan dan asam lemak omega-3 dapat mengurangi peradangan yang terjadi pada saluran napas penderita asma. Dengan begitu risiko kekambuhan gejala asma dapat diminimalisir." +
                        "\n\n2. Apel\n" + "\t\t\t\t\tBukti yang terbaru, apel bahkan diketahui dapat membantu meningkatkan fungsi paru dan mengendalikan gejala asma. Studi oleh para peneliti di Inggris mengungkapkan, penderita asma yang makan apel setiap hari berisiko lebih rendah mengalami serangan asma ketimbang yang tidak makan apel sama sekali. Selain enak dimakan segar-segar, Anda bisa mengolah apel menjadi jus atau smoothies." +
                        "\n\n3. Wortel\n" + "\t\t\t\t\tPada kenyataannya, makanan yang terbuat dari wortel punya manfaat lain untuk penderita asma. Studi menunjukkan bahwa beta karoten dalam wortel dapat mengurangi serangan asma yang dipicu oleh olahraga setelah diubah oleh tubuh menjadi vitamin A." +
                        "\n\n4. Bayam\n" + "\t\t\t\t\tSayuran hijau seperti bayam ternyata juga masuk dalam daftar makanan yang baik dikonsumsi untuk penderita asma. Kandungan folat (vitamin B9) dalam bayam dapat membantu mengendalikan asma." +
                        "\n\n5. Pisang\n" + "\t\t\t\t\tGuna mencegah mengi karena asma, Anda bisa mengonsumsi buah pisang. Sebuah survei yang diterbitkan dalam European Respiratory Journal menemukan bahwa pisang dapat mengurangi mengi pada anak-anak dengan asma. Manfaat ini didapat berkat kandungan antioksidannya." +
                        "\n\n6. Jahe\n" + "\t\t\t\t\tPenelitian melaporkan bahwa jahe dapat membantu mengurangi peradangan dan menghalangi kontraksi pada saluran pernapasan. Jahe juga dapat meningkatkan relaksasi pada otot seperti yang terdapat pada beberapa obat asma. Inilah sebabnya, jahe patut dijadikan sebagai makanan yang baik untuk dikonsumsi penderita asma.",
                "B. Makanan yang harus dihindari oleh penderita asma \n\n\t\t\t\t\tAda sejumlah makanan yang dapat memicu gejala asma sehingga harus dihindari penderita asma, di antaranya :" +
                        "\n\n1. Makanan mengandung sulfit\n" + "\t\t\t\t\tSulfit adalah bahan kimia yang banyak ditemukan dalam makanan dan minuman. Bahan kimia ini sering digunakan sebagai bahan pengawet. Pengawet ini bisa memicu serangan asma karena reaksi kimia yang terjadi dalam tubuh Anda. \n\t\t\t\t\tSulfit akan melepaskan gas sulfur yang akan membuat saluran pernapasan menyempit dan iritasi. Inilah yang memicu sesak napas dan serangan asma. Berikut adalah jenis makanan dan minuman tinggi sulfit yang sebaiknya tidak dikonsumsi pengidap asma, antaralain buah-buahan(termasuk kismis), jus lemon dalam kemasan, jus anggur dalam kemasan, wine, dan molase (gula tetes tebu)." +
                        "\n\n2. Makanan yang mengandung gas\n" + "\t\t\t\t\tMakanan yang mengandung gas dapat memberikan tekanan pada diafragma. Tanpa disadari, hal tersebut dapat menyebabkan sesak dada dan memicu gejala asma lainnya. Berikut beberapa makanan dan minuman yang mengandung gas dan sebaiknya dihindari oleh penderita asma, yakni minuman berkarbonasi, minuman manis dalam kemasa, permen karet, gorengan, sayur seperti kubis dan kol, kacang polong, dan bawang putih." +
                        "\n\n3. Makanan cepat saji\n" + "\t\t\t\t\tPengawet kimia, perasa, dan pewarna sering ditemukan dalam makanan olahan dan makanan cepat saji. Beberapa orang dengan asma mungkin sensitif atau alergi terhadap bahan-bahan buatan ini." +
                        "\n\n4. Makanan pemicu alergen\n" + "\t\t\t\t\tBeberapa jenis makanan yang paling sering menyebabkan reaksi alergi mirip asma meliputi produk susu, seafod, gandum, teur, dan kacang.");
        dataholder.add(ob8);

        DataModelRecommendation ob9;
        ob9 = new DataModelRecommendation(
                R.drawable.diare,
                "Diare",
                "\t\t\t\t\tDiare adalah salah satu penyakit saluran cerna yang paling umum di masyarakat. Diare seringkali disebabkan makanan/minuman yang sudah terkontaminasi bakteri, virus ataupun parasit lain. Selain itu, diare bisa disebabkan efek samping obat-obatan, alergi terhadap makanan, keracunan, dan peradangan pada usus. Karena itu, diare bisa menyerang siapa saja, mulai dari anak-anak hingga orang lanjut usia.",
                "A. Rekomendasi Makanan saat Diare \n\n\t\t\t\t\tKetika sedang diare, tubuh menjadi lemas dan kekurangan cairan. Tidak jarang, pada kasus yang lebih parah, diare bisa menyebabkan dehidrasi. Untuk mencegah hal tersebut, penderita diare harus memperhatikan makanan yang aman untuk dikonsumsi. Ditambah lagi, harus sebisa mungkin menghindari makanan yang tidak aman dikonsumsi saat diare." +
                        "\n\n1. Makanan berkuah\n" + "\t\t\t\t\tMakanan berkuah seperti sup dan kaldu ayam atau sapi bisa mengganti cairan tubuh yang hilang karena diare. Selain itu, sup dan kaldu ayam yang hangat akan membuat perut Anda menjadi lebih nyaman. Anda bisa membuatnya sendiri dengan sayuran yang tersedia atau membuat kaldu ayam yang sekarang sudah ada dalam kemasan instan." +
                        "\n\n2. Air putih\n" + "\t\t\t\t\tAir putih tidak pernah absen dalam meringankan berbagai macam penyakit. Bukan hanya meringankan, konsumsi air putih pun bisa menjadi obat alami yang sederhana. Pada kasus diare, air putih berfungsi vital untuk mengembalikan cairan tubuh. Minum banyak air putih membantu mencegah dehidrasi serta mengeluarkan racun dalam tubuh. Jadi, ketika terkena diare, Anda harus lebih banyak minum air putih." +
                        "\n\n3. Makanan/minuman yang mengandung probiotik\n" + "\t\t\t\t\tKetika sakit, probiotik membantu mempercepat proses pemulihan. Manfaat lainnya yaitu menjaga sistem pencernaan dengan menjaga keseimbangan bakteri baik di dalam usus. Probiotik bisa Anda temukan di dalam yoghurt, kefir, tempe, kimchi, atau kombucha. \n\t\t\t\t\tProbiotik juga bukan hanya terdapat di minuman seperti yoghurt saja, melainkan juga bisa dari makanan seperti tempe, kimchi, dan kombucha. Tempe memiliki kandungan probiotik tinggi. Dari fermentasi, tempe bisa menghasilkan vitamin seperti vitamin B12 dan senyawa anti kanker yaitu isoflavon." +
                        "\n\n4. Diet BRAT (Banana, Rice, Apple sauce, Toast)\n" + "\t\t\t\t\tBRAT adalah singkatan dari banana (pisang), rice (nasi), applesauce (apel yang dihaluskan) dan  toast (roti panggang). Diet BRAT sangat dianjurkan bagi penderita diare karena memiliki kandungan serat dan protein tinggi, serta lemak yang rendah sehingga bisa meredakan masalah pada saluran cerna. \n\t\t\t\t\tSelain keempat makanan di atas, terdapat makanan lain yang termasuk ke dalam diet BRAT, di antaranya kentang rebus, roti, sereal, oatmeal, gandum, biskuit serta ayam tanpa kulit dan lemak. Semua makanan tersebut kaya akan protein, karbohidrat, dan rendah lemak. \n\t\t\t\t\tAnda tidak dianjurkan mengonsumsinya dalam jangka panjang karena ada beberapa zat gizi yang tidak dimiliki pada makanan dalam diet BRAT ini. Jadi, setelah Anda sembuh dari diare, pastikan Anda kembali mengkonsumsi makanan dengan zat gizi seimbang yang baik untuk tubuh." +
                        "\n\n5. Makanan bercita rasa hambar\n" + "\t\t\t\t\tMakanan yang sebaiknya dikonsumsi ketika diare adalah makanan dengan rasa hambar. Makanan hambar yang bisa Anda konsumsi diantaranya cracker tanpa rasa, nasi putih, buah pisang, oatmeal, dan kentang rebus. Makanan yang hambar ini berfungsi untuk mengurangi risiko iritasi berlanjut pada usus ketika saluran cerna terkena diare.",
                "B. Pantangan Makanan saat Diare \n\n\t\t\t\t\tSelain makanan dan minuman yang sebaiknya dikonsumsi ketika diare, Anda juga harus menghindari beberapa pantangannya. Yuk, simak lima pantangan makanan yang harus dihindari berikut." +
                        "\n\n1. Produk susu selain yoghurt\n" + "\t\t\t\t\tKetika diare, Anda harus menghindari produk susu dan olahannya untuk sementara waktu. Hal ini karena diare membuat usus sulit memproduksi enzim laktase yang diperlukan tubuh untuk mencerna laktosa (gula yang dapat ditemukan dalam susu). Jika laktosa tidak tercerna, tubuh akan mengalami perut kembung, bergas, mual, sampai diare yang lebih parah. Meski tidak boleh mengonsumsi susu, ada satu produk olahan susu yang bisa Anda konsumsi saat diare. Yoghurt merupakan produk olahan susu yang mengandung probiotik, sehingga baik untuk meredakan diare." +
                        "\n\n2. Makanan berminyak dan berlemak\n" + "\t\t\t\t\tMakanan yang harus dihindari lainnya ketika Anda terserang diare yaitu makanan yang berminyak dan berlemak. Makanan seperti gorengan, makanan yang mengandung krim, makanan cepat saji ( fast food ), potongan daging yang berlemak, makanan yang berminyak, dan makanan dengan campuran saus. \n\t\t\t\t\tMakanan berlemak tinggi dapat mempercepat kontraksi usus. Hal ini bisa memicu reaksi pada sistem pencernaan yang sudah sensitif. Selain itu, makanan yang berminyak dan berlemak juga bisa menyebabkan otot-otot pada saluran cerna menjadi tegang. Diare pun menjadi semakin parah. Makanan berlemak juga bertanggung jawab atas rasa kembung yang terjadi akibat dari pengosongan lambung." +
                        "\n\n3. Makanan penghasil gas\n" + "\t\t\t\t\tBeberapa makanan bisa meningkatkan gas di usus dan membuat diare menjadi lebih parah. Contoh makanan penghasil gas yaitu brokoli, kubis, bunga kol, buah persik, buah plum, buah pir, biji dari tumbuhan polong-polongan (beans), serta buah yang dikeringkan seperti aprikot dan kismis. Agar diare tidak menjadi lebih parah, sebaiknya Anda menghindari jenis makanan penghasil gas tersebut. Sebagai penggantinya, Anda bisa mengonsumsi wortel, kacang hijau, jamur, zucchini, dan asparagus." +
                        "\n\n4. Makanan pedas\n" + "\t\t\t\t\tBukan hanya makanan berminyak seperti gorengan yang harus dihindari ketika diare, melainkan juga makanan pedas. Makanan pedas seperti sambal, dan saus berasal dari cabai yang mengandung zat capsaicin. Zat inilah yang menimbulkan rasa pedas pada makanan. Ketika diare, konsumsi makanan pedas bisa membuat iritasi pada saluran cerna dan memperparah diare. Sebagai tambahan, perut pun bisa menjadi kembung, bergas dan timbul sensasi terbakar pada perut." +
                        "\n\n5. Alkohol, kafein, dan minuman berkarbonasi\n" + "\t\t\t\t\tKetiga jenis minuman ini harus Anda hindari ketika terserang diare. Alkohol, kafein, dan soda bertindak sebagai diuretik yang bisa meningkatkan produksi dan volume urine. Ini bisa memperparah kondisi diare. Ketika produksi urine meningkat, cairan tubuh Anda pun dapat hilang lebih banyak dan menimbulkan dehidrasi. Karena itu, hentikan konsumsi ketiga minuman ini untuk mempercepat penyembuhan saat diare.");
        dataholder.add(ob9);

        recyclerView.setAdapter(new MyAdapterRecommendation(dataholder, getContext()));

        return view;
    }

//    private void filter (String text) {
//        ArrayList<DataModelRecommendation> filteredlist= new ArrayList<>();
//
//        for (DataModelRecommendation item : dataholder) {
//            if (item.getHeader().toLowerCase().contains(text.toLowerCase())) {
//                filteredlist.add(item);
//            }
//        }
//        adapter.filterList(filteredlist);
//    }

}