package type_aliases.learnprogramming.declarations.structural.equality

import type_aliases.learnprogramming.declarations.smart.casting.Employee
import type_aliases.learnprogramming.declarations.smart.casting.EmployeeSet

typealias EmployeeSet = Set<Employee>

fun main(args: Array<String>)  {

    val employeeOne = Employee("Mary", 1)
    val employeeTwo = Employee("John", 2)
    val employeeThree = Employee("John", 2)
    println(employeeOne === employeeTwo) //false
    println(employeeTwo === employeeThree) //false
    println(employeeOne == employeeTwo) //false
    println(employeeTwo == employeeThree) //true
    val employeeFour = employeeTwo
    println(employeeFour === employeeTwo)

    println(employeeFour != employeeTwo) //false
    println(employeeFour !== employeeTwo) //false
    println(employeeTwo != employeeThree) //false
    println(employeeTwo !== employeeThree) //true

    var number: Int
    number = 10;
    number = 20

    val names = arrayListOf("John", "Jane", "Mary")
    println(names[1])

    val employees: EmployeeSet

    val employee1 = Employee("Lynn Jones", 500)
    employee1.name = "Lynn Smith"

    val employee2: Employee
    val number2 = 100

    if (number < number2) {
        employee2 = Employee("Jane Smith", 400)
    }
    else {
        employee2 = Employee("Mike Watson", 150)
    }
}

class Employee(var name: String, val id : Int) {

    override fun equals(obj: Any?): Boolean {
        if (obj is Employee) {
            return name == obj.name && id == obj.id
        }

        return false
    }

}


