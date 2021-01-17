package type_aliases.learnprogramming.calljava

import type_aliases.learnprogramming.javacode.Car


fun main(args: Array<String>) {

    val car = Car("blue", "Ford", 2015)
    car.color = "green"
    println(car)

    car.variableMethod(5, "hello", "goodbye")
    val strings = arrayOf("hello", "goodbye")
    car.variableMethod(10, *strings)

    car.wantsIntArray(intArrayOf(1, 2, 3))

    println("x = ${Car.x}")
    println(Car.xString())

    car.demoMethod( { println("I'm in a thread!") }) //passando uma lambda para um metodo

    //car.anObject as java.lang.Object).notify() //por default um Object no java vira um Any no kt, por isso ele faz um cast para o Object

    //var model: String = car.model
    //println(model.javaClass)
    //model = null    //N compila pq o String do kt eh not null. Se tirar o String da declaracao compila
    //println(model)

    //val color: Int = car.color

}