package com.dafinrs.shaf.android.pages.detail.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dafinrs.shaf.android.R
import com.dafinrs.shaf.android.components.HeadlineLargeTitle
import com.dafinrs.shaf.android.ui.theme.fontFamily


@Composable
fun TargetAudienceDetailComponent(targetAudience: String = stringResource(id = R.string.unknow_detail)) {
    Column(
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .absolutePadding(left = 16.dp, right = 16.dp, bottom = 16.dp)
            .fillMaxWidth()
    ) {
        HeadlineLargeTitle(
            title = stringResource(id = R.string.target_audience),
            modifier = Modifier.absolutePadding(
                top = 24.dp,
                bottom = 16.dp,
            ),
        )

        Text(
            text = targetAudience,
            fontFamily = fontFamily,
            fontSize = 16.sp,
            color = MaterialTheme.colorScheme.onSurface
        )
    }
}