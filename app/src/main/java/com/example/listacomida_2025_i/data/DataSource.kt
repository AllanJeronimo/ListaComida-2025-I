package com.example.listacomida_2025_i.data

import com.example.listacomida_2025_i.R
import com.example.listacomida_2025_i.model.Platillo

class DataSource{

    fun loadPlatillos():List<Platillo>{
        return listOf<Platillo>(
            Platillo(R.string.desayuno , R.drawable.desayuno, "MX $100.0", "Ahorra hasta el 30%"),
            Platillo(R.string.hamburger , R.drawable.hamburger, "MX $150.0", "Ahorra hasta el 10%"),
            Platillo(R.string.pizza , R.drawable.pizza, "MX $220.0", "Ahorra hasta el 20%"),
            Platillo(R.string.postre, R.drawable.postre, "MX $80.0", "Sin oferta"),
            Platillo(R.string.pozole , R.drawable.pozole, "MX $100.0", "Ahorra hasta el 30%"),
            Platillo(R.string.Tacos , R.drawable.tacos, "MX $90.0", "Ahorra hasta el 15%")
        )
    }

}