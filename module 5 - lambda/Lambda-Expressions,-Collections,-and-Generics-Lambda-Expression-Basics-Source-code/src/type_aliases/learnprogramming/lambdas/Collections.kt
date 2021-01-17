package type_aliases.learnprogramming.lambdas


fun main(args: Array<String>) {

    val strings = listOf("spring", "summer", "fall", "winter") //immutable, return a new colletion
    println(strings.javaClass)
    println(strings.asReversed())
    println(strings)

    val emptyList = emptyList<String>()
    println(emptyList.javaClass)
    //println(emptyList[0])  //Exeception!!!
    if (!emptyList.isEmpty()) {
        println(emptyList[0])
    }

    val notNullList = listOfNotNull("hello", null, "goodbye") //nao add o null
    println(notNullList)

    val arraylist = mutableListOf(1, 2, 4) //mutable, as the arrayListOf
    println(arraylist.javaClass)
    println(arraylist[2])
    arraylist[1] = 20
    println(arraylist)


    val array = arrayOf("black", "white", "green")
    val colorList = array.toList()
    println(colorList)


    val ints = intArrayOf(1, 2, 3)
    println(ints.toList())
}