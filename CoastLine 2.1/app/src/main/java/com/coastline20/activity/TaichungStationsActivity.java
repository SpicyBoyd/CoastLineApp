package com.coastline20.activity;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.coastline20.R;
import com.coastline20.adapter.StationPagerAdapter;
import com.coastline20.fragment.StationFragment;

import java.util.ArrayList;
import java.util.List;

public class TaichungStationsActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private DrawerLayout drawerLayout;
    private NavigationView navigationView;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private List<StationFragment> fragmentList;
    private String[] titles;
    private int fragmentNum;

    private void init() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        navigationView = (NavigationView) findViewById(R.id.nav_view);
        tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        viewPager = (ViewPager) findViewById(R.id.view_pager);
        fragmentList = new ArrayList<>();
        titles = getResources().getStringArray(R.array.taichung_stations);
        fragmentNum = this.getIntent().getIntExtra("num", 0);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stations);

        init();
        setToolbar();
        setNavigationDrawer();
        setFragmentList();
        setTabLayout();
        setViewPager();
        tabLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(viewPager));
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
    }

    // 設定 Toolbar
    private void setToolbar() {
        toolbar.setTitle(R.string.taichung_stations);
        setSupportActionBar(toolbar);
    }

    // 設定 Navigation Drawer
    private void setNavigationDrawer() {
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                // 點選時收起選單
                drawerLayout.closeDrawer(GravityCompat.START);

                // 依照id判斷點了哪個項目並做相應事件
                int id = item.getItemId();
                if (id == R.id.home) {
                    Intent intent = new Intent().setClass(TaichungStationsActivity.this, MainActivity.class);
                    startActivity(intent);
                    return true;
                }
//                if (id == R.id.miaoli_stations) {
//                    Intent intent = new Intent().setClass(TaichungStationsActivity.this, MiaoliStationsActivity.class);
//                    startActivity(intent);
//                    return true;
//                }
                return false;
            }
        });
        // 將DrawerLayout 和 Toolbar整合
        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(this,
                drawerLayout, toolbar, R.string.open, R.string.close);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
    }

    // 設定 TabLayout
    private void setTabLayout() {
        for (String title : titles) {
            tabLayout.addTab(tabLayout.newTab().setText(title));
        }
    }

    // 設定 ViewPager
    private void setViewPager() {
        StationPagerAdapter pagerAdapter = new StationPagerAdapter(getSupportFragmentManager(),
                titles, fragmentList);
        viewPager.setAdapter(pagerAdapter);
        tabLayout.setupWithViewPager(viewPager);

        if (viewPager.getCurrentItem() != fragmentNum) {
            viewPager.setCurrentItem(fragmentNum);
        }
    }

    // 設定車站景點資料
    private void setFragmentList() {
        fragmentList.add(StationFragment.newInstance(
                getResources().getStringArray(R.array.rinan_spot_name),
                getResources().getStringArray(R.array.rinan_spot_rate),
                getResources().getStringArray(R.array.rinan_spot_info),
                getResources().getStringArray(R.array.rinan_spot_activity),
                new int[]{R.drawable.rinanspot1, R.drawable.rinanspot2}));
        fragmentList.add(StationFragment.newInstance(
                getResources().getStringArray(R.array.dajia_spot_name),
                getResources().getStringArray(R.array.dajia_spot_rate),
                getResources().getStringArray(R.array.dajia_spot_info),
                getResources().getStringArray(R.array.dajia_spot_activity),
                new int[]{R.drawable.dajiaspot1, R.drawable.dajiaspot2, R.drawable.dajiaspot3,
                        R.drawable.dajiaspot4, R.drawable.dajiaspot5, R.drawable.dajiaspot6}));
        fragmentList.add(StationFragment.newInstance(
                getResources().getStringArray(R.array.taichung_port_spot_name),
                getResources().getStringArray(R.array.taichung_port_spot_rate),
                getResources().getStringArray(R.array.taichung_port_spot_info),
                getResources().getStringArray(R.array.taichung_port_spot_activity),
                new int[]{R.drawable.taichungportspot1}));
        fragmentList.add(StationFragment.newInstance(
                getResources().getStringArray(R.array.qingshui_spot_name),
                getResources().getStringArray(R.array.qingshui_spot_rate),
                getResources().getStringArray(R.array.qingshui_spot_info),
                getResources().getStringArray(R.array.qingshui_spot_activity),
                new int[]{R.drawable.qingshuispot1, R.drawable.qingshuispot2, R.drawable.qingshuispot3,
                        R.drawable.qingshuispot4, R.drawable.qingshuispot5, R.drawable.qingshuispot6,
                        R.drawable.qingshuispot7, R.drawable.qingshuispot8, R.drawable.qingshuispot9,
                        R.drawable.qingshuispot10}));
        fragmentList.add(StationFragment.newInstance(
                getResources().getStringArray(R.array.shalu_spot_name),
                getResources().getStringArray(R.array.shalu_spot_rate),
                getResources().getStringArray(R.array.shalu_spot_info),
                getResources().getStringArray(R.array.shalu_spot_activity),
                new int[]{R.drawable.shaluspot1, R.drawable.shaluspot2, R.drawable.shaluspot3}));
        fragmentList.add(StationFragment.newInstance(
                getResources().getStringArray(R.array.longjing_spot_name),
                getResources().getStringArray(R.array.longjing_spot_rate),
                getResources().getStringArray(R.array.longjing_spot_info),
                getResources().getStringArray(R.array.longjing_spot_activity),
                new int[]{R.drawable.longjingspot1, R.drawable.longjingspot2, R.drawable.longjingspot3,
                        R.drawable.longjingspot4}));
        fragmentList.add(StationFragment.newInstance(
                getResources().getStringArray(R.array.dadu_spot_name),
                getResources().getStringArray(R.array.dadu_spot_rate),
                getResources().getStringArray(R.array.dadu_spot_info),
                getResources().getStringArray(R.array.dadu_spot_activity),
                new int[]{R.drawable.daduspot1, R.drawable.daduspot2, R.drawable.daduspot3,
                        R.drawable.daduspot4, R.drawable.daduspot5, R.drawable.daduspot6}));
        fragmentList.add(StationFragment.newInstance(
                getResources().getStringArray(R.array.zhuifen_spot_name),
                getResources().getStringArray(R.array.zhuifen_spot_rate),
                getResources().getStringArray(R.array.zhuifen_spot_info),
                getResources().getStringArray(R.array.zhuifen_spot_activity),
                new int[]{R.drawable.zhuifenspot1, R.drawable.zhuifenspot2}));
    }
}
