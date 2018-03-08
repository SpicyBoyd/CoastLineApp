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

public class YuanliSpot5I extends Fragment {
    //顯示文字內容
    private String text1 = "*   特殊活動-稻田彩繪：利用紫、綠水稻不同顏色的特色、在水田中種植出圖形，增加水田創意的美景。";
    private String text =  "*   早期藺草蓆帽是苗栗縣苑裡鎮著名的外銷產業之一，隨著傳統產業的沒落藺草等製品與作用也漸漸被取代，為了紀念藺草對苑裡鎮的重要，經過地方爭取，將此地改建成為一座藺草文物館。\n\n"+
            "*  以藺草生態及編織文化為主題，其他還設置了藺草體驗區、帽蓆文化區、農村文物、DIY教室、簡報區、戶外活動區等。每一個展示區擺放的都是老祖先的智慧，包含各式的日常生活用品、用具等。\n\n"+
            "*  『藺草』因為莖部具有柔軟、韌性強、不易斷、吸水性強的特性，加上可以除濕、除臭的功能，故成為編織的優良材料。";

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



