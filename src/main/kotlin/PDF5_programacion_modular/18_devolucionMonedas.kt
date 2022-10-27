package PDF5

//SIMULACION DEVOLUCION DE MONEDAS DE 3,47€ = 1m 2€, 1m 1€, 2m 0.20€, 1m 0.05€, 1m 0.02€
//SE PUEDE HACER SIN WHILE Y SERÁ MENOS EFICIENTE, ES DECIR HACERLO CON DIVISIONES ES MAS OPTIMO
fun main(){
 calculadoraDeMonedas()
}

fun pedirDinero():Float {
    do{
        println("Introduce el dinero que quieres se te devuelva:")
        var dinero = readln().toFloatOrNull()
        if (dinero != null){
            return dinero
        }else{
            println("Introduce los centimos con un punto(.) en vez de coma(,)")
        }
    }while(true)
}

//ESTA CALCULADORA, CALCULARA LAS MONEDAS QUE HABRA DE CADA TIPO EN FUNCION DE pedirDinero()
fun calculadoraDeMonedas() {
    val MONEDA_1:Float = 2.00f
    val MONEDA_2:Float = 1.00f
    val MONEDA_3:Float = 0.50f
    val MONEDA_4:Float = 0.20f
    val MONEDA_5:Float = 0.10f
    val MONEDA_6:Float = 0.05f
    val MONEDA_7:Float = 0.02f
    val MONEDA_8:Float = 0.01f
    var contador1:Int = 0
    var contador2:Int = 0
    var contador3:Int = 0
    var contador4:Int = 0
    var contador5:Int = 0
    var contador6:Int = 0
    var contador7:Int = 0
    var contador8:Int = 0
    var dineroCambiar:Float = pedirDinero()

    while(dineroCambiar >= MONEDA_1) {
        dineroCambiar = dineroCambiar - MONEDA_1
        contador1 = contador1 + 1
    }
    while(dineroCambiar >= MONEDA_2) {
        dineroCambiar = dineroCambiar - MONEDA_2
        contador2 = contador2 + 1
    }
    while(dineroCambiar >= MONEDA_3) {
        dineroCambiar = dineroCambiar - MONEDA_3
        contador3 = contador3 + 1
    }
    while(dineroCambiar >= MONEDA_4) {
        dineroCambiar = dineroCambiar - MONEDA_4
        contador4 = contador4 + 1
    }
    while(dineroCambiar >= MONEDA_5) {
        dineroCambiar = dineroCambiar - MONEDA_5
        contador5 = contador5 + 1
    }
    while(dineroCambiar >= MONEDA_6) {
        dineroCambiar = dineroCambiar - MONEDA_6
        contador6 = contador6 + 1
    }
    while(dineroCambiar >= MONEDA_7) {
        dineroCambiar = dineroCambiar - MONEDA_7
        contador7 = contador7 + 1
    }
    while(dineroCambiar >= MONEDA_8) {
        dineroCambiar = dineroCambiar - MONEDA_8
        contador8 = contador8 + 1
    }
    println("Tu cambio corresponde a: $contador1 moneda(s) de 2€, $contador2 moneda(s) de 1€,")
    println("$contador3 moneda(s) de 0.50€, $contador4 moneda(s) de 0,20€, $contador5 moneda(s) de 0,10€,")
    println("$contador6 moneda(s) de 0,05€, $contador7 moneda(s) de 0,02€ y $contador8 moneda(s) de 0,01€")
}