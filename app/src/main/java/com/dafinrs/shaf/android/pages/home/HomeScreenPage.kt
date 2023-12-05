package com.dafinrs.shaf.android.pages.home

import android.content.res.Configuration.UI_MODE_NIGHT_NO
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.dafinrs.shaf.android.pages.home.components.ContentComponent
import com.dafinrs.shaf.android.pages.home.components.HeaderDashboardComponent
import com.dafinrs.shaf.android.ui.theme.ShafTheme


@Composable
fun HomePage(modifier: Modifier = Modifier) {
    Box(modifier = modifier) {
        HeaderDashboardComponent()
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.BottomCenter,
        ) {
            ContentComponent()
        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Preview(
    showBackground = true,
    uiMode = UI_MODE_NIGHT_NO,
    showSystemUi = true,
)
@Composable
private fun PreviewDashboard() {
    ShafTheme(darkTheme = false) {
        Scaffold {
            HomePage(modifier = Modifier.padding(it))
        }
    }
}