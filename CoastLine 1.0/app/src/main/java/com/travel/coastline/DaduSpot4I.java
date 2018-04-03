package com.travel.coastline;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by SpicyBoy on 2017/3/8.
 */

public class DaduSpot4I extends Fragment{
    //顯示文字內容
//    private String text1 = "*  札記：\\n駐足沙灘，讚嘆風車之美，亦可等待夕陽西下、晚霞餘暉。";
    private String text =  "*  環保運動公園，不單單是運動公園，還兼具教育的功能，此地原是大肚鄉垃圾掩埋場，經過多年的復育，如今不僅成為綠意盎然的環保公園，同時還是一座自然的生態教室。\n\n" +
            "*  在春夏兩季，園內遍植的蜜源植物總是能夠吸引大批的蝴蝶在此繁衍生息，在這裡可觀察到蝴蝶的完整變態過程；從交尾、產卵、成蟲、結蛹到化蝶，令人讚嘆不已，目前環保運動公園將做為自然生態教室，開放給社會大眾以及學生使用。";

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