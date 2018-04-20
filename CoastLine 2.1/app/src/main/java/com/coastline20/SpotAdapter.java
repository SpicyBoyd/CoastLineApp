package com.coastline20;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.InputStream;

public class SpotAdapter extends RecyclerView.Adapter<SpotAdapter.ViewHolder> {
    private String[] names, rates, infos, activities;
    private int[] images;

    SpotAdapter(String[] names, String[] rates, String[] infos, String[] activities, int[] images) {
        this.names = names;
        this.rates = rates;
        this.infos = infos;
        this.activities = activities;
        this.images = images;
    }

    @NonNull
    @Override
    public SpotAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_station, parent, false);
        return new SpotAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {
        // 避免OOM
        BitmapFactory.Options opt = new BitmapFactory.Options();
        opt.inPreferredConfig = Bitmap.Config.RGB_565;
        opt.inPurgeable = true;
        opt.inInputShareable = true;
        InputStream is = holder.itemView.getResources().openRawResource(images[position]);
        final Bitmap bitmapImage = BitmapFactory.decodeStream(is, null, opt);

        holder.name.setText(names[position]);
        holder.rate.setText(rates[position]);
        holder.info.setText(infos[position]);
        holder.image.setImageBitmap(bitmapImage);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 以 Activity 名稱進行跳轉
                Intent intent = new Intent().setClassName(v.getContext(), activities[position]);
                v.getContext().startActivity(intent);
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
