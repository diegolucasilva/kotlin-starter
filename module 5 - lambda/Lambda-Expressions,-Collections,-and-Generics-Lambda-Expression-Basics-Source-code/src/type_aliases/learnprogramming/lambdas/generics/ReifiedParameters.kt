package type_aliases.learnprogramming.lambdas.generics

import java.math.BigDecimal


fun main(args: Array<String>) {

    val mixedList: List<Any> = listOf("string", 1, BigDecimal(22.5), "fall",
            BigDecimal(-5938.393849))
    val bigDecimalsOnly = getElementsOfType<String>(mixedList)
    for (item in bigDecimalsOnly) {
        println(item)
    }

}

//reified faz com que o tipo so seja checado em runtime. inline tb eh obrigatorio nesse caso
//the type isnt arrased until runtime
inline fun <reified T> getElementsOfType(list: List<Any>): List<T> {

    var newList: MutableList<T> = mutableListOf()
    for (element in list) {
        if (element is T) { //sem o refieid isso nao compila, pq o compilador n sabe que tipo o T sera, só depois de compilado
            newList.add(element)
        }
    }

    return newList

}

