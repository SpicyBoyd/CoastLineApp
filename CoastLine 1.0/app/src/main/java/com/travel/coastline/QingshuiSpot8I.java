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

public class QingshuiSpot8I extends Fragment {
    //顯示文字內容
    private String text1 = "*  鰲峰山公園又名「清水公園」，重新規劃、整修之後成為親子玩耍、民眾休閒的好去處。公園內增設了許多硬體設備，其中不乏由德國引進的趣味遊樂設施，讓孩子們擁有更多可以訓練體能的空間、挑戰手腳協調能力。眾多設施中，因觀景平台可以俯瞰清水市區的夜景與美麗夕陽。";
    private String text = "*  競合體驗遊戲場：星際蟲洞、還有2.4公尺高的『蜘蛛』造型的體能設施、鍛鍊平衡及韻律感的『極限飛輪』、類似障礙賽跑步區的『跑酷設施』，和模仿真實攀岩活動的『部落格子攀岩場』。\n\n"+
            "*  鰲峰玉帶：玉帶橋採圓弧造型，讓遊客行走於圓心內，形成類似「玉帶環腰」的風水格局，期望走過此橋的人能財源滾滾。可由橋上觀賞清水地景與鰲峰山自然景觀。\n\n"+
            "*  觀景平台：在鰲峰山制高點，擁有著180度全景可遠眺台灣海峽，台中港、高美濕地苗栗海線等景點，站在觀景平台遠眺無論是白天看海、日落黃昏、觀賞夜景，都會讓令人心曠神怡。\n\n"+
            "*  自由車場：此自行車場為國際標準自行車競技場，堪稱亞洲第一座場地。\n\n"+
            "*  音樂廣場：各種音樂體驗設施。";
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
