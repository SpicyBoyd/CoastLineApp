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

public class TongxiaoSpot4I extends Fragment {
    //顯示文字內容
//    private String text1 = "*  談文車站的行人天橋為別具特色的心鎖橋。";
    private String text =  "*  台鹽觀光工廠分成「鹽來館」及「生產工廠」兩區，欲前往生產工廠參觀者須提前預約。\n\n" +
            "*  鹽來館門口擺設一大包台鹽特級精鹽和鹼性離子水瓶模型吸引遊客的目光，導覽介紹從水滴的旅行與水循環開始，詳述鹽的製造方法及企業經營的文化介紹，展出全世界使用的鹽罐及台鹽歷年來生產的商品，館內特別設計藍光隧道介紹鹽的其他用途及效果，展示了由鹽巴製成的精緻藝術。\n\n" +
            "*  館外庭園採日式枯山水為設計背景，庭院中豎立全國首座鹽宗「夙沙氏」雕像，並立牌說明他的傳奇故事。\n\n" +
            "*  「海洋溫泉設備區」利用電析後較淡的海水供遊客泡腳，廠區還販售特色鹹冰棒，能一邊吃冰一邊泡腳，極其享受。\n\n" +
            "*  多種DIY活動供遊客選擇，其中以「七彩幸運鹽」最具特色，小朋友可以透過DIY體驗，為參觀鹽場的行程增添一些活動色彩。";

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


