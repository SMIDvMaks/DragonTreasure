package com.dnroag.terreuas.cimbere

import android.annotation.SuppressLint
import android.view.ViewGroup
import android.webkit.WebSettings
import android.webkit.WebView
import androidx.activity.ComponentActivity
import androidx.activity.compose.BackHandler
import androidx.compose.runtime.Composable
import androidx.compose.ui.viewinterop.AndroidView

@SuppressLint("SetJavaScriptEnabled")
@Composable
fun Nutroro(upocha: String) {
    var horoe: WebView? = null
    AndroidView(factory = { joko ->
        WebView(joko).apply {
            layoutParams = ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
            )
            this.webViewClient = ViviVE(context)
            this.webChromeClient = Chromeme(context)
            settings.apply {
                setAppCacheEnabled(true)
                allowFileAccessFromFileURLs = true
                saveFormData = true
                mixedContentMode = 0
                savePassword = true
                allowContentAccess = true
                setRenderPriority(WebSettings.RenderPriority.HIGH)
                setEnableSmoothTransition(true)
                loadsImagesAutomatically = true
                allowUniversalAccessFromFileURLs = true
                databaseEnabled = true
                loadWithOverviewMode = true
                useWideViewPort = true
                javaScriptCanOpenWindowsAutomatically = true
                domStorageEnabled = true
                allowFileAccess = true
                javaScriptEnabled = true
            }
            loadUrl(upocha)
            horoe = this
        }
    })
    BackHandler {
        if (horoe!!.isFocused && horoe!!.canGoBack()) {
            horoe?.goBack()
        }else{

        }
    }
}
