package com.travel.coastline;

import android.app.ListActivity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.RadioGroup;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import static android.R.attr.button;

public class BaishatunSpot extends ListActivity {
    ArrayList<HashMap<String, Object>> list = new ArrayList<HashMap<String, Object>>();
    private SimpleAdapter adapter;
    private static final int[] mPics = new int[]{
            R.drawable.baishatunspot1, R.drawable.baishatunspot2, R.drawable.baishatunspot3};
    private static final String[] mRatings = new String[]{"★★★☆☆", "★★★☆☆", "★★★★★"};
    private static final String[] mPlaces = new String[]{"白沙屯車站", "拱天宮", "白沙屯海灘"};
    private static final String[] mScenes=new String[]{
            "",
            "媽祖廟",
            "有海、有沙、有風車"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(BaishatunSpot.this, "點擊有興趣的景點", Toast.LENGTH_LONG).show();

        //把資料加入ArrayList
        for (int i = 0; i < mPlaces.length; i++) {
            HashMap<String, Object> item = new HashMap<String, Object>();
            item.put("pic", mPics[i]);
            item.put("scene",mScenes[i]);
            item.put("place", mPlaces[i]);
            item.put("rating", mRatings[i] + "");
            list.add(item);
        }

        //新增SimpleAdapter
        adapter = new SimpleAdapter(
                this,
                list,
                R.layout.activity_baishatun_spot,
                new String[]{"pic","scene", "place", "rating"},
                new int[]{R.id.imageView1,R.id.textView1, R.id.textView2, R.id.textView3}
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
                intent.setClass(BaishatunSpot.this,BaishatunStation.class); //寄件人，收件人
                break;
            case 1:
                intent.setClass(BaishatunSpot.this,Gongtiangong.class); //寄件人，收件人
                break;
            case 2:
                intent.setClass(BaishatunSpot.this,BaishatunBeach.class); //寄件人，收件人
                break;
        }
        startActivity(intent);
//    @Override
//    protected void onListItemClick(ListView l, View v, int position, long id) {
//        super.onListItemClick(l, v, position, id);
//
//        //設定查詢地址
//        Uri uri=Uri.parse("geo:0,0?q="+mAddress[position]);
//        //啟動元件
//        Intent intent=new Intent(Intent.ACTION_VIEW,uri);
//        startActivity(intent);
   }
}





