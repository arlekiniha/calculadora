package com.example.calculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.calculator.ui.theme.Calculator

class MainActivity : ComponentActivity() {
    val calculatorModel = CalculatorModel()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Calculator(
                modifier = Modifier
                    .background(Color.LightGray)
                    .fillMaxSize(),
                userInput = calculatorModel.userInput,
                onNumberClick = calculatorModel::onNumberClick,
                onPlusClick = calculatorModel::onPlusClick,
                onMinusClick = calculatorModel::onMinusClick,
                onTimesClick = calculatorModel::onTimesClick,
            )
        }
    }
}

class CalculatorModel {
    var userInput: String by mutableStateOf("")

    fun onNumberClick(number: String) {
        userInput += number
    }

    fun onPlusClick() {
        userInput += "+"
    }

    fun onMinusClick() {
        userInput += "-"
    }

    fun onTimesClick() {
        userInput += "*"
    }

}


@Preview
@Composable
fun Preview() {
    Calculator(
        modifier = Modifier
            .background(Color.LightGray)
            .fillMaxSize(),
        userInput = "",
        {},
        {},
        {},
        {}
    )
}


