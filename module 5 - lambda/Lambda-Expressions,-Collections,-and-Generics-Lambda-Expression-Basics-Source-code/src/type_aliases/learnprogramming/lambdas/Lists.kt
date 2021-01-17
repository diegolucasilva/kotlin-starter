package type_aliases.learnprogramming.lambdas


fun main(args: Array<String>) {

    val strings = listOf("spring", "summer", "fall", "summer", "winter") //imuutable
    val colorList = listOf("black", "white", "red", "black", "red")  //imuutable

    val mutableSeasons = strings.toMutableList()
    mutableSeasons.add("some other season")
    println(mutableSeasons)

    println(strings.last())

    println(strings.asReversed())

    println(strings.getOrNull(5)) //se nao tiver o 5 index retorna null

    println(colorList.zip(strings)) //cria Pars, com as duas listas

    val mergedLists = listOf(colorList, strings)
    println(mergedLists)
    val combinedList = colorList + strings
    println(combinedList)

    val noDupsList = colorList.union(strings)
    println(noDupsList)

    val noDupColors = colorList.distinct()
    println(noDupColors)

    val ints = listOf(1, 2, 3, 4, 5)
    println(ints.max())
    /*val ints = arrayOf(1, 2, 3, 4, 5)
    val add10List: MutableList<Int> = mutableListOf()
    for (i in ints) {
        add10List.add(i + 10)
    }
    println(add10List)*/ //verbose mode
    val add10List = ints.map { it + 10 }
    println(add10List)
    println(add10List.javaClass)

}