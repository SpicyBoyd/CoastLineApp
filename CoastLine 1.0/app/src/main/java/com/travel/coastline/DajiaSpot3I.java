package com.travel.coastline;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by SpicyBoy on 2017/3/10.
 */

public class DajiaSpot3I extends Fragment{
    //顯示文字內容
    private String text1 = "*   國家三級古蹟，該牌坊是為了表彰清代淡水廳大甲街余榮長妻子林春娘的貞孝事蹟而立。";
    private String text =  "*  該牌坊是為了表彰清代淡水廳大甲街余榮長妻子林春娘（文獻多記為春娘，而娘字為舊時對單名婦女的通稱，故應名為「林春」，而櫟社詩人蔡子昭所撰碑記即寫有「諱春」二字）的貞孝事蹟而立。\n\n" +
            "*  林氏除貞孝事蹟外，於地方還有禱雨的事蹟，大甲居民奉為貞節媽。其神像供奉於大甲鎮瀾宮內為大甲三神之一。";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        //導入Tab分頁的Fragment Layout
        return inflater.inflate(R.layout.fragment2, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);

        //取得TextView元件並帶入text字串
        TextView mText = (TextView) getView().findViewById(R.id.text);
        mText.setText(text);
        TextView mText1 = (TextView) getView().findViewById(R.id.text1);
        mText1.setText(text1);
    }
}