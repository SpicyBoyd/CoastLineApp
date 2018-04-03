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

public class YuanliSpot4I extends Fragment {
    //顯示文字內容
//    private String text1 = "*  日式木造車站之一，也因販售「追分－成功」紀念車票而聞名。";
    private String text =  "*  原本閒置多年、結構老舊殘破的山腳國小日治後期宿舍群，一度面臨拆除命運。但經當地居民反應下，政府最終決意保存並修復這座具有歷史意義與文化價值的宿舍。\n\n"+
            "*  山腳國小日治後期宿舍群在日據時代是學校提供給老師或官員的宿舍，主建築為木造，注重室內與戶外空間的串接，每棟均為雙拼格局，地板挑高與地面距離設置通氣窗保持通風，前後院地基為磚造牆壁為編竹夾泥牆，外覆以檜木板。";

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



