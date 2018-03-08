package com.travel.coastline;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

public class DajiaSpot extends ListActivity {
    ArrayList<HashMap<String,Object>> list=new ArrayList<HashMap<String,Object>>();
    private SimpleAdapter adapter;
    private static final int[] mPics=new int[]{
            R.drawable.dajiaspot1,R.drawable.dajiaspot2,R.drawable.dajiaspot3,R.drawable.dajiaspot4,
            R.drawable.dajiaspot5,R.drawable.dajiaspot6};
    private static final String[] mRatings=new String[]{"★★★★☆","★★★★★","★★☆☆☆","★★★☆☆","★★★★☆","★★★☆☆"};
    private static final String[] mPlaces=new String[]{"大甲車站","鎮瀾宮","林氏貞孝坊","大甲文昌祠","鐵砧山","裕珍馨"};
//    private static final String[] mAddress=new String[]{
//            "臺中市大甲區大甲車站",
//            "台中市大甲區順天路158號",
//            "台中市大甲區順天路與光明路交叉口",
//            "台中市大甲區文武路116號文昌祠",
//            "台中市大甲區鐵砧山風景區遊客服務中心",
//            "台中市大甲區光明路67號裕珍馨"};
    private static final String[] mScenes=new String[]{
            "海線第一大站",
            "臺灣著名的媽祖廟",
            "國家三級古蹟",
            "大甲最早的學校",
            "劍井、忠烈祠、延平郡王像",
            "奶油酥餅"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(DajiaSpot.this,"點擊有興趣的景點",Toast.LENGTH_LONG).show();

        //把資料加入ArrayList
        for(int i=0;i<mPlaces.length;i++){
            HashMap<String,Object> item=new HashMap<String,Object>();
            item.put("pic",mPics[i]);
            item.put("scene",mScenes[i]);
            item.put("place",mPlaces[i]);
            item.put("rating",mRatings[i]+"");
            list.add(item);
        }

        //新增SimpleAdapter
        adapter=new SimpleAdapter(
                this,
                list,
                R.layout.activity_dajia_spot,
                new String[]{"pic","scene","place","rating"},
                new int[]{R.id.imageView1,R.id.textView1,R.id.textView2,R.id.textView3}
        );
        //List設定adapter
        setListAdapter(adapter);
        //啟用按鍵過濾功能
        getListView().setTextFilterEnabled(true);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Intent intent=new Intent(); //郵局
        switch(position){
            case 0:
                intent.setClass(DajiaSpot.this,DajiaSpot1.class);
                break;
            case 1:
                intent.setClass(DajiaSpot.this,DajiaSpot2.class);
                break;
            case 2:
                intent.setClass(DajiaSpot.this,DajiaSpot3.class);
                break;
            case 3:
                intent.setClass(DajiaSpot.this,DajiaSpot4.class);
                break;
            case 4:
                intent.setClass(DajiaSpot.this,DajiaSpot5.class);
                break;
            case 5:
                intent.setClass(DajiaSpot.this,DajiaSpot6.class);
                break;
        }
        startActivity(intent);
    }
}

