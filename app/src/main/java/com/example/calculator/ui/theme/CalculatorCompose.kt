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
    userInput: String,
    onNumberClick: (String) -> Unit,
    onPlusClick: () -> Unit,
    onMinusClick: () -> Unit,
    onTimesClick: () -> Unit,
) {
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
                onNumberClick = onNumberClick,
                modifier = Modifier.weight(3f),
            )
            ActionsPad(
                onPlusClick = onPlusClick,
                onMinusClick = onMinusClick,
                onTimesClick = onTimesClick,
                modifier = Modifier.weight(1f),
            )
        }
    }
}


@Preview
@Composable
fun Preview() {
    Calculator(
        modifier = Modifier,
        userInput = "",
        {},
        {},
        {},
        {}
    )
}

