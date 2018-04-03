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

public class DaduFood extends ListActivity {
    ArrayList<HashMap<String,Object>> list=new ArrayList<HashMap<String,Object>>();
    private SimpleAdapter adapter;
    private static final int[] mPics=new int[]{
            R.drawable.dadufood1,R.drawable.dadufood3};
    private static final int[] mPics1=new int[]{
            R.drawable.dadufood2,R.drawable.dadufood4};
    private static final String[] mPlaces=new String[]{"大肚公有零售市場","錦昌燒炸粿"};
    private static final String[] mAddress=new String[]{
            "臺中市大肚區沙田路二段693號",
            "台中市大肚區文昌路一段19號",
            };
    private static final String[] mScenes=new String[]{
            "推薦小吃：阿珍的舖、大肚燕肉羹",
            "",
           };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(DaduFood.this,"點擊店家，即可導航",Toast.LENGTH_LONG).show();

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
                R.layout.activity_dadu_food,
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