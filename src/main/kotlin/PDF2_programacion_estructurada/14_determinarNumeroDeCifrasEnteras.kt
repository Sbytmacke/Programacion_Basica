package funcionesUtiles

fun main() {
    //SI QUIERES HACERLO CON DOUBLE, NO ES POSIBLE CON ESTE NIVEL, YA QUE LOS DECIMAL NO SON EXACTOS
    //EN PROGRAMACION por ejemplo: 0,1 != 0,1000000234.., darían mas cifras debido al contador hasta llegar a 0
    var contadorNumeros: Int = 0
    var entrada: Int = 0
    entrada = readln().toInt()

    while (entrada != 0) {
        entrada = entrada / 10
        contadorNumeros += 1
    }
    println("Tu numero tiene una cantidad de $contadorNumeros cifras")
}