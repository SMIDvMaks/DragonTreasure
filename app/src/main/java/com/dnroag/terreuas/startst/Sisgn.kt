package com.dnroag.terreuas.startst

import android.app.Application
import com.dnroag.terreuas.Tooliks.Kindere
import com.dnroag.terreuas.Tooliks.Zypivka
import com.dnroag.terreuas.Tooliks.peryu
import com.onesignal.OneSignal
import kotlinx.coroutines.DelicateCoroutinesApi

@DelicateCoroutinesApi
class Sisgn:Application() {
    override fun onCreate() {
        super.onCreate()
        val opiki = "NmY3NzM4YmEtOTg0Ny00OWU0LTg0OTMtODQxYzI3N2NjMGY2"
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE)
        OneSignal.initWithContext(this)
        OneSignal.setAppId(Kindere(opiki))
        peryu(this)
        Zypivka(this)
    }
}