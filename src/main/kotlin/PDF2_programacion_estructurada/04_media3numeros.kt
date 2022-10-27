package funcionesUtiles

//Media de 3 numeros con decimales y redondeada

fun main() {
    print("Introduce tu primera nota para hacer la media:")
    var mediaIntroducida1 = readln().toFloat()
    print("Introduce tu segunda nota para hacer la media:")
    var mediaIntroducida2 = readln().toFloat()
    print("Introduce tu tercera nota para hacer la media:")
    var mediaIntroducida3 = readln().toFloat()

    var media:Float = (mediaIntroducida1+mediaIntroducida2+mediaIntroducida3)/3
    println("Tu media es: $media")
}

