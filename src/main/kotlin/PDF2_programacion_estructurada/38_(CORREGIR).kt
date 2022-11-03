package funcionesUtiles

//23,29,31 o salir, son ejercicios,y cual queresmo realizar, se hacen esos ejercicios hasta que decidamos salir

fun main() {
    var eleccion: String = ""
    var salir: Boolean = false

    do {
        println("Elige tu herramienta:")
        println("A = Factorial de un numero")
        println("B = Organizador de las notas de los alumnos de la clase")
        println("C = Para saber si un numero es primo")
        println("D = Salir del programa")
        eleccion = readln()
        if (eleccion == "A") {
            var num: Int = 0
            print("Escribe el numero que quieras saber su factorial:")
            num = readln().toInt()
            //println("Tu resultado del factorial es: ${factorialIterativo(num)}")
        }
        if (eleccion == "B") {
            //organizadorNotas()
        }
        if (eleccion == "C") {
            //mioPrimo()
        }
        if (eleccion == "D") {
            salir = true
        }
    } while (salir == false)
}
