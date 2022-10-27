import funcionesUtiles.continuar_Y_N

//JUEGO  del 1 al 100
fun main () {
    println("JUEGO DEL NUMERO SECRETO")
    println("Tendrás 5 intentos")
    juegoProcedimiento()
}
//COMO MANTENER EL NUMERO ALEATORIO Y AL REINTANTER SE SIGUE MANTENIENDO
fun juegoProcedimiento () {
    var aleatorio:Int = (1..100).random()
    var respuesta:Int = 1
    //Hasta un maximo de 5 incluido
    var intentos:Int = 5

    do{
        do{
            println("Introduce un numero comprendido entre el 1 y 100:")
            respuesta = readln().toIntOrNull() ?: 0

        }while(respuesta < 1 || respuesta > 100)

        if (intentos == 0){
            intentos = intentos + 5
        }
        if (respuesta < 1 || respuesta > 100) {
            println("Introduce un numero comprendido entre el 1 y 100")
        }
        if (aleatorio < respuesta) {
            println("PISTA: Tu intento ha sido mayor que el nªSecreto")
        }
        if (aleatorio > respuesta) {
            println("PISTA: Tu intento ha sido menor que el nºSecreto")
        }
        if (aleatorio != respuesta) {
            intentos = intentos - 1
            println("Te quedan $intentos intentos")
        }
        if (aleatorio == respuesta) {
            println("¡HAS GANADO!")
        }
        if (intentos == 0){
            println("¡HAS PERDIDO!")
        }
    }while(continuar_Y_N("Quieres continuar? (Y/N)"))

}
