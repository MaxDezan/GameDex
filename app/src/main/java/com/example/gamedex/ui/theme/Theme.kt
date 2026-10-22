package com.example.gamedex.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorScheme = darkColorScheme(
    primary = Purple,
    onPrimary = SlateBlack,
    primaryContainer = DarkPurple,
    onPrimaryContainer = Color.White,
    secondary = NeonMagenta,
    onSecondary = Color.White,
    secondaryContainer = Color(0xFF4A1030),
    onSecondaryContainer = Color(0xFFFFD9E6),
    tertiary = NeonAmber,
    onTertiary = SlateBlack,
    background = SlateBlack,
    onBackground = SlateOnSurface,
    surface = SlateBlack,
    onSurface = SlateOnSurface,
    surfaceVariant = SlateSurfaceVariant,
    onSurfaceVariant = SlateOnSurfaceVariant,
    surfaceContainerLowest = SlateBlack,
    surfaceContainerLow = SlateSurface,
    surfaceContainer = SlateSurface,
    surfaceContainerHigh = SlateSurfaceVariant,
    surfaceContainerHighest = SlateSurfaceVariant,
    outline = SlateOutline,
    outlineVariant = SlateSurfaceVariant
)

private val LightColorScheme = lightColorScheme(
    primary = DarkPurple,
    onPrimary = Color.White,
    primaryContainer = Color(0xFFB2F5FF),
    onPrimaryContainer = Color(0xFF002024),
    secondary = NeonMagentaDark,
    onSecondary = Color.White,
    secondaryContainer = Color(0xFFFFD9E6),
    onSecondaryContainer = Color(0xFF3E0021),
    tertiary = NeonAmberDark,
    onTertiary = Color.White,
    background = CloudWhite,
    onBackground = InkOnSurface,
    surface = CloudWhite,
    onSurface = InkOnSurface,
    surfaceVariant = CloudSurfaceVariant,
    onSurfaceVariant = InkOnSurfaceVariant,
    surfaceContainerLowest = CloudSurface,
    surfaceContainerLow = CloudSurface,
    surfaceContainer = CloudSurface,
    surfaceContainerHigh = CloudSurfaceVariant,
    surfaceContainerHighest = CloudSurfaceVariant,
    outline = CloudOutline,
    outlineVariant = CloudSurfaceVariant
)

@Composable
fun GameDexTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}