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
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Start
        ) {

            NumberButton(on1Click, "1", Modifier.weight(1f))


            NumberButton(on2Click, "2", Modifier.weight(1f))


            NumberButton(on3Click, "3", Modifier.weight(1f))

        }


        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Start
        ) {

            NumberButton(on4Click, "4", Modifier.weight(1f))


            NumberButton(on5Click, "5", Modifier.weight(1f))


            NumberButton(on6Click, "6", Modifier.weight(1f))

        }



        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Start
        ) {

            NumberButton(on7Click, "7", Modifier.weight(1f))


            NumberButton(on8Click, "8", Modifier.weight(1f))


            NumberButton(on9Click, "9", Modifier.weight(1f))


        }


        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Start
        ) {
            NumberButton(
                on0Click,
                "0",
                modifier = Modifier.weight(1f)
            )
            NumberButton(
                onButtonClick = { println("smth") },
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
