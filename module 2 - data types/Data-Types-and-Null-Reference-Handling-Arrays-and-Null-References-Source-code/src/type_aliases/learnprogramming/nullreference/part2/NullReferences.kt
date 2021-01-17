package type_aliases.learnprogramming.nullreference.part2

fun main(args: Array<String>) {

    val str: String? = "This isn't null"
    //printText(str4) nem compila pq a funçao espera ? tb. So colocar o ? na parametro da funcao tb
    str?.let { printText(it) } //Se nao for null, ai ele chama a funcao. Isso e util quando ta usando alguma library.

    val str4 : String? = null
    val anotherStr = "This isn't nullable"
    println(str4 == anotherStr) // == eh safe, ele vai ver se n ta null antes de fazer

    val str2 = str!! // SE fosse null, ja ia dar ruim exeception aqui(pq forcou com !!). Ou faz desse jeito ou guarante que vai ver se ta null antes com '?'
    val str3 = str2.toUpperCase()

}

fun printText(text: String) {
    println(text)
}





