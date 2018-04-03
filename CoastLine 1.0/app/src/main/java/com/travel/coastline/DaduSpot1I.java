package com.travel.coastline;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class DaduSpot1I extends Fragment{
    //顯示文字內容
    private String text1 = "*  台鐵站名吉祥車票興起之後，大肚也搭上這股熱潮，發行了「大肚成功」的硬式車票，對想要懷孕的夫妻頗有吸引力。";
    private String text =  "*  大肚車站位於台灣臺中市大肚區，為臺灣鐵路管理局海岸線的鐵路車站。";

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