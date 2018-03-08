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

public class QingshuiSpot6I extends Fragment {
    //顯示文字內容
//    private String text1 = "*  縱貫線上被遺忘的小站，目前是無站員的一站，僅停靠區間車。";
    private String text =  "*   這間百年學校，前身是日時教育制度下的清水公學校，且為市定古蹟。\n\n"+
            "*  國小古蹟宿舍興建於日治時期(昭和9年)，教室宿舍的建築形式係屬於「和洋折衷式」宿舍，為日治中、晚期日本人「中流住宅」主要住宅型態。其在與外賓往來接觸密切的部分空間〈接待賓客之空間〉則採用西式空間與建築造型，頗具特色。";

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
