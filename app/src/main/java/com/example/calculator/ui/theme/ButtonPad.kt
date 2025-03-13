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
    onPlusClick: () -> Unit,
    onMinusClick: () -> Unit,
    onTimesClick: () -> Unit,
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


        Row(modifier = Modifier.fillMaxWidth()) {
            Button(
                onClick = on1Click,
                modifier = Modifier
                    .size(100.dp, 50.dp)
                    .weight(1f),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.DarkGray,
                )
            ) {
                Text("1")
            }

            Spacer(modifier = Modifier.padding(7.dp))

            Button(
                onClick = on2Click,
                modifier = Modifier
                    .size(100.dp, 50.dp)
                    .weight(1f),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.DarkGray,
                )
            ) {
                Text("2")
            }

            Spacer(modifier = Modifier.padding(7.dp))

            Button(
                onClick = on3Click,
                modifier = Modifier
                    .size(100.dp, 50.dp)
                    .weight(1f),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.DarkGray,
                )
            ) {
                Text("3")
            }

            Spacer(Modifier.padding(7.dp))

            Button(
                onClick = onTimesClick,
                Modifier
                    .size(100.dp, 50.dp)
                    .weight(1f),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.DarkGray,
                )
            ) {
                Text("X")
            }
        }

        Spacer(modifier = Modifier.padding(7.dp))

        Row(modifier = Modifier.fillMaxWidth()) {
            Button(
                onClick = on4Click,
                modifier = Modifier
                    .size(100.dp, 50.dp)
                    .weight(1f),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.DarkGray,
                )

            ) {
                Text("4")
            }

            Spacer(modifier = Modifier.padding(7.dp))

            Button(
                onClick = on5Click,
                modifier = Modifier
                    .size(100.dp, 50.dp)
                    .weight(1f),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.DarkGray,
                )
            ) {
                Text("5")
            }

            Spacer(modifier = Modifier.padding(7.dp))

            Button(
                onClick = on6Click,
                modifier = Modifier
                    .size(100.dp, 50.dp)
                    .weight(1f),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.DarkGray,
                )
            ) {
                Text("6")
            }

            Spacer(Modifier.padding(7.dp))

            Button(
                onClick = onPlusClick,
                Modifier
                    .size(100.dp, 50.dp)
                    .weight(1f),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.DarkGray,
                )
            ) {
                Text("+")
            }
        }

        Spacer(modifier = Modifier.padding(7.dp))

        Row(modifier = Modifier.fillMaxWidth()) {
            Button(
                onClick = on7Click,
                modifier = Modifier
                    .size(100.dp, 50.dp)
                    .weight(1f),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.DarkGray,
                )
            ) {
                Text("7")
            }

            Spacer(modifier = Modifier.padding(7.dp))

            Button(
                onClick = on8Click,
                modifier = Modifier
                    .size(100.dp, 50.dp)
                    .weight(1f),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.DarkGray,
                )
            ) {
                Text("8")
            }

            Spacer(modifier = Modifier.padding(7.dp))

            Button(
                onClick = on9Click,
                modifier = Modifier
                    .size(100.dp, 50.dp)
                    .weight(1f),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.DarkGray,
                )
            ) {
                Text("9")
            }

            Spacer(Modifier.padding(7.dp))

            Button(
                onClick = onMinusClick,
                Modifier
                    .size(100.dp, 50.dp)
                    .weight(1f),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.DarkGray,
                )
            ) {
                Text("-")
            }

        }

        Spacer(modifier = Modifier.padding(7.dp))
        Row(Modifier.fillMaxWidth()) {
            Button(
                onClick = on0Click,
                colors = ButtonDefaults.buttonColors(containerColor = Color.DarkGray),
                modifier = Modifier.size(260.dp, 50.dp)
            ) {
                Text("0")
            }

            Spacer(Modifier.padding(7.dp))

            Button(
                onClick = { println("something") },
                modifier = Modifier
                    .size(100.dp, 50.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.DarkGray,
                )
            ) {
                Text("=")
            }
        }
    }
}

@Preview
@Composable
fun Preview() {
    SetBackground()
    ButtonPad(
        userInput = "",
        on1Click = { },
        on2Click = { },
        on3Click = { },
        on4Click = { },
        on5Click = { },
        on6Click = { },
        on7Click = { },
        on8Click = { },
        on9Click = { },
        on0Click = { },
        onPlusClick = { },
        onMinusClick = { },
        onTimesClick = { },
        modifier = Modifier
            .fillMaxSize()
            .padding(30.dp),
    )
}




