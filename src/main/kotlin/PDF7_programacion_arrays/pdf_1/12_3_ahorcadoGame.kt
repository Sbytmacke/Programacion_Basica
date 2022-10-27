fun main() {
    //TODO: solamente falta ver por que no me leen varias letras!!! por ejemplo en aguacata, solo me lee
    //la primera 'a'
    /*
    REQUIERO DE:
    1.Un vecto a descubrir
    2.Un vecto Oculto
    3.Ejecucion de mi funcion final
     */


    val vectorParaDescrubrir: Array<String> = arrayOf("a", "r", "a", "d", "o")
    val vectorIncognitaInicial: Array<String> = generaIncognitaInicial(vectorParaDescrubrir.size)
    logicaFinal(vectorIncognitaInicial,vectorParaDescrubrir)
}

/**
 * Generacion de la palabra para adivinar oculta incial
 * @param tamannoDeVector es el tamaño del vector de la palabra que vamos a adivinar
 * @return nos devuelve el vector en barras bajas con el mismo tamaño de la palabra que queremos adivinar
 */
fun generaIncognitaInicial(tamannoDeVector: Int):Array<String> {
    var vectorIncognita = Array(tamannoDeVector){"_"}
    for (i in vectorIncognita.indices){
        print(vectorIncognita[i])
    }
    println(" ")
    return vectorIncognita
}

fun logicaFinal(vectorIncognitaAtualizado: Array<String>, vectorParaDescrubrir: Array<String>) {
    var intentos: Int = 6

    do {
        var entradaCaracter: String = entradaPalabra()

        generaIncognitaActualizada(vectorIncognitaAtualizado, vectorParaDescrubrir, entradaCaracter)

        if (palabraFinalDescubierta(vectorIncognitaAtualizado, vectorParaDescrubrir)) {
            println("TE HAS SOLTADO, HAS GANADO!\n" +
                    "===========''']\n" +
                    "   +---+\n" +
                    "       |\n" +
                    "       |\n" +
                    "  \\O/  |\n" +
                    "   |   |\n" +
                    "  / \\  |\n" +
                    "===========''']")
        }
        if (retornoBoleanoCompararLetraAcertada(vectorParaDescrubrir, entradaCaracter)) {
            println("Has acertado y te siguen quedando $intentos intentos")
        }
        if (!retornoBoleanoCompararLetraAcertada(vectorParaDescrubrir, entradaCaracter)) {
            intentos -= 1
            println("No existe esa LETRA en la palabra oculta")
            if (intentos == 5) {
                println("TE QUEDAN 5 OPORTUNIDADES\n" +
                            "===========''']\n" +
                            "   +---+\n" +
                            "   |   |\n" +
                            "   O   |\n" +
                            "       |\n" +
                            "       |\n" +
                            "       |\n" +
                            "===========''']")
            }
            if (intentos == 4) {
                println("TE QUEDAN 4 OPORTUNIDADES\n" +
                            "===========''']\n" +
                            "   +---+\n" +
                            "   |   |\n" +
                            "   O   |\n" +
                            "   |   |\n" +
                            "       |\n" +
                            "       |\n" +
                            "===========''']")
            }
            if (intentos == 3) {
                println("TE QUEDAN 3 OPORTUNIDADES\n" +
                            "===========''']\n" +
                            "   +---+\n" +
                            "   |   |\n" +
                            "   O   |\n" +
                            "   |\\ |\n" +
                            "       |\n" +
                            "       |\n" +
                            "===========''']")
            }
            if (intentos == 2) {
                println("TE QUEDAN 2 OPORTUNIDADES\n" +
                            "===========''']\n" +
                            "   +---+\n" +
                            "   |   |\n" +
                            "   O   |\n" +
                            "  /|\\ |\n" +
                            "       |\n" +
                            "       |\n" +
                            "===========''']")
            }
            if (intentos == 1) {
                println("TE QUEDA 1 OPORTUNIDAD\n" +
                            "===========''']\n" +
                            "   +---+\n" +
                            "   |   |\n" +
                            "   O   |\n" +
                            "  /|\\ |\n" +
                            "    \\ |\n" +
                            "       |\n" +
                            "===========''']")
            }
        }
        if (intentos == 0) {
            println(
                "AHORCADO... HAS PERDIDO!\n" +
                        "===========''']\n" +
                        "   +---+\n" +
                        "   |   |\n" +
                        "   O   |\n" +
                        "  /|\\  |\n" +
                        "  / \\  |\n" +
                        "       |\n" +
                        "===========''']"
            )
        }
    }while (intentos > 0)
}

//TODO: AQUI ES DONDE DEBE FALLAR
fun generaIncognitaActualizada(vectorIncognitaInicial: Array<String>, vectorParaDescrubrir: Array<String>, entradaCaracter:String) {
    if (retornoBoleanoCompararLetraAcertada(vectorParaDescrubrir,entradaCaracter) == true) {
        for (i in 0 .. vectorIncognitaInicial.size-1) {
            vectorIncognitaInicial[retornoVectorIncognitaActualizado(vectorIncognitaInicial, vectorParaDescrubrir,entradaCaracter)] =
                retornoValorLetraAcertada(vectorParaDescrubrir, entradaCaracter)
        }
        for (i in 0 .. vectorParaDescrubrir.size-1){
            print(vectorIncognitaInicial[i])
        }
        println("")
    }
}

//TODO: AQUI ES DONDE DEBE FALLAR, EL BUCLE ME SACA UNA VEZ ENCUENTRA UNA PALABRA???
fun retornoVectorIncognitaActualizado(vectorIncognita: Array<String>,vectorParaDescrubrir: Array<String>, entradaCaracter:String): Int {
    var contador: Int = -1
    var error: Int = -10
    for (i in 0..vectorParaDescrubrir.size-1) {
        if (vectorParaDescrubrir[i] == entradaCaracter){
            vectorIncognita[i] = entradaCaracter
            contador += 1
        }
        return contador
    }
    return error
}

fun retornoValorLetraAcertada(vectorParaDescrubrir: Array<String>, entradaCaracter:String): String {
    var fallado:String = "HAS FALLADO"

    for (i in 0..vectorParaDescrubrir.size-1) {
        if (vectorParaDescrubrir[i] == entradaCaracter) {
            return vectorParaDescrubrir[i]
        }
    }
    return fallado
}

/**
 * Comparamos la entrada de una letra del jugador con los indices del vector (palabra para adivinar)
 * @param vectorParaDescrubrir el vector para adivinar
 * @return true para saber si la entrada realizada es la misma que nuestro vectorParaDescrubrir, en caso contrario false
 */
fun retornoBoleanoCompararLetraAcertada(vectorParaDescrubrir: Array<String>, entradaCaracter:String): Boolean {
    for (i in 0..vectorParaDescrubrir.size-1) {
        if (vectorParaDescrubrir[i] == entradaCaracter){
            return true
        }
    }
    // logicaIntentos()
    return false
}

// TODO: FILTRAR LAS ENTRADAS PARA QUE SOLO SEA UN CARACTER AUNQUE DETERMINEMOS QUE SEA UN STRING...
fun entradaPalabra(): String{
    var entrada: String = " "
    entrada = readln()
    return entrada
}


fun palabraFinalDescubierta(vectorIncognitaActualizada: Array<String>, vectorParaDescrubrir: Array<String>):Boolean{
    if (vectorIncognitaActualizada.size != vectorParaDescrubrir.size) {
        return false
    }
    for (i in vectorParaDescrubrir.indices) {
        if (vectorIncognitaActualizada[i] != vectorParaDescrubrir[i]) {
            return false
        }
    }
    return true
}