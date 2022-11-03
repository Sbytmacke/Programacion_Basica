package funcionesUtiles

fun main() {
    var entradaDistanciaTren: Int = 0
    var entradaDiasEstancia: Int = 0
    val diasMaximoEstancia: Int = 7 //está incluido
    val distanciaMaximaKm: Int = 800 //está incluido
    val precioPorKm: Double = 2.5
    val descuento: Double = 0.7 //por ciento
    var precioViaje: Double = 0.0
    var precioViajeDescuento: Double = 0.0

    println("Introduce la distancia que va a recorrer tu tren: ")
    entradaDistanciaTren = readln().toInt()
    println("Introduce los días de estancia: ")
    entradaDiasEstancia = readln().toInt()

    if (diasMaximoEstancia > 7 && distanciaMaximaKm > 800) {
        precioViaje = entradaDistanciaTren * precioPorKm
        precioViajeDescuento = precioViaje * descuento
        println("El precio de tu billete final con descuento será $precioViajeDescuento€")
    } else {
        precioViaje = entradaDistanciaTren * precioPorKm
        println("El precio de tu billete final será: $precioViaje€")
    }
}