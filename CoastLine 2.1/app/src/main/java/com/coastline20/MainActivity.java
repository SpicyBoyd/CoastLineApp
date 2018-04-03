package com.coastline20;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void miaoliClick(View view) {
        Intent intent=new Intent();
        intent.setClass(MainActivity.this, AreaActivity.class);
        intent.putExtra("area", R.string.miaoli);
        startActivity(intent);
    }

    public void taichungClick(View view) {
        Intent intent=new Intent();
        intent.setClass(MainActivity.this, AreaActivity.class);
        intent.putExtra("area", R.string.taichung);
        startActivity(intent);
    }
}
