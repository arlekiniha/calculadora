package com.example.calculator.ui.theme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun Calculator(
    modifier: Modifier = Modifier,
) {
    var userInput by remember { mutableStateOf("") }
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Bottom,
    ) {
        Text(
            modifier = Modifier,
            text = userInput,
            fontSize = 25.sp
        )
        Row(
            verticalAlignment = Alignment.Bottom,
        ) {
            ButtonPad(
                on1Click = { userInput += "1" },
                on2Click = { userInput += "2" },
                on3Click = { userInput += "3" },
                on4Click = { userInput += "4" },
                on5Click = { userInput += "5" },
                on6Click = { userInput += "6" },
                on7Click = { userInput += "7" },
                on8Click = { userInput += "8" },
                on9Click = { userInput += "9" },
                on0Click = { userInput += "0" },
                modifier = Modifier.weight(3f),
            )
            ActionsPad(
                onPlusClick = { userInput += "+" },
                onMinusClick = { userInput += "-" },
                onTimesClick = { userInput += "x" },
                modifier = Modifier.weight(1f),
            )
        }
    }
}


@Preview
@Composable
fun Preview() {
    Calculator(
        modifier = Modifier
    )
}

