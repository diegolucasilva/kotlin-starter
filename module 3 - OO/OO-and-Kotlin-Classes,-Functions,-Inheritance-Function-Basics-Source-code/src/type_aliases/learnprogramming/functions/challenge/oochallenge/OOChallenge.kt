package type_aliases.learnprogramming.functions.challenge.oochallenge

fun main(args: Array<String>) {

    val bicycle = KotlinBicycle(10, 3)
    bicycle.printDescription()

    val mountainBike = KotlinMountainBike(20, 10, 10)
    mountainBike.printDescription()

    val roadBike = KotlinRoadBike(10, 10, 10)
    roadBike.printDescription()

    val mountainBike2 = KotlinMountainBike(10, 10, 10,10,"BLue")
    mountainBike2.printDescription()

    KotlinMountainBike.availableColors.forEach { println(it) }

}




//toda as propriedade e a propria classe sao publicas e final por default.
// se nao quiser "set" eh so declarar com val(imutavel)
open class KotlinBicycle(var cadence: Int, var speed: Int, var gear: Int=10) { //use only de primary constructor

    fun applyBrake(decrement: Int) {
        speed -= decrement
    }

    fun speedUp(increment: Int) {
        speed += increment
    }

    open fun printDescription() { //por padrao o metodo eh final, por isso o open
        println("Bike is in gear $gear with a cadence of $cadence " +
                "travelling at a speed of $speed.")
    }

}

class KotlinMountainBike(var seatHeight: Int, cadence: Int, speed: Int, gear: Int=20): //as propriedade que seram passadas pelo pai, nao pode por o var na frente
        KotlinBicycle(cadence, speed, gear) {
//secondery constructor
    constructor(seatHeight: Int, cadence: Int, speed: Int, gear: Int=20, color: String):
        this(seatHeight, cadence, speed, gear){
        println("This is the color $color")

    }

    override fun printDescription() {
        super.printDescription()
        println("The mountain bike has a seat height of $seatHeight inches.")
    }
    // companion object. List<String> called availableColors
    // initialize the list to "blue", "red", "white", "black", "green", and "brown"
    companion object {
        val availableColors = listOf("blue", "red", "white", "black", "green", "brown")
    }

}

class KotlinRoadBike(val tireWidth: Int, cadence: Int, speed: Int, gear: Int=30):
        KotlinBicycle(cadence, speed, gear) {

    override fun printDescription() {
        super.printDescription()
        println("The road bike has a tire width of $tireWidth MM.")
    }

}


