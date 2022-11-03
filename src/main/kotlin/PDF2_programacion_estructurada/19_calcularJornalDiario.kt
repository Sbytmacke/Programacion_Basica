package funcionesUtiles

fun main() {
    val salarioDiurnoPorHora: Int = 20
    val salarioNocturnoPorHora: Int = 35
    val salarioDiurnoDomingoPorHora: Int = 30
    val salarioNocturnoDomingoPorHora: Int = 50

    var entradaTurno: Char = ' '
    var horasTrabajadas: Int = 0
    var salario: Int = 0

    println("¿Cual es tu turno? Diurno o Nocturno (D/N):")
    entradaTurno = readln()[0]

    if (entradaTurno == 'D' || entradaTurno == 'd') {
        println("¿Cuantas horas has trabajado?:")
        horasTrabajadas = readln().toInt()
        salario = salarioDiurnoPorHora * horasTrabajadas
    }
    if (entradaTurno == 'N' || entradaTurno == 'n') {
        println("¿Cuantas horas has trabajado?: ")
        horasTrabajadas = readln().toInt()
        salario = salarioNocturnoPorHora * horasTrabajadas
    }
    println("Tu salario actual es: $salario€")


    println("PAGAS EXTRAS:")

    println("¿Cuantas horas has trabajado un Domingo Diurno?:")
    horasTrabajadas = readln().toInt()

    println("¿Cuantas horas has trabajado un Domingo Nocturno?:")
    horasTrabajadas = readln().toInt()

    salario =
        salario + (horasTrabajadas * salarioDiurnoDomingoPorHora) + (horasTrabajadas * salarioNocturnoDomingoPorHora)
    println("Tu salario final con pagas extras es: $salario")
}