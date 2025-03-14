package com.example.calculator.ui.theme

import android.R.attr.onClick
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.runtime.getValue

@Composable
fun Calculator(modifier: Modifier = Modifier) {
    var userInput by remember { mutableStateOf("") }
    Row(modifier = modifier) {
        ButtonPad(
            userInput = userInput,
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
            modifier = Modifier
                .weight(3f)
                .padding(30.dp)
        )

        ActionsPad(
            onPlusClick = { userInput += "+" },
            onMinusClick = { userInput += "-" },
            onTimesClick = { userInput += "x" },
            modifier = Modifier
                .width(70.dp),
        )
    }
}

@Composable
fun ActionsPad(
    onPlusClick: () -> Unit,
    onMinusClick: () -> Unit,
    onTimesClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Bottom
    ) {
        NumberButton(onPlusClick, "+")

        Spacer(modifier = Modifier.padding(7.dp))

        NumberButton(onMinusClick, "-")

        Spacer(modifier = Modifier.padding(7.dp))

        NumberButton(onTimesClick, "x")
    }
}

@Composable
fun NumberButton(onButtonClick: () -> Unit, text: String, modifier: Modifier = Modifier) {
    Button(
        onClick = onButtonClick,
        modifier = modifier
            .height(50.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.DarkGray,
        )
    ) {
        Text(text)
    }
}


@Composable
fun ButtonPad(
    userInput: String,
    on1Click: () -> Unit,
    on2Click: () -> Unit,
    on3Click: () -> Unit,
    on4Click: () -> Unit,
    on5Click: () -> Unit,
    on6Click: () -> Unit,
    on7Click: () -> Unit,
    on8Click: () -> Unit,
    on9Click: () -> Unit,
    on0Click: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.Start,
    ) {

        Spacer(modifier = Modifier.height(20.dp))

        if (userInput.isNotEmpty()) {
            Row(
                modifier = Modifier
                    .padding(30.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.End
            ) {
                Text(
                    text = userInput,
                    fontSize = 25.sp
                )
            }
        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {

            NumberButton(on1Click, "1", Modifier.weight(1f))

            Spacer(modifier = Modifier.padding(7.dp))

            NumberButton(on2Click, "2", Modifier.weight(1f))

            Spacer(modifier = Modifier.padding(7.dp))

            NumberButton(on3Click, "3", Modifier.weight(1f))

            Spacer(Modifier.padding(7.dp))

        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {

            Spacer(modifier = Modifier.padding(7.dp))

            NumberButton(on4Click, "4", Modifier.weight(1f))

            Spacer(modifier = Modifier.padding(7.dp))

            NumberButton(on5Click, "5", Modifier.weight(1f))

            Spacer(modifier = Modifier.padding(7.dp))

            NumberButton(on6Click, "6", Modifier.weight(1f))

            Spacer(Modifier.padding(7.dp))
        }
    }

    Spacer(modifier = Modifier.padding(7.dp))

    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {

        NumberButton(on7Click, "7", Modifier.weight(1f))

        Spacer(modifier = Modifier.padding(7.dp))

        NumberButton(on8Click, "8", Modifier.weight(1f))

        Spacer(modifier = Modifier.padding(7.dp))

        NumberButton(on9Click, "9", Modifier.weight(1f))

        Spacer(Modifier.padding(7.dp))

    }

    Spacer(modifier = Modifier.padding(7.dp))
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        NumberButton(on0Click, "0")
        NumberButton({ println("smth") }, "=")
    }
}


@Preview
@Composable
fun Preview() {
    SetBackground()
    Calculator(modifier = Modifier.fillMaxWidth())
}




