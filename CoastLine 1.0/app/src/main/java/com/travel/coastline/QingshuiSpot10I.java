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

public class QingshuiSpot10I extends Fragment {
    //顯示文字內容
//    private String text1 = "*  縱貫線上被遺忘的小站，目前是無站員的一站，僅停靠區間車。";
    private String text =  "*  「牛罵頭遺址」為臺灣中部地區新石器時代中期文化的代表，並以此地名作為本文化類型的命名，亦為國內第一個「命名遺址」，出土陶器以紅、褐色繩紋陶為主。\n\n"+
            "*  園區規劃兼具保存文化資產與展示教育的用途，不僅展出文化遺址介紹、出土文物典藏、考古挖掘方式等讓大家認識臺灣中部地區過去人類的生活面貌與拓墾歷程，還有日治時期神社留下來的遺跡以及原軍事營區的建築設施設置在其中，是一處蘊藏豐富歷史文化意義的空間。";

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
