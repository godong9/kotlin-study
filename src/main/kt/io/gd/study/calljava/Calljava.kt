package io.gd.study.calljava

import io.gd.study.calljava.javacode.Car

fun main() {
    val car = Car("blue", "Ford", 2015)
    car.color = "green"
    println(car)

    car.variableMethod(5, "hello", "goodbye")
    val strings = arrayOf("hello", "goodbye")
    car.variableMethod(5, *strings)

//    car.wantsIntArray(arrayOf(1, 2, 3).toIntArray())
    car.wantsIntArray(intArrayOf(1, 2, 3))

    println("x = ${Car.x}")
    Car.x = 10
    println(Car.xString())

    println(car.demoMethod())
    println(car.demoMethod( { println("I'm in a thread(kotlin)!") }))

//    (car.anObject as java.lang.Object).notify()
//    car.anObject.javaClass

    var model: String? = car.model
//    println(model.javaClass)
    model = null
    println(model)
}