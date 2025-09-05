package com.example.listacomida_2025_i.ui.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
import androidx.compose.ui.draw.clip
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.ui.graphics.Color

@Composable
fun MenuCard(
    platillo: Platillo,
    modifier: Modifier
){
    Card (modifier){
        Row(
            modifier = Modifier.padding(16.dp),
            verticalAlignment = androidx.compose.ui.Alignment.CenterVertically
        ) {
            Image   (
                painter = painterResource(id=platillo.drawableResourceId),
                contentDescription = stringResource(id=platillo.stringResourcesId),
                modifier=Modifier
                    .size(90.dp)
                    .clip(CircleShape),
                contentScale = ContentScale.Crop
            )
            Column (
                modifier = Modifier
                    .padding(start = 16.dp)
            ){
                Text(
                    text = LocalContext.current.getString(platillo.stringResourcesId),
                    style = MaterialTheme.typography.headlineLarge
                )
                Text(
                    text = platillo.precio,
                    style = MaterialTheme.typography.bodyLarge
                )
                Text(
                    text = platillo.oferta,
                    style = MaterialTheme.typography.bodyLarge,
                    color = Color.Blue
                )
            }
        }
    }
}