package type_aliases.learnprogramming.accessmodifiers

fun main(args: Array<String>) {


    val emp = Employee("John")
    println(emp.firstName)
    println(emp.another)

    val emp2 = Employee("Joe")
    println(emp2.firstName)
    println(emp2.fullTime)

    val emp3 = Employee("Jane", false)
    println(emp3.firstName)
    println(emp3.fullTime)



    val emp4 = Employee("Jane", false, false)
    println(emp4.firstName)
    println(emp4.fullTime)
    println(emp.another)

    println(Demo().dummy)

}

//forma menos verbosa de ter um contructor, fullTimet tem um default value true se nao for passado, dessa forma, nao precisa de varios contrutores igual no java
class Employee(val firstName: String, var fullTime: Boolean = true) {

    var another: Boolean = true // eh obrigado a passar um valor default

    //aqui seria um segundo contrutor. Ele chama o primerio pra poder passar as info
    constructor(firstName: String, fullTime: Boolean,another: Boolean): this(firstName,fullTime){ 
        this.another = another
    }

}

//forma mais verbosa de ter um constructor // essa classe so pode ser usada aqui dentro, pq eh privada
class EmployeeVerbose private constructor(firstName: String){
    val firstName: String;
    //val firstName: String = firstName; forma sem o init abaixo

    init{
        this.firstName = firstName;
    }
}

class Demo {
    val dummy: String

    constructor() {
        dummy = "Hello"
    }
}


