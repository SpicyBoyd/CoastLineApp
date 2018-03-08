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

public class DajiaSpot2I extends Fragment{
    //顯示文字內容
//    private String text1 = "*  札記：\\n駐足沙灘，讚嘆風車之美，亦可等待夕陽西下、晚霞餘暉。";
    private String text =  "*  俗稱大甲媽祖宮、大甲媽祖廟。\n\n"+
            "*  主奉天上聖母媽祖，為台灣媽祖信仰的知名廟宇之一。\n\n"+
            "*  大甲鎮瀾宮媽祖的遶境進香發展成宗教界的盛會，最有名的就是大甲媽南下遶境進香活動。";

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