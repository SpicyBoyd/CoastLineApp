package com.coastline20;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.ViewHolder> {
    private String[] foods;

    FoodAdapter(String[] foods) {
        this.foods = foods;
    }

    @NonNull
    @Override
    public FoodAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_food, parent, false);
        return new FoodAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodAdapter.ViewHolder holder, int position) {
        holder.textView.setText(foods[position]);
        // 缺 OnClickListener
    }

    @Override
    public int getItemCount() {
        return foods.length;
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView;

        ViewHolder(View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.food);
        }
    }
}
