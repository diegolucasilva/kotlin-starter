package type_aliases.learnprogramming.lambdas


fun main(args: Array<String>) {

    val immutableMap = mapOf<Int, Car>(1 to Car("green", "Toyota", 2015),
            2 to Car("red", "Ford", 2016),
            3 to Car("silver", "Honda", 2013),
            17 to Car("red", "BMW", 2015),
            8 to Car("green", "Ford", 2010))

    //println(immutableMap.asSequence().filter { it.value.model == "Ford"} //cada elemento eh avalido 1 by 1 stream
   //         .map { it.value.color }) //it´ not terminal operation

    listOf("Mary", "Jane", "Joe").asSequence()
            .map { println("mapping $it"); it.toUpperCase() }
            .filter { println("filtering $it"); it[0] == 'J'}
           // .toList()  //terminal operation
            .find { it.endsWith('E') } //find first match
}

/* sem sequence //mapeia tudo, depois filtra tudo sem necessidade
mapping Mary
mapping Jane
mapping Joe
filtering MARY
filtering JANE
filtering JOE
 */

/* com sequence  //stream, nao para a pipe
mapping Mary
filtering MARY
mapping Jane
filtering JANE
 */