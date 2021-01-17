package type_aliases.learnprogramming.lambdas.generics



fun main(args: Array<String>) {

    val ints = listOf(1, 2, 3, 4, 5)
    val shorts: List<Short?> = listOf(10, 20, 30, 40)
    val floats: List<Float?> = listOf(100.3f, -459.43f)
    val strings = listOf("1", "2", "3")

    if (strings is List<String>) { //isso nao eh possivel no java
        println("This list contains strings")
    }

    var listAny: Any = listOf("str1", "str2")
    /*if (listAny is List<String>) { nao compila
        println("Yes, this is a list. Thank you star projection!")
    }*/
    if (listAny is List<*>) {
        println("Yes, this is a list. Thank you star projection!")
    }

    listAny = listOf(1, 2, 3)
    if (listAny is List<*>) {
        println("This list contains strings")
        val strList = listAny as List<String>
        println(strList[1].replace("str", "string"))
    }

    convertToInt(floats)
    //convertToInt(shorts)
    //convertToInt(strings)

    append(StringBuilder("String 1"), StringBuilder("String 2"))


}


fun <T> append(item1: T, item2: T)
    where T: CharSequence, T: Appendable {
    println("Result is ${item1.append(item2)}")
}

//so aceita tipo number, se for null, n da nullpointer por causa do ?
fun <T: Number?> convertToInt(collection: List<T>) {
    for (num in collection) {
        println("${num?.toInt()}")
    }
}