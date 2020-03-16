package io.gd.study

fun main() {
    val car = Car("blue", "Toyota", 2015)
    println(car)
    val car2 = Car("blue", "Toyota", 2015)
    println(car == car2) // true
    val car3 = car.copy()
    println(car3)
    val car4 = car.copy(year = 2016, color = "green")
    println(car4)
}

data class Car(val color: String, val model: String, val year: Int) {

}