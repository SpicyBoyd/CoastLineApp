package com.travel.coastline;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by SpicyBoy on 2017/3/8.
 */

public class DaduSpot5I extends Fragment{
    //顯示文字內容
    private String text1 = "*  瑞井社區著名的觀光景點就是二次大戰遺留下的彈孔紀念區、古井步道和阿嬤的灶腳。";
    private String text =  "*  瑞井村，早期叫作「井仔頭」，是因為大肚台地的南端有兩條斷層線通過，斷層線上常湧出泉水，形成多處井泉，而早期聚落位於井泉湧出的地方，所以就叫做這個名字。\n\n"+
            "*  土角厝它是一種傳統的泥屋建築，當地居民就地取材打造，常見於中國大陸或台灣鄉間。主要用竹管做柱骨、以竹片織牆，並且以稻草攪泥製磚砌牆。最後會再塗上石灰及泥土，而這類建築一般用紅瓦當做屋頂。";

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
        TextView mText1 = (TextView) getView().findViewById(R.id.text1);
        mText.setText(text);
        mText1.setText(text1);
    }
}