package type_aliases.learnprogramming.lambdas


fun main(args: Array<String>) {

    println(countTo100())

    /////////
    val employees = listOf(Employee("John", "Smith", 2012),
                           Employee("Jane", "Wilson", 2015),
                           Employee("Mary", "Johnson", 2010),
                           Employee("Mike", "Jones", 2002))

    findByLastName(employees, "Wilson")
    findByLastName(employees, "Smithson")

    ////////
    "Some String".apply somestring@ {
        "Another String".apply {
            println(toLowerCase())
            println(this@somestring.toUpperCase()) //aplica o toUpperString para o receive objet(Some String) e nao para o Another String
        }
    }


}

fun findByLastName(employees: List<Employee>, lastName: String) {
    employees.forEach returnBlock@ {
        if (it.lastName == lastName) {
            println("Yes, there's an employee with the last name $lastName")
            return@returnBlock //retornBlock@ especifica que so eh o retorno da lambda, e codigo restande dessa funcao continuara a ser executado
        }
    }

    println("Nope, there's no employee with the last name $lastName") //msm dando match no if acima da lambda, executa essa linha por causa returnBlock@
}


//Receivers
fun countTo100() =
    StringBuilder().apply() { //retorna o mesmo tipo do objeto chamado
        for (i in 1..99) {
            append(i)
            append(", ")
        }
        append(100)
    }.toString()

fun countTo100With() =
        with(StringBuilder()) {  //recebe um receiver e retorna o mesmo tipo
            for (i in 1..99) {
                append(i) //ai n precisa mencionar a referencia
                append(", ")
            }
            append(100)
            toString() //n precisa mencionar o retorno
        }
fun countTo100Tradicional(): String {
    val numbers = StringBuilder()
    for (i in 1..99) {
        numbers.append(i)
        numbers.append(", ")
    }
    numbers.append(100)
    return numbers.toString()
}

