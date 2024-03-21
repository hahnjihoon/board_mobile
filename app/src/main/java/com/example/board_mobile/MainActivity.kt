package com.lbo.hybridbasic

import android.R
import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.view.View
import android.webkit.WebSettings
import android.webkit.WebView

class MainActivity : Activity() {
    var mWebView: WebView? = null
    private var mContext: Context? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mContext = this
        mWebView = findViewById<View>(R.id.webview) as WebView
        val ws = mWebView!!.settings
        ws.javaScriptEnabled = true
        ws.cacheMode = WebSettings.LOAD_NO_CACHE
        val url = "https://www.naver.com";
//        val url = "file:///android_asset/index.html"
        mWebView!!.loadUrl(url)
    }
}