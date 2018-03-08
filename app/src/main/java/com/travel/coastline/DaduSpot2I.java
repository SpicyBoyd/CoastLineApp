package com.travel.coastline;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class DaduSpot2I extends Fragment{
    //顯示文字內容
    private String text1 = "*  俗稱文昌祠，位於臺灣臺中市大肚區磺溪里文昌路上的古蹟。書院的前身稱為「西雝社」亦稱為「文昌會」，是當代文人士子的結集之所。";
    private String text =  "*  三級古蹟磺溪書院，又稱文昌廟。磺溪書院內祭拜有五尊神明文昌帝君、孚佑帝君、文衡帝君、朱衣星君與魁斗星君，合稱為「五文昌」，是古時科舉時代掌管所有考試的神明。內設有大殿與拜殿，所以俗稱文昌祠或文昌廟，建築的樣式屬於傳統的閩南式合院型態，是一間結合學堂與廟宇的四合院。";

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