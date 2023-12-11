package com.dafinrs.shaf.android.pages.home

import android.content.res.Configuration.UI_MODE_NIGHT_NO
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.dafinrs.shaf.android.pages.home.components.ContentComponent
import com.dafinrs.shaf.android.pages.home.components.HeaderDashboardComponent
import com.dafinrs.shaf.android.ui.theme.ShafTheme


@Composable
fun HomePage(navController: NavController) {
    Box {
        HeaderDashboardComponent(
            onTapSearch = {
                navController.navigate("locations")
            },
            onTapLocation = {
                navController.navigate("setLocation")
            },
        )
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.BottomCenter,
        ) {
            ContentComponent(navController = navController)
        }
    }
}

@Preview(
    showBackground = true,
    uiMode = UI_MODE_NIGHT_NO,
    showSystemUi = true,
)
@Composable
private fun PreviewDashboard() {
    ShafTheme(darkTheme = false) {
        HomePage(navController = rememberNavController())
    }
}