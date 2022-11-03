package funcionesUtiles

//TE PIDO NUMEROS Y SALIMOS DEL BUCLE CUANDO ESTEMOS ENTRE 1 Y 5

fun main() {
    val limiteMinimo: Int = 1
    val limiteMaximo: Int = 5
    var entrada: Int = 0

    while (entrada <= limiteMinimo || entrada >= limiteMaximo) {
        println("Introduce un numero, saldrás del bucle cuando estés entre 1 y 5 (no incluidos):")
        entrada = readln().toInt()
    }
}