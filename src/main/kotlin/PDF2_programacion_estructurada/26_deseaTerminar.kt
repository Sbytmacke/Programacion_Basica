package funcionesUtiles

fun main() {
    var respuesta: Char = ' '
    var terminar: Boolean = false

    while (terminar == false) {
        println("¿Desea terminar? (S/N)")
        respuesta = readln()[0]
        if (respuesta == 's' || respuesta == 'S') {
            terminar = true
        }
        if (respuesta == 'n' || respuesta == 'N') {
            terminar = false
        }
    }
}