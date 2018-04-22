package com.coastline20.activity.taichung.shalu.food;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.coastline20.R;

public class ShaluFoodBlogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);

        WebView webView = (WebView) findViewById(R.id.web_view);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("http://dream3s.pixnet.net/blog/post/198072405-%5B%E5%8F%B0%E4%B8%AD%E6%B2%99%E9%B9%BF%5D%E6%B5%B7%E7%B7%9A%E6%B2%99%E9%B9%BF%E6%8E%A5%E8%BF%91200%E5%AE%B6%E7%BE%8E%E9%A3%9F%E5%B0%8F%E5%90%83%E9%A4%90%E5%BB%B3%E6%87%B6");
    }
}
