package com.coastline20;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.NumberPicker;
import android.support.v7.widget.Toolbar;
import android.widget.Toast;

public class MiaoliActivity extends AppCompatActivity {
    private NumberPicker numberPicker;
    private NavigationView navigationView;
    private Toolbar toolbar;
    private DrawerLayout drawerLayout;
    private int fragmentNum;

    private void init() {
        numberPicker = (NumberPicker) findViewById(R.id.picker);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        navigationView = (NavigationView) findViewById(R.id.nav_view);
        fragmentNum = 3; // 預設位置
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_miaoli);

        init();
        // 設定 toolbar
        setSupportActionBar(toolbar);
        setNavigationDrawer();
        // 主畫面
        final String[] stations = getResources().getStringArray(R.array.miaoli_stations);
        numberPicker.setMinValue(0);
        numberPicker.setMaxValue(stations.length - 1);
        numberPicker.setDisplayedValues(stations);
        numberPicker.setValue(3); // 設定預設位置
        numberPicker.setWrapSelectorWheel(false); // 是否循環顯示
        numberPicker.setDescendantFocusability(NumberPicker.FOCUS_BLOCK_DESCENDANTS); // 不可編輯
        numberPicker.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal) {
                fragmentNum = newVal;
            }
        });
    }

    // 設定 navigation drawer
    private void setNavigationDrawer() {
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                // 點選時收起選單
                drawerLayout.closeDrawer(GravityCompat.START);

                // 依照id判斷點了哪個項目並做相應事件
                int id = item.getItemId();
                if (id == R.id.home) {
                    Intent intent = new Intent().setClass(MiaoliActivity.this, MainActivity.class);
                    startActivity(intent);
                    return true;
                }
//                if (id == R.id.taichung) {
//                    Intent intent = new Intent().setClass(MiaoliActivity.this, TaichungActivity.class);
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

    public void cancelAction(View view) {
        numberPicker.setValue(3); // 設定預設位置
        Toast.makeText(this, "請重新選擇車站", Toast.LENGTH_SHORT).show();
    }

    public void submitAction(View view) {
        Intent intent = new Intent().setClass(MiaoliActivity.this, MiaoliStationsActivity.class);
        intent.putExtra("num", fragmentNum);
        startActivity(intent);
    }
}
