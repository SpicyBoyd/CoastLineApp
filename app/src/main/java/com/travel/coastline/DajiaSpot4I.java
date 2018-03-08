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

public class DajiaSpot4I extends Fragment{
    //顯示文字內容
    private String text1 = "*   大甲最早的學校，也是斑駁的國家三級古蹟。";
    private String text =  "*  文昌祠是三開間、兩進兩廊，左右帶護龍的殿堂式四合院祠宇建築。前埕寬敞山門是擔廊形式，三段燕尾翹脊，筒瓦屋面是清代祠廟形式。祠內請來鹿港師彩繪，是一座結合書院與廟宇的建築，列入國家第三級古蹟保存。";

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