package com.android.testcomposeapp.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.android.mujaz.ui.theme.colors.mujazColor
import com.android.testcomposeapp.ui.theme.styles.textStyleRegular12

@Composable
fun RoundedBackgroundComponent(
    text: String,
    color: Color,
    modifier: Modifier = Modifier,
    style: TextStyle = textStyleRegular12(),
    textColor: Color = MaterialTheme.mujazColor.textColor1
) {
    Text(
        text = text,
        style = style.copy(color = textColor),
        modifier = modifier
            .background(
                color,
                shape = RoundedCornerShape(5.dp)
            )
            .padding(horizontal = 5.dp, vertical = 2.dp)
    )
}
