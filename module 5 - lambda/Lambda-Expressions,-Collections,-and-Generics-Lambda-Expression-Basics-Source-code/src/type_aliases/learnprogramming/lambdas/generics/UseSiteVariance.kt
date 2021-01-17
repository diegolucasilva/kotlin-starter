package type_aliases.learnprogramming.lambdas.generics


fun main(args: Array<String>) {

    val cars1 = mutableListOf(Car(), Car())
    val cars2: MutableList<Car> = mutableListOf()
    copyCars(cars1, cars2) //funciona sem o out, pq o o tipo Pai

    val fords1 = mutableListOf(Ford(), Ford())
    val fords2: MutableList<Ford> = mutableListOf()
    copyCars(fords1, fords2) //precisa do out, pra deixar passar um subtipo

    copyCars(fords1, cars2) //o out no primero argumento, deixa que o T seja um subtipo

    val cars3: MutableList<Car> = mutableListOf(Ford(), Ford())

}
//out eh so retorno, nao pode usar o add
//T tem que ser um Car
fun <T: Car> copyCars(source: MutableList<out T>, destination: MutableList<T>) {
    for (car in source) {
        //source.add(car) out protected
        destination.add(car)
    }
}

open class Car {}
class Toyota: Car() {}
class Ford: Car() {}

// List<? extends Car> covarience

// List<? super Car>   contravarience