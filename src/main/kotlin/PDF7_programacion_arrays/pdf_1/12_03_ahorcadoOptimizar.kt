package pdf_1

fun main (){
    val palabraParaAdivinar: String = "arado"
    val palabraParaAdivinarChar: CharArray = palabraParaAdivinar.toCharArray()
    var palabraVisualizadaOculta: String = " "
    val palabraVisualizadaOcultaChar: CharArray = palabraParaAdivinar.toCharArray()

//DISTINTAS FORMAS DE CONSEGUIR UNA ENTRADA CHARACTER
    val entradaLetra = readln().lowercase().firstOrNull() ?: ' '
    // val input = readln().lowercase()
    // val letra = if (input.length == 1) input[0] else ' '

    // var entradaMia = readln()!![0]

    generaPalabraOcultaConMismoTamannoDePalabraParaAdivinar(palabraParaAdivinarChar,palabraVisualizadaOcultaChar)
    print(comparacionPalabraOcultaConPalabraParaAdivinar(palabraParaAdivinarChar,palabraVisualizadaOcultaChar,entradaLetra))


}

fun generaPalabraOcultaConMismoTamannoDePalabraParaAdivinar(palabraParaAdivinarChar: CharArray, palabraVisualizadaOcultaChar: CharArray) {

}

fun comparacionPalabraOcultaConPalabraParaAdivinar(palabraParaAdivinarChar: CharArray, palabraVisualizadaOcultaChar: CharArray, entradaLetra: Char) {
    for (i in palabraParaAdivinarChar.indices) {
        if (entradaLetra == palabraParaAdivinarChar[i]){
            palabraVisualizadaOcultaChar[i] = palabraParaAdivinarChar[i]
        }
    }
    print(palabraVisualizadaOcultaChar)
}



