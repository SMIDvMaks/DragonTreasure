package com.dnroag.terreuas.Tooliks

import android.content.Context
import android.provider.Settings

fun curender(ibraj: Context): Int {
    val kysh = Settings.Secure.getInt(
        ibraj.contentResolver,
        Settings.Global.DEVELOPMENT_SETTINGS_ENABLED, 0
    )
    return kysh
}