package com.dnroag.terreuas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.dnroag.terreuas.Tooliks.Mushi


class AnotherW : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.addFlags(1024)
        val nitro = "aHR0cHM6Ly93d3cucHJpdmFjeXBvbGljeW9ubGluZS5jb20vbGl2ZS5waHA/dG9rZW49eTJTUHFFTFU3ZTVLd285bGg3emc4S011MUViblFWZ1g="
        setContent {
         Mushi(lqks = nitro, coreq = this)
        }
    }
}

