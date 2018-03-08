package com.travel.coastline;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTabHost;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Gongtiangong extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gongtiangong);

        // 讀取折疊 Toolbar 物件
        CollapsingToolbarLayout collapsingToolbar =
                (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        // 設定折疊 Toolbar 的標題
        collapsingToolbar.setTitle("拱天宮");

        //獲取TabHost控制元件
        FragmentTabHost mTabHost = (FragmentTabHost) findViewById(android.R.id.tabhost);
        //設定Tab頁面的顯示區域，帶入Context、FragmentManager、Container ID
        mTabHost.setup(this, getSupportFragmentManager(), R.id.container);

        /**
         新增Tab結構說明 :
         首先帶入Tab分頁標籤的Tag資訊並可設定Tab標籤上顯示的文字與圖片，
         再來帶入Tab頁面要顯示連結的Fragment Class，最後可帶入Bundle資訊。
         **/

        //小黑人建立一個Tab，這個Tab的Tag設定為one，
        //並設定Tab上顯示的文字為第一堂課與icon圖片，Tab連結切換至
        //LessonOneFragment class，無夾帶Bundle資訊。
        mTabHost.addTab(mTabHost.newTabSpec("one")
                        .setIndicator("資訊")
                ,GongtiangongInfo.class,null);

        //同上方Tab設定，不同處為帶入參數的差異
        mTabHost.addTab(mTabHost.newTabSpec("two")
                        .setIndicator("照片")
                ,GongtiangongPics.class, null);
    }

    /**
     方法權限設定為Public目的是可以讓Fragment取得內容 。
     */

    //Tab - Lesson One的文字內容
    public String getLessonOneText(){return
            "*  臺灣一座媽祖廟。「白沙屯媽祖往北港徒步進香」歷史悠久，來回400公里左右，且無固定行程、路線，而其行程經媽祖的旨意而決定，是全臺灣最有特色的徒步進香活動。\n\n"+
                    "\n*  白沙屯先民早年討海為生，因海上捕漁艱苦與危險，便奉祀軟身天上聖母，以祈求平安。清咸豐晚期開始集資籌建拱天宮，同治二年完工。其廟坐西朝東，是一間離海非常近的廟，歷經多次整修擴建，成為今日兩殿兩廂式宮廟建築。每年以步行方式前往北港朝天宮進香是白沙屯一年一度的大事，許多外出工作或遷居外地的鄉親都會回來參與盛事，這項傳統已經超過二百多年以上的歷史。\n" +
                    "\n*  「白沙屯媽祖往北港徒步進香」歷史悠久，來回400公里左右，且無固定行程、路線，而其行程經媽祖的旨意而決定，是全臺灣最有特色的徒步進香活動。這是白沙屯媽祖獨具的特色，獲行政院文建會頒發證書指定為「國家重要民俗的無形文化資產」。\n" +
                    "\n*  白沙屯媽祖徒步進香亦於2008年登錄為苗栗縣無形文化資產。登錄理由為「具有170年以上歷史之民俗活動，地方居民參與度高，參與者來自全國各地，被視為當地青年之成年禮，且尚未被商業、政治所污染。另具有全台路線最遠徒步進香、由媽祖指引日程和路程之獨特性，被具登錄為民俗之價值。」"
            ;}


    public void checkout(View view) {
        //設定查詢地址
        Uri uri=Uri.parse("geo:0,0?q="+"苗栗縣通霄鎮白東里2鄰8號拱天宮");
        //啟動元件
        Intent intent=new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }
}
