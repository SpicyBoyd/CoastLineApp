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

public class QingshuiSpot extends ListActivity {
    ArrayList<HashMap<String,Object>> list=new ArrayList<HashMap<String,Object>>();
    private SimpleAdapter adapter;
    private static final int[] mPics=new int[]{
            R.drawable.qingshuispot1,R.drawable.qingshuispot2,R.drawable.qingshuispot3,R.drawable.qingshuispot4,
            R.drawable.qingshuispot5,R.drawable.qingshuispot6,R.drawable.qingshuispot7,R.drawable.qingshuispot8,
            R.drawable.qingshuispot9,R.drawable.qingshuispot10};
    private static final String[] mRatings=new String[]{"★★☆☆☆","★☆☆☆☆","★★★★☆","★★★☆☆","★★★★★",
            "★★☆☆☆","★★★★☆","★★★★☆","★★☆☆☆","★★☆☆☆"};
    private static final String[] mPlaces=new String[]{"清水車站","日式員工宿舍","港區藝術中心","清水眷村文化園區","高美溼地",
            "清水國小","趙家古厝","鰲峰山公園","清水鬼洞","牛罵頭遺址"};
     private static final String[] mScenes=new String[]{
            "震災復興新式車站",
            "清水車站旁",
            "古樸典雅的藝術中心",
            "認識眷村文化",
            "風車、木棧道、高美燈塔",
            "市定古蹟",
            "夏季賞荷勝地",
            "親子玩耍、民眾休閒的好去處",
            "日治時代的軍備地道",
            "考古遺址"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(QingshuiSpot.this,"點擊有興趣的景點",Toast.LENGTH_LONG).show();

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
                R.layout.activity_qingshui_spot,
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
                intent.setClass(QingshuiSpot.this,QingshuiSpot1.class);
                break;
            case 1:
                intent.setClass(QingshuiSpot.this,QingshuiSpot2.class);
                break;
            case 2:
                intent.setClass(QingshuiSpot.this,QingshuiSpot3.class);
                break;
            case 3:
                intent.setClass(QingshuiSpot.this,QingshuiSpot4.class);
                break;
            case 4:
                intent.setClass(QingshuiSpot.this,QingshuiSpot5.class);
                break;
            case 5:
                intent.setClass(QingshuiSpot.this,QingshuiSpot6.class);
                break;
            case 6:
                intent.setClass(QingshuiSpot.this,QingshuiSpot7.class);
                break;
            case 7:
                intent.setClass(QingshuiSpot.this,QingshuiSpot8.class);
                break;
            case 8:
                intent.setClass(QingshuiSpot.this,QingshuiSpot9.class);
                break;
            case 9:
                intent.setClass(QingshuiSpot.this,QingshuiSpot10.class);
                break;
        }
        startActivity(intent);
    }
}

