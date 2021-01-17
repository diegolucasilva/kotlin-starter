package type_aliases.learnprogramming.lambdas.generics

fun main(args: Array<String>) {

    val joe = Person("Joe", "Jones", 45)
    val jane = Person("Jane", "Smith", 12)
    val mary = Person("Mary", "Wilson", 70)
    val john = Person("John", "Adams", 32)
    val jean = Person("Jean", "Smithson", 66)

    val people = mapOf("Jones" to joe,  //imutable
            "Smith" to jane,
            "Wilson" to mary,
            "Adams" to john,
            "Smithson" to jean)

    println(people.filter { it.value.lastName.startsWith('S') }.count())


    ///////////////////////
    val namePairs = people.map { Pair(it.value.firstName, it.value.lastName) }
    println(namePairs)
    //verbose mode to create a Pair
    val firstNames = people.map { it.value.firstName }
    val lastNames = people.map { it.value.lastName }
    val namePairs2 = firstNames.zip(lastNames) //cria um Pair
    println(namePairs2)


    //////////////
    // also()
    // Joe is 45 years old
    // Jane is 12 years old
    // etc.
    people.also { //uma funcao lambda, tipo um apply
        it.map { println("${it.value.firstName} is ${it.value.age} years old")}
    }


    val (fName, lName, age) = joe  //tem que ser dataclass pra fazer ou isso, ou escrever os metodos componentes
    println("fName = $fName, lName = $lName, age = $age")
    //////////////


    val list1 = listOf(1, 4, 9, 15, 33)
    val list2 = listOf(4, 55, -83, 15, 22, 101)
    //val list3 = list1.filter { it in list2 }
    val list3 = list1.filter { list2.contains(it) }
    println("list3 = $list3")
    //////////////





    var regularPaper = Box<Regular>()
    var paper = Box<Paper>()
   // paper = regularPaper // Bo deve ser coverient(readonly)

    paper.addPaper(Premium()) //so compila com in

    regularPaper = paper
    // bad!
    //val sheet: Regular = regularPaper.takePaper() so compila com out

}


class Person(val firstName: String, val lastName: String, val age: Int) {

    operator fun component1() = firstName  //se for dataclass n precisa
    operator fun component2() = lastName
    operator fun component3() = age

}


class Box<in T> {
    //fun takePaper(): T {} //so compila com out

    fun addPaper(paper: T) {} //so compila com o in contravarience
}

open class Paper {}
class Regular: Paper() {}
class Premium: Paper() {}