package com.dafinrs.shaf.android.pages.detail.components

import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LargeTopAppBar
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dafinrs.shaf.android.R
import com.dafinrs.shaf.android.ui.theme.fontFamily


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBarDetail(onBackNavigation: () -> Unit) {
    val scrollBehavior =
        TopAppBarDefaults.exitUntilCollapsedScrollBehavior(rememberTopAppBarState())
    LargeTopAppBar(
        title = {
            Text(
                modifier = Modifier.absolutePadding(right = 16.dp),
                text = "Lorem Ipsum jsd fk sdfka k ahsdf a ska dfa fashdfak fkas dfah",
                fontFamily = fontFamily,
                fontSize = 28.sp,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis
            )
        },
        navigationIcon = {
            IconButton(
                onClick = {
                    onBackNavigation()
                },
            ) {
                Icon(
                    imageVector = Icons.Rounded.ArrowBack,
                    contentDescription = stringResource(id = R.string.back_navigation)
                )
            }
        },
        scrollBehavior = scrollBehavior,
    )
}