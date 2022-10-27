fun main () {
    var numeroA:Int = 0
    var numeroB:Int = 0
    var repetir:String = "y"

    //DECIR QUE NUMERO ES MAYOR DE TODOS LOS INTRODUCIDOS
    //Hago un print inicial para mantener el valor en numA y despues compararlo con el bucle siguiente

    println("Introduce el primer número que necesites:")
    numeroA = readln().toInt()

    do {
        println("Introduce el siguiente número que necesites para saber cual es mayor:")
        numeroB = readln().toInt()
        println("¿Quieres continuar introduciendo números? (y/n)")
        repetir = readln()
        if (numeroB > numeroA){
            numeroA = numeroB
        }
    }while(repetir == "y")

    println("El mayor número de tus entradas es: $numeroA")
    println("FIN")
}