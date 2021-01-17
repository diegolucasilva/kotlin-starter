package type_aliases.learnprogramming.functions.accessmodifier

fun main(args: Array<String>) {

    val emp = Employee2("John")
    println(emp.firstName)
    emp.fullTime = false
    println(emp.fullTime)

    val emp2 = Employee2("Joe")
    println(emp2.firstName)
    println(emp2.fullTime)

    val emp3 = Employee2("Jane", false)
    println(emp3.firstName)
    println(emp3.fullTime)

    val demo3 = Demo("A",true)
    demo3.firstName = "B"
    println(demo3.firstName)
    println(demo3.fullTime)
    //demo3.fullTime = false nao funcionaaa. o set ta privado


}
//teste nao eh acessivel nem com get ou set
class Employee2(val firstName: String, fullTime: Boolean = true, private var teste: Boolean = true){

    var fullTime = fullTime //a declaracao de cima agora eh so um parametro sendo passado, nao gera "get" e "set"
    get() {
        println("Running the custom get")
        return field
    }
    set(value) {
        println("Running the custom set")
        field = value
    }
}



class Demo(firstName: String, fullTime: Boolean) {
    var firstName = firstName //a declaracao de cima agora eh so um parametro sendo passado, nao gera "get" e "set"
        get() {
            println("Running the custom get")
            return field
        }
        set(value) {
            println("Running the custom set")
            field = value
        }

    var fullTime = fullTime //a declaracao de cima agora eh so um parametro sendo passado, nao gera "get" e "set"
        get() {
            println("Running the custom get")
            return field
        }
        private set(value) {
            println("Running the custom set")
            field = value
        }
}


