package type_aliases.learnprogramming.functions.imports.communications

import java.time.Year

fun topLevel(str: String) = println("Top level function: $str") //declarar com private para ser acessivl so no msm arquivo


enum class Department(val fullName: String, val numEmployees: Int) {
    HR("Human Resources", 5), IT("Information Technology", 10),
    ACCOUNTING("Accounting", 3), SALES("Sales", 20);

    fun getDeptInfo() = "The $fullName department has $numEmployees employees"
}



object CompanyCommunications {

    val currentYear = Year.now().value;

    fun getTagline() = "Our company rocks!"
    internal fun getCopyrightLine() = "Copyright \u00A9 $currentYear Our Company. All rights reserved." //so eh acessivel dentro do mesmo modulo

}

fun String.upperFirstAndLast(): String { //com o String. vai deixar quql String chamar essa funcao direto. N precisa do this
    val upperFirst = this.substring(0, 1).toUpperCase() + substring(1)
    return upperFirst.substring(0, upperFirst.length - 1) +
            upperFirst.substring(upperFirst.length - 1, upperFirst.length).toUpperCase()
}