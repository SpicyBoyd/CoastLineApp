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

public class DaduSpot3I extends Fragment{
    //顯示文字內容
//    private String text1 = "*  札記：\\n駐足沙灘，讚嘆風車之美，亦可等待夕陽西下、晚霞餘暉。";
    private String text =  "*  望高寮是臺灣觀賞夜景的地點之一，居大肚山南側，倚臨王田斷崖，為地形上可俯瞰東、南、西三面的景觀；向東可展望臺中盆地上臺中市天際線，向南可眺望大肚溪及對岸的彰化平原，向西可遠望整個臺中港。由於望高寮的位置偏僻，又因這裡是觀賞夜景的至高點，吸引不少人前來。";

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
//        TextView mText1 = (TextView) getView().findViewById(R.id.text1);
        mText.setText(text);
//        mText1.setText(text1);
    }
}