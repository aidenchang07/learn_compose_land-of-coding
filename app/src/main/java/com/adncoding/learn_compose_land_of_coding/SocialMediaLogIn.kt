package com.adncoding.learn_compose_land_of_coding

import androidx.annotation.DrawableRes
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.adncoding.learn_compose_land_of_coding.ui.theme.BlueGray
import com.adncoding.learn_compose_land_of_coding.ui.theme.LightBlueWhite

/**
 * Created by AidenChang 2023/09/26
 */

@Composable
fun SocialMediaLogIn(
    modifier: Modifier = Modifier,
    @DrawableRes icon: Int,
    text: String,
    onClick: () -> Unit
) {
    Row (
        modifier = Modifier
            .clip(RoundedCornerShape(4.dp))
            .socialMedia()
            .clickable { onClick() }
            .height(40.dp)
    ) {

    }
}

fun Modifier.socialMedia() : Modifier = composed {
    if (isSystemInDarkTheme()) {
        background(Color.Transparent).border(
            width = 1.dp,
            color = BlueGray,
            shape = RoundedCornerShape(4.dp)
        )
    } else {
        background(LightBlueWhite)
    }
}