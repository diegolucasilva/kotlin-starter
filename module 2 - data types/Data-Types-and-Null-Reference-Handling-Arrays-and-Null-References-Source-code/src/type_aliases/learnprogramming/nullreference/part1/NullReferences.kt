package type_aliases.learnprogramming.nullreference.part1

fun main(args: Array<String>) {

    val str: String? = null  // oo ? diz que o valor pode ser null
    //str.toUpperCase() n compila, pq ele sabe que pode dar um nullpointer já que o valor acima foi declardo com ? e pode ser null
    str?.toUpperCase() // so    vai ser executado se não estiver null;

    //val str44 = str!!; //ele ja ve se é null aqui por quase do !! e já lança exception
    //val str4 = str!!.toUpperCase() //dessa forma, assume que pode tomar nullpointer(e vai dar no caso)



    println("What happens when we do this: ${str?.toUpperCase()}") //n da nullpointer, exibi null

    val str2 = str ?: "This is the default value"
    println(str2)

    //val whatever = bankBranch?.address?.country ?: "US"

    val something: Any = arrayOf(1, 2, 3, 4)
    val str3 = something as? String
    println(str3)

    println(str3?.toUpperCase()) //ele n vai conseguir fazer o cast, mas n lança nullPointer


   // val contryCode: String? = bank?.address?.country?.contryCode  //não precisa de um monte de if pra ver se é null
    //da pra usar o ?: operator aqui tb
}




