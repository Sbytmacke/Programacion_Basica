package funcionesUtiles

fun main(){
    var ladoA:Int= 0
    var ladoB:Int= 0
    var perimetro:Int = 0
    var superficie:Int = 0

    do{
        print("Introduce la medida del lado A de tu cuadrado:")
        var ladoA = readln().toInt()
        print("Introduce la medida del lado B de tu cuadrado:")
        var ladoB = readln().toInt()
        if (ladoA == 0 || ladoB == 0){println("Introduce un numero distinto de 0")}
        if (ladoA < 0 || ladoB < 0){println("Introduce un numero mayor de 0")}
        perimetro = perimetroRectangulo(ladoA,ladoB)
        superficie = superficieRectangulo(ladoA, ladoB)
    }while(ladoA <= 0 || ladoB <= 0)

    println("Tu perimetro es: $perimetro y tu superficie es: $superficie")
}

fun perimetroRectangulo(ladoA:Int, ladoB:Int):Int {
    var perimetro:Int = ladoA + ladoB
    return perimetro
}

fun superficieRectangulo(ladoA:Int, ladoB:Int):Int {
    var superficie = ladoA * ladoB
    return superficie
}