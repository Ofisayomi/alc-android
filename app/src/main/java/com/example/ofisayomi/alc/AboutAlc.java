package com.example.ofisayomi.alc;

import android.net.http.SslError;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by ofisayomi on 7/13/19.
 */

public class AboutAlc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_alc);
        WebView wview = (WebView)findViewById(R.id.web_view);

        WebSettings settings = wview.getSettings();
        settings.setJavaScriptEnabled(true);
        wview.setWebViewClient(new WebViewClient(){
            @Override
            public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
                handler.proceed();
                //super.onReceivedSslError(view, handler, error);
            }
        });
        //wview.setWebChromeClient(getChromeClient());
        wview.loadUrl("http://www.andela.com/alc/");


    }
}