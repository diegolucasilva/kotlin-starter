package type_aliases.learnprogramming.functions.inheritance

import java.time.Year

fun main(args: Array<String>) {

    println(CompanyCommunications.getTagLine())
    println(CompanyCommunications.getCopyrightLine())
}

object CompanyCommunications { //singleton

    val currentYear = Year.now().value

    fun getTagLine() = "Our company rocks!"
    fun getCopyrightLine() = "Copyright \u00A9 $currentYear Our Company. All rights reserved."
}


