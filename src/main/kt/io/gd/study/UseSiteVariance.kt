package io.gd.study

fun main() {

    val cars1 = mutableListOf(MyCar(), MyCar())
    val cars2: MutableList<MyCar> = mutableListOf()
    copyCars(cars1, cars2)

    val fords1 = mutableListOf(Ford(), Ford())
    val fords2: MutableList<Ford> = mutableListOf()
    copyCars(fords1, fords2)

    copyCars(fords1, cars2)

    val cars3: MutableList<MyCar> = mutableListOf(Ford(), Ford())
}

fun <T: MyCar> copyCars(source: MutableList<out T>, destination: MutableList<T>) {
    for (car in source) {
        destination.add(car)
    }
}

open class MyCar {

}

class Toyota: MyCar() {

}

class Ford: MyCar() {

}
