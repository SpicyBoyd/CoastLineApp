package com.travel.coastline;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by SpicyBoy on 2017/3/11.
 */

public class TongxiaoSpot4P extends Fragment {
    //顯示文字內容
    private String text = "鹽來館";
    private String text2 = "海水泡腳";
    private String text3 = "親水廣場";
    private String text4 = "鹽30招";
    private String text5 = "鹽宗「夙沙氏」雕像";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        //導入Tab分頁的Fragment Layout
        return inflater.inflate(R.layout.fragment5, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);

        //取得TextView元件並帶入text字串
        TextView mText = (TextView) getView().findViewById(R.id.text);
        TextView mText2 = (TextView) getView().findViewById(R.id.text2);
        TextView mText3 = (TextView) getView().findViewById(R.id.text3);
        TextView mText4 = (TextView) getView().findViewById(R.id.text4);
        TextView mText5 = (TextView) getView().findViewById(R.id.text5);
        mText.setText(text);
        mText2.setText(text2);
        mText3.setText(text3);
        mText4.setText(text4);
        mText5.setText(text5);

        //取得ImageView元件並帶入指定圖片
        ImageView mImg = (ImageView) getActivity().findViewById(R.id.img);
        ImageView mImg2 = (ImageView) getActivity().findViewById(R.id.img2);
        ImageView mImg3 = (ImageView) getActivity().findViewById(R.id.img3);
        ImageView mImg4 = (ImageView) getActivity().findViewById(R.id.img4);
        ImageView mImg5 = (ImageView) getActivity().findViewById(R.id.img5);
        mImg.setImageResource(R.drawable.tongxiaospot4_1);
        mImg2.setImageResource(R.drawable.tongxiaospot4_2);
        mImg3.setImageResource(R.drawable.tongxiaospot4_3);
        mImg4.setImageResource(R.drawable.tongxiaospot4_4);
        mImg5.setImageResource(R.drawable.tongxiaospot4_5);
    }
}