package type_aliases.learnprogramming.loops

import java.math.BigDecimal


enum class Season {
    SPRING, SUMMER, FALL, WINTER
}

fun main(args: Array<String>) {

    var num = 100

    val timeOfYear = Season.SPRING
    val str = when (timeOfYear) {
        Season.SPRING -> {  //como esta usandos todos os valores do enum, n precisa de um else no final pra compilar
            num += 5
            "Flowers are blooming" //a ultima linha tem que se o retorno, se inverter com a linha de cima n compila
        }
        Season.SUMMER -> "It's hot!"
        Season.FALL -> "It's getting cooler"
        Season.WINTER -> {
            num = 22 - 55
            "I need a coat"
        }
    }
    println(str)
    /////////////////////


    val num2 = -50
    if (num < num2) {
        println("num is less than num2")
    }
    else if (num > num2) {
        println("num is greater than num2")
    }
    else {
        println("num = num2")
    }
    when {  //when na verdade como se fosse um if so pra teste de condicoes
        num < num2 -> println("num is less than num2")
        num > num2 -> println("num is greater than num2")
        else -> println("num = num2")
    }


    val y = 10

    when(num) {
        y + 80 -> println("90")
        in 100..199 -> println("in range 100..199")
        200 -> println("200")
        300 -> println("300")
        else -> println("Doesn't match anything")
    }




    /////////////////////
    val obj: Any = "I'm a string"
    val obj2: Any = BigDecimal(25.2)
    val obj3: Any = 45

    val something: Any = obj2
//    if (something is String) {
//        println(something.toUpperCase())
//    }
//    else if (something is BigDecimal) {
//        println(something.remainder(BigDecimal(10.5)))
//    }
//    else if (something is Int) {
//        println("${something - 22}")
//    }

    val z = when (something) {
        is String -> {
            println(something.toUpperCase())
            1
        }
        is BigDecimal -> {
            println(something.remainder(BigDecimal(10.5)))
            2
        }
        is Int -> {
            println("${something - 22}")
            3
        }
        else -> {  //bloqo obritatorio pq esta atrabuindo a val
            println("I have no idea what type this is")
            -1
        }
    }
    println(z)

}