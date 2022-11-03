fun main() {
    var entradaDividendo: Double = 0.0
    var entradaDivisor: Double = 0.0
    var cociente: Double = 0.0

    println("Para calcular tu division:")
    println("Introduce tu dividendo: ")
    entradaDividendo = readln().toDouble()
    println("Introduce tu divisor: ")
    entradaDivisor = readln().toDouble()

    while (entradaDividendo > entradaDivisor) {
        //el dividendo se convertirá en el resto
        entradaDividendo -= entradaDivisor
        cociente += 1
    }
    println("Tu división da como resultado un cociente de $cociente y un resto de $entradaDividendo")
}