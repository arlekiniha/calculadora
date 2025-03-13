package com.example.calculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFrom
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import com.example.calculator.ui.theme.ButtonPad
import com.example.calculator.ui.theme.Calculator
import com.example.calculator.ui.theme.SetBackground


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Calculator(modifier = Modifier)
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
        modifier = Modifier
            .fillMaxSize()
            .padding(30.dp),
    )
}


