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

public class XinpuSpot3I extends Fragment {
    //顯示文字內容
    private String text1 = "*   秋茂園是很古老的設計，裡面都是一些人物、動物的塑像，或是勵志、善行的故事壁畫，完全沒有新式的遊樂設施。";
    private String text =  "*   秋茂園是旅日華僑黃秋茂先生回饋故鄉所建，在苗栗跟台南各有一座。園區內種植許多樹木，也建有幾間不同宗教信仰的廟宇，而園內最有特色的就是各式各樣的水泥石像。";

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



