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

public class TanwenSpot2I extends Fragment {
    //顯示文字內容
    private String text1 = "*  鄭漢步道，不僅可運動健行，還可眺望中港溪平原與台灣海峽的美景，到此登山休閒的民眾也越趨增加。";
    private String text =  "*  鄭漢為一位捨己救人的青年，民國五十三年間約二十多歲的鄭漢為營救兩名於中港溪嬉戲而溺水的孩童，奮不顧身跳往溪中將兩孩童救起，自己卻因腳被水壩鐵刺所割傷而溺斃於溪中。地方人士為感念鄭漢的義行，於視野最為良好的山頂處建造紀念碑。";

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
