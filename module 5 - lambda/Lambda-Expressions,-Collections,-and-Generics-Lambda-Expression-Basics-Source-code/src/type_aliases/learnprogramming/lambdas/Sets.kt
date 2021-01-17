package type_aliases.learnprogramming.lambdas


fun main(args: Array<String>) {

    val setInts = setOf(10, 15, 19, 5, 3, -22)
    println(setInts.plus(20))
    println(setInts.plus(10)) //n add elemento duplicado
    println(setInts.minus(19))
    println(setInts.minus(100))
    println(setInts.average())
    println(setInts.drop(3))
    println(setInts.filter{it % 2 != 0})

}




