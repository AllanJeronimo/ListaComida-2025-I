    package com.example.listacomida_2025_i.ui.theme

    import androidx.compose.material3.Typography
    import androidx.compose.ui.text.TextStyle
    import androidx.compose.ui.text.font.Font
    import androidx.compose.ui.text.font.FontFamily
    import androidx.compose.ui.text.font.FontWeight
    import androidx.compose.ui.unit.sp
    import com.example.listacomida_2025_i.R

    val AbrilFatFace = FontFamily(
        Font(R.font.abrilfatface_regular)
    )
    val Montserrat = FontFamily(
        Font(R.font.montserrat_extrabolditalic, FontWeight.ExtraBold),
        Font(R.font.montserrat_thinitalic, FontWeight.Thin)
    )
    val Typography = Typography(
        displayLarge = TextStyle(
            fontFamily = AbrilFatFace,
            fontWeight = FontWeight.Normal,
            fontSize = 30.sp
        ),

        labelSmall = TextStyle(
            fontFamily = Montserrat,
            fontWeight = FontWeight.Thin,
            fontSize = 25.sp
        ),
        bodyLarge = TextStyle(
            fontFamily = Montserrat,
            fontWeight = FontWeight.Normal,
            fontSize = 25.sp,
            lineHeight = 24.sp,
            letterSpacing = 0.5.sp
        )
    )