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

public class LonggangSpot2I extends Fragment {
    //顯示文字內容
//    private String text1 = "*  札記：\n駐足沙灘，讚嘆風車之美，亦可等待夕陽西下、晚霞餘暉。";
    private String text =  "*  如今泥沙淤積，面積大幅縮小，港口貨運也早已消失，當年的帆檣林立情景已不復見，港口一片寥寂。\n\n"+
            "*  此地區以前為台灣與中國貿易船隻停泊的海港，因海港邊曾建有貿易公司的工寮，故地名稱為「公司寮」。";

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
