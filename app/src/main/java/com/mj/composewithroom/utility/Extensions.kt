package com.mj.composewithroom.utility


import android.graphics.DashPathEffect
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Paint
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.drawscope.drawIntoCanvas
import androidx.compose.ui.graphics.nativeCanvas
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

class Extensions {
}

fun Modifier.squareBorder(
    color: Color = Color.LightGray,
    strokeWidth: Dp = 1.dp
): Modifier = this.then(
    Modifier.border(
        width = strokeWidth,
        color = color,
        shape = RectangleShape
    ).padding(vertical = 8.dp)
)