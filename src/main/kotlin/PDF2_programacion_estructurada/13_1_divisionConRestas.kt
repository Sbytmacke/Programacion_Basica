fun main () {
  var cociente:Int = restaYCuentaHastaCero(40, 2)
  println(cociente)
}

fun restaYCuentaHastaCero (num1: Int, num2: Int): Int {
  var contador = 0
  var res = 1
  do {
    res = num1 - num2
    contador = contador + 1
  }while (res >= 0)

  return contador
}