package com.dafinrs.shaf.android.pages.dashboard

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.dafinrs.shaf.android.pages.home.HomePage


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DashboardScreenPage() {
    Scaffold {
        Box(modifier = Modifier.padding(it)) {
            Column {
                HomePage()
            }
        }
    }
}