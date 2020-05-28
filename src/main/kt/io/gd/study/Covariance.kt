package io.gd.study

fun main() {
//    val shortList: List<Short> = listOf(1, 2, 3, 4, 5)
    val shortList: MutableList<Short> = mutableListOf(1, 2, 3, 4, 5)
    convertToInt(shortList)
}

fun convertToInt(collection: List<Number>) {
    for (num in collection) {
        println("${num.toInt()}")
    }
//    collection.add(25.3)
}

fun tendGarden(roseGarden: Garden<Rose>) {
    waterGarden(roseGarden)
}

fun waterGarden(garden: Garden<Flower>) {

}

open class Flower {

}

class Rose: Flower() {

}

class Garden<out T: Flower>(val something: T) { // Can't use "var", but can use "private var"

    val flowers: List<T> = listOf()

    fun pickFlower(i: Int): T = flowers[i]
//    fun plantFlower(flower: T) {} // Cannot use T for parameter
//    fun plantFlower(flower: @UnsafeVariance T) {} // If T not changed, use like this ( ex) List )
}
