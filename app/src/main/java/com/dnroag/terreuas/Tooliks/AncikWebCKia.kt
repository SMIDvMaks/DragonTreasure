package com.dnroag.terreuas.Tooliks

import android.content.Context
import android.webkit.WebView
import androidx.compose.runtime.Composable
import androidx.compose.ui.viewinterop.AndroidView

@Composable
fun Mushi(lqks:String,coreq:Context){
    AndroidView(factory = {
        WebView(coreq).apply {
            loadUrl(Kindere(lqks))
        }
    })
}