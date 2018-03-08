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

public class TanwenSpot1I extends Fragment {
    //顯示文字內容
    private String text1 = "*  談文車站的行人天橋為別具特色的心鎖橋。";
    private String text =  "*  談文車站是海線五個日式木造車站之一，已有90年的歷史，但是這一站的狀況卻是五站之中最糟的。\n\n" +
            "*  因為緊鄰路基較高的縱貫公路，本來就只能露出半層樓高的屋頂，居然又加了一道圍籬把車站正面完全遮住。這使得談文的木造站房從馬路上是看不到的，走近車站的正面也看不到全貌，只能從側面觀察，而最好的角度是要從車站內月台上來看。\n\n" +
            "*  另外，談文現在已經降為招呼站，平常完全不會有站務人員。";

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

