package PDF_Arrays.pdf_1

fun main(){
    var vector1: IntArray = intArrayOf(1, 2, 3, 4, 5, 6)
    var vector2: IntArray = intArrayOf(1, 2, 3, 4, 5, 6)
    //CUIDADO, AL SER MUTABLES, SI EECUTAMOS A LA VEZ SUMA Y RESTA, YA NO FUNCIONA!!!
    //sumaVector(vector1, vector2)
    //restaVector(vector1, vector2)
    productoEscalar(vector1, vector2)
}


fun localizarMayorVector(vector1: IntArray, vector2: IntArray): IntArray {
    if(vector1.size > vector2.size){
        return vector1
    }else{
        return vector2
    }
}

fun sumaVector(vector1: IntArray, vector2: IntArray) {
    var vectorSuma: IntArray = localizarMayorVector(vector1,vector2)

    for (i in 0..vectorSuma.size -1){
        vectorSuma[i] = vector1[i] + vector2[i]
        println(vectorSuma[i])
    }
}

fun restaVector(vector1: IntArray, vector2: IntArray) {
    var vectorResta: IntArray = localizarMayorVector(vector1,vector2)

    for (i in 0..vectorResta.size -1){
        vectorResta[i] = vector1[i] - vector2[i]
        println(vectorResta[i])
    }
}

fun productoEscalar(vector1: IntArray, vector2: IntArray) {
    var vectorProductoEscalar: IntArray = localizarMayorVector(vector1,vector2)

    for (i in 0..vectorProductoEscalar.size - 1) {
        vectorProductoEscalar[i] = vector1[i]*vector2[i]
        println(vectorProductoEscalar[i])
    }
}


