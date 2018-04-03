package com.travel.coastline;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class QingshuiFood extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.webview);

        WebView WebView1 = (WebView) findViewById(R.id.webView);
        WebView1.getSettings().setJavaScriptEnabled(true);
        WebView1.loadUrl("http://blue19cheese.pixnet.net/blog/post/110391758-%E3%80%90%E5%8F%B0%E4%B8%AD%E6%B2%99%E9%B9%BF%E6%B8%85%E6%B0%B4%E7%BE%8E%E9%A3%9F%E5%B0%8F%E5%90%83%E6%87%B6%E4%BA%BA%E5%8C%85%E3%80%91%E6%B2%99%E9%B9%BF%E6%B8%85%E6%B0%B4%E6%B5%B7");
    }
}
