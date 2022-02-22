package com.dnroag.terreuas.cimbere

import android.app.Activity
import android.content.ActivityNotFoundException
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.webkit.ValueCallback
import android.webkit.WebChromeClient
import android.webkit.WebView

var nity: ValueCallback<Array<Uri>>? = null
val pimimi = 100

class Chromeme(val copike: Context) : WebChromeClient() {
    override fun onShowFileChooser(
        ruiq: WebView?,
        plio: ValueCallback<Array<Uri>>?,
        gudim: FileChooserParams?
    ): Boolean {
        if (nity != null) {
            nity!!.onReceiveValue(null)
            nity = null
        }
        nity = plio
        try {
            val ibib = Intent(Intent.ACTION_GET_CONTENT)
            ibib.addCategory(Intent.CATEGORY_OPENABLE)
            ibib.type = "*/*"
            (copike as Activity).startActivityForResult(Intent.createChooser(ibib,"Tilivi"), pimimi)
        }catch (eres: ActivityNotFoundException){
            nity = null
            return false
        }
        return true
    }
}