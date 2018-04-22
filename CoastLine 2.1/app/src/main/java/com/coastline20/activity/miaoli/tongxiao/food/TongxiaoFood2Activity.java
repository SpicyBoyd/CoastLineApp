package com.coastline20.activity.miaoli.tongxiao.food;

import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.coastline20.R;
import com.coastline20.adapter.FoodInfoAdapter;
import com.coastline20.adapter.FoodPagerAdapter;
import com.coastline20.entity.FoodEntity;
import com.coastline20.util.DensityUtil;

public class TongxiaoFood2Activity extends AppCompatActivity {
    private ViewPager viewPager;
    private LinearLayout indexContainer;
    private final int HOME_AD_RESULT = 1;
    private RecyclerView recyclerView;
    private FoodEntity foodEntity;
    private TextView textView;

    private void init() {
        viewPager = (ViewPager) findViewById(R.id.view_pager);
        indexContainer = (LinearLayout) findViewById(R.id.index_container);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        textView = (TextView) findViewById(R.id.food_title);

        foodEntity = new FoodEntity(
                R.array.tongxiao_food,
                R.array.tongxiao_food_info,
                2,
                R.drawable.tongxiaofood2_1,
                R.drawable.tongxiaofood2_2,
                R.array.tongxiao_food_address);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        init();
        initView();
        textView.setText(getResources().getStringArray(foodEntity.getFood())[foodEntity.getFoodNum()+1]);
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL));
        recyclerView.setAdapter(new FoodInfoAdapter(
                getResources().getStringArray(foodEntity.getInfo())[foodEntity.getFoodNum()],
                foodEntity.getImages()));
    }

    // 設定 FloatingActionButton
    public void mapGuide(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=" +
                getResources().getStringArray(foodEntity.getAddress())[foodEntity.getFoodNum()]));
        startActivity(intent);
    }

    private Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case HOME_AD_RESULT:
                    viewPager.setCurrentItem(viewPager.getCurrentItem() + 1, true);
                    break;
            }
        }
    };

    // 設定輪播
    private void initView() {
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                refreshPoint(position % 2);
                if (handler.hasMessages(HOME_AD_RESULT)) {
                    handler.removeMessages(HOME_AD_RESULT);
                }
                handler.sendEmptyMessageDelayed(HOME_AD_RESULT, 3000);
            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {
                if (ViewPager.SCROLL_STATE_DRAGGING == state && handler.hasMessages(HOME_AD_RESULT)) {
                    handler.removeMessages(HOME_AD_RESULT);
                }
            }
        });

        viewPager.setAdapter(new FoodPagerAdapter(this, foodEntity.getImages()));
        addIndicatorImageViews(2);
        viewPager.setCurrentItem(2 * 1000, false);
        handler.sendEmptyMessageDelayed(HOME_AD_RESULT, 3000);
    }

    // 为ViewPager设置监听器
    private void refreshPoint(int position) {
        if (indexContainer != null) {
            for (int i = 0; i < indexContainer.getChildCount(); i++) {
                indexContainer.getChildAt(i).setEnabled(false);
                if (i == position) {
                    indexContainer.getChildAt(i).setEnabled(true);
                }
            }
        }
    }

    // 添加指示图标
    private void addIndicatorImageViews(int size) {
        indexContainer.removeAllViews();
        for (int i = 0; i < size; i++) {
            ImageView iv = new ImageView(this);
            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
                    DensityUtil.dip2px(this, 5),
                    DensityUtil.dip2px(this, 5));
            if (i != 0) {
                lp.leftMargin = DensityUtil.dip2px(this, 7);
            }
            iv.setLayoutParams(lp);
            iv.setBackgroundResource(R.drawable.xml_round_orange_grey_sel);
            iv.setEnabled(false);
            if (i == 0) {
                iv.setEnabled(true);
            }
            indexContainer.addView(iv);
        }
    }
}
