package com.dnroag.terreuas.cimbere

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.graphics.Bitmap
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.core.content.ContextCompat.startActivity
import com.dnroag.terreuas.Knopka
import com.dnroag.terreuas.Lapocha
import com.dnroag.terreuas.Tooliks.Kindere
var pichas = "Z2FwcHM9NDA0"
class ViviVE(val corective: Context):WebViewClient() {
    override fun onPageStarted(blya: WebView?, nyda: String?, nyne: Bitmap?) {
        super.onPageStarted(blya, nyda, nyne)
        if (nyda?.contains(Kindere(pichas)) == true) {
            corective.startActivity(Intent(corective, Knopka::class.java))
        }
    }
    override fun onPageFinished(moie: WebView?, tvoie: String?) {
        super.onPageFinished(moie, tvoie)
       val pampers:SharedPreferences.Editor? = Lapocha?.edit()
        pampers?.putString("MacDeep",tvoie)?.apply()
    }
}