package type_aliases.learnprogramming.loops


fun main(args: Array<String>) {

    println(getNumber("22.5") ?: "I can't print the result")
    println(getNumber("22.5")) //a funcao println ja tem o '?' na declaracao, caso contrario nem compilaria

    notImplementedYet("string")

}

fun notImplementedYet(something: String): Nothing {
    throw IllegalArgumentException("Implement me!")
}

fun getNumber(str: String): Int? { //'?' assumiu que o valor pode ser null
    return try {
            Integer.parseInt(str)
        }
        catch(e: NumberFormatException) {
            //0
            null //para poder retornar null tem que colocar o ?
        }
        finally {
            println("I'm in the finally block")
            1 //ele nunca usa esse retorno, so os do catch
        }
}