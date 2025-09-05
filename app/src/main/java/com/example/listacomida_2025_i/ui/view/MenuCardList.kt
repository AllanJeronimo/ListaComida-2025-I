package com.example.listacomida_2025_i.ui.view

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.listacomida_2025_i.model.Platillo

@Composable
fun MenuCardList(
    platilloList:List<Platillo>,
    modifier: Modifier
){
    LazyColumn (modifier){
        items(platilloList){
                platillo -> MenuCard(
            platillo = platillo,
            Modifier.padding(10.dp)
        )
        }
    }

}