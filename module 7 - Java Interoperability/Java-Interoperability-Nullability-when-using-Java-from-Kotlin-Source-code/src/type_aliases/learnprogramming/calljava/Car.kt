@file:JvmName("StaticCar")  //mudar o nome da classe que Static que o java ira chamar os metodos topLevel

package type_aliases.learnprogramming.calljava

import java.io.IOException

fun topLevel() = println("I'm in the Car file!")  //uma classe chamada CarStatic sera criada automaticamente

fun main(args: Array<String>) {
    "Print this".print()
    Car.carComp()
}

@JvmOverloads fun defaultArgs(str: String, num: Int = 25) {}

@Throws(IOException::class)
fun doIO() {
    throw IOException()
}

object SingletonObj { //cria um singleton
    @JvmStatic fun doSomething() = println("I'm doing something in the singleton object") //JvmStatic permite chamar como um metodo estatico
}
//para val so gera get

class Car(val color: String, @JvmField val model: String, val year: Int) {

//    var color: String = color
//        private set(value) {
//            field = "always green"
//        }

    companion object {
        const val constant = 25
        @JvmField val isAuto = false
        @JvmStatic fun carComp() = println("I'm in Car's companion object") //permite chamar como metodo estatico no java
    }

    fun printMe(text: String) { //expected non nuallbe type
        println("I don't expect a null value")
    }




}

fun String.print() { //No java deve ser chamado como um metodo estatico StaticCar.print("fdsasd")
    println(this)
}