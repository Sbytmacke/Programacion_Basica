package algoritmos

import java.util.Vector

fun main(){
    val vector: IntArray = intArrayOf(0,1,2,3)
    val vectorClonado = clonarVector(vector)
   for (i in vectorClonado){
       println(i)
   }
}

fun clonarVector(vector: IntArray):IntArray {
    var vectorClonado: IntArray = IntArray(vector.size)
    for(i in 0..vector.size-1){
        vectorClonado[i] = vector[i]
    }
    return vectorClonado
}