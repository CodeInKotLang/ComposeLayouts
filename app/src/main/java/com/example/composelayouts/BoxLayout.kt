package com.example.composelayouts

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun BoxLayout() {
    Box(
        modifier = Modifier.size(200.dp),
        contentAlignment = Alignment.Center,
        propagateMinConstraints = true
    ) {
        Image(
            painter = painterResource(id = R.drawable.image),
            contentDescription = ""
        )
        Text(
            text = "Black Box",
            color = Color.White,
            modifier = Modifier.align(Alignment.BottomCenter)
        )
        Icon(
            imageVector = Icons.Default.Favorite,
            contentDescription = null,
            tint = Color.White
        )
    }
}