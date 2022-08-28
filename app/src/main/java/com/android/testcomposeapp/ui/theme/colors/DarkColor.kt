package com.android.mujaz.ui.theme.colors

import androidx.compose.ui.graphics.Color

fun darkColor(
    // background
    backgroundColor1: Color = Color(0xFF0A0A0A),
    backgroundColor2: Color = Color(0xFF1F1F1F),
    // app bar color
    barColor: Color = Color(0xFF525252),
    //shadow color
    shadowColor: Color = Color(0x85D1D1D1),
    // identity
    identity: Color = Color(0xFF7A66F8),
    // text
    textColor1: Color = Color(0xFFFFFFFF),
    textColor2: Color = Color(0xFFDEDEDE),
    textColor3: Color = Color(0xFF989898),
    textColor4: Color = Color(0xFFFFFFFF),
    textColor6: Color = Color(0xFF0A84FF),
    // buttons
    buttonColor1: Color = Color(0xFF7A66F8),
    buttonColor2: Color = Color(0xFFD6B34A),
    buttonColor3: Color = Color(0xFF16BFBA),
    // text button
    textButtonColor1: Color = Color(0xFFFFFFFF),
    textButtonColor2: Color = Color(0xFFFFFFFF),
    textButtonColor3: Color = Color(0xFFFFFFFF),
    // labels types color
    categoryBackground: Color = Color(0xFF7A66F8),
    categoryText: Color = Color(0xFFFFFFFF),
    secretBackgroundColor: Color = Color(0xFFD6800A),
    secretTextColor: Color = Color(0xFFFFFFFF),
    topSecretBackgroundColor: Color = Color(0xFFD54416),
    topSecretTextColor: Color = Color(0xFFFFFFFF),
    normalBackground: Color = Color(0xFF3589EC),
    normalText: Color = Color(0xFFFFFFFF),
): MujazColor = MujazColor(
    backgroundColor1 = backgroundColor1,
    backgroundColor2 = backgroundColor2,
    barColor = barColor,
    shadowColor = shadowColor,
    identity = identity,
    textColor1 = textColor1,
    textColor2 = textColor2,
    textColor3 = textColor3,
    textColor4 = textColor4,
    textColor6 = textColor6,
    buttonColor1 = buttonColor1,
    buttonColor2 = buttonColor2,
    buttonColor3 = buttonColor3,
    textButtonColor1 = textButtonColor1,
    textButtonColor2 = textButtonColor2,
    textButtonColor3 = textButtonColor3,
    categoryBackground = categoryBackground,
    categoryText = categoryText,
    secretBackgroundColor = secretBackgroundColor,
    secretTextColor = secretTextColor,
    topSecretBackgroundColor = topSecretBackgroundColor,
    topSecretTextColor = topSecretTextColor,
    normalBackground = normalBackground,
    normalText = normalText,
)
