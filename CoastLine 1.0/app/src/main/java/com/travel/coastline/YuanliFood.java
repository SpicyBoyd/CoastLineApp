package com.travel.coastline;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class YuanliFood extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.webview);

        WebView WebView1 = (WebView) findViewById(R.id.webView);
        WebView1.getSettings().setJavaScriptEnabled(true);
        WebView1.loadUrl("http://m.xuite.net/blog/nakobe/wretch/147031190");
    }
}
