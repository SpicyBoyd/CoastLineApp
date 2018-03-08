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

public class LonggangSpot4I extends Fragment {
    //顯示文字內容
//    private String text1 = "*  札記：\n駐足沙灘，讚嘆風車之美，亦可等待夕陽西下、晚霞餘暉。";
    private String text =  "*  依山傍水有山有海，成排的大風車佇立海岸線。站在觀景台上，可遠眺後龍溪、西湖溪出海與台灣海峽交會。下方的海線鐵道，偶爾可見火車駛過。";

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
