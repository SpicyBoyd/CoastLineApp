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

public class DaduSpot extends ListActivity {
    ArrayList<HashMap<String,Object>> list=new ArrayList<HashMap<String,Object>>();
    private SimpleAdapter adapter;
    private static final int[] mPics=new int[]{
            R.drawable.daduspot1,R.drawable.daduspot2,R.drawable.daduspot3,R.drawable.daduspot4,R.drawable.daduspot5,R.drawable.daduspot6};
    private static final String[] mRatings=new String[]{"★★☆☆☆","★★★★☆","★★★★★","★★★☆☆","★★☆☆☆","★★☆☆☆"};
    private static final String[] mPlaces=new String[]{"大肚車站","磺溪書院","望高寮","環保運動公園","瑞井社區","萬里長城步道"};
//    private static final String[] mAddress=new String[]{
//
//            "",
//            "台中市南屯區中台路望高寮夜景公園",
//            "台中市大肚區華山路大肚區環保運動公園",
//            "台中縣大肚鄉瑞井村瑞井社區",
//            "台中市大肚區大肚山萬里長城"};
    private static final String[] mScenes=new String[]{
            "吉祥車票-大肚成功",
            "三級古蹟，文昌廟",
            "觀賞夜景的地點",
            "",
            "以瑞井古井命名的村莊",
            "郊山等級的步道"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(DaduSpot.this,"點擊有興趣的景點",Toast.LENGTH_LONG).show();

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
                R.layout.activity_dadu_spot,
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
                intent.setClass(DaduSpot.this,DaduSpot1.class);
                break;
            case 1:
                intent.setClass(DaduSpot.this,DaduSpot2.class);
                break;
            case 2:
                intent.setClass(DaduSpot.this,DaduSpot3.class);
                break;
            case 3:
                intent.setClass(DaduSpot.this,DaduSpot4.class);
                break;
            case 4:
                intent.setClass(DaduSpot.this,DaduSpot5.class);
                break;
            case 5:
                intent.setClass(DaduSpot.this,DaduSpot6.class);
                break;
        }
        startActivity(intent);
    }
}
