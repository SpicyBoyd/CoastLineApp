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

public class XinpuSpot1I extends Fragment {
    //顯示文字內容
    private String text1 = "*  日式木造車站之一，也是距離海岸線最近的車站。";
    private String text =  "*  新埔是西部幹線離海最接近的車站（東部幹線有更接近的），直線距離大約150公尺，出站後直走隨便都可以到海邊。\n\n"+
            "*  新埔車站保留了跟大山一模一樣的木造站房，差別只在於塗裝上漆的程度。";

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



