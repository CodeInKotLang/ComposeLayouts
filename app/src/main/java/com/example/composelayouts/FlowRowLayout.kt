package com.example.composelayouts

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowColumn
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.AssistChip
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun FlowRowLayout() {
    val tags = listOf(
        "AndroidDev",
        "JetpackCompose",
        "Kotlin",
        "UI/UX",
        "MaterialDesign",
        "AppDevelopment",
        "OpenSource",
        "Firebase",
        "Flutter",
        "ReactNative",
        "MobileApp",
        "APIs",
        "MVVM",
        "DataBinding",
        "FrontEnd",
        "AndroidDev",
        "JetpackCompose",
        "Kotlin",
        "UI/UX",
        "MaterialDesign",
        "AppDevelopment",
        "OpenSource",
        "Firebase",
    )
    FlowRow(
        modifier = Modifier.padding(20.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp),
        verticalArrangement = Arrangement.Center,
        maxItemsInEachRow = 2
    ) {
        tags.forEach { tag ->
            AssistChip(
                onClick = { /*TODO*/ },
                label = { Text(text = tag) }
            )
        }
    }
    FlowColumn {
        tags.forEach { tag ->
            AssistChip(
                onClick = { },
                label = { Text(text = tag) }
            )
        }
    }
}