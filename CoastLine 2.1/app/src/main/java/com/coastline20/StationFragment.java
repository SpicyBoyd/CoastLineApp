package com.coastline20;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class StationFragment extends Fragment {
    private String[] names, rates, infos;
    private int[] images;

    // TODO: Rename and change types and number of parameters
    public static StationFragment newInstance(String[] names, String[] rates, String[] infos, int[] images) {
        StationFragment fragment = new StationFragment();
        Bundle args = new Bundle();
        args.putStringArray("name", names);
        args.putStringArray("rate", rates);
        args.putStringArray("info", infos);
        args.putIntArray("image", images);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            names = getArguments().getStringArray("name");
            rates = getArguments().getStringArray("rate");
            infos = getArguments().getStringArray("info");
            images = getArguments().getIntArray("image");
        }
    }

    // 不建議在 onCreateView 使用findViewById，可能會crash
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_station, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL));
        recyclerView.setAdapter(new SpotAdapter(this.getContext(), names, rates, infos, images));
    }

}
