package funcionesUtiles

/*
Si el año es uniformemente divisible por 4, vaya al paso 2. ...
Si el año es uniformemente divisible por 100, vaya al paso 3. ...
Si el año es uniformemente divisible por 400, vaya al paso 4. ...
El año es un año bisiesto (tiene 366 días).
*/

fun main() {
    var entrada: Int = 0
    entrada = readln().toInt()
//Un año es bisiesto en el calendario Gregoriano, si es divisible entre 4
// y no divisible entre 100, y también si es divisible entre 400.
    if (entrada % 4 == 0 && entrada % 100 != 0 && entrada % 400 == 0) {
        print("$entrada no es bisiesto")
    } else {
        print("$entrada es bisiesto")
    }
}