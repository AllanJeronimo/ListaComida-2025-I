package com.example.listacomida_2025_i.ui.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.listacomida_2025_i.model.Platillo

@Composable
fun MenuCard(
    platillo: Platillo,
    modifier: Modifier
){
    Card (Modifier){
        Column {
            Image   (
          painter = painterResource(id=platillo.drawableResourceId),
                contentDescription = stringResource(id=platillo.stringResourcesId),
                modifier=Modifier
                    .fillMaxWidth()
                    .height(190.dp),
                contentScale = ContentScale.Crop
            )
            Text(
                text = LocalContext.current.getString(platillo.stringResourcesId),
                modifier = Modifier.padding(22.dp),
                style = MaterialTheme.typography.headlineMedium
            )
        }
    }
}

