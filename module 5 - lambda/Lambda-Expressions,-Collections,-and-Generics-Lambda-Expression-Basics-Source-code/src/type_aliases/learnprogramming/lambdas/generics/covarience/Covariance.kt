package type_aliases.learnprogramming.lambdas.generics.covarience
/*

https://medium.com/@yuhuan/covariance-and-contravariance-in-java-6d9bfb7f6b8e

Covarient: que varia no mesmo sentido;

In Java won’t allow a List<Cat> to be passed to a List<Animal>. In Kotlin we have the special keyword OUT
 */




fun main(args: Array<String>) {

    val shortList: List<Short> = listOf(1, 2, 3, 4, 5) //coverient pq eh so read only,quer que o subtivo seja preservado, Não tem como criar uma lista com N subtipos
    convertToIntCovarience(shortList)

    val shortListMutable: MutableList<Short> = mutableListOf(1, 2, 3, 4, 5) //invarient. Generics is invarient
   // convertToIntMutable(shortListMutable) ///nao compila, pq n quer deixar tentar passar um subtipo invalido e dar erro

}

fun convertToIntMutable(collection: MutableList <Number>) {
    /* IMPORTANTE!!
      A lista passada por parametro é de SHORT na linha 11 (generics) e no metodo abaixo tentamos add um FlOAT,iria dar erro de compilacao,
      POR ISSO, quando a tipo da classe é in (invarient) o tipo deve ser o mesmo da declaracao do metodo (linha 16)
     */
    //collection.add(255555555555555555555555555.3)
    for (num in collection) {
        println("${num.toInt()}")
        if(collection.contains(10)){
            println("O metodo contains possui a anotacao @UnsafeVariance, pois ele garante que não vai modificar a lista, só vai ver se o elemento passado existe")
        }
    }

}

fun convertToIntCovarience(collection: List<Number>) {
   // collection.add(255555555555555555555555555.3) //pode passar subtipo, pq eh imutavel
    for (num in collection) {
        println("${num.toInt()}")
    }
}

fun tendGarden(roseGarden: Garden<Rose>) {
    waterGarden(roseGarden)
    //waterGardenInvarient(roseGarden) nao compila, esse classe espera que seja Flower, n pode se subtipo
}

fun waterGarden(garden: Garden<Flower>) {
}

open class Flower {}
class Rose: Flower() {}


class GardenInvarient<T: Flower>{}
fun waterGardenInvarient(garden: GardenInvarient<Flower>) {}

//o "out" deixa a classe covarient. Ou seja, pode receber subtipos. Agora essa classe é imutavel
//out -> so pode ser usado no retorno de tipos
//in -> parametro de entrada
class Garden<out T: Flower>(private var something: T) { //so pode declarar private(que ai o get e set vai ser privado) ou val(so tem get)

    val flowers: List<T> = listOf()

    fun pickFlower(i: Int): T = flowers[i] //retorna a flower to tipo T do indice pasado
   //fun plantFlower(flower: T) {} //nao compila, n pode receber parametros de entrada, so saida. Se usar @UnsafeVariance ele deixa
    //Ele esta tentando prevenir que passe varios subtipos de T, gerando um mix de Flowers (esse não é objetivo, no exemplo, só quermos um jardin de Rosas)
}