package type_aliases.learnprogramming.functions.enums
fun main(args: Array<String>) {
    println(Department.ACCOUNTING.getDeptInfo())
    println(Department.ACCOUNTING.fullName)
    println(Department.ACCOUNTING.numEmployees)

}

enum class Department(val fullName: String, val numEmployees: Int) {
    HR("Human Resources", 5), IT("Information Technology", 10),
    ACCOUNTING("Accounting", 3), SALES("Sales", 20);

    fun getDeptInfo() = "The $fullName department has $numEmployees employees"
}