package funcionesUtiles

//EL ITERATIVO ES MAS EFICIENTE, PERO CONSUMIR MAS DE CPU HACE QUE CONSUMA MENOS DE MEMORIA-RAM???
fun main() {
    val entrada1: Int = readln().toInt()
    var res = 1
    for (i in 1..entrada1) {
        res = res * i
    }
    println("El interativo es: $res")
}


