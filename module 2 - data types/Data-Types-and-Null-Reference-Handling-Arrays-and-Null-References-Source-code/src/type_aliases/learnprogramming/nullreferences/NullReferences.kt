package type_aliases.learnprogramming.nullreferences

fun main(args: Array<String>) {


    val nullableInts = arrayOfNulls<Int>(5)  //cria um array de null, o '?' é implicito, n vai dar null pointer no toString abaixo
    for (i in nullableInts) {
        println(i)
    }
    println(nullableInts[3].toString()) //varios metodos aqui n podem ser usados a n ser que force com '!!'
    nullableInts[3].toString()
   //nullableInts[3]!!.toByte()  //forca a compilacao, mas vai dar nullpointer nessa caso

}

fun printText(text: String) {
    println(text)
}





