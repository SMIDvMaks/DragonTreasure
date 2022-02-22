package com.dnroag.terreuas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.dnroag.terreuas.Tooliks.Kindere
import com.dnroag.terreuas.ui.theme.DragonTreasureTheme

class Rupckie : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Image(
                modifier = Modifier.fillMaxSize(),
                painter = painterResource(R.mipmap.bg),
                contentDescription = Kindere(supcikie),
                contentScale = ContentScale.FillBounds
            )
            Column(
                modifier = Modifier
                    .fillMaxSize(), verticalArrangement = Arrangement.SpaceAround,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Hello, the game is called Dragon Treasure\n\n" +
                            "1. To start the game, click Play Game\n\n" +
                            "2. You will switch to the game\n\n" +
                            "3. Click on the chest to try your luck\n\n" +
                            "4. You can click on the chest 10 times, after which your points are reset and the game starts again\n" +
                            "5. If you get 3 single elements, you get +2000\n\n" +
                            "6. If 3 different items fall out, get -500\n\n" +
                            "7. When you reach 1500 points you will be pleasantly surprised",
                    fontWeight = FontWeight.SemiBold, fontSize = 20.sp, color = Color.White
                )
            }
        }
    }
}

