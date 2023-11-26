package com.dafinrs.shaf.android.ui.theme

import androidx.compose.ui.graphics.Color

data class ColorSchemeShaf(
    val primary: Color,
    val onPrimary: Color,
    val primaryContainer: Color,
    val onPrimaryContainer: Color,
    val secondary: Color,
    val onSecondary: Color,
    val secondaryContainer: Color,
    val onSecondaryContainer: Color,
    val tertiary: Color,
    val onTertiary: Color,
    val tertiaryContainer: Color,
    val onTertiaryContainer: Color,
    val surface: Color,
    val onSurface: Color,
    val surfaceVariant: Color,
    val onSurfaceVariant: Color,
    val outline: Color,
    val outlineVariant: Color,
) {
    companion object {
        val light = ColorSchemeShaf(
            primary = Color(0xff006C50),
            onPrimary = Color.White,
            primaryContainer = Color(0xff7FF9CB),
            onPrimaryContainer = Color(0xff002116),
            secondary = Color(0xff4C6359),
            onSecondary = Color.White,
            secondaryContainer = Color(0xffCEE9DB),
            onSecondaryContainer = Color(0xff092017),
            tertiary = Color(0xff3F6375),
            onTertiary = Color.White,
            tertiaryContainer = Color(0xffC2E8FD),
            onTertiaryContainer = Color(0xff001F2A),
            surface = Color(0xffF8FAF6),
            onSurface = Color(0xff191C1A),
            surfaceVariant = Color(0xffDBE5DE),
            onSurfaceVariant = Color(0xff404944),
            outline = Color(0xff707974),
            outlineVariant = Color(0xffBFC9C2)
        )
        val dark = ColorSchemeShaf(
            primary = Color(0xff61DCB0),
            onPrimary = Color(0xff003828),
            primaryContainer = Color(0xff00513C),
            onPrimaryContainer = Color(0xff7FF9CB),
            secondary = Color(0xffB3CCBF),
            onSecondary = Color(0xff1E352C),
            secondaryContainer = Color(0xff354B41),
            onSecondaryContainer = Color(0xffCEE9DB),
            tertiary = Color(0xffA6CCE0),
            onTertiary = Color(0xff0A3545),
            tertiaryContainer = Color(0xff264B5C),
            onTertiaryContainer = Color(0xffC2E8FD),
            surface = Color(0xff111412),
            onSurface = Color(0xffC5C7C4),
            surfaceVariant = Color(0xff404944),
            onSurfaceVariant = Color(0xffBFC9C2),
            outline = Color(0xff89938D),
            outlineVariant = Color(0xff404944),
        )
    }
}
