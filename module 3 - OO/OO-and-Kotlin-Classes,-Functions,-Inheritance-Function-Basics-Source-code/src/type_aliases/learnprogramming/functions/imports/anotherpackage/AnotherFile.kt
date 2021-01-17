package type_aliases.learnprogramming.functions.imports.anotherpackage

import type_aliases.learnprogramming.functions.imports.communications.CompanyCommunications as Comm
import type_aliases.learnprogramming.functions.imports.communications.topLevel as tp
import type_aliases.learnprogramming.functions.imports.communications.Department.*
import type_aliases.learnprogramming.functions.imports.communications.upperFirstAndLast as ufal


fun main(args: Array<String>) {
    tp("Hello from AnotherFile") //se declara-lo como private, n daria pra usar
    println(Comm.getCopyrightLine()) //so eh acessivel dentro do mesmo modulo
    println(IT.getDeptInfo())
    println(SALES.getDeptInfo())
    println("some string".ufal())

}