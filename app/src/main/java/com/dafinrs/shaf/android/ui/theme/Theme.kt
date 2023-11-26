package com.dafinrs.shaf.android.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val DarkColorScheme = darkColorScheme(
    primary = ColorSchemeShaf.light.primary,
    onPrimary = ColorSchemeShaf.light.onPrimary,
    primaryContainer = ColorSchemeShaf.light.primaryContainer,
    secondary = ColorSchemeShaf.light.secondary,
    tertiary = ColorSchemeShaf.light.tertiary,
    surface = ColorSchemeShaf.light.surface,
    onSurface = ColorSchemeShaf.light.onSurface,
)

private val LightColorScheme = lightColorScheme(
    primary = ColorSchemeShaf.dark.primary,
    onPrimary = ColorSchemeShaf.dark.onPrimary,
    primaryContainer = ColorSchemeShaf.dark.primaryContainer,
    secondary = ColorSchemeShaf.dark.secondary,
    tertiary = ColorSchemeShaf.dark.tertiary,
    surface = ColorSchemeShaf.dark.surface,
    onSurface = ColorSchemeShaf.dark.onSurface,
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

    MaterialTheme(
        colorScheme = colorScheme,
        content = content,
    )
}