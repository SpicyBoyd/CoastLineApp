package com.coastline20.miaoli.baishatun;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

import com.coastline20.FoodFragment;
import com.coastline20.InfoFragment;
import com.coastline20.PhotoFragment;
import com.coastline20.R;
import com.coastline20.SpotPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class Baishatun1Activity extends AppCompatActivity {
    private CollapsingToolbarLayout toolbarLayout;
    private ImageView imageView;
    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private List<Fragment> fragmentList;
    private String[] titles;

    private void init() {
        toolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.toolbar_layout);
        imageView = (ImageView) findViewById(R.id.toolbar_image);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        viewPager = (ViewPager) findViewById(R.id.view_pager);
        titles = getResources().getStringArray(R.array.spot_tab);
        fragmentList = new ArrayList<>();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spot);

        init();
        setToolbar();
        setToolbarLayout();
        setFragmentList();
        setTabLayout();
        setViewPager();
        tabLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(viewPager));
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
    }

    // 設定 CollapsingToolbarLayout
    private void setToolbarLayout() {
        imageView.setImageResource(R.drawable.baishatunspot1);
        toolbarLayout.setTitle(getResources().getStringArray(R.array.baishatun_spot_name)[0]);
        toolbarLayout.setCollapsedTitleTextColor(Color.WHITE);
        toolbarLayout.setExpandedTitleColor(Color.WHITE);
    }

    // 設定 Toolbar
    private void setToolbar() {
        setSupportActionBar(toolbar);
    }

    // 設定 TabLayout
    private void setTabLayout() {
        for (String title : titles) {
            tabLayout.addTab(tabLayout.newTab().setText(title));
        }
    }

    // 設定 ViewPager
    private void setViewPager() {
        SpotPagerAdapter pagerAdapter = new SpotPagerAdapter(getSupportFragmentManager(), titles, fragmentList);
        viewPager.setAdapter(pagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }

    // 設定景點資料
    void setFragmentList() {
        fragmentList.add(PhotoFragment.newInstance(new int[]{R.drawable.baishatunspot1_1,
                R.drawable.baishatunspot1_2, R.drawable.baishatunspot1_3}));
        fragmentList.add(InfoFragment.newInstance(
                getResources().getStringArray(R.array.baishatun1_info)));
        fragmentList.add(FoodFragment.newInstance(
                getResources().getStringArray(R.array.baishatun1_food)));
    }

    // 設定 FloatingActionButton
    public void mapGuide(View view) {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q="+"苗栗縣通霄鎮白沙屯火車站"));
        startActivity(intent);
    }
}
