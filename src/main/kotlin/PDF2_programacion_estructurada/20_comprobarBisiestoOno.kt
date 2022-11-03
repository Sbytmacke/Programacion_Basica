package funcionesUtiles

fun main() {
    var anno: Int = 0

    println("Introduce tu año para saber si es bisiesto o no:")
    anno = readln().toInt()

    // Un año es bisiesto si es: Divisible entre 4 y No divisible entre 100, y Divisible entre 400.

    if ((anno % 4 == 0 && anno % 100 != 0) || anno % 400 == 0) {
        println("Es bisiesto $anno")
    } else {
        println("Es año normal $anno")
    }
}