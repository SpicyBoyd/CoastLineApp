package com.coastline20;

import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.NumberPicker;
import android.support.v7.widget.Toolbar;

public class MiaoliActivity extends AppCompatActivity {
    private NumberPicker numberPicker;
    private ImageView imageView;
    private NavigationView navigationView;
    private Toolbar toolbar;
    private DrawerLayout drawerLayout;

    void init() {
        numberPicker = (NumberPicker) findViewById(R.id.picker);
        imageView = (ImageView) findViewById(R.id.areaImage);
        navigationView = (NavigationView) findViewById(R.id.nav_view);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(true);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(this,
                drawerLayout, toolbar, R.string.open, R.string.close) {
            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
            }
        };
        actionBarDrawerToggle.syncState();
        drawerLayout.setDrawerListener(actionBarDrawerToggle);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_miaoli);
        init();

        imageView.setImageResource(R.drawable.area_miaoli);

        final String[] miaoliStation = getResources().getStringArray(R.array.miaoli_station);
        numberPicker.setMinValue(0);
        numberPicker.setMaxValue(miaoliStation.length - 1);
        numberPicker.setDisplayedValues(miaoliStation);
        numberPicker.setValue(3); // 設定預設位置
        numberPicker.setWrapSelectorWheel(false); // 是否循環顯示
        numberPicker.setDescendantFocusability(NumberPicker.FOCUS_BLOCK_DESCENDANTS); // 不可編輯
        numberPicker.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal) {

            }
        });
    }
}
