package com.example.calculator.ui.theme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ActionsPad(
    onPlusClick: () -> Unit,
    onMinusClick: () -> Unit,
    onTimesClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Bottom,
    ) {
        NumberButton(
            onPlusClick,
            "+",
            modifier = Modifier.fillMaxWidth()
        )

        NumberButton(
            onMinusClick,
            "-",
            modifier = Modifier.fillMaxWidth()
        )

        NumberButton(
            onTimesClick,
            "x",
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(
            Modifier
                .height(50.dp)
                .padding(5.dp)
        )
    }
}

@Composable
fun ButtonPad(
    onNumberClick: (String) -> Unit,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.Start,
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Start
        ) {

            NumberButton(onClick = { onNumberClick("1") }, "1", modifier =  Modifier.weight(1f))


            NumberButton(onClick = { onNumberClick("2") }, "2", Modifier.weight(1f))


            NumberButton(onClick = { onNumberClick("3") }, "3", Modifier.weight(1f))

        }


        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Start
        ) {

            NumberButton(onClick = { onNumberClick("4") }, "4", Modifier.weight(1f))


            NumberButton(onClick = { onNumberClick("5") }, "5", Modifier.weight(1f))


            NumberButton(onClick = { onNumberClick("6") }, "6", Modifier.weight(1f))

        }



        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Start
        ) {

            NumberButton(onClick = { onNumberClick("7") }, "7", Modifier.weight(1f))


            NumberButton(onClick = { onNumberClick("8") }, "8", Modifier.weight(1f))


            NumberButton(onClick = { onNumberClick("9") }, "9", Modifier.weight(1f))


        }


        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Start
        ) {
            NumberButton(
                onClick = { onNumberClick("0") },
                "0",
                modifier = Modifier.weight(1f)
            )
            NumberButton(
                onClick = { println("smth") },
                text = "=",
                modifier = Modifier.weight(2f)
            )
        }
    }
}

@Preview
@Composable
private fun ButtonPadPreview() {
    ButtonPad(
        onNumberClick = { },
        modifier = Modifier,
    )
}

@Preview
@Composable
private fun ActionPadPreview() {
    ActionsPad(
        onPlusClick = { },
        onMinusClick = { },
        onTimesClick = { },
        modifier = Modifier,
    )
}
