package com.dafinrs.shaf.android.pages.detail.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.dafinrs.shaf.android.R
import com.dafinrs.shaf.android.components.HeadlineLargeTitle
import com.dafinrs.shaf.android.ui.theme.ShafTheme
import com.dafinrs.shaf.android.ui.theme.fontFamily


@Composable
fun SpeakerDetailComponent(nameSpeaker: String = stringResource(id = R.string.unknow_speaker)) {
    Column(
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .fillMaxWidth()
            .absolutePadding(
                left = 16.dp, right = 16.dp, top = 24.dp
            )
    ) {
        HeadlineLargeTitle(
            title = stringResource(id = R.string.speaker),
            modifier = Modifier.absolutePadding(
                bottom = 16.dp
            ),
        )
        SpeakerProfile(
            speakerName = nameSpeaker
        )
    }
}

@Composable
private fun SpeakerProfile(urlImageProfile: String? = null, speakerName: String? = null) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start,
        modifier = Modifier.fillMaxWidth()
    ) {
        Box(
            modifier = Modifier
                .absolutePadding(right = 23.dp)
                .size(60.dp)
                .border(
                    1.dp,
                    color = MaterialTheme.colorScheme.outline,
                    shape = RoundedCornerShape(12.dp)
                )
        ) {
            if (!urlImageProfile.isNullOrBlank()) {
                AsyncImage(
                    model = urlImageProfile,
                    contentDescription = stringResource(id = R.string.speaker_profile),
                    placeholder = painterResource(id = R.drawable.outline_person_24),
                    error = painterResource(id = R.drawable.outline_person_24),
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxSize()
                )
            } else {
                Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                    Icon(
                        imageVector = Icons.Outlined.Person,
                        contentDescription = stringResource(id = R.string.speaker_profile),
                        modifier = Modifier.height(42.dp)
                    )
                }
            }
        }

        if (!speakerName.isNullOrBlank()) {
            Text(
                text = speakerName,
                fontFamily = fontFamily,
                color = MaterialTheme.colorScheme.onSurface,
                fontSize = 16.sp,
                overflow = TextOverflow.Ellipsis
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
private fun SpeakerDetailComponent() {
    ShafTheme {
        SpeakerDetailComponent(nameSpeaker = "Fulan")
    }
}