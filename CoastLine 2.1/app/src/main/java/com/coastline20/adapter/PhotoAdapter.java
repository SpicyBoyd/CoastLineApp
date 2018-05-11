package com.coastline20.adapter;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.coastline20.R;

import java.io.InputStream;

public class PhotoAdapter extends RecyclerView.Adapter<PhotoAdapter.ViewHolder> {
    private int[] images;
    private Toast toast;

    public PhotoAdapter(int[] images) {
        this.images = images;
    }

    @NonNull
    @Override
    public PhotoAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_photo, parent, false);
        return new PhotoAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PhotoAdapter.ViewHolder holder, final int position) {
        // 避免OOM
        BitmapFactory.Options opt = new BitmapFactory.Options();
        opt.inPreferredConfig = Bitmap.Config.RGB_565;
        opt.inPurgeable = true;
        opt.inInputShareable = true;
        InputStream is = holder.itemView.getResources().openRawResource(images[position]);
        final Bitmap bitmapImage = BitmapFactory.decodeStream(is, null, opt);

        holder.imageView.setImageBitmap(bitmapImage);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                ImageView imageView = new ImageView(v.getContext());
                imageView.setImageBitmap(bitmapImage);

                // 避免 toast 累加時間
                if (toast == null) {
                    toast = new Toast(v.getContext());
                }
                toast.setView(imageView);
                // 使圖片width充滿畫面
                toast.setGravity(Gravity.FILL_HORIZONTAL | Gravity.FILL_VERTICAL, 0, 0);
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;

        ViewHolder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.photo_image);
        }
    }
}
