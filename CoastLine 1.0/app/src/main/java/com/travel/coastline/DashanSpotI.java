package com.travel.coastline;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by SpicyBoy on 2017/3/10.
 */

public class DashanSpotI extends Fragment {
    //顯示文字內容
    private String text1 = "*  日式木造車站之一。";
    private String text =  "*  海線鐵路沿中港溪南岸前進到出海口附近，接著便往南拐彎，進入後龍鎮。夾在中港溪與後龍溪差不多中間的區域，就是大山。\n\n" +
            "*  大山還繼續使用90年歷史的日式木造站房，這使得談文、大山連續兩站都有木造站房，是全台灣唯一的珍貴路段。大山的木造站房保存狀況非常好，而且維護極為整潔，車站內外幾乎看不到任何垃圾；站房內也是用心經營，各式告示、注意事項都清清楚楚。";

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
