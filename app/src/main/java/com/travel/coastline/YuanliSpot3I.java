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

public class YuanliSpot3I extends Fragment {
    //顯示文字內容
//    private String text1 = "*  日式木造車站之一，也因販售「追分－成功」紀念車票而聞名。";
    private String text =  "*  房裡城是位於今臺灣苗栗縣苑裡鎮的民築城池，為今苗栗縣為一曾築過土石的城池，該地原為道卡斯族蓬山八社之一房裡社所有。該城已不存，但苑裡鎮公所於過去的南門、北門處有立碑紀念。\n\n"+
            "*  房裡城雖然已成為歷史，但村裡依然留有相當豐富之歷史文物，例如順天宮、房裡溪義渡碑、蔡家古厝，都是相當值得訪客深入探索的。";

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



