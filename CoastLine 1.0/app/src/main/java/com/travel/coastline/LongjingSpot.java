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

public class LongjingSpot extends ListActivity {
    ArrayList<HashMap<String,Object>> list=new ArrayList<HashMap<String,Object>>();
    private SimpleAdapter adapter;
    private static final int[] mPics=new int[]{
            R.drawable.longjingspot1,R.drawable.longjingspot2,R.drawable.longjingspot3,R.drawable.longjingspot4};
    private static final String[] mRatings=new String[]{"★★★☆☆","★★☆☆☆","★★★★★","★★★★★"};
    private static final String[] mPlaces=new String[]{"龍井車站","龍目井","麗水漁港","藝術街"};
    private static final String[] mScenes=new String[]{
            "別具特色的車站造型",
            "龍泉岩前的古蹟",
            "地中海藍白特色建築",
            "集人文、藝術景觀和社區意識之大成"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(LongjingSpot.this,"點擊有興趣的景點",Toast.LENGTH_LONG).show();

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
                R.layout.activity_longjing_spot,
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
                intent.setClass(LongjingSpot.this,LongjingSpot1.class);
                break;
            case 1:
                intent.setClass(LongjingSpot.this,LongjingSpot2.class);
                break;
            case 2:
                intent.setClass(LongjingSpot.this,LongjingSpot3.class);
                break;
            case 3:
                intent.setClass(LongjingSpot.this,LongjingSpot4.class);
                break;
        }
        startActivity(intent);
    }
}
