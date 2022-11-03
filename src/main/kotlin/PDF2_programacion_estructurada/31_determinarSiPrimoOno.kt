package funcionesUtiles

fun main() {
    var entrada: Int = 0
    var resultado: Int = 0
    var contadorPrimo: Int = 0
    print("Introduce el numero para saber si es primo: ")
    entrada = readln().toInt()

    for (i in 1..entrada) {
        resultado = entrada % i
        if (resultado == 0) {
            contadorPrimo += 1
        }
    }
    if (contadorPrimo == 2 || resultado == 1) {
        println("Es primo $entrada")
    } else {
        println("No es primo $entrada")
    }
}