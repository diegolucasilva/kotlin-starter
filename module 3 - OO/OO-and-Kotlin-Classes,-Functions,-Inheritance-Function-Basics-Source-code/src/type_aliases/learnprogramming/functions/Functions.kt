package type_aliases.learnprogramming.functions
//o retorno default eh "unit"
//function
fun main(args: Array<String>) {
    println(labelMultiply(label = "Here's the result:", operand2 = 3, operand1 = 4))

    val emp = Employee("Jane")
    println(emp.upperCaseFirstName())

    val car1 = Car("blue", "Toyota", 2015)
    val car2 = Car("red", "Ford", 2016)
    val car3 = Car("grey", "Ford", 2017)

    printColors(car1, car2, car3)
    printColors2(car1, car2, car3, str="A") // Obrigatorio usar label por causa do vargs a nao ser que ele seja antes do vargargs

    val numbers = arrayOf(1, 2, 3)

    val manyCars = arrayOf(car1, car2, car3)
    printColors(*manyCars) //colcar * que ele ja converte para varargs

    val moreCars = arrayOf(car2, car3)
    val car4 = car2.copy()
    val lotsOfCars = arrayOf(*manyCars, *moreCars, car4) //pra converter para 1 unico array, precisa do *. Senao esse array iria ter 3 elementos so(2 do tipo array, e 1 tipo car)
    for (c in lotsOfCars) {
        println(c)
    }
}

fun printColors(vararg cars: Car) {
    for (car in cars) {
        println(car.color)
    }
}

fun printColors2(vararg cars: Car, str: String) { // obritario usar o label parametro quando tem varargs junto
    for (car in cars) {
        println(car.color)
    }
}

fun whatever() = 3 * 4

//n explicou direito pra que serve o inline
inline fun labelMultiplyVerbose(operand1: Int, operand2: Int, //forma mais verbosa
                         label: String) : String{
    return ("$label ${operand1 * operand2}")
}


fun labelMultiply(operand1: Int, operand2: Int,
                  label: String = "The answer is:") =
    "$label ${operand1 * operand2}"


class Employee(val firstName: String) {

    fun upperCaseFirstName() = firstName.toUpperCase() //sem retorno = Unit, se tiver retorna, ai teria que colocar :String

}

data class Car(val color: String, val model: String, val year: Int) {

}



