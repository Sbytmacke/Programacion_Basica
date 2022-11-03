package funcionesUtiles

fun main() {
    var numeroEntradaA: Int = 0
    var numeroEntradaB: Int = 0
    var resultado: Int = 0

    println("Introduce dos numeros donde se restará el mayor con el menor:")
    println("Primer numero:")
    numeroEntradaA = readln().toInt()
    println("Segundo numero:")
    numeroEntradaB = readln().toInt()

    if (numeroEntradaA > numeroEntradaB) {
        resultado = numeroEntradaA - numeroEntradaB
        println("Tu resultado es $resultado")
    } else {
        resultado = numeroEntradaB - numeroEntradaA
        println("Tu resultado es $resultado")
    }

}