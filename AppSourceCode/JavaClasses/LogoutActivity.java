package com.abhiz.wificaptivelogin;


import android.content.Intent;
import android.net.http.SslError;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.webkit.SslErrorHandler;
import android.webkit.URLUtil;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by abhiz on 17-Aug-18.
 */

public class LogoutActivity extends AppCompatActivity {
    public WebView mWebView;
    public static SharedPreferences sh;
    public static SharedPreferences.Editor editor;
    public static String userid;
    public static String userpwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.logout);
        mWebView = (WebView) findViewById(R.id.web);
        mWebView.setWebViewClient(new WebViewClient());
        mWebView.loadUrl("https://scg.ruckuswireless.com:9998/SubscriberPortal/login");
        WebSettings webSettings = mWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        mWebView.setWebViewClient(new WebViewClient() {
            @Override
            public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
                handler.proceed(); // Ignore SSL certificate errors
            }
            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                
                sh = getSharedPreferences("myprefe", 0);
                editor = sh.edit();

                
                userid = sh.getString("name", null);
                userpwd = sh.getString("password", null);
                
                mWebView.loadUrl(
                        "javascript:(function() { " +
                                "document.getElementById('UE-Username').value='"+userid+"';"
                                + "document.getElementById('UE-Password').value='"+userpwd+"';"
                                + "document.forms['loginForm'].submit();" +
                                "})()");
            }
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                // we handle the url ourselves if it's a network url (http / https)
                return ! URLUtil.isNetworkUrl(url);
            }

        });




    }

    // on back key press exit the application.

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            Intent intent = new Intent(LogoutActivity.this,
                    SplashActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            intent.putExtra("EXIT", true);
            startActivity(intent);
        }
        return super.onKeyDown(keyCode, event);
    }
}


