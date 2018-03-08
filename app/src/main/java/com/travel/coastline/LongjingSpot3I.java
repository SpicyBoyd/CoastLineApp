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

public class LongjingSpot3I extends Fragment {
    //顯示文字內容
//    private String text1 = "*  縱貫線上被遺忘的小站，目前是無站員的一站，僅停靠區間車。";
    private String text =  "*   位在臺中最西南端龍井區的麗水漁港，原為一座發展有百年歷史的老漁港，因受到鄰近的火力發電廠興建的影響之下，致使漁業發展日漸沒落乏人問津，幾乎不再有船隻來此捕魚，僅剩少數的膠筏停靠，後來巧妙地利用堤岸上已荒廢的海巡檢哨站改建為希臘風情藍白基調的觀景平台，再加上附近設有自行車步道，成為台中適合新人婚紗取景、觀夕照賞鳥、騎單車看海的絕佳勝地。";

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

