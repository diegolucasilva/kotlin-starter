package type_aliases.learnprogramming.functions.accessmodifier

val MY_CONSTANT = 100 //tem que val(n pode ser alterado, var = pode ser alterado

fun main(args: Array<String>) {
    println(MY_CONSTANT)

    val car = Car("blue", "Toyota", 2015)
    println(car) //toString ja veio pq eh data class
    val car2 = Car("blue", "Toyota", 2015)
    println(car == car2) //equals ja vem pronto comparando pelas propriedades
    val car3 = car.copy()  //copia as propridades, tb ja vem pronto
    println(car3)
    val car4 = car.copy(year = 2016, color = "green") //copy com mudanca so de dois parametros
    println(car4)

}
//ja vem com toString, copy, equals(). Usado pra armazenar estado
data class Car(val color: String, val model: String, val year: Int) {

}

class Employee(val firstName: String, fullTime: Boolean = true){ // sem "val" ou "var" eh so um parametro regular, seu get e set ta abaixo

    var fullTime = fullTime
    get() {
        println("Running the custom get")
        return field
    }
    set(value) {
        println("Running the custom set")
        field = value
    }

}


