package com.travel.coastline;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class BaishatunStationInfo extends Fragment{
    //顯示文字內容
    private String text1 = "*  白沙屯原地名為白沙墩，是指白沙(海鹽)堆積如山丘的意思。";
    private String text =  "*   白沙屯車站位於臺灣苗栗縣通霄鎮白沙屯，為臺灣鐵路管理局海岸線的鐵路車站。\n\n"+
                    "*   白沙屯這個名字非常可愛，讓人直接聯想到在海邊可以看見白白的沙灘、藍藍的海水、耀眼的陽光。這一站離海也只有兩、三百公尺，但從車站月台平面還看不到，要走到天橋上才有較好的視野。";

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