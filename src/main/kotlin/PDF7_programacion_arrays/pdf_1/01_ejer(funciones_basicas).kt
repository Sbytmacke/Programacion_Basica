package PDF_Arrays.pdf_1

fun main(){
    val miVector:IntArray = intArrayOf(1,3,-3,7,2)
}

/**
 * A) Realizará un recorrido al vector y lo imprimirá
 * @param vector el cual será recorrido por un bucle definido
 */
fun imprimirVector(vector:IntArray) {
    for (i in vector.indices) {
        println(vector[i])
    }

    // For each vector
    /*
    for (i in vector){
        println(i)
    }
    */
}

/**
 * B) Realizará un recorrido al vector y veremos cual es el mayor
 * @param vector el cual será recorrido por un bucle definido
 */
fun maximoVector(vector:IntArray) {
    var valorMaximo:Int = 0

    for (i in vector.indices) {
        if (vector[i] > valorMaximo){
            valorMaximo = vector[i]
        }
    }

    println(valorMaximo)
}

/**
 * C) Realizará un recorrido al vector y veremos cual es el menor
 * @param vector el cual será recorrido por un bucle definido
 */

fun minimoVector(vector:IntArray) {
    var valorMinimo:Int = 0

    for (i in vector.indices) {
        if (vector[i] < valorMinimo){
            valorMinimo = vector[i]
        }
    }

    println(valorMinimo)
}

/**
 * D) Realizará una media del vector
 * @param vector ,el cual será recorrido por un bucle definido
 * @return media ,devuelve la media para utilizarla posteriormente
 */

fun mediaVector(vector:IntArray): Int{
    var sumaTotal:Int = 0
    var media:Int = 0
    for (i in 0..vector.size - 1){
        sumaTotal += vector[i]
    }
    media = sumaTotal/vector.size
    return media
}