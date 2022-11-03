package funcionesUtiles

fun main() {
    var entrada: Double = 0.0
    var entradaDos: Double = 0.0
    var entradaTres: Double = 0.0

    println("Introduce 3 valores para saber si están ordenados de forma consecutiva: ")
    entrada = readln().toDouble()
    entradaDos = readln().toDouble()
    entradaTres = readln().toDouble()

    if (entrada == entradaDos - 1 && entradaDos == entradaTres - 1
        || entrada == entradaDos + 1 && entradaDos == entradaTres + 1
    ) {
        println("Están ordenados de forma consecutiva")
    } else {
        println("No están ordenados de forma consecutiva")
    }
}