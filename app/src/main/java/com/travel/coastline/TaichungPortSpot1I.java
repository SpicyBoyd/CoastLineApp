package com.travel.coastline;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by user on 2017/3/11.
 */

public class TaichungPortSpot1I extends Fragment {
    //顯示文字內容
    private String text1 = "*  因站內有一條路線通往臺中港區而得名。實際上臺中港車站與真正的臺中港可說有一大段距離。";
    private String text =  "*  海線鐵路穿越大甲市區之後，接著就跨越大甲溪，來到清水。在大甲溪南岸有一個地名叫做「甲南」（意思當然就是大甲之南），原本的台中港車站就是甲南車站。";

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
