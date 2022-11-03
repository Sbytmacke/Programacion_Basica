package funcionesUtiles

import kotlin.math.sqrt

fun main() {
    var a: Double = 0.0
    var b: Double = 0.0
    var c: Double = 0.0

    println("Introduce tus valores del discriminante: ")
    println("Valor a: ")
    a = readln().toDouble()
    println("Valor b: ")
    b = readln().toDouble()
    println("Valor c: ")
    c = readln().toDouble()

    val discriminante: Double = (b * b) - (4 * a * c)

    if (discriminante > 0.0) {
        val sol1 = (-b + sqrt(discriminante)) / (2 * a)
        val sol2 = (-b - sqrt(discriminante)) / (2 * a)
        println("Tus dos soluciones: $sol1 y $sol2")
    } else if (discriminante == 0.0) {
        val sol3 = (-b / (2 * a))
        println("Únicamente hay una solución siendo: $sol3")
    } else {
        println("No hay soluciones reales")
    }
}

/*  //se puede utilizar un when
   val discriminante = b*b - 4*a*c
  when {
    discriminante > 0.0 -> println ( "dos soluciones reales")
    val sol1 = (-b + Math.sqrt(discriminante)) / (2 * a)
    val sol2 = (-b - Math.sqrt(discriminante)) / (2 * a)
    println("Las soluciones son: $sol1 y $sol2")

    discriminante == 0.0 -> println ( "una solución real")

    discriminante < 0.0 -> println ( "no hay solución real")
  }*/


