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

public class YuanliSpot extends ListActivity {
    ArrayList<HashMap<String,Object>> list=new ArrayList<HashMap<String,Object>>();
    private SimpleAdapter adapter;
    private static final int[] mPics=new int[]{
            R.drawable.yuanlispot1,R.drawable.yuanlispot2,R.drawable.yuanlispot3,R.drawable.yuanlispot4,R.drawable.yuanlispot5,R.drawable.yuanlispot6};
    private static final String[] mRatings=new String[]{"★★☆☆☆","★★☆☆☆","★★★☆☆","★★★★★","★★★★☆","★★★★☆"};
    private static final String[] mPlaces=new String[]{"苑裡車站","天下路老街","房里古城","山腳國小日治宿舍群","藺草文化館","東里家風百年古厝"};
    private static final String[] mScenes=new String[]{
            "",
            "保存良好的老街",
            "歷史文物",
            "見證歷史的活史蹟",
            "紀錄過去的繁華",
            "古裝劇拍攝場景"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(YuanliSpot.this,"點擊有興趣的景點",Toast.LENGTH_LONG).show();

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
                R.layout.activity_yuanli_spot,
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
                intent.setClass(YuanliSpot.this,YuanliSpot1.class);
                break;
            case 1:
                intent.setClass(YuanliSpot.this,YuanliSpot2.class);
                break;
            case 2:
                intent.setClass(YuanliSpot.this,YuanliSpot3.class);
                break;
            case 3:
                intent.setClass(YuanliSpot.this,YuanliSpot4.class);
                break;
            case 4:
                intent.setClass(YuanliSpot.this,YuanliSpot5.class);
                break;
            case 5:
                intent.setClass(YuanliSpot.this,YuanliSpot6.class);
                break;
        }
        startActivity(intent);
    }
}

