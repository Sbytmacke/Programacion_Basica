package PDF5

import funcionesUtiles.entradaEnteroNumerico
import funcionesUtiles.entradaFloatNumerico

//º Realiza un módulo que me devuelva cuantos dígitos pares y cuantos impares tiene un
//número. Ejemplo: 234656, devolvería: 4 dígitos pares y 2 impares.

fun main(){
    val entrada:Int = entradaEnteroNumerico("Introduce un numero entero para saber cuantos dígitos pares e impares hay")
    contadorParesImpares(entrada)
}

fun contadorParesImpares(entradaNumerica:Int){
    var contadorPar: Int = 0
    var contadorImpar: Int = 0
    var entrada: Int = entradaNumerica

    while(entrada > 0){
        entrada = entrada/10
    }
    println("Tu dígito presenta $contadorPar pares y $contadorImpar impares")
}
