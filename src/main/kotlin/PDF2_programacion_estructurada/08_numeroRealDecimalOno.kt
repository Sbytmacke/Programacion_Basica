package funcionesUtiles

//Determinar si un numero real es decimal o no
fun main() {
    var entradaDecimal: Double = 0.0
    var conversionEnteraUno: Int = 0
    var conversionEnteraDos: Int = 0

    entradaDecimal = readln().toDouble()
    conversionEnteraUno = (entradaDecimal * 10).toInt()
    conversionEnteraDos = (entradaDecimal.toInt()) * 10

    if (conversionEnteraUno == conversionEnteraDos) {
        println("${entradaDecimal.toInt()} no es decimal")
    } else {
        println("$entradaDecimal es decimal")
    }
}