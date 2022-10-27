package PDF5

import funcionesUtiles.entradaEnteroNumerico
import funcionesUtiles.entradaFloatNumerico
import funcionesUtiles.exponente

//Realiza un programa que permita convertir modularmente números binarios en
//decimales y viceversa.

fun main (){
    println("Conversión de binario a decimal y viceversa...")

    //NO SE ME REDONDEA UN NUMERO, LO DEMAS OK
    println(entradaBinarioADecimal())

    //POR QUE ME SALE EN EL PRINT: kotlinUnit???
    println(entradaDecimalABinaria())
}

fun entradaBinarioADecimal():Int{
    var entradaBinaria:Float = entradaFloatNumerico("Introduce un nºbinario:")
    var sumaTotal:Int = 0
    var contador:Int = 0

    while (entradaBinaria >= 1){
        var entradaDividida:Float = 0f
        var entradaBinariaNueva:Float = 0f
        var entradaRestar:Int = 0
        var res:Int = 0

        //SE REUTILIZA LA ENTRADA BINARIA
        entradaBinaria = entradaBinaria/10

        //VARIABLE ENTERA PARA RESTAR A ENTRADABINARIA FLOAT Y ME DE UN EN SU DECIMAL SIENDO [0,0 || 0,1]
        entradaRestar = entradaBinaria.toInt()

        //ME QUEDO CON LA PARTE DE LA COMA, PUDIENDO SOLO SER [0 || 1]
        entradaBinariaNueva = entradaBinaria - entradaRestar

        // Y LA CONVIERTO EN ENTERA PARA FILTRARLA  MEJOR
        //TODO EN UN FUTURO MEJORAR EL FILTRO DE REDONDEO... O UTILIZAR EL BIGDECIMAL QUE AHORA NO SABEMOS...
        if (entradaBinariaNueva > 0.05 && entradaBinariaNueva < 1){
            res = 1
        }else{
            res = 0
        }

        //FILTROS EN FUNCION DE [0,1]
        if (res == 0){
            contador = contador + 1
        }else if (res == 1){
                if (contador > 0) {
                    sumaTotal = sumaTotal + exponente(2,contador)
                    contador = contador + 1
                }else if(contador == 0){
                    sumaTotal = sumaTotal + 1
                    contador = contador + 1
                }
            }
        }
    return sumaTotal
}

fun entradaDecimalABinaria() {
    var entradaDecimal: Int = entradaEnteroNumerico("Introduce un nº en decimal:")
    var cadenaBinaria:String = ""

    while (entradaDecimal >= 1) {
        if (entradaDecimal % 2 == 1) {
            entradaDecimal = (entradaDecimal/2)
            cadenaBinaria = "1 $cadenaBinaria "
        }else if (entradaDecimal % 2 == 0) {
            entradaDecimal = (entradaDecimal/2)
            cadenaBinaria = "0 $cadenaBinaria "
        }else if(entradaDecimal == 1){
            cadenaBinaria = "1 $cadenaBinaria "
        }else{
            cadenaBinaria = "0 $cadenaBinaria "
        }
    }
    println(cadenaBinaria)
}