package com.example.listacomida_2025_i.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Platillo(
    @StringRes val stringResourcesId: Int,
    @DrawableRes val drawableResourceId: Int,
    val precio: String,
    val oferta: String
)