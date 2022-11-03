package PDF2_programacion_estructurada

//ESCRIBE TODOS LOS NUMEROS PARES DEL 1 AL 20
fun main() {
    var entrada1: Int = 0
    var entrada2: Int = 0
    var valorMayor: Int = 0
    var valorMenor: Int = 0
    println("Introduce tus dos numeros:")
    entrada1 = readln().toInt()
    entrada2 = readln().toInt()

    if (entrada1 % 2 != 0) {
        entrada1 += 1
    }
    if (entrada2 % 2 != 0) {
        entrada2 += 1
    }
    if (entrada1 < entrada2) {
        valorMayor = entrada2
        valorMenor = entrada1
    } else {
        valorMayor = entrada1
        valorMenor = entrada2
    }

    println("Tus numeros pares son:")
    for (i: Int in valorMenor..valorMayor step 2) {
        print("$i ")
    }
}
