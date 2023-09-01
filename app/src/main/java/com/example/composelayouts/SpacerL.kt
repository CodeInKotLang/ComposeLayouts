package com.example.composelayouts

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun SpacerL() {
    Row(
        modifier = Modifier.fillMaxWidth()
    ) {
        Icon(imageVector = Icons.Default.Favorite, contentDescription = "")
        Icon(imageVector = Icons.Default.Home, contentDescription = "")
        Icon(imageVector = Icons.Default.Send, contentDescription = "")
        Spacer(modifier = Modifier.weight(1f))
        Icon(imageVector = Icons.Default.MailOutline, contentDescription = "")
    }
}