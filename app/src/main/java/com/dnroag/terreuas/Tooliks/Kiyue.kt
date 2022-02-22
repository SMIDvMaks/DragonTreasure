package com.dnroag.terreuas.Tooliks

import android.content.Context
import android.util.Log
import com.appsflyer.AppsFlyerConversionListener
import com.appsflyer.AppsFlyerLib
import java.util.*

var iBDcho: String? = null
var facike: String? = null
var pairb: String? = null
var leqqe = "ZldkVzdHZkRpcTROY0NGR212aHV6Zg=="
var pimpocha = "Tm9uLW9yZ2FuaWM="
fun Zypivka(huyio: Context) {
    val hki = object : AppsFlyerConversionListener {
        override fun onConversionDataSuccess(mip1: MutableMap<String, Any>) {
            for (kinoo in mip1.keys)
                facike =
                    Objects.requireNonNull(mip1[Kindere("YWZfc3RhdHVz")]).toString()
            if (facike == Kindere(pimpocha)) {
                val jysy = Objects.requireNonNull(mip1[Kindere("Y2FtcGFpZ24=")]).toString()
                pairb = NewKooa(jysy)
            }
        }

        override fun onConversionDataFail(p6: String?) {}
        override fun onAppOpenAttribution(p3: MutableMap<String, String>?) {}
        override fun onAttributionFailure(p4: String?) {}
    }
    iBDcho = AppsFlyerLib.getInstance().getAppsFlyerUID(huyio)
    AppsFlyerLib.getInstance().run {
        init(Kindere(leqqe), hki, huyio)
        start(huyio)
    }
}