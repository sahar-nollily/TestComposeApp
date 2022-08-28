package com.android.mujaz.ui.theme.colors

import androidx.compose.ui.graphics.Color

fun lightColor(
    // background
    backgroundColor1: Color = Color(0xFFF8F8F8),
    backgroundColor2: Color = Color(0xFFFFFFFF),
    // app bar color
    barColor: Color = Color(0xFF525252),
    //shadow color
    shadowColor: Color = Color(0x88D1D1D1),
    // identity
    identity: Color = Color(0xFF5A4EB7),
    // text
    textColor1: Color = Color(0xFF3C3C3C),
    textColor2: Color = Color(0xFF707070),
    textColor3: Color = Color(0xFF989898),
    textColor4: Color = Color(0xFFFFFFFF),
    textColor6: Color = Color(0xFF0A84FF),
    // buttons
    buttonColor1: Color = Color(0xFF5A4EB7),
    buttonColor2: Color = Color(0xFFE8BA30),
    buttonColor3: Color = Color(0xFF00A39E),
    // text button
    textButtonColor1: Color = Color(0xFFFFFFFF),
    textButtonColor2: Color = Color(0xFFFFFFFF),
    textButtonColor3: Color = Color(0xFFFFFFFF),
    // labels types color
    categoryBackground: Color = Color(0xFFE2E0F3),
    categoryText: Color = Color(0xFF5A4EB7),
    secretBackgroundColor: Color = Color(0xFFFCF0E0),
    secretTextColor: Color = Color(0xFFEF8E0C),
    topSecretBackgroundColor: Color = Color(0xFFFAEDEA),
    topSecretTextColor: Color = Color(0xFFD9593A),
    normalBackground: Color = Color(0xFFE7EFFA),
    normalText: Color = Color(0xFF2868CF),
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
