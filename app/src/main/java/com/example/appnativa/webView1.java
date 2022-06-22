package com.example.appnativa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class webView1 extends AppCompatActivity {

    WebView wv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view1);

        wv1 = (WebView) findViewById(R.id.webView1);

        String URL = getIntent().getStringExtra("paginaWeb");
        wv1.setWebViewClient(new WebViewClient());
        wv1.loadUrl("https://" + URL);
    }
}