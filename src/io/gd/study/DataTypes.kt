package io.gd.study

import io.gd.study.java.DummyClass

fun main() {
    val myInt = 10
    println("default datatype is ${myInt is Int}")
    val myLong = 22L

    var varLong = 22L

    varLong = myInt.toLong()

    val myByte: Byte = 111
    var myShort: Short
    myShort = myByte.toShort()

    val anotherInt = 5

    var myDouble = 65.984

    println(myDouble is Double)

    val myFloat = 464.346346f
    println("This is a float: ${myFloat is Float}")

    myDouble = myFloat.toDouble()

    val char = 'b'
    val myCharInt = 65
    println(myCharInt.toChar())

    val myBoolean = true

    val vacationTime = false
    val onVacation = DummyClass().isVacationTime(vacationTime)
    println(onVacation)

}