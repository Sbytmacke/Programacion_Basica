package funcionesUtiles

/*
Conversion fahrenheit a centigrade y viceversa
 */
fun main() {
    var farenheit: Double = 0.0
    var centigrade: Double = 0.0
    var eleccion: Char = ' '
//SI PROBRAMOS DE CENTIGRADOS A FARENHERI, EJ: -20, DEBERIA DAR -4FARENHEIT , Y NO DA!!!
    //LO DEMAS ES CORRECTO
    println("¿A que quieres convertir? (F/C):")
    eleccion = readln()[0]
    if (eleccion == 'F' || eleccion == 'f') {
        println("Introduce tu valor centigrade:")
        centigrade = readln().toDouble()
        farenheit = ((9 / 5) * centigrade) + 32
        println("Tus $centigrade ºC, son $farenheit F")

    } else {
        println("Introduce tu valor farenheit:")
        farenheit = readln().toDouble()
        centigrade = (farenheit - 32) * 1.8
        println("Tus $farenheit F, son $centigrade ºC")
    }

}