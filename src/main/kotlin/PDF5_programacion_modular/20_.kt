package PDF5

import funcionesUtiles.entradaEnteroNumerico

//Realiza un programa que admita tres números enteros y los devuelva ordenados de
//menor a mayor

fun main(){

    var numero1:Int = entradaEnteroNumerico("Introduce tu primer numero entero:")
    var numero2:Int = entradaEnteroNumerico("Introduce tu segundo numero entero:")
    var numero3:Int = entradaEnteroNumerico("Introduce tu tercer numero entero:")
    ordenar3Numeros(numero1, numero2, numero3)

}

fun ordenar3Numeros(num1:Int,num2:Int,num3:Int){

    var mayorNum:Int = 0
    var medioNum:Int = 0
    var menorNum:Int = 0

    if(num1>num2 && num1>num3){
        mayorNum = num1
    } else if (num1>num2 && num1<num3){
        medioNum = num1
    }else if (num1<num2 && num1>num3){
        medioNum = num1
    }else{
        menorNum = num1
    }

    if(num2>num1 && num2>num3){
        mayorNum = num2
    } else if (num2>num1 && num2<num3){
        medioNum = num2
    }else if (num2<num1 && num2>num3){
        medioNum = num2
    }else{
        menorNum = num2
    }

    if(mayorNum == 0){
        mayorNum = num3
    }else if (medioNum == 0){
        medioNum = num3
    }else{
        menorNum = num3
    }

   println("Tus numeros ordenados son de mayor a menor orden: $mayorNum $medioNum $menorNum")
}