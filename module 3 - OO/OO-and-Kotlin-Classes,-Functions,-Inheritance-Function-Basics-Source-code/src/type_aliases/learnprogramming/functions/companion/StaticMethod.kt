package type_aliases.learnprogramming.functions.companion

fun main(args: Array<String>) {

    println(SomeClass.accessPrivateVar())

    //val someclass = SomeClassFactory("QA") construtor eh privado, n da pra usa-lo
    val factory1 = SomeClassFactory.justAssign("A")
    println(factory1.someString)

    val factory2 = SomeClassFactory.upperOrLowerCase("A",true)
    println(factory2.someString)



}



class SomeClassFactory private constructor(val someString: String) { //deixou o constructor privado pra ninguem conseguir isntancias essa classe

    companion object { //dessa manneira da pra acessa como se fosse method static

        fun justAssign(str: String) = SomeClassFactory(str)
        fun upperOrLowerCase(str: String, lowerCase: Boolean): SomeClassFactory { //: SomeClassFactory é tipo do retorno!!!
            if (lowerCase) {
                return SomeClassFactory(str.toLowerCase())
            }
            else {
                return SomeClassFactory(str.toUpperCase())
            }
        }
    }
}


class SomeClass{

    companion object {
        private var privateVar = 6
        fun accessPrivateVar() = "I'm accessing privateVar: $privateVar"
    }
}
