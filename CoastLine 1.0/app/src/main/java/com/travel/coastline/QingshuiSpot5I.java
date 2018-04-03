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

public class QingshuiSpot5I extends Fragment {
    //顯示文字內容
    private String text1 = "*  高美濕地除了豐富的生態之外，到了黃昏，繽紛炫麗的夕陽，更將高美濕地點綴得更加浪漫。";
    private String text =  "*   高美濕地（高美野生動物保護區）位於清水大甲溪出海口南側，擁有豐富的天然資源，是國內少數幾處雁鴨集體繁殖區之一。曾在高美濕地棲息的鳥類有多達120餘種，為重要之生態保育區。目前已逐漸取代大肚溪口，成為喜好賞鳥人士的新興賞線。\n\n"+
            "*  高美濕地乾濕混合的河口生態讓這裡聚集了許多鳥類、魚類、蟹類和其他無脊椎類等生物，高美濕地「潮溪區」提供迴遊魚類生育孵化、「緩流區」讓魚苗平安長大、「泥灘地」是彈塗魚和大眼蟹的共處之地、「沙地」讓和尚蟹在這裡暢行無阻、「河口地」則有許多清白招潮蟹和網紋招潮蟹在這裡悠閒度日。\n\n" +
            "*  高美濕地除了是豐富的寶地以外，也是調節水量的所在，能將洪水先吸收後再緩慢釋出，不僅保護沿岸居民的安全，更降低了地下水和土壤鹽化、洪災和土壤流失等災害，可說是珍貴的大自然資源。";

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
