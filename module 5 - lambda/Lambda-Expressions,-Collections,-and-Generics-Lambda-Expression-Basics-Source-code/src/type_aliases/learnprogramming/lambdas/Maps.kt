package type_aliases.learnprogramming.lambdas


fun main(args: Array<String>) {
    //key to value
    val immutableMap = mapOf<Int, Car>(1 to Car("green", "Toyota", 2015),
            2 to Car("red", "Ford", 2016),
            3 to Car("silver", "Honda", 2013))

  //  println(immutableMap.javaClass)
  //  println(immutableMap)

    val mutableMap = hashMapOf<String, Car>("John's car" to Car("red", "Range Rover", 2010),
            "Jane's car" to Car("blue", "Hyundai", 2012))
 //   println(mutableMap.javaClass)
 //   println(mutableMap)
    //mutableMap.put("Mary's car", Car("red", "Corvette", 1965))
    mutableMap["Mary's car"] = Car("red", "Corvette", 1965)
    /*for (entry in mutableMap) {
        println(entry.key)
        println(entry.value)
    }*/ //verbose mode
    for ((k, v) in mutableMap) {
   //     println(k)
    //    println(v)
    }

    ///////////////
    println(immutableMap.toSortedMap())
    println(immutableMap.any { it.value.year > 2014 })
    println(immutableMap.count { it.value.year > 2014 })
    val cars = immutableMap.values

    println("////")
    println(cars.find { it.year > 2014 })
    println(cars.groupBy { it.color })
    println(cars.sortedBy { it.year })
    println(immutableMap.filter { it.value.model == "Ford"}
            .map { it.value.color })
    println(immutableMap.map { it.value.year })


    //////////
    val pair = Pair(10, "ten")
    //val firstValue = pair.first
    //val secondValue = pair.second
    val (firstValue, secondValue) = pair //destructuing declaration
    println(firstValue)
    println(secondValue)

    //////////
    val car = Car("blue", "Corvette", 1959)
    val (color, model, year) = car //tem que implementar os component funcions para a destructuring seja usada
    println("color = $color, model = $model, and year = $year")


}

data class Car(val color: String, val model: String, val year: Int) {
    //se nao fosse data teria que implementar conforme abaixo
    /*operator fun component1() = color
    operator fun component2() = model
    operator fun component3() = year*/

}



