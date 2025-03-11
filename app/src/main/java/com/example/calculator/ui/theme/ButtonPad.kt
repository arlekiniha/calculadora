package com.example.calculator.ui.theme

import android.R.attr.onClick
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun ButtonPad(
    userInput: String,
    on1Click: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.Start,

        ) {

        Spacer(modifier = Modifier.height(20.dp))
        if (userInput.isNotEmpty()) {
            Text(userInput)
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
                onClick = { println("Button 1 clicked") },
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
                onClick = { println("Button 1 clicked") },
                modifier = Modifier
                    .size(100.dp, 50.dp)
                    .weight(1f),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.DarkGray,
                )
            ) {
                Text("3")
            }
        }

        Spacer(modifier = Modifier.padding(7.dp))

        Row(modifier = Modifier.fillMaxWidth()) {
            Button(
                onClick = { println("Button 1 clicked") },
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
                onClick = { println("Button 1 clicked") },
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
                onClick = { println("Button 1 clicked") },
                modifier = Modifier
                    .size(100.dp, 50.dp)
                    .weight(1f),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.DarkGray,
                )
            ) {
                Text("6")
            }
        }

        Spacer(modifier = Modifier.padding(7.dp))

        Row(modifier = Modifier.fillMaxWidth()) {
            Button(
                onClick = { println("Button 1 clicked") },
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
                onClick = { println("Button 1 clicked") },
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
                onClick = { println("Button 1 clicked") },
                modifier = Modifier
                    .size(100.dp, 50.dp)
                    .weight(1f),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.DarkGray,
                )
            ) {
                Text("9")
            }

        }
        Spacer(modifier = Modifier.padding(7.dp))

        Button(
            onClick = { println("Button 1 clicked") },
            modifier = Modifier
                .fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.DarkGray,
            )
        ) {
            Text("0")
        }
    }
}



