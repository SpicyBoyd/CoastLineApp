package com.coastline20;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class InfoAdapter extends RecyclerView.Adapter<InfoAdapter.ViewHolder> {
    private String[] infos;

    InfoAdapter(String[] infos) {
        this.infos = infos;
    }

    @NonNull
    @Override
    public InfoAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_info, parent, false);
        return new InfoAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull InfoAdapter.ViewHolder holder, int position) {
        holder.textView.setText(infos[position]);
    }

    @Override
    public int getItemCount() {
        return infos.length;
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView;

        ViewHolder(View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.info);
        }
    }
}
