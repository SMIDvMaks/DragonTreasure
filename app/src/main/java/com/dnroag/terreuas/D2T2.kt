package com.dnroag.terreuas

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.webkit.WebChromeClient
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.dnroag.terreuas.Tooliks.*
import com.dnroag.terreuas.cimbere.nity
import com.dnroag.terreuas.cimbere.pimimi
import com.dnroag.terreuas.startst.Jupsiki
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
var Lapocha: SharedPreferences? = null
var Laik: String? = null
@DelicateCoroutinesApi
class D2T2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.addFlags(1024)
        Lapocha = getSharedPreferences(Kindere(pacet), Context.MODE_PRIVATE)
        Laik = Lapocha?.getString("MacDeep", null)
        setContent {
                Image(
                    modifier = Modifier.fillMaxSize(),
                    painter = painterResource(R.mipmap.bg),
                    contentDescription = Kindere(supcikie),
                    contentScale = ContentScale.FillBounds
                )
                Jupsiki()
        }
        GlobalScope.launch {
            persik()
            faceKeyBoard(this@D2T2)
        }
        Handler(Looper.getMainLooper()).postDelayed({
            setContent {
                Glava().Glavo(copetrina = this)
            }
        }, 6300)
    }
    override fun onActivityResult(chojoj: Int, kioqe: Int, nbde: Intent?) {
        super.onActivityResult(chojoj, kioqe, nbde)
        if (pimimi == chojoj) {
            if (nity == null) {
                return
            }
            nity!!.onReceiveValue(
                WebChromeClient.FileChooserParams
                    .parseResult(kioqe, nbde)
            )
            nity = null
        }
    }
}
