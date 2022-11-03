package funcionesUtiles

//PEDIR NUMEROS HASTA INTRODUCIR UN NUMERO MAYOR A 100
fun main() {
    val limite: Int = 100
    var entrada: Int = 0

    while (entrada <= limite) {
        println("Si introduces un numero mayor a 100 te sale del bucle:")
        entrada = readln().toInt()
    }
}