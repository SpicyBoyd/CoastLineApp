package com.travel.coastline;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by SpicyBoy on 2017/3/10.
 */

public class DajiaSpot5I extends Fragment{
    //顯示文字內容
//    private String text1 = "*   大甲最早的學校，也是斑駁的國家三級古蹟";
    private String text =  "*  劍井:傳說鄭成功在鐵砧山駐守時，以佩劍插地而得甘泉，故此地有劍井之名。\n\n" +
            "*  忠烈祠:原本奉祀鄭氏牌位，後來合祀抗戰剿匪的國軍英魂。祠前立有兩座古砲，建築則別具一格，採中西合璧。\n\n"+
            "*  延平郡王像\n\n" +
            "*  永信公園:位在延平郡王像的旁邊，佔地寬廣，設施依地形而建，主要分為育樂中心及運動公園。";

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