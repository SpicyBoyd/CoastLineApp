package com.travel.coastline;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by user on 2017/3/11.
 */

public class ShaluSpot3I extends Fragment {
    //顯示文字內容
//    private String text1 = "*  縱貫線上被遺忘的小站，目前是無站員的一站，僅停靠區間車。";
    private String text =  "*  四平街則是沙鹿的著名老街，是沙鹿地區早期開發的商業聚落，街長大約400公尺，兩旁商店林立，特別是以金成發為代表的金紙店、成興商行...等，動輒是超過60年的老店。街上信仰中心有保安宮(三山國王廟)、玉皇殿及教會，前兩者是每年大甲媽遶境行程中的宮廟。";

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
