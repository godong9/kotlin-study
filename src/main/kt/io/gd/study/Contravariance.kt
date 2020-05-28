package io.gd.study

fun main() {
    val flowerTender = object: FlowerCare<Flower2>  {
        override fun prune(flower2: Flower2) = println("I'm tending a ${flower2.name}!")
    }

    val roseTender = object: FlowerCare<Rose2> {
        override fun prune(flower2: Rose2) = println("I'm pruning a rose!")
    }
//    val roseGarden = Garden2<Rose2>(listOf(Rose2(), Rose2()), roseTender)
    val roseGarden = Garden2<Rose2>(listOf(Rose2(), Rose2()), flowerTender)
    roseGarden.tendFlower(0)

    val daffodilTender = object: FlowerCare<Daffodil> {
        override fun prune(flower2: Daffodil) = println("I'm pruning a daffodil!")
    }
//    val daffodilGarden = Garden2<Daffodil>(listOf(Daffodil(), Daffodil(), Daffodil()), daffodilTender)
    val daffodilGarden = Garden2<Daffodil>(listOf(Daffodil(), Daffodil(), Daffodil()), flowerTender)
    daffodilGarden.tendFlower(2)
}

open class Flower2(val name: String) {

}

class Garden2<T: Flower2>(val flowers: List<T>, val flowerCare: FlowerCare<T>) {
    fun pickFlower(i: Int) = flowers[i]
    fun tendFlower(i: Int) {
        flowerCare.prune(flowers[i])
    }
}

class Rose2: Flower2("Rose") {

}

class Daffodil: Flower2("Daffodil") {

}

interface FlowerCare<in T> {
    fun prune(flower2: T)
//    fun pick(): T // Can't do this
}
