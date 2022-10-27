package funcionesUtiles

fun main(){
    var lado:Int= 0
    var perimetro:Int = 0
    var superficie:Int = 0

    do{
        print("Introduce la medida del lado de tu cuadrado:")
        var lado = readln().toInt()
        if (lado == 0){println("Introduce un numero mayor de 0")}
        if (lado < 0){println("Introduce un numero mayor de 0")}
        perimetro = perimetroCuadrado(lado)
        superficie = superficieCuadrado(lado)
    }while(lado <= 0)

    println("Tu perimetro es: $perimetro y tu superficie es: $superficie")
}

fun perimetroCuadrado(lado:Int):Int {
    var perimetro:Int = lado*4
    return perimetro
}

fun superficieCuadrado(lado:Int):Int {
    var superficie:Int = lado*lado
    return superficie
}

