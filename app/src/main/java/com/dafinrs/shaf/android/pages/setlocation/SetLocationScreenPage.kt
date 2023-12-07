package com.dafinrs.shaf.android.pages.setlocation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.rounded.ArrowForward
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavController
import com.dafinrs.shaf.android.R


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SetLocationScreenPage(navController: NavController) {
    Scaffold(topBar = {
        TopAppBar(
            navigationIcon = {
                IconButton(onClick = {
                    navController.popBackStack()
                }) {
                    Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "Back")
                }
            },
            title = {
                Text(text = stringResource(id = R.string.set_location))
            },
        )
    }) {
        Box(modifier = Modifier.padding(it)) {
            Column(verticalArrangement = Arrangement.Top) {
                TextField(
                    value = "",
                    onValueChange = {

                    },
                )
                TextField(
                    value = "", enabled = false,
                    onValueChange = {

                    },
                    readOnly = true,
                    trailingIcon = {
                        IconButton(onClick = { navController.navigate("locations") }) {
                            Icon(
                                imageVector = Icons.Rounded.ArrowForward,
                                contentDescription = stringResource(
                                    id = R.string.change_location
                                )
                            )
                        }
                    },
                )

                ElevatedButton(onClick = { /*TODO*/ }) {
                    Text(text = stringResource(id = R.string.change_location))
                }
            }
        }
    }
}