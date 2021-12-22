package com.dianmediana.tugasproject.adapter;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.dianmediana.tugasproject.model.DataModelRecommendation;
import com.dianmediana.tugasproject.DetailRecommendation;
import com.dianmediana.tugasproject.R;

import java.util.ArrayList;

public class MyAdapterRecommendation extends RecyclerView.Adapter<MyAdapterRecommendation.MyViewHolder> {

    ArrayList<DataModelRecommendation> dataholder;
    Context context;

    public MyAdapterRecommendation(ArrayList<DataModelRecommendation> dataholder, Context context) {
        this.dataholder = dataholder;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.menu2_single_row, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
//        holder.img.setImageResource(dataholder.get(position).getImage());
        holder.header.setText(dataholder.get(position).getHeader());
//        holder.desc.setText(dataholder.get(position).getDesc());

        holder.img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(context, namaMakanan.get(position), Toast.LENGTH_LONG).show();

                //untuk berpindah ke activity lain. asalnya context tujuannya ke DetailActivity.java
                Intent intent = new Intent(context, DetailRecommendation.class);

                //mengirimkan data
                //meyimpan data dalam memori, baru nanti diterima oleh penerima yaitu DetailActivity. Data yang dikirim berupa foto, nama, dan info
                intent.putExtra("gambar", dataholder.get(position).getImage());
                intent.putExtra("judul", dataholder.get(position).getHeader());
                intent.putExtra("awalan", dataholder.get(position).getDesc());
                intent.putExtra("rekomendasi", dataholder.get(position).getRecommend());
                intent.putExtra("pantangan", dataholder.get(position).getAvoid());

                Log.d("gambarr", String.valueOf(dataholder.get(position).getImage()));
                Log.d("namaa", dataholder.get(position).getHeader());
                Log.d("detaill", dataholder.get(position).getDesc());

                //data dikirim ke activity_detail
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return dataholder.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        ImageButton img;
        TextView header, desc;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.img1);
            header = itemView.findViewById(R.id.t1);
//            desc = itemView.findViewById(R.id.t2);
        }
    }

//    public MyAdapterRecommendation(ArrayList<DataModelRecommendation> exampleList) {
//        dataholder = exampleList;
//    }
//
//    public void filterList(ArrayList<DataModelRecommendation> filteredList) {
//        dataholder = filteredList;
//        notifyDataSetChanged();
//    }
}
