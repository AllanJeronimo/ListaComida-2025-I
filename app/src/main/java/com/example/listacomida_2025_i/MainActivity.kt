package com.example.listacomida_2025_i

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.listacomida_2025_i.data.DataSource
import com.example.listacomida_2025_i.ui.theme.ListaComida2025ITheme
import com.example.listacomida_2025_i.ui.view.MenuCardList

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ListaComida2025ITheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                        MenuApp(Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun MenuApp(modifier: Modifier){
    MenuCardList(
        DataSource().loadPlatillos(),
        modifier
    )
}