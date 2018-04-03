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

public class YuanliSpot2I extends Fragment {
    //顯示文字內容
//    private String text1 = "*  日式木造車站之一，也因販售「追分－成功」紀念車票而聞名。";
    private String text =  "*  作為藺草編織發源地的苑裡，老街負起內外銷商品櫥窗的重要角色，當時街上曬帽蓆的盛況仍為耆老所樂道。 \n\n" +
            "*  天下路老街包括保存良好的楊合發帽蓆行、苑裡女子樂團、歷史巷道－「番仔路」、傳統手藝現場理髮店，都是彌足珍貴的文化資產。\n\n";

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



