package com.example.kotlinapp

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
import com.example.kotlinapp.ui.theme.KotlinappTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        enableEdgeToEdge()
        setContent {
            KotlinappTheme {
            variablesConstants()
            }
        }
    }
}

private fun variablesConstants() {
    var nomAlumne = "Pau Guerrero"
    println(nomAlumne)
    // Comentari d'una línia
    /* Comentari de iverses
    línies
     */

    var edat = 23
    // edat = "Ramon" No és pot modificar el tipus
    println(edat)
}