package type_aliases.learnprogramming.lambdas.generics

import java.math.BigDecimal


fun main(args: Array<String>) {

    val list = mutableListOf("Hello")
    list.add("another string")
    list.printCollection()


    val bdList = mutableListOf(BigDecimal(-33.45), BigDecimal(3503.99),
            BigDecimal(0.329))
    bdList.printCollection()

}

//defined extension function
fun <T> List<T>.printCollection() {
    for (item in this) {
        println(item) //essa funcao ja eh nullable(?)
    }
}

//defined extension function
fun <T: Any> List<T>.printCollection3() { //com o Any ele deixa de aceitar nullable
    for (item in this) {
        println(item)
    }
}
fun <T> printCollectionVerbose(collection :List <T>) {
    for (item in collection) {
        println(item)
    }
}