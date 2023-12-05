package com.dafinrs.shaf.android.pages.home.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dafinrs.shaf.android.R
import com.dafinrs.shaf.android.ui.theme.GradientCompose
import com.dafinrs.shaf.android.ui.theme.fontFamily
import java.time.ZonedDateTime

@Composable
fun HeaderDashboardComponent() {
    Box(
        modifier = Modifier
            .height(285.dp)
            .fillMaxWidth()
            .background(Brush.verticalGradient(GradientCompose.current))
    ) {
        Column(modifier = Modifier.fillMaxSize()) {
            AppBarMenu {

            }
            TitleBackground()
        }
    }
}

@Composable
private fun AppBarMenu(location: () -> Unit) {
    Row(
        modifier = Modifier
            .height(64.dp)
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(modifier = Modifier.weight(1f))
        IconButton(onClick = location) {
            Icon(
                imageVector = Icons.Default.Search,
                contentDescription = "Location",
                Modifier.size(24.dp),
                tint = MaterialTheme.colorScheme.onSurface
            )
        }
        IconButton(onClick = location) {
            Icon(
                imageVector = Icons.Default.LocationOn,
                contentDescription = "Location",
                Modifier.size(24.dp),
                tint = MaterialTheme.colorScheme.onSurface
            )
        }
    }
}

@Composable
private fun TitleBackground() {
    val yearTimeNow = ZonedDateTime.now().year

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
    ) {
        Column(modifier = Modifier.weight(0.5f)) {
            Text(
                text = stringResource(id = R.string.kajian),
                fontFamily = fontFamily,
                style = TextStyle(fontSize = 36.sp, fontWeight = FontWeight(400), color = MaterialTheme.colorScheme.onSurface)
            )
            Text(
                text = "$yearTimeNow",
                fontFamily = fontFamily,
                style = TextStyle(fontSize = 36.sp),
                fontWeight = FontWeight(400),
                color = MaterialTheme.colorScheme.onSurface
            )
            Text(
                modifier = Modifier.padding(top = 4.dp),
                text = "di Tangerang, Banten",
                fontFamily = fontFamily,
                style = TextStyle(fontSize = 12.sp),
                fontWeight = FontWeight(400),
                color = MaterialTheme.colorScheme.onSurface
            )
        }
    }
}