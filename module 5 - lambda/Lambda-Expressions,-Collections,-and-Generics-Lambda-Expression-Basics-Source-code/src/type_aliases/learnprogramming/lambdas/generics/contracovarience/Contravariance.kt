package type_aliases.learnprogramming.lambdas.generics.contracovarience



fun main(args: Array<String>) {
    //object = anonymous class
    val flowerTender = object: FlowerCare<Flower> {
        override fun prune(flower: Flower) = println("I'm tending a ${flower.name}!")
    }
    //o in deixa superTipos seram passados no lugar dos filhos
    val daffodilGarden2= Garden<Daffodil>(listOf(Daffodil(), Daffodil(), Daffodil()),
            flowerTender)

    //especificos FlowerCare tenders
    val roseTender = object: FlowerCare<Rose> {
        override fun prune(flower: Rose) = println("I'm pruning a rose!")
    }
    val daffodilTender = object: FlowerCare<Daffodil> {
        override fun prune(flower: Daffodil) = println("I'm pruning a daffodil!")
    }
    val roseGarden = Garden<Rose>(listOf(Rose(), Rose()), roseTender)
    roseGarden.tendFlower(0)
    val daffodilGarden = Garden<Daffodil>(listOf(Daffodil(), Daffodil(), Daffodil()),
            daffodilTender)  //nao consigo passar um roseTender por exemplo, pq ele ja espera o outro subtipo
    daffodilGarden.tendFlower(2)






}
//contravarience nao quer preservar o tipo, que deixar passar superTipos
class Garden<T: Flower>(val flowers: List<T>, val flowerCare: FlowerCare<T>) {
    //fun pickFlower(i: Int) = flowerCare.pick(i)
    fun tendFlower(i: Int) {
        flowerCare.prune(flowers[i])
    }
}

open class Flower(val name: String) {}

class Rose: Flower("Rose") {}

class Daffodil: Flower("Daffodil") {}


//in -> deixa superTipos serem passados
interface FlowerCare<in T> {
    fun prune(flower: T)
    //fun pick(): T // eh o contrario do covarience, n deixa retornar tipo(out), somente entrar(in)
    //isso pq vc pode passar o Flower no lugar do Rose, porem, o subtipo que vc esperava era Daffodil
    //flowerTender2 eh um exemplo do problema que iria dar
}



val flowerTender2 = object: FlowerCare<Flower> {
    override fun prune(flower: Flower) = println("I'm tending a flower")
    //override fun pick(): Margarida = Margarida("some random flower") //nao compila
}
val roseGarden2 = Garden<Rose>(listOf(Rose()), flowerTender2)
//val rose: Rose = roseGarden2.pickFlower(0) //nao compila por isso!! iria voltar Margarida aqui, outro subtipo