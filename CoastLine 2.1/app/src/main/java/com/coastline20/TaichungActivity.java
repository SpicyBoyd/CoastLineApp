package com.coastline20;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.NumberPicker;

public class TaichungActivity extends AppCompatActivity {
    private NumberPicker numberPicker;
    private ImageView imageView;

    void init() {
        numberPicker = (NumberPicker) findViewById(R.id.picker);
        imageView = (ImageView) findViewById(R.id.areaImage);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taichung);
        init();

        imageView.setImageResource(R.drawable.area_taichung);

        final String[] taichungStation = getResources().getStringArray(R.array.taichung_station);
        numberPicker.setMinValue(0);
        numberPicker.setMaxValue(taichungStation.length - 1);
        numberPicker.setDisplayedValues(taichungStation);
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
