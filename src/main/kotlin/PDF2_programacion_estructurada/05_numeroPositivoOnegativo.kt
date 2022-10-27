package funcionesUtiles

/*
Determinar si un numero leido es negativo o positivo,
hazlo en la funcion main, de manera estructural...
 */
fun main(){
    var entradaNumerica: Int = 0

    print("Introduce un valor para saber si es positivo o negativo:")
    entradaNumerica = readln().toInt()

    if (entradaNumerica > 0){
        println("El valor es positivo")
    }else{
        println("El valor es negativo")
    }
    if (entradaNumerica == 0){
        println("El valor es el valor neutro = $entradaNumerica")
    }
}