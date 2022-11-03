package funcionesUtiles

fun main() {
    var cantidadDeEntradas: Int = 0
    var entradaNueva: Int = 0
    var sumaTotal: Int = 0
    var media: Int = 0

    while (entradaNueva >= 0) {
        entradaNueva = readln().toInt()
        if (entradaNueva > 0) {
            cantidadDeEntradas += 1
            sumaTotal = sumaTotal + entradaNueva
            println("Te encuentras en la cantidad $cantidadDeEntradas con una suma total de $sumaTotal")
        }
    }
    if (cantidadDeEntradas > 0) {
        media = sumaTotal / cantidadDeEntradas
    }
    println("Tu media es: $media")
}