package PDF5

import funcionesUtiles.entradaEnteroNumerico

//PARA RECOGER VARIOS RETURN, SE DEBE HACER UNO POR FUNCION Y DESPUES JUNTARLOS EN LA MAIN
fun main(){
    var anno:Int = preguntarAnno("Introduce el año actual (debe ser de 4 cifras):")
    var mes:Int = preguntarMes("Introduce el mes actual:")
    var dia:Int = preguntarDia("Introduce el dia actual:")

    var annoNacimiento:Int = preguntarAnno("Introduce tu año de nacimiento (debe ser de 4 cifras):")
    var mesNacimiento:Int = preguntarMes("Introduce tu mes de nacimiento:")
    var diaNacimiento:Int = preguntarDia("Introduce tu dia de nacimiento:")

    var annoEdad:Int = 0
    var mesEdad:Int = 0
    var diaEdad:Int = 0

    //PREGUNTAR FECHA ACTUAL Y FECHA DE NACIMIENTO
    println("La fecha actual es: año=$anno mes=$mes dia=$dia")
    println("Tu fecha de nacimiento: año=$annoNacimiento mes=$mesNacimiento dia=$diaNacimiento")

    //FINALMENTE SE DETERMINARA CUAL ES LA EDAD DEL USUARIO
    annoEdad = anno - annoNacimiento
    println("Tu edad es de: $annoEdad años")
}

fun preguntarAnno(mensaje:String):Int {
    do {
        var anno:Int = entradaEnteroNumerico(mensaje)
        if (anno < 1900) {
            println("Debe ser un numero entre 1900 y 2022")
        } else if (anno > 2022) {
            println("Debe ser un numero entre 1900 y 2022")
        } else {
            return anno
        }
    } while (true) //cambiar por (true) cuando se haga funcion y tenga un return que me cree el (false)
}

fun preguntarMes(mensaje:String):Int {
    do {
        var mes:Int = entradaEnteroNumerico(mensaje)
        if (mes < 1) {
            println("Debe ser un numero entre 1 y 12")
        } else if (mes > 12) {
            println("Debe ser un numero entre 1 y 12")
        } else {
            return mes
        }
    } while (true) //cambiar por (true) cuando se haga funcion y tenga un return que me cree el (false)
}

fun preguntarDia(mensaje:String):Int {
    do {
        var dia:Int = entradaEnteroNumerico(mensaje)
        if (dia < 1) {
            println("Debe ser un numero entre 1 y 31")
        } else if (dia > 31) {
            println("Debe ser un numero entre 1 y 31")
        } else {
            return dia
        }
    } while (true)
}


