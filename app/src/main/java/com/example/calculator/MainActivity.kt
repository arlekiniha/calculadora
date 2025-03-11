package com.example.calculator

import android.R.attr.onClick
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.SemanticsActions.OnClick
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.calculator.ui.theme.CalculatorTheme
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.unit.dp
import com.example.calculator.ui.theme.ButtonPad
import com.example.calculator.ui.theme.SetBackground


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            var userInput by remember { mutableStateOf("") }
            SetBackground()
            ButtonPad(
                userInput = userInput,
                on1Click = { userInput += "1" },
                modifier = Modifier
                    .fillMaxSize()
                    .padding(30.dp),
                )
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
        modifier = Modifier
            .fillMaxSize()
            .padding(30.dp),
    )
}


