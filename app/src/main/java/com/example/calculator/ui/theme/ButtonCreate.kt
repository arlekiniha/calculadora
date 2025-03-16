package com.example.calculator.ui.theme

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun NumberButton(onButtonClick: () -> Unit, text: String, modifier: Modifier = Modifier) {
    Button(
        onClick = onButtonClick,
        modifier = modifier
            .height(50.dp)
            .padding(5.dp)
        ,
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.DarkGray,
        )
    ) {
        Text(text)
    }
}