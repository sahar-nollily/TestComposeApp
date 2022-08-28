package com.android.mujaz.ui.theme.colors

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Color

data class MujazColor(
    // background
    val backgroundColor1: Color = Color(0xFFF8F8F8),
    val backgroundColor2: Color = Color(0xFFFFFFFF),
    // app bar color
    val barColor: Color = Color(0xFF525252),
    //shadow color
    val shadowColor: Color = Color(0x88D1D1D1),
    // identity
    val identity: Color = Color(0xFF5A4EB7),
    // text
    val textColor1: Color = Color(0xFF3C3C3C),
    val textColor2: Color = Color(0xFF707070),
    val textColor3: Color = Color(0xFF989898),
    val textColor4: Color = Color(0xFFFFFFFF),
    val textColor6: Color = Color(0xFF0A84FF),
    // buttons
    val buttonColor1: Color = Color(0xFF5A4EB7),
    val buttonColor2: Color = Color(0xFFE8BA30),
    val buttonColor3: Color = Color(0xFF00A39E),
    // text button
    val textButtonColor1: Color = Color(0xFFFFFFFF),
    val textButtonColor2: Color = Color(0xFFFFFFFF),
    val textButtonColor3: Color = Color(0xFFFFFFFF),
    // labels types color
    val categoryBackground: Color = Color(0xFFE2E0F3),
    val categoryText: Color = Color(0xFF5A4EB7),
    val secretBackgroundColor: Color = Color(0xFFFCF0E0),
    val secretTextColor: Color = Color(0xFFEF8E0C),
    val topSecretBackgroundColor: Color = Color(0xFFFAEDEA),
    val topSecretTextColor: Color = Color(0xFFD9593A),
    val normalBackground: Color = Color(0xFFE7EFFA),
    val normalText: Color = Color(0xFF2868CF),
    )

val LocalMujazColor = compositionLocalOf { MujazColor() }

val MaterialTheme.mujazColor: MujazColor
    @Composable
    @ReadOnlyComposable
    get() = LocalMujazColor.current