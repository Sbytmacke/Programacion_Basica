package funcionesUtiles

//EL ITERATIVO ES MAS EFICIENTE, PERO CONSUMIR MAS DE CPU HACE QUE CONSUMA MENOS DE MEMORIA-RAM???
fun main(){
println("El interativo es: ${factorialIterativo(15)}") //y el recursivo: $recursivo")
//println("El recurisvo es: ${factorialRecursivo(4)}")
}

fun factorialIterativo(num:Int):Int{
    var res = 1
    for(i in 1..num){
        res = res * i
    }
    return res
}

//ES IMPORTANTE DECIRLE QUE PARE EN LAS RECURSIVIDADES PARA QUE NO HAGA STACKOVERFLOW, DEBEMOS PONER CONDICION DE PARADA
//fun factorialRecursivo(num:Int):Int{
//    num = factorialRecursivo(num)
//}


