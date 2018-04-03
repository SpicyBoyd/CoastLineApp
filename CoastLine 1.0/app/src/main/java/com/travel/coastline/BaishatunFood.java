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

public class BaishatunFood extends ListActivity {
    ArrayList<HashMap<String,Object>> list=new ArrayList<HashMap<String,Object>>();
    private SimpleAdapter adapter;
    private static final int[] mPics=new int[]{
            R.drawable.baishatunfood1,R.drawable.baishatunfood2,R.drawable.baishatunfood3,R.drawable.baishatunfood4,R.drawable.baishatunfood5};
    private static final int[] mPics1=new int[]{
            R.drawable.baishatunfood6,R.drawable.baishatunfood7,R.drawable.baishatunfood8,R.drawable.baishatunfood9,R.drawable.baishatunfood10};
    private static final String[] mPlaces=new String[]{"石蓮園","老杜牛肉麵","大腸麵線白東肉圓\n臭豆腐超大杯飲料",
            "阿珠熱炒飯麵","阿潔 老麵饅頭"};
    private static final String[] mAddress=new String[]{
            "苗栗縣通霄鎮白西里153-8號",
            "苗栗縣通霄鎮白東里37-1號老杜牛肉麵",
            "苗栗縣通霄鎮白東里2鄰白東8-11號大腸麵線白東肉圓臭豆腐超大杯飲料",
            "苗栗縣通霄鎮白東里5鄰30號阿珠熱炒",
            "苗栗縣通霄鎮自強路27-1號"};
    private static final String[] mScenes=new String[]{
            "提供的菜單以火車便當為主。",
            "老杜40年原汁牛肉麵",
            "賣什麼都寫在店名了",
            "最近以蚵仔煎更為出名",
            "阿潔河南老麵饅頭堅持純手工製作，札實而有彈性。堅持故鄉的古早作法，採用祖傳老麵頭天然發酵，口味獨特嚴選當地最天然的食材，吃的健康，營養無負擔。無人工添加物"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(BaishatunFood.this,"點擊店家，即可導航",Toast.LENGTH_LONG).show();

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
                R.layout.activity_baishatun_food,
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