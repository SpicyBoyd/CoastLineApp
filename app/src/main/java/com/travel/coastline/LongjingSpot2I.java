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

public class LongjingSpot2I extends Fragment {
    //顯示文字內容
    private String text1 = "*  清水祖師廟龍泉岩前的古蹟－龍目井。";
    private String text =  "*  相傳該井的泉水是由兩棵壞死的樟樹根部自然湧出的，而不是由人力所鑿成的。此井旁邊有兩塊石頭，形狀就好像龍的眼精。而現今的龍目井，原有的樟樹己不存在，而龍目井則以水泥重新整修，原兩井前的水池也幾乎乾涸，剩下周邊的老榕樹相伴，龍目井己成為現在居民們聊天休憩之處。";

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
