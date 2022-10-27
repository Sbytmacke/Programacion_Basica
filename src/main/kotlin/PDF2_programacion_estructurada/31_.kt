package funcionesUtiles

fun main(){
}

fun mioPrimo () {
  var numero = 0
  var contador=0
  var resto= 0
  // Es posible que sea mas sencillo si filtramos con IF si divimos entre pares e impares
  do{
    print("Introduce el numero para saber si es primo: ")
    numero = readln().toInt()
    if (numero == 0){println("Introduce un numero menor o mayor a 0")}
  }while(numero == 0)

  for(i in 1..numero){
    resto = numero%i

    if(resto == 0){
      contador = contador+1
    }
  }
  if(contador == 2){
    print("Si es primo")
  }else{println("No es primo")}
}
