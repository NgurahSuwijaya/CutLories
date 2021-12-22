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
import com.dianmediana.tugasproject.model.DataModelTips;
import com.dianmediana.tugasproject.R;
import com.dianmediana.tugasproject.TipsWebView;

import java.util.ArrayList;

public class MyAdapterTips extends RecyclerView.Adapter<MyAdapterTips.MyViewHolderTips> {

    ArrayList<DataModelTips> dataholder;
    Context context;

    public MyAdapterTips(ArrayList<DataModelTips> dataholder, Context context) {
        this.dataholder = dataholder;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolderTips onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.menu3_single_row, parent, false);
        return new MyViewHolderTips(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolderTips holder, int position) {

        Glide.with(context).asBitmap().load(dataholder.get(position).getImage()).into(holder.img);
        holder.header.setText(dataholder.get(position).getHeader());
        holder.source.setText(dataholder.get(position).getSource());
        holder.date.setText(dataholder.get(position).getDate());

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(context, namaMakanan.get(position), Toast.LENGTH_LONG).show();

                //untuk berpindah ke activity lain. asalnya context tujuannya ke DetailActivity.java
                Intent intent = new Intent(context, TipsWebView.class);

                intent.putExtra("webview", dataholder.get(position).getUrls());
                intent.putExtra("source", dataholder.get(position).getSource());
//                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(dataholder.get(position).getUrls()));
                
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return dataholder.size();
    }

    class MyViewHolderTips extends RecyclerView.ViewHolder {

        ImageView img;
        TextView header, source, date;
        CardView cardView;

        public MyViewHolderTips(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.img1);
            header = itemView.findViewById(R.id.t1);
            source = itemView.findViewById(R.id.t2);
            date = itemView.findViewById(R.id.t3);
            cardView = itemView.findViewById(R.id.cardView);
        }
    }
}
