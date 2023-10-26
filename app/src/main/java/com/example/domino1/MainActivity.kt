package com.example.domino1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.foundation.Image
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.domino1.ui.theme.Domino1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Domino1Theme {
                Domino()
            }
        }
    }
}
@Preview
@Composable
fun Domino() {
    DiceWithButtonAndImage(
        modifier = Modifier
            .fillMaxSize()
            .wrapContentSize(Alignment.Center)
    )
}

@Composable
fun DiceWithButtonAndImage(modifier: Modifier = Modifier) {
    var result by remember { mutableStateOf(1) }
    val imageResource = when (result) {
        1 -> R.drawable.domino_0
        2 -> R.drawable.domino_1
        3 -> R.drawable.domino_2
        4 -> R.drawable.domino_4
        5 -> R.drawable.domino_5
        6 -> R.drawable.domino_6
        7 -> R.drawable.domino_7
        8 -> R.drawable.domino_8
        9 -> R.drawable.domino_9
        10 -> R.drawable.domino_10
        11 -> R.drawable.domino_11
        12 -> R.drawable.domino_12
        13 -> R.drawable.domino_13
        14 -> R.drawable.domino_14
        15 -> R.drawable.domino_15
        16 -> R.drawable.domino_16
        17 -> R.drawable.domino_17
        18 -> R.drawable.domino_18
        19 -> R.drawable.domino_19
        20 -> R.drawable.domino_20
        21 -> R.drawable.domino_21
        22 -> R.drawable.domino_22
        23 -> R.drawable.domino_23
        24 -> R.drawable.domino_24
        25 -> R.drawable.domino_25
        26 -> R.drawable.domino_26
        27 -> R.drawable.domino_27
        28 -> R.drawable.domino_28
        else -> R.drawable.domino_28

    }
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = imageResource),
            contentDescription = result.toString()
        )
        Spacer(modifier = Modifier.height(4.dp))
        Button(onClick = { result = (1..28).random()}) {
            Text(stringResource(R.string.shuffle))
        }

    }
}