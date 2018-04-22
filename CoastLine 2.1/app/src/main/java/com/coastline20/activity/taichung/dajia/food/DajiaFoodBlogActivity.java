package com.coastline20.activity.taichung.dajia.food;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.coastline20.R;

public class DajiaFoodBlogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);

        WebView webView = (WebView) findViewById(R.id.web_view);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("http://zine1215.pixnet.net/blog/post/37206026-%E3%80%90%E5%8F%B0%E4%B8%AD%E3%80%91%E5%A4%A7%E7%94%B2%E5%AA%BD%E7%A5%96%E9%8E%AE%E7%80%BE%E5%AE%AE%E5%91%A8%E9%82%8A%E7%BE%8E%E9%A3%9F%E6%8E%A8%E8%96%A6%E3%80%81%E5%B0%8F%E5%90%83");
    }
}
