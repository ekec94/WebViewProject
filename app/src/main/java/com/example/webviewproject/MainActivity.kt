// We will be working on displaying webpages and how they can be used to format data nicely.
// This lesson is to help you understand the webView object in Android.

package com.example.webviewproject

import android.os.Build
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        webViewSetup()
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun webViewSetup(){
        val webView: WebView = findViewById(R.id.idWebView)
        webView.webViewClient = WebViewClient()

        webView.apply {
            loadUrl("https://duckduckgo.com/")
            settings.safeBrowsingEnabled = true
        }
    }

    @Deprecated("Deprecated in Java")
    override fun onBackPressed() {
        val webView: WebView = findViewById(R.id.idWebView)
        if (webView.canGoBack()) {
            webView.goBack()
        } else {
            super.onBackPressed()
        }
    }
}