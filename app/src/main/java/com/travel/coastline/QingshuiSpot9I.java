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

public class QingshuiSpot9I extends Fragment {
    //顯示文字內容
    private String text1 = "*  清水鬼洞沒有鬼，為日軍留下的戰備坑道。洞口有公所人員駐留，參觀需登記名字人數，領一個號碼牌。";
    private String text =  "*  坑道四通八達、冬暖夏涼，且內部皆由鵝卵石、鋼筋及混凝土打造而成，相當堅固安穩。由於軍隊的生活作息都在坑道中進行，因此設有床鋪、洗手間、倉庫、辦公室、電話等設施，至今仍有少數保持完整的設備，讓民眾參觀時可感受當時在地道生活的困難與辛苦。";

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
