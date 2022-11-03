package funcionesUtiles

//15 resultados al azar de 1,X,2
fun main() {
    val uno: String = "1"
    val dos: String = "2"
    val equis: String = "X"
    val limiteMaximo: Int = 15
    val limiteMinimo: Int = 1

    for (i in limiteMinimo..limiteMaximo) {
        val aleatorio: Int = (1..3).random()
        if (aleatorio == 1) {
            println("Resultado $i: $uno")
        }
        if (aleatorio == 2) {
            println("Resultado $i: $dos")
        }
        if (aleatorio == 3) {
            println("Resultado $i: $equis")
        }
    }
}