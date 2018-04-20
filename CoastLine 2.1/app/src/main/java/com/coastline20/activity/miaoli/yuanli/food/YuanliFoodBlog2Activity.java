package com.coastline20.activity.miaoli.yuanli.food;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.coastline20.R;

public class YuanliFoodBlog2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_blog);

        WebView webView = (WebView) findViewById(R.id.web_view);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("http://kiwi77720.pixnet.net/blog/post/57072150-%E3%80%90%E8%8B%97%E6%A0%97%E8%8B%91%E8%A3%A1%E3%80%91%E8%8B%91%E8%A3%A1%E9%8A%B7%E9%AD%82%E7%BE%8E%E9%A3%9F9%E9%80%A3%E7%99%BC%E4%B9%8B%E8%81%9E%E9%A6%99%E4%B8%8B%E9%A6%AC(");
    }
}
