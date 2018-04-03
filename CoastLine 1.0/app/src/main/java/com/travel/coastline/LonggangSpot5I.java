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

public class LonggangSpot5I extends Fragment {
    //顯示文字內容
    private String text1 = "*  裸露的山壁挾雜著無數的貝殼化石，都屬於淺海的各種貝類，其中以海扇貝最多。";
    private String text =  "*  於一百萬至六百萬年前，當時這塊山丘位於淺海中，如今則距離海岸線遠達零點五公里。岩層中夾藏的貝類化石，主要有雙殼貝類、卷貝類、翼足類、珊瑚類、海膽、螃蟹、介形蟲等。";

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
