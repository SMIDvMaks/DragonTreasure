package com.dnroag.terreuas.Tooliks

import android.util.Base64

fun Kindere(kinder:String):String{
    val kind = String(Base64.decode(kinder,Base64.DEFAULT))
    return kind
}