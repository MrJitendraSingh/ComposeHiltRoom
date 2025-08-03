package com.mj.composewithroom.ui.theme

import androidx.compose.material3.MaterialTheme
import com.mj.composewithroom.R
import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )
    /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
    */
)

val SatoshiFontFamily = FontFamily(
    Font(R.font.satoshi_light, FontWeight.Light),
    Font(R.font.satoshi_light_italic, FontWeight.Light, FontStyle.Italic),
    Font(R.font.satoshi_regular, FontWeight.Normal),
    Font(R.font.satoshi_italic, FontWeight.Normal, FontStyle.Italic),
    Font(R.font.satoshi_medium, FontWeight.Medium),
    Font(R.font.satoshi_medium_italic, FontWeight.Medium, FontStyle.Italic),
    Font(R.font.satoshi_bold, FontWeight.Bold),
    Font(R.font.satoshi_bold_italic, FontWeight.Bold, FontStyle.Italic),
    Font(R.font.satoshi_black, FontWeight.Black),
    Font(R.font.satoshi_black_italic, FontWeight.Black, FontStyle.Italic)
)

val SatoshiTypography = Typography(
    displayLarge = TextStyle(
        fontFamily = SatoshiFontFamily,
        fontWeight = FontWeight.Black,
        fontSize = 57.sp
    ),
    displayMedium = TextStyle(
        fontFamily = SatoshiFontFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 45.sp
    ),
    displaySmall = TextStyle(
        fontFamily = SatoshiFontFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 36.sp
    ),
    headlineLarge = TextStyle(
        fontFamily = SatoshiFontFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 32.sp
    ),
    headlineMedium = TextStyle(
        fontFamily = SatoshiFontFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 28.sp
    ),
    headlineSmall = TextStyle(
        fontFamily = SatoshiFontFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 24.sp
    ),
    titleLarge = TextStyle(
        fontFamily = SatoshiFontFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 22.sp,
    ),
    titleMedium = TextStyle(
        fontFamily = SatoshiFontFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 16.sp
    ),
    titleSmall = TextStyle(
        fontFamily = SatoshiFontFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 14.sp
    ),
    bodyLarge = TextStyle(
        fontFamily = SatoshiFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
    bodyMedium = TextStyle(
        fontFamily = SatoshiFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp
    ),
    bodySmall = TextStyle(
        fontFamily = SatoshiFontFamily,
        fontWeight = FontWeight.Light,
        fontSize = 12.sp
    ),
    labelLarge = TextStyle(
        fontFamily = SatoshiFontFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 14.sp
    ),
    labelMedium = TextStyle(
        fontFamily = SatoshiFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    ),
    labelSmall = TextStyle(
        fontFamily = SatoshiFontFamily,
        fontWeight = FontWeight.Light,
        fontSize = 10.sp
    )
)
