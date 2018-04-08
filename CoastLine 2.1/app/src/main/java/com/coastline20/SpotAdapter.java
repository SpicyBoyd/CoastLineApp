package com.coastline20;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class SpotAdapter extends RecyclerView.Adapter<SpotAdapter.ViewHolder> {
    private Context context;
    private String[] names, rates, infos;
    private int[] images;

    SpotAdapter(Context context, String[] names, String[] rates, String[] infos, int[] images) {
        this.context = context;
        this.names = names;
        this.rates = rates;
        this.infos = infos;
        this.images = images;
    }

    @NonNull
    @Override
    public SpotAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recyclerview_station_item, parent, false);
        return new SpotAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, int position) {
        holder.name.setText(names[position]);
        holder.rate.setText(rates[position]);
        holder.info.setText(infos[position]);
        holder.image.setImageResource(images[position]);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // MainActivity 未知
                Intent intent = new Intent().setClass(context, MainActivity.class);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return names.length;
    }

    //Adapter 需要一個 ViewHolder，只要實作它的 constructor 就好，保存起來的view會放在itemView裡面
    class ViewHolder extends RecyclerView.ViewHolder {
        TextView name, rate, info;
        ImageView image;

        ViewHolder(View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.spot_name);
            rate = (TextView) itemView.findViewById(R.id.spot_rate);
            info = (TextView) itemView.findViewById(R.id.spot_info);
            image = (ImageView) itemView.findViewById(R.id.spot_image);
        }
    }

}
