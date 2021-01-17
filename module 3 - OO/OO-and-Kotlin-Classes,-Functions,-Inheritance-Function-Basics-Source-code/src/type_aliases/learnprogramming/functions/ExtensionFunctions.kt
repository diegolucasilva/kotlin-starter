package type_aliases.learnprogramming.functions



fun main(args: Array<String>) {

    val s = "this is all in lowercase"
    println(s.upperFirstAndLast()) //pode usar essa fun nos outros arquivos tb

}

fun String.upperFirstAndLast(): String { //com o String. vai deixar quql String chamar essa funcao direto. N precisa do this
    val upperFirst = this.substring(0, 1).toUpperCase() + substring(1)
    return upperFirst.substring(0, upperFirst.length - 1) +
            upperFirst.substring(upperFirst.length - 1, upperFirst.length).toUpperCase()
}



