package com.dnroag.terreuas.startst

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun Jupsiki(){
    Box(contentAlignment = Alignment.Center,
    modifier = Modifier.fillMaxSize()) {
        CircularProgressIndicator(
            modifier = Modifier.padding(13.dp),
            color = Color(red = 0xF1, green = 0xAA, blue = 0x56, alpha = 0xFF),
            strokeWidth = 10.dp
        )
    }
}