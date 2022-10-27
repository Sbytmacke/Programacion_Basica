fun main() {
    print("Tu numero de lotería es:")
    for (i in 1..6) {
        val aleatorio: Int = (1..49).random()
        print(" $aleatorio")
    }
}