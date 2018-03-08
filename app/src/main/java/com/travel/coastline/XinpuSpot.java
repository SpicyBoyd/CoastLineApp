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

public class XinpuSpot extends ListActivity {
    ArrayList<HashMap<String,Object>> list=new ArrayList<HashMap<String,Object>>();
    private SimpleAdapter adapter;
    private static final int[] mPics=new int[]{
            R.drawable.xinpuspot1,R.drawable.xinpuspot2,R.drawable.xinpuspot3};
    private static final String[] mRatings=new String[]{"★★★☆☆","★★★★★","★★☆☆☆"};
    private static final String[] mPlaces=new String[]{"新埔車站","新埔海邊","秋茂園"};
    private static final String[] mScenes=new String[]{
            "距離海岸最近的車站",
            "漸層海浪",
            "人物、動物的塑像"
            };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(XinpuSpot.this,"點擊有興趣的景點",Toast.LENGTH_LONG).show();

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
                R.layout.activity_xinpu_spot,
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
                intent.setClass(XinpuSpot.this,XinpuSpot1.class);
                break;
            case 1:
                intent.setClass(XinpuSpot.this,XinpuSpot2.class);
                break;
            case 2:
                intent.setClass(XinpuSpot.this,XinpuSpot3.class);
                break;
        }
        startActivity(intent);
    }
}
