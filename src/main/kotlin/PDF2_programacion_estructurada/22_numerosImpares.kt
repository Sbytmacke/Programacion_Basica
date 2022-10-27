package PDF2_programacion_estructurada

//SUMA TODOS LOS NUMEROS IMPARES QUE HAY ENTRE 1 Y 20 MUESTRA EL RESULTADO
//GENERALIZA ESTE EJERCICIO PARA DOS NUMEROS CUALQUIERA PEDIDO POR TECLADO
//DEBEN IR DE  MENOR A MAYOR

fun main(){
    //EN PROGRAMACION ESTRUCTURADA UNICAMENTE SE PUEDE HACER ASÍ
    println("Introduce dos numeros para demostrarte cuantos números impares hay entre ellos de menor a mayor:")
    val ENTRADA_1:Int = readln().toInt()
    val ENTRADA_2:Int = readln().toInt()
    var numMayor: Int = 0
    var numMenor: Int = 0
    var num: Int = 0

    if (ENTRADA_1 > ENTRADA_2){
        numMayor = ENTRADA_1
        numMenor = ENTRADA_2
    } else {
        numMayor = ENTRADA_2
        numMenor = ENTRADA_1
    }
    if (numMenor%2 == 0){
        numMenor = numMenor + 1
    }
    if (numMayor%2 == 0){
        numMayor = numMayor + 1
    }
    println("Tus numeros impares de menor a mayor son:")
    for (i in numMenor..numMayor step 2){
        num = i
        print("$num ")
    }
}

fun imparesDel1al20 (){
    val NUM_MIN: Int = 1
    val NUM_MAX: Int = 20

    for (i:Int in NUM_MIN .. NUM_MAX step 2) {
        println("Tus numeros impares son: $i")
    }
}


//TENGO QUE TERMINARLA PERO CON PROGRAMACION MODULAR
fun ordenarImpares(){
    println("Introduce dos numeros para demostrarte cuantos números impares hay entre ellos de menor a mayor:")
    do{
        var entrada:Int? = null
        println("Primer numero:")
        entrada = readln().toIntOrNull()
        if(entrada == null) {
            println("Introduce un numero entero")
        }
    }while(entrada == null)
    do{
        var entrada:Int? = null
        println("Segundo numero:")
        entrada = readln().toIntOrNull()
        if(entrada == null) {
            println("Introduce un numero entero")
        }
    }while(entrada == null)
}