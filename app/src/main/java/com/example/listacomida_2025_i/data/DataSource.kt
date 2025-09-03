package com.example.listacomida_2025_i.data

import com.example.listacomida_2025_i.R
import com.example.listacomida_2025_i.model.Platillo

class DataSource{

    fun loadPlatillos():List<Platillo>{
        return listOf<Platillo>(
            Platillo(R.string.desayuno , R.drawable.desayuno),
            Platillo(R.string.hamburger , R.drawable.hamburger),
            Platillo(R.string.pizza , R.drawable.pizza),
            Platillo(R.string.postre, R.drawable.postre),
            Platillo(R.string.pozole , R.drawable.pozole),
            Platillo(R.string.Tacos , R.drawable.tacos)

        )
    }

}