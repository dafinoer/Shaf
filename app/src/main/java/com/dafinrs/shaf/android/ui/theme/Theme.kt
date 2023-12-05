package com.dafinrs.shaf.android.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

private val DarkColorScheme = darkColorScheme(
    primary = ColorSchemeShaf.dark.primary,
    onPrimary = ColorSchemeShaf.dark.onPrimary,
    primaryContainer = ColorSchemeShaf.dark.primaryContainer,
    secondary = ColorSchemeShaf.dark.secondary,
    tertiary = ColorSchemeShaf.dark.tertiary,
    surface = ColorSchemeShaf.dark.surface,
    onSurface = ColorSchemeShaf.dark.onSurface,
)

private val LightColorScheme = lightColorScheme(
    primary = ColorSchemeShaf.light.primary,
    onPrimary = ColorSchemeShaf.light.onPrimary,
    primaryContainer = ColorSchemeShaf.light.primaryContainer,
    secondary = ColorSchemeShaf.light.secondary,
    tertiary = ColorSchemeShaf.light.tertiary,
    surface = ColorSchemeShaf.light.surface,
    onSurface = ColorSchemeShaf.light.onSurface,
)

@Composable
fun ShafTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit,
) {
    val colorScheme = when {
        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    val colorGradient: List<Color> = when {
        darkTheme -> listOf(Color(0xff050D10), Color(0xff2D4625))
        else -> listOf(Color(0xffA9E5FF), Color(0xffF6FFD3))
    }

    CompositionLocalProvider(
        GradientCompose provides colorGradient
    ) {
        MaterialTheme(
            colorScheme = colorScheme,
            content = content,
        )
    }
}

val GradientCompose = staticCompositionLocalOf {
    listOf(Color(0xffA9E5FF), Color(0xffF6FFD3))
}