package com.dnroag.terreuas

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dnroag.terreuas.Tooliks.Kindere
import kotlin.system.exitProcess
val supcikie = "YmFja2dyb3VuZF9pbWFnZQ=="
class Knopka : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.addFlags(1024)
        val pini = "RHJhZ29uIFRyZWFzdXJl"
        val ckopai = "UGxheSBHYW1l"
        setContent {
            Box()
            {
                Image(
                    modifier = Modifier.fillMaxSize(),
                    painter = painterResource(R.mipmap.bgbg),
                    contentDescription = Kindere(supcikie),
                    contentScale = ContentScale.FillBounds
                )

                Column(
                    modifier = Modifier
                        .fillMaxSize(), verticalArrangement = Arrangement.SpaceAround,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = Kindere(pini), fontWeight = FontWeight.Bold,
                        fontSize = 40.sp, color = Color.Yellow
                    )
                    Button(
                        onClick = {
                            val keycik = Intent(this@Knopka, ZAdpGANEN::class.java)
                            startActivity(keycik)
                        },
                        modifier = Modifier.width(260.dp),
                        colors = ButtonDefaults.buttonColors(backgroundColor = Color.Yellow)
                    ) {
                        Text(
                            text = Kindere(ckopai), fontWeight = FontWeight.Bold,
                            fontSize = 25.sp

                        )
                    }
                    Button(
                        modifier = Modifier.width(260.dp),
                        colors = ButtonDefaults.buttonColors(backgroundColor = Color.Yellow),
                        onClick = {
                            startActivity(Intent(this@Knopka, AnotherW::class.java))
                        }
                    ) {
                        Text(
                            text = "Privacy Policy", fontWeight = FontWeight.Bold,
                            fontSize = 25.sp
                        )
                    }
                    Button(
                        modifier = Modifier.width(260.dp),
                        colors = ButtonDefaults.buttonColors(backgroundColor = Color.Yellow),
                        onClick = {
                            startActivity(Intent(this@Knopka,Rupckie::class.java))
                        }
                    ) {
                        Text(
                            text = "Rules", fontWeight = FontWeight.Bold,
                            fontSize = 25.sp
                        )
                    }
                    Button(
                        modifier = Modifier.width(260.dp),
                        colors = ButtonDefaults.buttonColors(backgroundColor = Color.Yellow),
                        onClick = {
                            finishAffinity()
                        }
                    ) {
                        Text(
                            text = "Close", fontWeight = FontWeight.Bold,
                            fontSize = 25.sp
                        )
                    }
                }
            }
        }
    }
}

