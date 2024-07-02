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
//        condicionals()
//        sentenciaWhen()
//        estructuraArrays()
//        estructuraMaps()
//        bucles()
//        var resposta = saludar("Martí")
//        println("El pc diu: $resposta")
//        println(saludar("Laura"))
//        println(saludar("Anna"))
        crearUsuari()

        }
    }

private fun crearUsuari(){

}

//private fun saludar(nom:String):String {
//   // println("Hola classe! El meu nom és $nom")
//    return "Hola classe! El meu nom és $nom"
//}











//private fun condicionals() {
//    var edat = 0
//    var dia = "dimarts"
//    var vip = true
//
//    if (edat >= 18 || (dia == "dimarts" && vip )){
//        println("$edat es major de 18, pots pasar")
//    } else if (edat == 0){
//        println("$edat no és una edat vàlida, has de dir-me una edat correcta")
//    } else {
//        println("$edat és menor a 18, no pots passar")
//    }
//}
//private fun sentenciaWhen() {
//    var pais = "Argentina"
//    var nota = 8

//    when(pais){
//        "Suecia" -> {
//            println("a $pais el idioma és el Suec")
//        } "Espanya", "Argentina", "Honduras" -> {
//            println("a $pais el idioma és el Espanyol")
//        } "Vietnam" -> {
//        println("El idioma és el Vietnamita")
//    } else -> {
//        println("No reconec aquest idioma")
//        }
//    }

//    when (nota){
//        0,1,2,3,4 -> {
//            println("Suspes")
//        } in 5 .. 7 -> {
//            println("Aprovat")
//        } in 8..10 -> {
//        println("Notable")
//        } else -> {
//        println("No conec la nota")
//        }
//    }
//}

//private fun estructuraArrays(){
//    var alumne1 = "Josep"
//    var alumne2 = "Maria"
//    var alumne3 = "Jesus"
//    var alumne4 = "Gabriel"
//    var alumne5 = "Satanas"
//
//    var aula: ArrayList<String> = arrayListOf<String>()
//    aula.add(alumne1)
//    aula.add(alumne2)
//    aula.add(alumne3)
//    aula.add(alumne4)
//    aula.add(alumne5)
//    println(aula)
//    aula.removeAt(4)
//    println(aula[2])
//
//    // Recorrer array
//    aula.forEach {
//        println(it)
//    }
//    // Comptar elements d'un array
//    println(aula.count())
//    // El 1er element i l'últim
//    println(aula.first())
//    println(aula.last())
//    // ordena
//    aula.sort()
//    println(aula)
//
//    aula.clear()
//    println(aula)
// }
//
//private fun estructuraMaps(){
//    var elMeuMapa: Map<String,Int> = mapOf()
//    elMeuMapa = mapOf("Joan" to 5, "Iria" to 3, "Iu" to 9)
//    println(elMeuMapa)
//    // maps son immutables, no es poden redimensionar
//
//    var elTeuMapa = mutableMapOf("Lorena" to 9, "Silvia" to 6, "Ricard" to 8)
//    elTeuMapa["Romina"] = 3
//    elTeuMapa.put("Hermenegildo", 6)
//    println(elTeuMapa)
//    println(elTeuMapa["Silvia"])
//
//    elTeuMapa.remove("Romina")
//    println(elTeuMapa)
//}
//private fun bucles(){
//    val ciutats: List<String> = listOf("Ho Chi Minh", "Hue", "Dong Hoi", "Hanoi", "Nha Trang")
//    val temperatures: MutableMap<String, Int> = mutableMapOf(
//        "Ho Chi Minh" to 21,
//        "Hue" to 32,
//        "Dong Hoi" to 17,
//        "Hanoi" to 21,
//        "Nha Trang" to 34
//    )
//
//    for (ciutat: String in ciutats){
//        println(ciutat)
//    }
//
//    for (temperatura: MutableMap.MutableEntry<String, Int> in temperatures){
//        println("La temperatura de ${temperatura.key} és de ${temperatura.value}")
//    }
//
//    for (taula:Int in 0..10){
//        println("6 x " + taula + " = " + taula*6)
//    }
//// exclou l'últim element del rang
//    for (taula:Int in 0 until 10){
//        println("8 x " + taula + " = " + taula*8)
//    }
//// recorre el rang amb salt
//    for (taula:Int in 0 .. 10 step 2){
//        println("2 x " + taula + " = " + taula*2)
//    }
//
//    for (taula:Int in 10 downTo 0){
//        println("2 x " + taula + " = " + taula*2)
//    }
//
//    var pisos:IntRange = (0 .. 30)
//    for (pis:Int in pisos){
//        println("Estic al pis $pis")
//    }
//
//    // while
//    var pisAscensor = 0
//    var pisDesitjat = 4
//
//    while (pisAscensor <= pisDesitjat) {
//        if (pisAscensor < pisDesitjat){
//            println("Estem al pis $pisAscensor")
//        } else {
//            println("Ja estem al pis $pisDesitjat")
//        }
//        pisAscensor++
//    }
//}
