fun main (){
    var num1:Byte = 0
    var num2:Byte = 0
    var num3:Byte = 0

    //DECIR QUE NUMERO ES MAYOR DE TODOS LOS INTRODUCIDOS
    println("Introduce una cantidad de 3 números para decirte cual es mayor:")
    num1 = readln().toByte()
    num2 = readln().toByte()
    num3 = readln().toByte()

    if (num1 > num2 && num1 > num3){
        println("El $num1 es el número mayor")
    }
    if (num2 > num1 && num2 > num3){
        println("El $num2 es el número mayor")
    }
    if (num3 > num1 && num3 > num2){
        println("El $num3 es el número mayor")
    }
}