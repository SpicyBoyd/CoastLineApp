package com.travel.coastline;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class GongtiangongInfo extends Fragment{
    //顯示文字內容
    private String text1 = "*  白沙屯拱天宮是臺灣一座媽祖廟，位在苗栗縣通霄鎮白東里白沙屯聚落。";
    private String text =  "*  臺灣一座媽祖廟。「白沙屯媽祖往北港徒步進香」歷史悠久，來回400公里左右，且無固定行程、路線，而其行程經媽祖的旨意而決定，是全臺灣最有特色的徒步進香活動。\n\n"+
            "*  白沙屯先民早年討海為生，因海上捕漁艱苦與危險，便奉祀軟身天上聖母，以祈求平安。清咸豐晚期開始集資籌建拱天宮，同治二年完工。其廟坐西朝東，是一間離海非常近的廟，歷經多次整修擴建，成為今日兩殿兩廂式宮廟建築。每年以步行方式前往北港朝天宮進香是白沙屯一年一度的大事，許多外出工作或遷居外地的鄉親都會回來參與盛事，這項傳統已經超過二百多年以上的歷史。\n" +
            "\n*  「白沙屯媽祖往北港徒步進香」歷史悠久，來回400公里左右，且無固定行程、路線，而其行程經媽祖的旨意而決定，是全臺灣最有特色的徒步進香活動。這是白沙屯媽祖獨具的特色，獲行政院文建會頒發證書指定為「國家重要民俗的無形文化資產」。\n" +
            "\n*  白沙屯媽祖徒步進香亦於2008年登錄為苗栗縣無形文化資產。登錄理由為「具有170年以上歷史之民俗活動，地方居民參與度高，參與者來自全國各地，被視為當地青年之成年禮，且尚未被商業、政治所污染。另具有全台路線最遠徒步進香、由媽祖指引日程和路程之獨特性，被具登錄為民俗之價值。」";

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
        TextView mText1 = (TextView) getView().findViewById(R.id.text1);
        mText.setText(text);
        mText1.setText(text1);
    }
}