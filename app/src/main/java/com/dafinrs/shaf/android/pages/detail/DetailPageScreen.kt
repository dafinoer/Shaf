package com.dafinrs.shaf.android.pages.detail

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.DateRange
import androidx.compose.material.icons.outlined.Share
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.dafinrs.shaf.android.R
import com.dafinrs.shaf.android.pages.detail.components.DescriptionDetailComponent
import com.dafinrs.shaf.android.pages.detail.components.InfoDetailComponent
import com.dafinrs.shaf.android.pages.detail.components.SpeakerDetailComponent
import com.dafinrs.shaf.android.pages.detail.components.TargetAudienceDetailComponent
import com.dafinrs.shaf.android.pages.detail.components.TopAppBarDetail
import com.dafinrs.shaf.android.ui.theme.ShafTheme


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailScreenPage(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBarDetail(
                onBackNavigation = {
                    navController.popBackStack()
                },
            )
        },
        bottomBar = {
            BottomAppBar(containerColor = MaterialTheme.colorScheme.surfaceVariant) {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Outlined.Share,
                        contentDescription = stringResource(id = R.string.share),
                        tint = MaterialTheme.colorScheme.onSurface
                    )
                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Outlined.DateRange,
                        contentDescription = stringResource(id = R.string.share),
                        tint = MaterialTheme.colorScheme.onSurface
                    )
                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        painter = painterResource(id = R.drawable.round_bookmark_border_24),
                        contentDescription = stringResource(id = R.string.share),
                        tint = MaterialTheme.colorScheme.onSurface
                    )
                }
            }
        },
    ) {

        Box(
            modifier = Modifier
                .padding(it)
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
        ) {
            Column(
                verticalArrangement = Arrangement.Top,
                modifier = Modifier.fillMaxSize(),
            ) {
                InfoDetailComponent()
                DescriptionDetailComponent(detailDescription = "Lorem")
                Divider(color = MaterialTheme.colorScheme.outline)
                TargetAudienceDetailComponent()
                Divider(color = MaterialTheme.colorScheme.outline)
                SpeakerDetailComponent()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewDetailScreen() {
    ShafTheme {
        DetailScreenPage(navController = rememberNavController())
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewDetailDarkModeScreen() {
    ShafTheme(darkTheme = true) {
        DetailScreenPage(navController = rememberNavController())
    }
}