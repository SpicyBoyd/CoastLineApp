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

public class TongxiaoSpot5I extends Fragment {
    //顯示文字內容
    private String text1 = "*  入場券：只要在火車站附近的商店買東西，都可以跟他要入場券。如果忘記在火車站附近要入場券，可以在海水浴場裡頭消費，也會給入場券。";
    private String text =  "*  通霄海水浴場位於苗栗，是中部少見的海水浴場，過去曾荒蕪3年，無法開放，一直到2012年才重新開放，提供海域戲水與沙灘活動。暑假期間還會舉辦各種活動吸引大家來參加。";

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


