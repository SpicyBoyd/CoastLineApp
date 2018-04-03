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

public class QingshuiSpot4I extends Fragment {
    //顯示文字內容
//    private String text1 = "*  縱貫線上被遺忘的小站，目前是無站員的一站，僅停靠區間車。";
    private String text =  "*  清水眷村文化園區位於台中港藝術中心對面，園區展出和平新村、銀聯二村、陽明新村、果貿一村、信義新村、忠勇新村、慈恩二十村等七個清水在地眷村的老照片、特色文物，還會有文創市集、眷村巷口童玩體驗及眷村鐵馬電影院等。\n\n"+
            "*  「清水眷村文化園區」的改建，是由台中市鰲峰人文發展協會及許多清水在地社區團體，與文化局攜手合作的。大多數參與園區改建的人都是自願性的。因為他們懷抱著熱忱，才能堅持下去。";

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
