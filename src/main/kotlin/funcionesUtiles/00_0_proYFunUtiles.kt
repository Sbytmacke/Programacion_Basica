package funcionesUtiles

fun continuar_Y_N(mensaje: String):Boolean{
    var respuesta:String = "n"
    do{
        println(mensaje)
        respuesta = readln()
        if (respuesta == "y" || respuesta == "Y"){
            return true
        }
        if (respuesta == "n" || respuesta == "N"){
            return false
        }
    }while(true)
}

fun exponente(num:Int,numExponente:Int):Int{
    var numBase:Int = num
    var numResultado:Int = 1
    val ZERO:Int = 1

    if (numExponente == 0){
        return ZERO
    }else{
        for(i in 1..numExponente){
            numResultado = numBase*numResultado
        }
        return numResultado
    }
}

fun entradaEnteroNumerico(mensaje: String):Int{
    var entrada:Int? = 0
    do{
        println(mensaje)
        entrada = readln().toIntOrNull()
        if(entrada != null){
            return entrada
        }else{
            println("Introduce un valor entero")
        }
    }while(true)
}

fun entradaFloatNumerico(mensaje: String):Float{
    var entrada:Float? = 0f
    do{
        println(mensaje)
        entrada = readln().toFloatOrNull()
        if(entrada != null){
            return entrada
        }else{
            println("Introduce un valor decimal")
        }
    }while(true)
}
