package type_aliases.learnprogramming.functions.inheritance


fun main(args: Array<String>) {
    val laserPrinter = LaserPrinter("Brother 1234")
    laserPrinter.printModel()

    SomethingElse("whatever")

}


abstract class Printer(val modelName: String) { //se eh abstract ja eh open

    open fun printModel() = println("The model name of this printer is $modelName") //tem que colocar open, pq por default os metodos sao final.
    abstract fun bestSellingPrice(): Double
}

open class LaserPrinter(modelName: String): Printer(modelName) {

    final override fun printModel() = println("The model name of this laser printer is $modelName")
     final override fun bestSellingPrice(): Double = 129.99 //add o final se quiser que nenhuma subsclasse dessa, seja capaz de sobrescvrever esse metodo de novo

}

open class Printer2{ //por default a classe eh final e n pode ser extendida, por isso tem que usar o open
    open fun bestSellingPrice(): Int = 10 //tem que ser open pra poder ser extendido

}
class LaserPrinter2: Printer2{
    constructor(): super() //necessario chamar dessa forma ou igual acima(no ex, tem parametro)
    override fun bestSellingPrice(): Int {return 10} //pode sobrescrever msm o pai sendo concreto

}

////////

open class Something: MySubInterface {

    val someProperty: String
    override val number: Int = 25  //pode sobscrever propriedade

    constructor(someParameter: String) {
        someProperty = someParameter
        println("I'm in the parent's constructor")
    }

    override fun myFunction(str: String): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun mySubFunction(num: Int): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}


class SomethingElse: Something {

    constructor(someOtherParameter: String): super(someOtherParameter) {
        println("I'm in the child's constructor")
    }

}

interface MyInterface {

    val number: Int //node inicializ propriedade em interface. Um contorno eh escrever o proprio get da propriedade como abaixo
    val number2: Int
        get() = number * 100 //em classe da pra escrever "field" inves do real nome da propriedade, em interface nao

    fun myFunction(str: String): String
}

interface MySubInterface: MyInterface {
    fun mySubFunction(num: Int): String
}







//open data class DataClass(val number: Int) {} //n e possivel extender data class
