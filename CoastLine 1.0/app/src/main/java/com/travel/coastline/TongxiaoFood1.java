package com.travel.coastline;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class TongxiaoFood1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.webview);

        WebView WebView1 = (WebView) findViewById(R.id.webView);
        WebView1.getSettings().setJavaScriptEnabled(true);
        WebView1.loadUrl("http://nana0032458.pixnet.net/blog/post/413255698-%E9%80%9A%E9%9C%84%E5%9C%B0%E5%8D%80%E7%BE%8E%E9%A3%9F%E6%97%85%E9%81%8A%E6%99%AF%E9%BB%9E%E6%8E%A8%E8%96%A6%EF%BC%8C%E4%B8%80%E6%97%A5%E9%81%8A%E6%99%AF%E9%BB%9E%E3%80%81%E4%B8%8B");
    }
}
