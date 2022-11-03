package funcionesUtiles

fun main() {
    val numeroMaximo: Int = 100
    val numeroMinimo: Int = 1
    var resultado: Int = 0
    var contadorPrimo: Int = 0

    for (dividendo in numeroMinimo..numeroMaximo) {
        contadorPrimo = 0
        //BUCLE PARA DIVIDIR
        for (divisor in numeroMinimo..dividendo) {
            resultado = dividendo % divisor
            if (resultado == 0) {
                contadorPrimo += 1
            }
        }
        if (contadorPrimo == 2 || dividendo == 1) {
            println("Es primo $dividendo")
        } else {
            println("No es primo $dividendo")
        }
    }
}