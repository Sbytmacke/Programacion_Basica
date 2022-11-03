package funcionesUtiles

//entrada con apuesta de la quiniela anterior y decir si ha acertado o no
fun main() {
    val uno: String = "1"
    val dos: String = "2"
    val equis: String = "X"
    val limiteMaximo: Int = 15
    val limiteMinimo: Int = 1

    var entrada: String = ""

    println("Tendrás 15 apuestas siendo posible (1/X/2):")
    println("Apuesta!:")
    for (i in limiteMinimo..limiteMaximo) {

        var aleatorio: String = ((1..3).random()).toString()

        entrada = readln()

        if (entrada == "x") {
            entrada = "X"
        }
        if (aleatorio == "3") {
            aleatorio = "X"
        }
        if (entrada == aleatorio) {
            println("Has acertado en tu apuesta nº$i: $aleatorio")
        } else {
            println("Has fallado en tu apuesta nº$i: $aleatorio")
        }

    }
}