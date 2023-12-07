package com.dafinrs.shaf.android.pages.locations

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowBack
import androidx.compose.material.icons.rounded.Clear
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.dafinrs.shaf.android.ui.theme.fontFamily


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchLocationScreenPage(
    navController: NavController
) {
    var rememberTextSearchLocation: String by remember {
        mutableStateOf("")
    }

    Scaffold(topBar = {
        TopAppBar(
            navigationIcon = {
                IconButton(onClick = { navController.popBackStack() }) {
                    Icon(imageVector = Icons.Rounded.ArrowBack, contentDescription = "Bzck")
                }
            },
            title = {
                TextField(
                    value = rememberTextSearchLocation,
                    onValueChange = {
                        rememberTextSearchLocation = it
                    },
                    singleLine = true,
                    maxLines = 1,
                    placeholder = {
                        Text(text = "Input Search", fontFamily = fontFamily)
                    },
                    colors = TextFieldDefaults.textFieldColors(
                        containerColor = MaterialTheme.colorScheme.surface,
                        focusedTrailingIconColor = MaterialTheme.colorScheme.onSurface,
                        unfocusedTrailingIconColor = MaterialTheme.colorScheme.onSurface,
                        focusedIndicatorColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.Transparent,
                        placeholderColor = MaterialTheme.colorScheme.onSurface
                    ),
                )
            },
            actions = {
                IconButton(onClick = { rememberTextSearchLocation = "" }) {
                    Icon(imageVector = Icons.Rounded.Clear, contentDescription = "Clear")
                }
            }
        )
    }) {
        Column(modifier = Modifier.padding(it)) {

        }
    }
}