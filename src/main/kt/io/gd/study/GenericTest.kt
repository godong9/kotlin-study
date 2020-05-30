package io.gd.study

import javax.crypto.Mac

// Referenced from https://deep-dive-dev.tistory.com/39

open class Laptop
class MacBook : Laptop()
class Gram : Laptop()

interface Developer<T> {
    fun develop()
}

fun varianceTest(input: Developer<out Laptop>) {
    input.develop()
}

fun contravarianceTest(input: Developer<in Laptop>) {
    input.develop()
}

fun main() {
    val laptop: Developer<Laptop> = object:Developer<Laptop> {
        override fun develop() {
            println("Develop!")
        }
    }

    val macbook: Developer<MacBook> = object:Developer<MacBook> {
        override fun develop() {
            println("Develop using MacBook!")
        }
    }

    val any: Developer<Any> = object:Developer<Any> {
        override fun develop() {
            println("Develop using Any!")
        }
    }


    // Success
    println(varianceTest(laptop))
    // Success
    println(varianceTest(macbook))
    // Error
//    println(varianceTest(any))

    abstract class Source<out T> {
        abstract fun nextT(): T
    }
    fun demo(strs: Source<String>) {
        val objects: Source<Any> = strs // This is OK, since T is an out-parameter
        // ...
    }

    // Success
    println(contravarianceTest(laptop))
    // Error
//    println(contravarianceTest(macbook))
    // Success
    println(contravarianceTest(any))

//    interface Comparable<in T> {
//        operator fun compareTo(other: T): Int
//    }
    fun demo(x: Comparable<Number>) {
        x.compareTo(1.0) // 1.0 has type Double, which is a subtype of Number
        // Thus, we can assign x to a variable of type Comparable<Double>
        val y: Comparable<Double> = x // OK!
    }
}


