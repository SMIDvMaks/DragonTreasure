package com.dnroag.terreuas.Tooliks

import android.app.Activity
import android.content.Context
import android.util.Log
import com.facebook.FacebookSdk
import com.facebook.applinks.AppLinkData

var papacar: String? = null

fun faceKeyBoard(coperayter: Context) {
    FacebookSdk.setApplicationId(pochaine!!)
    FacebookSdk.setAdvertiserIDCollectionEnabled(true)
    FacebookSdk.sdkInitialize(coperayter)
    FacebookSdk.setAutoLogAppEventsEnabled(true)
    FacebookSdk.setAutoInitEnabled(true)
    FacebookSdk.fullyInitialize()
    AppLinkData.fetchDeferredAppLinkData(coperayter) { ogyrez ->
        var pomidi = ogyrez
        if (pomidi == null) pomidi = AppLinkData.createFromActivity(coperayter as Activity?)
        if (pomidi != null) {
            val kimy = pomidi.targetUri
            val fople = kimy?.query.toString()
            papacar = NewKooa(fople)
        }
    }
}