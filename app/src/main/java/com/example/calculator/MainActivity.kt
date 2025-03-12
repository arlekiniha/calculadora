package com.example.calculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
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
                    .fillMaxSize()
                    .padding(30.dp),
                )
        }
    }
}

//
//@Preview
//@Composable
//fun Preview() {
//    SetBackground()
//    ButtonPad(
//        userInput = "",
//        on1Click = { },
//        modifier = Modifier
//            .fillMaxSize()
//            .padding(30.dp),
//    )
//}


