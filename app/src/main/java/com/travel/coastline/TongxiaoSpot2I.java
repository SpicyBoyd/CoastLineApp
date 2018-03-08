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

public class TongxiaoSpot2I extends Fragment {
    //顯示文字內容
//    private String text1 = "*  談文車站的行人天橋為別具特色的心鎖橋。";
    private String text =  "*  「通霄神社」位於苗栗縣的虎頭山公園內，是通霄最著名的歷史古蹟，也是台灣少數的日式神明建築，該神社建造於昭和12年(西元1937年)，日本接收台灣時，由地方人士所建造的通霄御遺跡地紀念碑，後來促成了現在的通霄神社建立。\n\n" +
            "*  現存的「通霄神社」，主殿、幣殿、拜殿、社務所、參道、鳥居的社域格局依舊存在，惟主殿、幣殿已遭受到拆毀，僅存基台。\n\n" +
            "*  其中拜殿在戰後被修改成中國傳統閩南式的燕翹脊屋頂，並且改為祭祀延平郡王鄭成功，而拜殿前參道的兩側有日式石燈籠，顏色新舊不一，部分是當年的舊物、部分是殘存的基座加上重鑄的石燈籠，雖然石燈籠與鳥居石柱上的昭和紀元已被抹去，但四周的環境仍可讓人感受到日本神社的氛圍。\n\n";

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


