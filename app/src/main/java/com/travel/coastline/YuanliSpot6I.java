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

public class YuanliSpot6I extends Fragment {
    //顯示文字內容
//    private String text1 = "*  日式木造車站之一，也因販售「追分－成功」紀念車票而聞名。";
    private String text =  "*   歷經一百三十餘年時間，依舊展現唐山師父細緻結實建築工法，以及紅磚瓦與交趾陶的精緻藝術，這就是位於苑裡中溝溪畔的『東里家風』。\n\n"+
            "*  台灣少見並保存良好的『東里家風』，是棟傳承文化藝術與先民生活歷史痕跡的百年三合院建築，為三級古蹟，古厝結合古蹟文化與觀光休閒功能，提供導覽、餐飲及民宿等服務，更是電影電視熱門拍攝場景。";

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



