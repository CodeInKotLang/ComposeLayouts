package com.example.composelayouts

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import kotlin.random.Random

@Composable
fun StaggeredGridLayout() {
    val colors = listOf(
        Color.Red, Color.Blue, Color.Green, Color.Yellow, Color.Cyan,
        Color.Gray, Color.Black, Color.Magenta, Color.DarkGray
    )
    LazyVerticalStaggeredGrid(
        columns = StaggeredGridCells.FixedSize(100.dp),
        contentPadding = PaddingValues(10.dp),
        verticalItemSpacing = 10.dp,
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        items(100) {
            val randomHeight = Random.nextInt(100, 200)
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(randomHeight.dp)
                    .clip(RoundedCornerShape(5.dp))
                    .background(colors.random())
            )
        }
    }
}