package funcionesUtiles

fun main() {
    var entrada: Double = 0.0
    var entradaDos: Double = 0.0
    var entradaTres: Double = 0.0

    println("Introduce 3 valores para saber si están ordenados de menor a mayor: ")
    entrada = readln().toDouble()
    entradaDos = readln().toDouble()
    entradaTres = readln().toDouble()

    if (entrada < entradaDos && entradaDos < entradaTres) {
        println("Están ordenados de menor a mayor")
    } else {
        println("No están ordenados de menor a mayor")
    }
}