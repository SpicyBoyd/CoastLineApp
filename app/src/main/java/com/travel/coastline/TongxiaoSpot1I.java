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

public class TongxiaoSpot1I extends Fragment {
    //顯示文字內容
//    private String text1 = "*  談文車站的行人天橋為別具特色的心鎖橋。";
    private String text =  "*  根據通霄鎮志記載：「通霄」一名由來，原是平埔族原住民道卡斯族之「風呢樣」，一名「屯消」社之所在。\n\n" +
            "*  此外，又有一說：在清代時，因本鎮昔日南勢溪水深可停泊商船，為銅鑼、三義、苗栗等地貨物「吞」吐「銷」售中心。閩南語「霄」與「銷」發音相同，所以稱「吞霄」。清治時期部份有志之士開始改稱「通霄」。\n\n" +
            "*  日治時期新竹州長蒞臨視察，也認為「吞霄」地名之不雅。且就地北望，見虎頭山高聳入雲霄，覺得稱「通霄」較好。遂於明治37年（西元1904年）更名為現今之「通霄」。";

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


