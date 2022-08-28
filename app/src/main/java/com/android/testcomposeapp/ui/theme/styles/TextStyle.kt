package com.android.testcomposeapp.ui.theme.styles

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import com.android.mujaz.ui.theme.colors.mujazColor
import com.android.testcomposeapp.ui.theme.ShadowColor


@Composable
fun textStyleRegular12(
    fontFamily: FontFamily = FontFamily.Default,
    fontWeight: FontWeight = FontWeight.Normal,
    fontSize: TextUnit = 12.sp,
    shadow: Shadow = Shadow(ShadowColor, blurRadius = 5f),
    color: Color = MaterialTheme.mujazColor.textColor1
) = TextStyle(
    fontFamily = fontFamily,
    fontWeight = fontWeight,
    fontSize = fontSize,
    shadow = shadow,
    color = color
)

@Composable
fun textStyleRegular14(
    fontFamily: FontFamily = FontFamily.Default,
    fontWeight: FontWeight = FontWeight.Normal,
    fontSize: TextUnit = 14.sp,
    shadow: Shadow = Shadow(ShadowColor, blurRadius = 5f),
    color: Color = MaterialTheme.mujazColor.textColor1
) = TextStyle(
    fontFamily = fontFamily,
    fontWeight = fontWeight,
    fontSize = fontSize,
    shadow = shadow,
    color = color
)


@Composable
fun textStyleRegular16(
    fontFamily: FontFamily = FontFamily.Default,
    fontWeight: FontWeight = FontWeight.Normal,
    fontSize: TextUnit = 16.sp,
    shadow: Shadow = Shadow(ShadowColor, blurRadius = 5f),
    color: Color = MaterialTheme.mujazColor.textColor1
) = TextStyle(
    fontFamily = fontFamily,
    fontWeight = fontWeight,
    fontSize = fontSize,
    shadow = shadow,
    color = color
)

@Composable
fun textStyleBold12(
    fontFamily: FontFamily = FontFamily.Default,
    fontWeight: FontWeight = FontWeight.Bold,
    fontSize: TextUnit = 12.sp,
    shadow: Shadow = Shadow(ShadowColor, blurRadius = 5f),
    color: Color = MaterialTheme.mujazColor.textColor1
) = TextStyle(
    fontFamily = fontFamily,
    fontWeight = fontWeight,
    fontSize = fontSize,
    shadow = shadow,
    color = color
)

@Composable
fun textStyleBold14(
    fontFamily: FontFamily = FontFamily.Default,
    fontWeight: FontWeight = FontWeight.Bold,
    fontSize: TextUnit = 14.sp,
    shadow: Shadow = Shadow(ShadowColor, blurRadius = 5f),
    color: Color = MaterialTheme.mujazColor.textColor1
) = TextStyle(
    fontFamily = fontFamily,
    fontWeight = fontWeight,
    fontSize = fontSize,
    shadow = shadow,
    color = color
)


@Composable
fun textStyleBold16(
    fontFamily: FontFamily = FontFamily.Default,
    fontWeight: FontWeight = FontWeight.Bold,
    fontSize: TextUnit = 16.sp,
    shadow: Shadow = Shadow(ShadowColor, blurRadius = 5f),
    color: Color = MaterialTheme.mujazColor.textColor1
) = TextStyle(
    fontFamily = fontFamily,
    fontWeight = fontWeight,
    fontSize = fontSize,
    shadow = shadow,
    color = color
)
