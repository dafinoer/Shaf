package com.dafinrs.shaf.android.components

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import com.dafinrs.shaf.android.ui.theme.fontFamily


@Composable
fun HeadlineLargeTitle(title: String, modifier: Modifier = Modifier) {
    Text(
        text = title,
        fontFamily = fontFamily,
        color = MaterialTheme.colorScheme.onSurface,
        modifier = modifier,
        fontSize = 22.sp
    )
}