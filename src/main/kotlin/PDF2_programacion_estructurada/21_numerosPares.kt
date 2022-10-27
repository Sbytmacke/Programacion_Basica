package PDF2_programacion_estructurada

//ESCRIBE TODOS LOS NUMEROS PARES DEL 1 AL 20

fun main (){
    val NUM_MIN: Int = 1
    val NUM_MAX: Int = 20
    var num: Int = 0
    println("Tus numeros pares son:")
    for (i:Int in NUM_MIN .. NUM_MAX step 2) {
        num = i + 1
        print("$num ")
    }
}
