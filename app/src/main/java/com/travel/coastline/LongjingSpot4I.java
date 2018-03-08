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

public class LongjingSpot4I extends Fragment {
    //顯示文字內容
//    private String text1 = "*  縱貫線上被遺忘的小站，目前是無站員的一站，僅停靠區間車。";
    private String text =  "*  理想國藝術街位於東海大學附近的國際街，是一個集人文、藝術景觀和社區意識之大成的理想國社區。\n\n" +
            "*  在這一條沿著小斜坡而建的藝術街坊，體驗沿途的人文氣息，充滿個人特色、藝術氣息的商店，也有後現代主義式的咖啡店，以及室內裝飾佈置的小飾品店，大都充滿歐洲復古的氣氛，也有比較現代的摩登造型；另外還有許多各種個人化的商品店、咖啡館、茶藝館、陶藝館、唐裝服飾店等等。 ";

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

