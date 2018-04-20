package com.coastline20.adapter;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.coastline20.fragment.StationFragment;

import java.util.List;

public class StationPagerAdapter extends FragmentPagerAdapter{
    private List<StationFragment> fragmentList;
    private String[] titles;

    public StationPagerAdapter(FragmentManager fm, String[] titles, List<StationFragment> fragmentList) {
        super(fm);
        this.titles = titles;
        this.fragmentList = fragmentList;
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }
}
