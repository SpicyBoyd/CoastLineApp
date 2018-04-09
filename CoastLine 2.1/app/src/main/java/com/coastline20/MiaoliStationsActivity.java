package com.coastline20;

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

import java.util.ArrayList;
import java.util.List;

public class MiaoliStationsActivity extends AppCompatActivity {
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
        titles = getResources().getStringArray(R.array.miaoli_stations);
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
    }

    // 設定 Toolbar
    private void setToolbar() {
        toolbar.setTitle(R.string.miaoli_stations);
        setSupportActionBar(toolbar);
    }

    // 設定 navigation drawer
    void setNavigationDrawer() {
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                // 點選時收起選單
                drawerLayout.closeDrawer(GravityCompat.START);

                // 依照id判斷點了哪個項目並做相應事件
                int id = item.getItemId();
                if (id == R.id.home) {
                    Intent intent = new Intent().setClass(MiaoliStationsActivity.this, MainActivity.class);
                    startActivity(intent);
                    return true;
                }
//                if (id == R.id.taichung_stations) {
//                    Intent intent = new Intent().setClass(MiaoliStationsActivity.this, TaichungStationsActivity.class);
//                    startActivity(intent);
//                    return true;
//                }
                return false;
            }
        });
        // 將drawerLayout和toolbar整合
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
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }
        });
    }

    // 設定 ViewPager
    private void setViewPager() {
        StationPagerAdapter pagerAdapter = new StationPagerAdapter(getSupportFragmentManager(), titles, fragmentList);
        viewPager.setAdapter(pagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
        if (viewPager.getCurrentItem() != fragmentNum) {
            viewPager.setCurrentItem(fragmentNum);
        }
    }

    // 設定車站景點資料
    void setFragmentList() {
        fragmentList.add(StationFragment.newInstance(
                getResources().getStringArray(R.array.tanwen_spot_name),
                getResources().getStringArray(R.array.tanwen_spot_rate),
                getResources().getStringArray(R.array.tanwen_spot_info),
                getResources().getStringArray(R.array.tanwen_spot_activity),
                new int[]{R.drawable.tanwenspot1, R.drawable.tanwenspot2}));
        fragmentList.add(StationFragment.newInstance(
                getResources().getStringArray(R.array.dashan_spot_name),
                getResources().getStringArray(R.array.dashan_spot_rate),
                getResources().getStringArray(R.array.dashan_spot_info),
                getResources().getStringArray(R.array.dashan_spot_activity),
                new int[]{R.drawable.dashanspot1}));
        fragmentList.add(StationFragment.newInstance(
                getResources().getStringArray(R.array.houlong_spot_name),
                getResources().getStringArray(R.array.houlong_spot_rate),
                getResources().getStringArray(R.array.houlong_spot_info),
                getResources().getStringArray(R.array.houlong_spot_activity),
                new int[]{R.drawable.houlongspot1}));
        fragmentList.add(StationFragment.newInstance(
                getResources().getStringArray(R.array.longgang_spot_name),
                getResources().getStringArray(R.array.longgang_spot_rate),
                getResources().getStringArray(R.array.longgang_spot_info),
                getResources().getStringArray(R.array.longgang_spot_activity),
                new int[]{R.drawable.longgangspot1, R.drawable.longgangspot2, R.drawable.longgangspot3,
                        R.drawable.longgangspot4, R.drawable.longgangspot5, R.drawable.longgangspot6,
                        R.drawable.longgangspot7}));
        fragmentList.add(StationFragment.newInstance(
                getResources().getStringArray(R.array.baishatun_spot_name),
                getResources().getStringArray(R.array.baishatun_spot_rate),
                getResources().getStringArray(R.array.baishatun_spot_info),
                getResources().getStringArray(R.array.baishatun_spot_activity),
                new int[]{R.drawable.baishatunspot1, R.drawable.baishatunspot2, R.drawable.baishatunspot3}));
        fragmentList.add(StationFragment.newInstance(
                getResources().getStringArray(R.array.xinpu_spot_name),
                getResources().getStringArray(R.array.xinpu_spot_rate),
                getResources().getStringArray(R.array.xinpu_spot_info),
                getResources().getStringArray(R.array.xinpu_spot_activity),
                new int[]{R.drawable.xinpuspot1, R.drawable.xinpuspot2, R.drawable.xinpuspot3}));
        fragmentList.add(StationFragment.newInstance(
                getResources().getStringArray(R.array.tongxiao_spot_name),
                getResources().getStringArray(R.array.tongxiao_spot_rate),
                getResources().getStringArray(R.array.tongxiao_spot_info),
                getResources().getStringArray(R.array.tongxiao_spot_activity),
                new int[]{R.drawable.tongxiaospot1, R.drawable.tongxiaospot2, R.drawable.tongxiaospot3,
                        R.drawable.tongxiaospot4, R.drawable.tongxiaospot5}));
        fragmentList.add(StationFragment.newInstance(
                getResources().getStringArray(R.array.yuanli_spot_name),
                getResources().getStringArray(R.array.yuanli_spot_rate),
                getResources().getStringArray(R.array.yuanli_spot_info),
                getResources().getStringArray(R.array.yuanli_spot_activity),
                new int[]{R.drawable.yuanlispot1, R.drawable.yuanlispot2, R.drawable.yuanlispot3,
                        R.drawable.yuanlispot4, R.drawable.yuanlispot5, R.drawable.yuanlispot6}));
    }
}
