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

public class QingshuiSpot3I extends Fragment {
    //顯示文字內容
//    private String text1 = "*  縱貫線上被遺忘的小站，目前是無站員的一站，僅停靠區間車。";
    private String text =  "*  建於高低起伏的人工矮丘與平地之間，建築為仿閩南風格設計，古樸典雅，具有本土傳統質素。\n\n" +
            "*  中心主要區分為展覽廳、演藝廳、美術家資料館、演講會議廳、戶外劇場休閒區、研習教室區和行政區等。\n\n" +
            "*  展覽廳以「尋藝」為意涵，如家門一般大小的入口，營造出尋覓的氣氛，希望大眾在善用公共資源有如回家的感覺般，經常舉辦繪畫、攝影、雕塑、陶藝和文物等。\n\n" +
            "*  演藝廳大廳上方如斗笠的白色薄膜式屋頂，是中心最具特色的指標建築，是個多功能型演藝場所。\n\n" +
            "*  戶外劇場休閒區則為開放式表演空間，包括藝術廣場、清水廣場、迴旋廣場、圖騰廣場、瓜棚和雅書廊等六個戶外廣場，適合地方戲曲、露天音樂會、假日文化廣場等戶外活動之表演。";

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
