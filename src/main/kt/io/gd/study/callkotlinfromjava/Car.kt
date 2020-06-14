@file:JvmName("StaticCar")

package io.gd.study.callkotlinfromjava

import java.io.IOException

fun topLevel() = println("I'm in the Car file!")

fun main() {
    "Print this".print()
    Car.carComp()
}

@JvmOverloads fun defaultArgs(str: String, num: Int = 25) {
    println("$str$num")
}

@Throws(IOException::class)
fun doIO() {
    throw IOException()
}

object SingletonObj {
    @JvmStatic fun doSomething() = println("I'm doing something in the singleton object")
}

class Car(val color: String, @JvmField val model: String, val year: Int, var isAutomatic: Boolean) {

    companion object {
        const val constant = 25
        @JvmField val isAuto = false
        @JvmStatic fun carComp() = println("I'm in car companion object")
    }

    fun printMe(text: String) {
        println("I don't expect a null value: $text")
    }

//    var color: String = color
//    set(value) {
//        field = "always green"
//        field = value
//    }
}

fun String.print() {
    println(this)
}