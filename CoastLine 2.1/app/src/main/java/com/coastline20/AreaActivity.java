package com.coastline20;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

public class AreaActivity extends AppCompatActivity {
    private Spinner areaSpinner;
    private ImageView areaImage;

    void init(){
        areaSpinner=(Spinner)findViewById(R.id.areaSpinner);
        areaImage = (ImageView)findViewById(R.id.areaImage);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area);
        init();

        Intent intent = this.getIntent();
        int area = intent.getIntExtra("area", 0);
        if (area == R.string.miaoli) {
            miaoliAction();
        }
        if (area == R.string.taichung) {
            taichungAction();
        }
    }

    private void miaoliAction(){
        areaImage.setImageResource(R.drawable.area_miaoli);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this, R.array.miaoli_station, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        areaSpinner.setAdapter(adapter);

    }
    private void taichungAction(){
        areaImage.setImageResource(R.drawable.area_taichung);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this, R.array.taichung_station, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        areaSpinner.setAdapter(adapter);
    }
}
