package funcionesUtiles

fun main() {
    var hora: Int = 0
    var minutos: Int = 0
    var segundos: Int = 0

    println("Introduce la hora actual, para saber la hora al pasar un segundo:")
    print("Hora: ")
    hora = readln().toInt()
    print("Minutos: ")
    minutos = readln().toInt()
    print("Segundos: ")
    segundos = readln().toInt()

    segundos += 1
    if (segundos == 60) {
        segundos = 0
        minutos += 1
    }
    if (minutos == 60) {
        minutos = 0
        hora += 1
    }
    if (hora == 25) {
        hora = 1
    }
    println("Tu hora actual al pasar un segundo es -> $hora:$minutos:$segundos")
}