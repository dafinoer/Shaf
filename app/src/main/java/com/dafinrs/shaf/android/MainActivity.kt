package com.dafinrs.shaf.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.SystemBarStyle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.DisposableEffect
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.dafinrs.shaf.android.pages.dashboard.DashboardScreenPage
import com.dafinrs.shaf.android.pages.detail.DetailScreenPage
import com.dafinrs.shaf.android.pages.locations.SearchLocationScreenPage
import com.dafinrs.shaf.android.pages.setlocation.SetLocationScreenPage
import com.dafinrs.shaf.android.ui.theme.ShafTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            val rememberNavController = rememberNavController()
            val darkState = isSystemInDarkTheme()

            DisposableEffect(key1 = darkState) {
                enableEdgeToEdge(
                    statusBarStyle = SystemBarStyle.auto(
                        lightScrim = android.graphics.Color.TRANSPARENT,
                        darkScrim = android.graphics.Color.TRANSPARENT,
                    ) { darkState },
                    navigationBarStyle = SystemBarStyle.auto(
                        lightScrim = android.graphics.Color.TRANSPARENT,
                        darkScrim = android.graphics.Color.TRANSPARENT,
                    ) {
                        darkState
                    },
                )

                onDispose { }
            }

            ShafTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background,
                ) {
                    NavHost(navController = rememberNavController, startDestination = "dashboard") {
                        composable("dashboard") {
                            DashboardScreenPage(rememberNavController)
                        }
                        composable("detail/{id}") {
                            DetailScreenPage()
                        }
                        composable("setLocation") {
                            SetLocationScreenPage(rememberNavController)
                        }
                        composable("locations") {
                            SearchLocationScreenPage(rememberNavController)
                        }
                    }
                }
            }
        }
    }
}