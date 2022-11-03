package PDF2_programacion_estructurada

//SUMA TODOS LOS NUMEROS IMPARES QUE HAY ENTRE 1 Y 20 MUESTRA EL RESULTADO
//GENERALIZA ESTE EJERCICIO PARA DOS NUMEROS CUALQUIERA PEDIDO POR TECLADO
//DEBEN IR DE  MENOR A MAYOR

fun main() {
    //EN PROGRAMACION ESTRUCTURADA UNICAMENTE SE PUEDE HACER ASÍ
    println("Introduce dos numeros para demostrarte cuantos números impares hay entre ellos de menor a mayor:")
    val entrada1: Int = readln().toInt()
    val entrada2: Int = readln().toInt()
    var numMayor: Int = 0
    var numMenor: Int = 0
    var num: Int = 0

    if (entrada1 > entrada2) {
        numMayor = entrada1
        numMenor = entrada2
    } else {
        numMayor = entrada2
        numMenor = entrada1
    }
    if (numMenor % 2 == 0) {
        numMenor = numMenor + 1
    }
    if (numMayor % 2 == 0) {
        numMayor = numMayor + 1
    }
    println("Tus numeros impares de menor a mayor son:")
    for (i in numMenor..numMayor step 2) {
        print("$i ")
    }
}