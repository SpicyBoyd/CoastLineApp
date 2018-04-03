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

public class LonggangSpot extends ListActivity {
    ArrayList<HashMap<String,Object>> list=new ArrayList<HashMap<String,Object>>();
    private SimpleAdapter adapter;
    private static final int[] mPics=new int[]{
            R.drawable.longgangspot1,R.drawable.longgangspot2,R.drawable.longgangspot3,R.drawable.longgangspot4,
            R.drawable.longgangspot5,R.drawable.longgangspot6,R.drawable.longgangspot7};
    private static final String[] mRatings=new String[]{"★☆☆☆☆","★★☆☆☆","★★☆☆☆","★★★★★","★★★☆☆","★★★★☆","★★☆☆☆"};
    private static final String[] mPlaces=new String[]{"龍港車站","公司寮漁港","同興老街","後龍好望角","過港貝化石層","海角樂園","過港舊隧道"};
    private static final String[] mScenes=new String[]{
            "縱貫線上被遺忘的小站",
            "沒落的漁港",
            "迷你的老街",
            "有山、有海、有風車",
            "無數貝殼化石",
            "純白風車、湛藍海景、還有一道彩虹",
            "鐵路懷舊隧道"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(LonggangSpot.this,"點擊有興趣的景點",Toast.LENGTH_LONG).show();

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
                R.layout.activity_longgang_spot,
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
                intent.setClass(LonggangSpot.this,LonggangSpot1.class);
                break;
            case 1:
                intent.setClass(LonggangSpot.this,LonggangSpot2.class);
                break;
            case 2:
                intent.setClass(LonggangSpot.this,LonggangSpot3.class);
                break;
            case 3:
                intent.setClass(LonggangSpot.this,LonggangSpot4.class);
                break;
            case 4:
                intent.setClass(LonggangSpot.this,LonggangSpot5.class);
                break;
            case 5:
                intent.setClass(LonggangSpot.this,LonggangSpot6.class);
                break;
            case 6:
                intent.setClass(LonggangSpot.this,LonggangSpot7.class);
                break;
        }
        startActivity(intent);
    }
}
