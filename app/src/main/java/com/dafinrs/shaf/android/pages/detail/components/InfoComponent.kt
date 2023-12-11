package com.dafinrs.shaf.android.pages.detail.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.LocationOn
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dafinrs.shaf.android.R
import com.dafinrs.shaf.android.ui.theme.ShafTheme
import com.dafinrs.shaf.android.ui.theme.fontFamily


@Composable
fun InfoDetailComponent() {
    Surface(
        modifier = Modifier
            .padding(vertical = 22.dp, horizontal = 16.dp)
            .fillMaxWidth(),
        color = MaterialTheme.colorScheme.surface,
        shape = RoundedCornerShape(12.dp)
    ) {
        Column(
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.Top,
        ) {
            ItemInfo(
                title = stringResource(id = R.string.date),
                subTitle = "",
                modifier = Modifier
                    .fillMaxWidth()
                    .absolutePadding(top = 24.dp, left = 16.dp, right = 16.dp)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.outline_schedule_24),
                    contentDescription = stringResource(id = R.string.schedule),
                    tint = MaterialTheme.colorScheme.onSurface
                )
            }
            ItemInfo(
                title = stringResource(id = R.string.location),
                subTitle = "",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                Icon(
                    imageVector = Icons.Outlined.LocationOn,
                    contentDescription = stringResource(id = R.string.location),
                    tint = MaterialTheme.colorScheme.onSurface
                )
            }
            ItemInfo(
                title = stringResource(id = R.string.category),
                subTitle = "",
                modifier = Modifier
                    .fillMaxWidth()
                    .absolutePadding(bottom = 24.dp, left = 16.dp, right = 16.dp)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.outline_category_24),
                    contentDescription = stringResource(id = R.string.schedule),
                    tint = MaterialTheme.colorScheme.onSurface
                )
            }
        }
    }
}


@Composable
private fun ItemInfo(
    modifier: Modifier = Modifier,
    title: String, subTitle: String,
    icon: @Composable () -> Unit,
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start,
        modifier = modifier
    ) {
        icon()
        Text(
            text = title,
            fontFamily = fontFamily,
            fontWeight = FontWeight.Bold,
            fontSize = 14.sp,
            modifier = Modifier.padding(horizontal = 12.dp)
        )

        Text(
            text = subTitle,
            fontFamily = fontFamily,
            fontSize = 14.sp,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            lineHeight = 20.sp
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewItemInfo() {
    ShafTheme {
        ItemInfo(
            icon = {
                Icon(
                    painter = painterResource(id = R.drawable.outline_category_24),
                    contentDescription = stringResource(id = R.string.schedule),
                    tint = MaterialTheme.colorScheme.onSurface
                )
            },
            title = stringResource(id = R.string.category), subTitle = "",
        )
    }
}