package com.example.composelayouts

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun ColumnLayout() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Hello Developers,",
            modifier = Modifier.weight(3f)
        )
        Text(
            text = "Column layout -> top to bottom",
            modifier = Modifier.weight(5f)
        )
        Text(
            text = "Thanks",
            modifier = Modifier
                .align(Alignment.End)
                .weight(2f)
        )
    }
}