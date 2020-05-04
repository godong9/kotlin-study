package io.gd.study

import java.lang.IllegalArgumentException
import java.lang.NumberFormatException

fun main() {
    println(getNumber("22"))
    println(getNumber("22.5") ?: throw IllegalArgumentException("Number isn't an Int"))

    notImplementedYet("string")
}

fun notImplementedYet(something: String) {
    throw IllegalArgumentException("Implement me!")
}

//fun getNumber(str: String): Int {
//    return try {
//        Integer.parseInt(str)
//    } catch (e: NumberFormatException) {
//        0
//    } finally {
//        println("I'm in the finally block")
//    }
//}

fun getNumber(str: String): Int? {
    return try {
        Integer.parseInt(str)
    } catch (e: NumberFormatException) {
        null
    } finally {
        println("I'm in the finally block")
    }
}