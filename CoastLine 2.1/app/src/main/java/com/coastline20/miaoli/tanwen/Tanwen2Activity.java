package com.coastline20.miaoli.tanwen;

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

import com.coastline20.InfoFragment;
import com.coastline20.PhotoFragment;
import com.coastline20.R;
import com.coastline20.SpotEntity;
import com.coastline20.SpotPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class Tanwen2Activity extends AppCompatActivity {
    private CollapsingToolbarLayout toolbarLayout;
    private ImageView imageView;
    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private String[] titles;
    private SpotEntity entity;

    // Spot 修改資料的地方
    private void init() {
        toolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.toolbar_layout);
        imageView = (ImageView) findViewById(R.id.toolbar_image);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        viewPager = (ViewPager) findViewById(R.id.view_pager);

        entity = new SpotEntity(
                getResources(),
                R.drawable.tanwenspot2,
                R.array.tanwen_spot_name,
                2,
                new int[]{R.drawable.tanwenspot2_1,
                        R.drawable.tanwenspot2_2, R.drawable.tanwenspot2_3,
                        R.drawable.tanwenspot2_4, R.drawable.tanwenspot2_5},
                R.array.tanwen2_info,
                "苗栗縣造橋鄉鄭漢紀念碑");
        titles = getResources().getStringArray(entity.getTabTitle());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spot);

        init();
        setToolbar();
        setToolbarLayout();
        setTabLayout();
        setViewPager();
        tabLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(viewPager));
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
    }

    // 設定 CollapsingToolbarLayout
    private void setToolbarLayout() {
        imageView.setImageResource(entity.getToolbarImage());
        toolbarLayout.setTitle(getResources().getStringArray(entity.getSpotName())[entity.getSpotNum()]);
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
        SpotPagerAdapter pagerAdapter = new SpotPagerAdapter(getSupportFragmentManager(), titles, entity.getFragmentList());
        viewPager.setAdapter(pagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }

    // 設定 FloatingActionButton
    public void mapGuide(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=" + entity.getAddress()));
        startActivity(intent);
    }

}
