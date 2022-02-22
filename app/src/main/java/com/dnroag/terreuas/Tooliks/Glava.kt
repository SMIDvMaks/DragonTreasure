package com.dnroag.terreuas.Tooliks

import android.annotation.SuppressLint
import android.content.Intent
import androidx.activity.ComponentActivity
import androidx.compose.runtime.Composable
import com.dnroag.terreuas.D2T2
import com.dnroag.terreuas.Knopka
import com.dnroag.terreuas.cimbere.Nutroro
import com.dnroag.terreuas.Laik
import kotlinx.coroutines.DelicateCoroutinesApi

@DelicateCoroutinesApi
class Glava : ComponentActivity() {
    @SuppressLint("CoroutineCreationDuringComposition")
    @Composable
    fun Glavo(copetrina: D2T2) {
        if (curender(copetrina) == 0) {
            if (Laik != null) {
                Nutroro(upocha = Laik.toString())
            } else {
                BMWRylit(bydimo = copetrina)
            }
        } else {
            val ibris = Intent(copetrina, Knopka::class.java)
            copetrina.startActivity(ibris)
            copetrina.finish()
        }
    }
}