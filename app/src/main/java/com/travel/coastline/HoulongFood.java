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

public class HoulongFood extends ListActivity {
    ArrayList<HashMap<String,Object>> list=new ArrayList<HashMap<String,Object>>();
    private SimpleAdapter adapter;
    private static final int[] mPics=new int[]{
            R.drawable.houlongfood1,R.drawable.houlongfood2,R.drawable.houlongfood3,R.drawable.houlongfood4,R.drawable.houlongfood5,R.drawable.houlongfood11};
    private static final int[] mPics1=new int[]{
            R.drawable.houlongfood6,R.drawable.houlongfood7,R.drawable.houlongfood8,R.drawable.houlongfood9,R.drawable.houlongfood10,R.drawable.houlongfood12};
    private static final String[] mPlaces=new String[]{"黑輪伯","廟口肉圓","杏仁露",
            "後龍餡餅","後龍小吃店","一條龍阿伯小吃"};
    private static final String[] mAddress=new String[]{
            "苗栗縣後龍鎮三民路120號黑輪伯",
            "苗栗縣後龍鎮中龍街185號廟口肉圓",
            "苗栗縣後龍鎮杏仁露",
            "苗栗縣後龍鎮中龍里中龍街199號",
            "苗栗縣後龍鎮北龍里中山街88-5號",
            "苗栗縣後龍鎮北龍里中華路65-4號"};
    private static final String[] mScenes=new String[]{
            "大推蔬菜類，如高麗菜捲、蘿蔔、苦瓜",
            "內餡簡單，肉和筍絲，醬汁不錯",
            "",
            "老闆娘每天現做現包,餡料為豬肉高麗菜,將餡餅煎至定型後再放入烤箱烘烤",
            "大推二層肉",
            "大推芋粿和米粉"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(HoulongFood.this,"點擊店家，即可導航",Toast.LENGTH_LONG).show();

        //把資料加入ArrayList
        for(int i=0;i<mPlaces.length;i++){
            HashMap<String,Object> item=new HashMap<String,Object>();
            item.put("pic",mPics[i]);
            item.put("pic1",mPics1[i]);
            item.put("scene",mScenes[i]);
            item.put("place",mPlaces[i]);
            list.add(item);
        }

        //新增SimpleAdapter
        adapter=new SimpleAdapter(
                this,
                list,
                R.layout.activity_houlong_food,
                new String[]{"pic","pic1","scene","place"},
                new int[]{R.id.imageView1,R.id.imageView2,R.id.textView1,R.id.textView2}
        );
        //List設定adapter
        setListAdapter(adapter);
        //啟用按鍵過濾功能
        getListView().setTextFilterEnabled(true);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        //設定查詢地址
        Uri uri=Uri.parse("geo:0,0?q="+mAddress[position]);
        //啟動元件
        Intent intent=new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }
}
