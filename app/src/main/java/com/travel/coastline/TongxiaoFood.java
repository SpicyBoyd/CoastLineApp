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

public class TongxiaoFood extends ListActivity {
    ArrayList<HashMap<String,Object>> list=new ArrayList<HashMap<String,Object>>();
    private SimpleAdapter adapter;
    private static final int[] mPics=new int[]{
            R.drawable.tongxiaofood1,R.drawable.tongxiaofood6,R.drawable.tongxiaofood3,R.drawable.tongxiaofood4,
            R.drawable.tongxiaofood5,R.drawable.tongxiaofood11};
    private static final int[] mPics1=new int[]{
            R.drawable.tongxiaofood2,R.drawable.tongxiaofood7,R.drawable.tongxiaofood8,R.drawable.tongxiaofood9,
            R.drawable.tongxiaofood10,R.drawable.tongxiaofood12};
    private static final String[] mPlaces=new String[]{"綠色小木屋","小倆口自助冰店","王煎包",
            "邱煎包","賴煎包","國永號．問路店"};
    private static final String[] mAddress=new String[]{
            "苗栗縣通霄鎮光復路11號",
            "苗栗縣通霄鎮信義路小倆口",
            "苗栗縣通霄鎮信義路119號王煎包",
            "苗栗市通霄鎮仁愛路40號",
            "苗栗縣通霄鎮仁愛路45巷18號",
            "苗栗縣通霄鎮南和里116號問路店"};
    private static final String[] mScenes=new String[]{
            "80年老店，販售高達10種以上的湯麵類",
            "裝潢別有特色，充滿小倆口愛戀、浪漫的元素",
            "位於媽祖廟前的排隊銅板小吃",
            "有嚼感的餅皮",
            "超薄脆皮",
            "老字號柑仔店「國永號雜貨店」，最有名的是老闆娘滷製的茶葉蛋"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(TongxiaoFood.this,"點擊店家，即可導航",Toast.LENGTH_LONG).show();

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
                R.layout.activity_tongxiao_food,
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