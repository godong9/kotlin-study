package io.gd.study

fun main() {
    println(labelMultiply(3, 4, "The result is:"))
    println(labelMultiply(label = "Here's the result:", operand1 = 4, operand2 = 4))
    println(labelMultiply(3, 5))

    val user = User("Jane")
    println(user.upperCaseFirstName())

    val car1 = TestCar("blue", "Toyota", 2015)
    val car2 = TestCar("red", "Ford", 2016)
    val car3 = TestCar("grey", "Toyota", 2017)

    printColors("Color", car1, car2, car3)

    val numbers = arrayOf(1, 2, 3)

    val manyCars = arrayOf(car1, car2, car3)

    printColors("Color", *manyCars)

    val moreCars = arrayOf(car2, car3)
    val car4 = car2.copy()
    val lotsOfCars = arrayOf(*manyCars, *moreCars, car4)
    for (c in lotsOfCars) {
        println(c)
    }

    val s = "this is all in lowercase"
    println(s.upperFirstAndLast())
}

//fun labelMultiply(operand1: Int, operand2: Int, label: String): String {
//    return ("$label ${operand1 * operand2}")
//}

inline fun labelMultiply(operand1: Int, operand2: Int, label: String = "The answer is:") =
    "$label ${operand1 * operand2}"

//fun whatever():Int = 3 * 4
fun whatever() = 3 * 4

class User(val firstName: String) {
    fun upperCaseFirstName() = firstName.toUpperCase()
}

//fun printColors(vararg cars: TestCar, str: String) {
//    for (car in cars) {
//        println("${str}: ${car.color}")
//    }
//}

fun printColors(str: String, vararg cars: TestCar) {
    for (car in cars) {
        println("${str}: ${car.color}")
    }
}

data class TestCar(val color: String, val model: String, val year: Int)


fun String.upperFirstAndLast(): String {
    val upperFirst = this.substring(0, 1).toUpperCase() + this.substring(1)
    return upperFirst.substring(0, upperFirst.length - 1) +
            upperFirst.substring(upperFirst.length - 1, upperFirst.length).toUpperCase()
}