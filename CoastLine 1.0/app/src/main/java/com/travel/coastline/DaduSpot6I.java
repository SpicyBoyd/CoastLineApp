package com.travel.coastline;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by SpicyBoy on 2017/3/9.
 */

public class DaduSpot6I extends Fragment{
    //顯示文字內容
//    private String text1 = "*  札記：\\n駐足沙灘，讚嘆風車之美，亦可等待夕陽西下、晚霞餘暉。";
    private String text =  "*  郊山等級的步道，蜿蜒於大肚山的稜支線，因為海拔不高且坡度平緩，是一條老少咸宜的步道，加上離鬧區並不算太遠，離高速公路或快速道路也近，尤其大肚區側的入口也方便停車，是條適合闔家前來走走路運動一下的好地方。";

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
//        TextView mText1 = (TextView) getView().findViewById(R.id.text1);
        mText.setText(text);
//        mText1.setText(text1);
    }
}