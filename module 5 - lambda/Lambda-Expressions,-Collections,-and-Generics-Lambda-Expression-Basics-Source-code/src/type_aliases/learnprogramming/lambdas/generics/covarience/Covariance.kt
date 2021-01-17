package type_aliases.learnprogramming.lambdas.generics.covarience




fun main(args: Array<String>) {

    val shortList: List<Short> = listOf(1, 2, 3, 4, 5) //coverient pq eh so read only
    convertToIntCovarience(shortList)

    val shortListMutable: MutableList<Short> = mutableListOf(1, 2, 3, 4, 5) //
   // convertToIntMutable(shortListMutable) ///nao compila, pq n quer deixar tentar passar um subtipo invalido e dar erro

}

fun convertToIntMutable(collection: MutableList <Number>) {
    //collection.add(255555555555555555555555555.3) //por isso que ele n deixa, isso daria um erro de c
    for (num in collection) {
        println("${num.toInt()}")
    }
}

fun convertToIntCovarience(collection: List<Number>) {
    //collection.add(255555555555555555555555555.3) //pode passar subtipo, pq eh imutavel
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

//o "out" deixa a classe covarient. Ou sja, pode receber subtipos
//out -> so pode ser usado no retorno de tipos
//in -> parametro de entrada
class Garden<out T: Flower>(private var something: T) { //so pode declarar private(que ai o get e set vai ser privado) ou val(so tem get)

    val flowers: List<T> = listOf()

    fun pickFlower(i: Int): T = flowers[i] //retorna a flower to tipo T do indice pasado
   //fun plantFlower(flower: T) {} //nao compila, n pode receber parametros de entrada, so saida. Se usar @UnsafeVariance ele deixa
}