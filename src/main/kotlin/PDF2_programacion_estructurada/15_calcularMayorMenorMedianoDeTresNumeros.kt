package funcionesUtiles

fun main() {
    var entradaPrimerNumero: Int = 0
    var entradaSegundoNumero: Int = 0
    var entradaTercerNumero: Int = 0

    println("Introduce tres valores numérico, para saber cual es el menor, el mayor y el mediano:")
    entradaPrimerNumero = readln().toInt()
    entradaSegundoNumero = readln().toInt()
    entradaTercerNumero = readln().toInt()

    if (entradaPrimerNumero < entradaSegundoNumero && entradaPrimerNumero < entradaTercerNumero) {
        println("El menor valor es $entradaPrimerNumero")
    } else if (entradaPrimerNumero > entradaSegundoNumero && entradaPrimerNumero > entradaTercerNumero) {
        println("El mayor valor es $entradaPrimerNumero")
    } else {
        println("El valor mediano es $entradaPrimerNumero")
    }

    if (entradaSegundoNumero < entradaPrimerNumero && entradaSegundoNumero < entradaTercerNumero) {
        println("El menor valor es $entradaSegundoNumero")
    } else if (entradaSegundoNumero > entradaPrimerNumero && entradaSegundoNumero > entradaTercerNumero) {
        println("El mayor valor es $entradaSegundoNumero")
    } else {
        println("El valor mediano es $entradaSegundoNumero")
    }

    if (entradaTercerNumero < entradaPrimerNumero && entradaTercerNumero < entradaSegundoNumero) {
        println("El menor valor es $entradaTercerNumero")
    } else if (entradaTercerNumero > entradaPrimerNumero && entradaTercerNumero > entradaSegundoNumero) {
        println("El mayor valor es $entradaTercerNumero")
    } else {
        println("El valor mediano es $entradaTercerNumero")
    }
}