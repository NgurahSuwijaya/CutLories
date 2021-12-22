package com.dianmediana.tugasproject;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.dianmediana.tugasproject.adapter.MyAdapterTips;
import com.dianmediana.tugasproject.model.DataModelTips;

import java.util.ArrayList;


public class TipsFragment extends Fragment {

    RecyclerView recyclerView;
    ArrayList<DataModelTips> dataholder;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_tips, container, false);
        recyclerView =  view.findViewById((R.id.tipsview));
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        dataholder = new ArrayList<>();

        DataModelTips ob1 = new DataModelTips("https://res.cloudinary.com/dk0z4ums3/image/upload/v1599031992/attached_image/tips-pola-makan-untuk-diet-sehat-0-alodokter.jpg", "Tips Pola Makan untuk Diet Sehat", "alodokter.com", "03-09-2020", "https://www.alodokter.com/tips-pola-makan-untuk-diet-sehat#:~:text=Secara%20umum%2C%20ada%20beberapa%20pilihan%20makanan%20yang%20bisa,misalnya%20gandum%2C%20roti%20gandum%2C%20oatmeal%2C%20dan%20nasi%20merah");
        dataholder.add(ob1);

        DataModelTips ob2 = new DataModelTips("https://www.gooddoctor.co.id/_next/image?url=https%3A%2F%2Fcms.gooddoctor.co.id%2Fwp-content%2Fuploads%2F2020%2F05%2Fdiet-sehat.jpg&w=1200&q=75", "Diet Sehat: Panduan, Tips dan Menu Diet agar Berat Badan Cepat Turun", "gooddoctor.co.id", "02-09-2020", "https://www.gooddoctor.co.id/hidup-sehat/nutrisi/diet-sehat-ini-panduan-tips-dan-menu-diet-lengkapnya/");
        dataholder.add(ob2);

        DataModelTips ob3 = new DataModelTips("https://cdn.hellosehat.com/wp-content/uploads/2017/04/cara-memasak.jpg", "Kukus, Rebus, Panggang: Mana Cara Memasak yang Paling Sehat?", "hellosehat.com", "18-04-2017", "https://hellosehat.com/nutrisi/tips-makan-sehat/cara-memasak-pengaruh-nutrisi/");
        dataholder.add(ob3);

        DataModelTips ob4 = new DataModelTips("https://www.sasa.co.id/uploads/tips_tricks/1606280639453019.png", "Tips Mengolah Makanan Untuk Menu Diet", "sasa.co.id", "04-12-2019", "https://www.sasa.co.id/tips-and-hacks/view/tips-mengolah-makanan-untuk-menu-diet");
        dataholder.add(ob4);

        DataModelTips ob5 = new DataModelTips("https://cdn.hellosehat.com/wp-content/uploads/2017/02/makanan-olahan.jpg", "Mengapa Makanan Olahan Kurang Sehat Bagi Tubuh?", "hellosehat.com", "27-02-2017", "https://hellosehat.com/nutrisi/tips-makan-sehat/makanan-olahan-kurang-sehat-bagi-tubuh/");
        dataholder.add(ob5);

        DataModelTips ob6 = new DataModelTips("https://asset.kompas.com/crops/MvWT1qaoyYqGoqDnE11YzLK1mv8=/2x3:998x667/750x500/data/photo/2019/11/19/5dd37528762bf.jpg", "4 Tips Pola Makan Sehat untuk Penderita Diabetes", "kompas.com", "15-09-2020", "https://health.kompas.com/read/2020/09/15/133337268/4-tips-pola-makan-sehat-untuk-penderita-diabetes");
        dataholder.add(ob6);

        recyclerView.setAdapter(new MyAdapterTips(dataholder, getContext()));

        return view;
    }

}