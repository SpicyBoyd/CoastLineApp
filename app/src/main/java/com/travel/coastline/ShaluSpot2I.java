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

public class ShaluSpot2I extends Fragment {
    //顯示文字內容
    private String text1 = "*  重現50年前的旗袍店、黑貓大酒店、柑仔店、麵攤、水果店、黃包車等台灣早期的光景。";
    private String text =  "*  主要以描繪50年前的臺灣懷舊景色。隱身於新平巷與美秀巷週邊小巷之中，共有五大幅維妙維肖的彩繪壁畫，重現早期臺灣的純樸生活面貌，勾起人們的兒時美好回憶，是一處值得細細品味、漫步探訪的臺中新興拍照景點。";

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
