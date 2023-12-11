package com.dafinrs.shaf.android.pages.home.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun ContentComponent(modifier: Modifier = Modifier, navController: NavController) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .fillMaxHeight(0.75f)
            .clip(RoundedCornerShape(topStart = 40.dp, topEnd = 40.dp))
            .background(MaterialTheme.colorScheme.surface),
        contentAlignment = Alignment.BottomCenter
    ) {
        LazyColumn(verticalArrangement = Arrangement.Top, modifier = Modifier.fillMaxSize()) {
            item {
                TabBarComponent()
            }

            item {
                TileComponent(fromTime = "12:00", toTime = "13:00") {
                    navController.navigate("detail/1")
                }
            }

            item {
                TileComponent(fromTime = "12:00", toTime = "13:00") {
                    navController.navigate("detail/1")
                }
            }

            item {
                TileComponent(fromTime = "12:00", toTime = "13:00") {
                    navController.navigate("detail/1")
                }
            }

            item {
                TileComponent(fromTime = "12:00", toTime = "13:00"){
                    navController.navigate("detail/1")
                }
            }
            item {
                TileComponent(fromTime = "12:00", toTime = "13:00"){
                    navController.navigate("detail/1")
                }
            }
            item {
                TileComponent(fromTime = "12:00", toTime = "13:00"){
                    navController.navigate("detail/1")
                }
            }
        }
    }
}