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

public class TongxiaoSpot3I extends Fragment {
    //顯示文字內容
//    private String text1 = "*  談文車站的行人天橋為別具特色的心鎖橋。";
    private String text =  "*  可瞭望苗栗山林與稻田交錯的田園風光，還有通霄一望無際的海景，當夕陽西下餘暉灑落海面。\n\n" +
            "*  此外，山頂上有一座「日露戰役望樓記念碑」，是紀念日俄戰爭時，虎頭山曾為情報基地，日軍在此監視海上動靜的歷史，而光復後，此紀念碑被駐守於虎頭山的國軍改成「台灣光復紀念碑」。";

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


