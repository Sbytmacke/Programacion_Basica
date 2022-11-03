package funcionesUtiles

//Calcular la media de numeros pedidos por teclado

fun main() {
    var cantidadDeEntradas: Int = 0
    var entradaAnterior: Int = 0
    var entradaNueva: Int = 0
    var media: Int = 0

    println("Introduce la cantidad de numeros que vas a introducir: ")
    cantidadDeEntradas = readln().toInt()

    for (i in 1..cantidadDeEntradas) {
        println("Introduce el numero $i para realizar la media: ")
        entradaNueva = readln().toInt()
        entradaNueva = entradaAnterior + entradaNueva
        entradaAnterior = entradaNueva
        println("Te encuentras en la cantidad $i con una suma total de $entradaNueva")
    }

    media = entradaNueva / cantidadDeEntradas
    println("Tu media es: $media")
}