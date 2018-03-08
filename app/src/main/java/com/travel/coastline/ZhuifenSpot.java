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

public class ZhuifenSpot extends ListActivity {
    ArrayList<HashMap<String,Object>> list=new ArrayList<HashMap<String,Object>>();
    private SimpleAdapter adapter;
    private static final int[] mPics=new int[]{
            R.drawable.zhuifenspot1,R.drawable.zhuifenspot2};
    private static final String[] mRatings=new String[]{"★★★★★","★★★☆☆"};
    private static final String[] mPlaces=new String[]{"追分車站","追分許願池"};
    private static final String[] mScenes=new String[]{
            "紀念車票，追分－成功",
            "追分成功、成功追婚"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(ZhuifenSpot.this,"點擊有興趣的景點",Toast.LENGTH_LONG).show();

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
                R.layout.activity_zhuifen_spot,
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
                intent.setClass(ZhuifenSpot.this,ZhuifenSpot1.class);
                break;
            case 1:
                intent.setClass(ZhuifenSpot.this,ZhuifenSpot2.class);
                break;
        }
        startActivity(intent);
    }
}
