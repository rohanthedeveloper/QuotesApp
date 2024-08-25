package com.example.quotesapp.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.quotesapp.R
import androidx.compose.ui.text.googlefonts.GoogleFont
import androidx.compose.ui.text.googlefonts.Font

val AbrilFatface = FontFamily(
    Font(R.font.abrilfatface_regular)
)

val Montserrat = FontFamily(
    Font(R.font.montserrat_bold),
    Font(R.font.montserrat_regular),
    Font(R.font.montserrat_semibold)
)

val Poppins = FontFamily(
    Font(R.font.poppins_bold),
    Font(R.font.poppins_regular),
    Font(R.font.poppins_semibold)
)

val Roboto = FontFamily(
    Font(R.font.roboto_regular),
    Font(R.font.roboto_bold)
)
val Lato = FontFamily(
    Font(R.font.lato_regular),
    Font(R.font.lato_bold)
)
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ) ,
    displayLarge = TextStyle(
        fontFamily = AbrilFatface,
        fontWeight = FontWeight.Normal,
        fontSize = 36.sp
    ),
    displayMedium = TextStyle(
        fontFamily = Montserrat,
        fontWeight = FontWeight.Bold,
        fontSize = 24.sp
    ),
    labelSmall = TextStyle(
        fontFamily = Montserrat,
        fontWeight = FontWeight.Bold,
        fontSize = 32.sp
    ),
    bodyMedium = TextStyle(
        fontFamily = Poppins,
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp
    ),



)