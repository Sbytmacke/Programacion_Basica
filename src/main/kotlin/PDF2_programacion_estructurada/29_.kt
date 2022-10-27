package funcionesUtiles

fun main(){
    organizadorNotas()
}

fun organizadorNotas() {
    var notas:Int = 0
    var alumnos:Int = 0
    var contador:Int = 1

    var aprobados:Int = 0
    var suspensos:Int = 0

    var sobresalientes:Int = 0
    var notables:Int = 0
    var bienes:Int = 0

    do{
        print("Introduce los alumnos que presenta tu clase:")
        alumnos = readln().toInt()
        if (alumnos < 0) {println("Introduce un numero positivo")}
        if (alumnos == 0) {println("Introduce un valor distinto de cero")}
    }while(alumnos <= 0)

    do{
        print("Introduce la nota "+contador+" que presenta tu alumno "+contador+":")
        notas = readln().toInt()
        if (notas < 0) {println("Introduce un numero positivo")}
        if (notas > 10){println("Introduce una nota comprendida entre 0 y 10")}

        if (notas in 5..10) {
            aprobados = aprobados + 1
            contador = contador + 1
        }
        if (notas in 0..4) {
            suspensos = suspensos + 1
            contador = contador + 1
        }

        if (notas == 5 || notas == 6) {
            bienes = bienes + 1
        }
        if (notas == 7 || notas == 8){
            notables = notables + 1
        }
        if (notas == 9 || notas == 10){
            sobresalientes = sobresalientes + 1
        }
        }while(contador <= alumnos || notas <= 0)

    println("Tu clase ha tenido un total de $aprobados aprobados y $suspensos suspensos")
    print("Con un total de $bienes bienes, $notables notables y $sobresalientes sobresalientes")
}
