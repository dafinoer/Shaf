package com.dafinrs.shaf.android.pages.home.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.AssistChip
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dafinrs.shaf.android.R
import com.dafinrs.shaf.android.ui.theme.ShafTheme
import com.dafinrs.shaf.android.ui.theme.fontFamily


@Composable
fun TileComponent(fromTime: String, toTime: String) {
    Box(modifier = Modifier
        .fillMaxWidth()
        .clickable { }) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {
            Row(
                modifier = Modifier.padding(16.dp),
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.Top
            ) {
                val modiferWeight = Modifier.weight(1f)

                TimeSpotComponent(from = fromTime, to = toTime)
                ContentInfo(modifier = modiferWeight)
                TraillingContent {

                }
            }
            Divider()
        }
    }
}


@Composable
private fun TimeSpotComponent(from: String, to: String) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier.padding(horizontal = 18.dp)
    ) {
        Text(
            text = from,
            fontFamily = fontFamily,
            fontWeight = FontWeight.Normal,
            fontSize = 16.sp,
            color = MaterialTheme.colorScheme.onSurface
        )

        Divider(
            modifier = Modifier
                .padding(vertical = 8.dp)
                .width(8.dp)
                .rotate(90f),
            color = MaterialTheme.colorScheme.outline
        )

        Text(
            text = to,
            fontFamily = fontFamily,
            fontWeight = FontWeight.Normal,
            fontSize = 16.sp,
            color = MaterialTheme.colorScheme.onSurface
        )
    }
}

@Composable
private fun ContentInfo(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start
    ) {
        ChipItem(chipItems = listOf("lorem", "IP", "o")) {

        }
        ContentTitle("lorem ipsum dolor sitamet test i123")
        ProfileName("Dafinrs")
    }
}

@Composable
private fun ContentTitle(text: String) {
    Text(
        text = text,
        fontFamily = fontFamily,
        fontSize = 22.sp,
        maxLines = 2,
        overflow = TextOverflow.Ellipsis,
        style = TextStyle(fontWeight = FontWeight.W500)
    )
}

@Composable
private fun TraillingContent(isBookMark: Boolean = false, onTapAction: () -> Unit) {
    IconButton(onClick = onTapAction) {
        when (isBookMark) {
            true -> Icon(
                painter = painterResource(id = R.drawable.round_bookmark_24),
                contentDescription = "Bookmark",
            )

            else -> Icon(
                painter = painterResource(id = R.drawable.round_bookmark_border_24),
                contentDescription = "Bookmark"
            )
        }
    }
}


@OptIn(ExperimentalMaterial3Api::class, ExperimentalLayoutApi::class)
@Composable
private fun ChipItem(chipItems: List<String> = emptyList(), onTapChip: (String) -> Unit) {
    FlowRow(
        modifier = Modifier.absolutePadding(bottom = 0.dp),
        horizontalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        for (item in chipItems) {
            AssistChip(
                onClick = {
                    onTapChip(item)
                },

                label = {
                    Text(
                        text = item,
                        fontFamily = fontFamily,
                        color = MaterialTheme.colorScheme.onSurface,
                    )
                },
            )
        }
    }
}


@Composable
private fun ProfileName(name: String) {
    Text(
        text = name,
        fontFamily = fontFamily,
        fontStyle = FontStyle.Normal,
        fontSize = 14.sp,
    )
}


@Preview()
@Composable
private fun TileComponentPreview() {
    ShafTheme {
        Box(modifier = Modifier.fillMaxSize()) {
            TileComponent(
                fromTime = "12:00", toTime = "13:00"
            )
        }
    }
}