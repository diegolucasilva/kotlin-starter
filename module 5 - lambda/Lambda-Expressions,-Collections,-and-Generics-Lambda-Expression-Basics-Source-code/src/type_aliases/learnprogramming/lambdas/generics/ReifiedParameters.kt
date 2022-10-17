package type_aliases.learnprogramming.lambdas.generics

import java.math.BigDecimal


/*
Reifiable(reificavel): encarar (algo abstrato) como uma coisa material ou concreta; coisificar.
transformar em coisa; dar o caráter de coisa a.

https://dev.java/learn/type-erasure/

A reifiable type is a type whose type information is fully available at runtime.
This includes primitives, non-generic types, raw types, and invocations of unbound wildcards.

Non-reifiable types are types where information has been removed at compile-time by type erasure


Non-reifiable types are types where information has been removed at compile-time by type erasure — invocations of generic types that are not defined as unbounded wildcards.
A non-reifiable type does not have all of its information available at runtime.
Examples of non-reifiable types are List<String> and List<Number>;
the JVM cannot tell the difference between these types at runtime.
As shown in the Restrictions on Generics section, there are certain situations where non-reifiable
types cannot be used: in an instanceof expression, for example, or as an element in an array.
 */

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

