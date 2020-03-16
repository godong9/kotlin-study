package io.gd.study.inheritance

fun main() {
    val laserPrinter = LaserPrinter("Broter 1234", 15)
    laserPrinter.printModel()

    SomethingElse("whatever")
}

abstract class Printer(val modelName: String) {
    open fun printModel() = println("The model name of this printer is $modelName")
    abstract fun bestSelligPrice(): Double
}

open class LaserPrinter(modelName: String, ppm: Int): Printer(modelName) {
    final override fun printModel() = println("The model name of this laser printer is $modelName")
    override fun bestSelligPrice(): Double = 129.99
}

class SpecialLaserPrinter(modelName: String): LaserPrinter(modelName, 20) {

}

open class Something: MySubInterface {
    val someProperty: String
    override val number: Int = 25

    constructor(someParameter: String) {
        someProperty = someParameter
        println("I'm in the parent's constructor")
    }

    override fun MyFunction(str: String): String {
        TODO("Not yet implemented")
    }

    override fun mySubFunction(num: Int): String {
        TODO("Not yet implemented")
    }
}

class SomethingElse: Something {
    constructor(someOtherParameter: String): super(someOtherParameter) {
        println("I'm in the child's constructor")
    }
}

data class DataClass(val number: Int) {
}

interface MyInterface {
    val number: Int
    val number2: Int
        get() = number * 100

    fun MyFunction(str: String): String
}

interface MySubInterface: MyInterface {
    fun mySubFunction(num: Int): String
}

