fun main() {
    var numero = 0
    var contador = 0
    do {
        println("Introduce tu numero con 5 cifras: ")
        numero = readln().toInt()
    } while (numero < -99999 || numero > 99999)


    //Algoritmo
    while (numero != 0) {
        numero /= 10
        contador += 1
    }
    print("Tu numero tiene $contador cifras")
}