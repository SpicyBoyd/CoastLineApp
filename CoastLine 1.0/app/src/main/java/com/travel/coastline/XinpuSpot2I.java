package com.travel.coastline;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by SpicyBoy on 2017/3/11.
 */

public class XinpuSpot2I extends Fragment {
    //顯示文字內容
//    private String text1 = "*  日式木造車站之一，也因販售「追分－成功」紀念車票而聞名。";
    private String text =  "*  沿著海堤欣賞美麗的湛藍漸層海浪";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        //導入Tab分頁的Fragment Layout
        return inflater.inflate(R.layout.fragment1, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);

        //取得TextView元件並帶入text字串
        TextView mText = (TextView) getView().findViewById(R.id.text);
        mText.setText(text);
//        TextView mText1 = (TextView) getView().findViewById(R.id.text1);
//        mText1.setText(text1);
    }
}



