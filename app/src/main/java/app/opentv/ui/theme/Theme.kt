/*
 * This file is part of OpenTV.
 * Copyright (C) 2026 The OpenTV Contributors
 * Licensed under the GNU General Public License v3.0 or later.
 */
package app.opentv.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Typography
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

/*
 * DKALION — Interface TV / Mobile
 *
 * Palette :
 * - Noir profond pour le fond
 * - Bleu électrique pour l'action principale
 * - Bleu lumineux pour le focus Android TV
 * - Blanc et gris clair pour une excellente lisibilité
 */

// Couleurs principales
private val DkalionBlue = Color(0xFF1677FF)
private val DkalionBlueBright = Color(0xFF3D8BFF)
private val DkalionBlueDark = Color(0xFF0D47A1)

// Fonds
private val DkalionBlack = Color(0xFF050608)
private val DkalionSurface = Color(0xFF0B0E14)
private val DkalionSurfaceVariant = Color(0xFF141923)

// Textes
private val DkalionWhite = Color(0xFFF5F7FA)
private val DkalionGray = Color(0xFFB7BFCC)

// Bordures
private val DkalionOutline = Color(0xFF293241)

// Erreur
private val DkalionError = Color(0xFFFF5252)

private val DarkScheme = darkColorScheme(
    primary = DkalionBlue,
    onPrimary = Color.White,

    primaryContainer = DkalionBlueDark,
    onPrimaryContainer = Color(0xFFE4EEFF),

    secondary = DkalionBlueBright,
    onSecondary = Color.White,

    secondaryContainer = Color(0xFF12315E),
    onSecondaryContainer = Color(0xFFD8E7FF),

    background = DkalionBlack,
    onBackground = DkalionWhite,

    surface = DkalionSurface,
    onSurface = DkalionWhite,

    surfaceVariant = DkalionSurfaceVariant,
    onSurfaceVariant = DkalionGray,

    outline = DkalionOutline,

    error = DkalionError,
    onError = Color.White,
)

/*
 * Mode clair conservé pour les utilisateurs qui le sélectionnent
 * explicitement dans les paramètres.
 */
private val LightScheme = lightColorScheme(
    primary = Color(0xFF075FE8),
    onPrimary = Color.White,

    primaryContainer = Color(0xFFD9E7FF),
    onPrimaryContainer = Color(0xFF001A41),

    secondary = Color(0xFF2869C7),
    onSecondary = Color.White,

    background = Color(0xFFF7F9FC),
    onBackground = Color(0xFF10141B),

    surface = Color.White,
    onSurface = Color(0xFF10141B),

    surfaceVariant = Color(0xFFE9EDF4),
    onSurfaceVariant = Color(0xFF444B58),

    outline = Color(0xFFC4CBD6),

    error = Color(0xFFBA1A1A),
    onError = Color.White,
)

/*
 * Typographie adaptée à Android TV et aux téléphones.
 * Les titres sont légèrement plus grands pour une lecture à distance.
 */
private val OpenTvTypography = Typography(
    displayLarge = TextStyle(
        fontSize = 38.sp,
        fontWeight = FontWeight.Bold
    ),

    displayMedium = TextStyle(
        fontSize = 34.sp,
        fontWeight = FontWeight.Bold
    ),

    displaySmall = TextStyle(
        fontSize = 30.sp,
        fontWeight = FontWeight.SemiBold
    ),

    headlineLarge = TextStyle(
        fontSize = 28.sp,
        fontWeight = FontWeight.Bold
    ),

    headlineMedium = TextStyle(
        fontSize = 24.sp,
        fontWeight = FontWeight.SemiBold
    ),

    headlineSmall = TextStyle(
        fontSize = 21.sp,
        fontWeight = FontWeight.SemiBold
    ),

    titleLarge = TextStyle(
        fontSize = 20.sp,
        fontWeight = FontWeight.Medium
    ),

    titleMedium = TextStyle(
        fontSize = 17.sp,
        fontWeight = FontWeight.Medium
    ),

    titleSmall = TextStyle(
        fontSize = 15.sp,
        fontWeight = FontWeight.Medium
    ),

    bodyLarge = TextStyle(
        fontSize = 16.sp
    ),

    bodyMedium = TextStyle(
        fontSize = 14.sp
    ),

    bodySmall = TextStyle(
        fontSize = 12.sp
    ),

    labelLarge = TextStyle(
        fontSize = 14.sp,
        fontWeight = FontWeight.SemiBold
    ),

    labelMedium = TextStyle(
        fontSize = 13.sp,
        fontWeight = FontWeight.Medium
    ),

    labelSmall = TextStyle(
        fontSize = 11.sp,
        fontWeight = FontWeight.Medium
    )
)

@Composable
fun OpenTvTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit,
) {
    MaterialTheme(
        colorScheme = if (darkTheme) {
            DarkScheme
        } else {
            LightScheme
        },
        typography = OpenTvTypography,
        content = content,
    )
}
