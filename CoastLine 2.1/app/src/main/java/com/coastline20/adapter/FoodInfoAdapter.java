package com.coastline20.adapter;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.coastline20.R;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class FoodInfoAdapter extends RecyclerView.Adapter<FoodInfoAdapter.ViewHolder> {
    private String info;
    private int[] images;
    private List<Bitmap> bitmapImageList = new ArrayList<>();

    public FoodInfoAdapter(String info, int[] images) {
        this.info = info;
        this.images = images;
    }

    @NonNull
    @Override
    public FoodInfoAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_food_info, parent, false);
        return new FoodInfoAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        // 避免OOM
        BitmapFactory.Options opt = new BitmapFactory.Options();
        opt.inPreferredConfig = Bitmap.Config.RGB_565;
        opt.inPurgeable = true;
        opt.inInputShareable = true;

        for (int image : images) {
            InputStream is = holder.itemView.getResources().openRawResource(image);
            bitmapImageList.add(BitmapFactory.decodeStream(is, null, opt));
        }
        holder.info.setText(info);
        holder.image1.setImageBitmap(bitmapImageList.get(0));
        holder.image2.setImageBitmap(bitmapImageList.get(1));
    }

    @Override
    public int getItemCount() {
        return 1;
    }

    //Adapter 需要一個 ViewHolder，只要實作它的 constructor 就好，保存起來的view會放在itemView裡面
    class ViewHolder extends RecyclerView.ViewHolder {
        TextView info;
        ImageView image1, image2;

        ViewHolder(View itemView) {
            super(itemView);
            info = (TextView) itemView.findViewById(R.id.food_info);
            image1 = (ImageView) itemView.findViewById(R.id.food_image1);
            image2 = (ImageView) itemView.findViewById(R.id.food_image2);
        }
    }
}

