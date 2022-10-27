package funcionesUtiles

/*
Calcula el area y circunferencia de un circulo cuyo radio se debe preguntar al usuario,
hazlo en la funcion main, de manera estructural...
 */

val  PI:Double = 3.14
fun main(){
    var areaCirculo:Double = 0.0
    var circunferencia:Double = 0.0
    var radio:Double = 0.0

    println("Introduce tu radio:")
    println(areaCirculo)
    radio = readln().toDouble()
    areaCirculo = (PI*radio)*(PI*radio)
    circunferencia = 2*radio*PI

    println("El área tu de círculo es: $areaCirculo y el tamaño de la circunferencia: $circunferencia")
}