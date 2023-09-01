package com.example.composelayouts

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun GridLayout() {
    LazyVerticalGrid(
        columns = GridCells.Adaptive(minSize = 60.dp),
        contentPadding = PaddingValues(30.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        items(100) {
            Image(
                painter = painterResource(id = R.drawable.compose_logo),
                contentDescription = "",
                modifier = Modifier.size(60.dp)
            )
        }
    }
    LazyHorizontalGrid(
        modifier = Modifier.height(150.dp),
        rows = GridCells.Fixed(2)
    ) {
        items(100) {
            Image(
                painter = painterResource(id = R.drawable.compose_logo),
                contentDescription = "",
                modifier = Modifier.size(60.dp)
            )
        }
    }
}