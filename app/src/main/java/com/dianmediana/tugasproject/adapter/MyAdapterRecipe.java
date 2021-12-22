package com.dianmediana.tugasproject.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.dianmediana.tugasproject.model.DataModelRecipe;
import com.dianmediana.tugasproject.DetailRecipe;
import com.dianmediana.tugasproject.R;

import java.util.ArrayList;

public class MyAdapterRecipe extends RecyclerView.Adapter<MyAdapterRecipe.ViewHolder>{

    ArrayList<DataModelRecipe> dataholder;
    Context context;

    public MyAdapterRecipe(ArrayList<DataModelRecipe> dataholder,Context context) {
        this.dataholder = dataholder;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recipe_single_row, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    //menampilkan data pada breakfast_single_row
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Glide.with(context).asBitmap().load(dataholder.get(position).getImage()).into(holder.img);
        holder.header.setText(dataholder.get(position).getHeader());
        holder.desc.setText(dataholder.get(position).getDesc());
        holder.time.setText(dataholder.get(position).getTime());
        holder.porsi.setText(dataholder.get(position).getPortion());

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(context, namaMakanan.get(position), Toast.LENGTH_LONG).show();

                //untuk berpindah ke activity lain. asalnya context tujuannya ke DetailActivity.java
                Intent intent = new Intent(context, DetailRecipe.class);

                //mengirimkan data
                //meyimpan data dalam memori, baru nanti diterima oleh penerima yaitu DetailActivity. Data yang dikirim berupa foto, nama, dan info
                intent.putExtra("foto_makanan", dataholder.get(position).getImage());
                intent.putExtra("nama_makanan", dataholder.get(position).getHeader());
                intent.putExtra("desc_makanan", dataholder.get(position).getDesc());
                intent.putExtra("waktu_sajian", dataholder.get(position).getTime());
                intent.putExtra("porsi_sajian", dataholder.get(position).getPortion());
                intent.putExtra("alat_bahan", dataholder.get(position).getTools());
                intent.putExtra("cara_masak", dataholder.get(position).getProcedure());

                //data dikirim ke activity_detail
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return dataholder.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView img;
        TextView header, desc, time, porsi;
        CardView cardView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.img1);
            header = itemView.findViewById(R.id.t1);
            desc = itemView.findViewById(R.id.t2);
            time = itemView.findViewById(R.id.t3);
            porsi = itemView.findViewById(R.id.t4);
            cardView = itemView.findViewById(R.id.cardView);
        }
    }

//    public MyAdapterRecipe(ArrayList<DataModelRecipe> exampleList) {
//        dataholder = exampleList;
//    }
//
//    public void filterList(ArrayList<DataModelRecipe> filteredList) {
//        dataholder = filteredList;
//        notifyDataSetChanged();
//    }

//    public static final class holder extends RecyclerView.ViewHolder {}

//    public Filter getFilter() {
//        return new Filter() {
//            @Override
//            protected FilterResults performFiltering(CharSequence charSequence) {
//                String Key = charSequence.toString();
//                if (Key.isEmpty()) {
//                    filteredMenuList = namaMakanan;
//                }
//                else {
//                    ArrayList<String> isfiltered = new ArrayList<>();
//                    for (String row: namaMakanan) {
//                        if (namaMakanan.contains(Key.toLowerCase())){
//                            isfiltered.add(row);
//                        }
//                    }
//                    filteredMenuList = isfiltered;
//                }
//                FilterResults filterResults = new FilterResults();
//                filterResults.values = filteredMenuList;
//                return null;
//            }
//
//            @Override
//            protected void publishResults(CharSequence charSequence, FilterResults filterResults) {
//                filteredMenuList = filterResults.values;
//                notifyDataSetChanged();
//            }
//        };
//    }
}

