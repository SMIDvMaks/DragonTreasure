package com.dnroag.terreuas.Tooliks

import android.content.Context
import android.util.Log
import com.google.android.gms.ads.identifier.AdvertisingIdClient
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response
val pacet = "Y29tLmRucm9hZy50ZXJyZXVhcw=="
var tipili: String? = null
var tyndrad: String? = null
var jinjino: String? = null
var pochaine: String? = null
@DelicateCoroutinesApi
fun peryu(jokyu: Context) {
    GlobalScope.launch {
        val iyueq: AdvertisingIdClient.Info =
            AdvertisingIdClient.getAdvertisingIdInfo(jokyu)
        tipili = iyueq.id
    }
}
fun persik() {
    val kesha =
        "aHR0cHM6Ly9naXN0LmdpdGh1YnVzZXJjb250ZW50LmNvbS9TTUlEdk1ha3MvYjk5NmIxYjQwZTA2YzdmODIyMDk3NWFiNDE0YjIxMTkvcmF3L0RyYWdvbiUyNTIwVHJlYXN1cmU="
    val pepos = Request.Builder()
        .url(Kindere(kesha))
        .build()
    val ciciDo = OkHttpClient()
    val intror: Response = ciciDo.newCall(pepos).execute()
    val montik = intror.body()?.string()
    val Moreyrik = montik?.split("|")?.toMutableList()
    pochaine = Moreyrik!![2]
    jinjino = Moreyrik[1]
    tyndrad = Moreyrik[0]
}