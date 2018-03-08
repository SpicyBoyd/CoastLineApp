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

public class LonggangSpot6I extends Fragment {
    //顯示文字內容
//    private String text1 = "*  札記：\n駐足沙灘，讚嘆風車之美，亦可等待夕陽西下、晚霞餘暉。";
    private String text =  "*  原本是垃圾掩埋場的後龍鎮中和里灣瓦海濱，在鎮公所綠美化復育後，九十三年闢建成小而美且具環保概念的「海角樂園」，再加上周邊有風力發電的「大風車」迎風旋轉，成了民眾拍照賞景及吹風的好去處。";

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