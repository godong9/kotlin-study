package io.gd.study

/**
 * Top-Level Items
 *
 * private - Visible within the same file
 * protected - Can't be used
 * public - Visible everywhere
 * internal - Visible within the same module
 */

/*
class Employee constructor(firstName: String) {
    val firstName: String
    init {
        this.firstName = firstName
    }
    val firstName: String = firstName;
}

class Employee protected constructor(val firstName: String) {
}

class Employee (val firstName: String) {
    var fullTime: Boolean = true

    constructor(firstName: String, fullTime: Boolean): this(firstName) {
        this.fullTime = fullTime
    }
}

class Employee(val firstName: String, val fullTime: Boolean = true) {
}
*/

class Employee(val firstName: String, fullTime: Boolean = true) {
    var fullTime = fullTime
    get() {
        println("Running the custom get")
        return field
    }
    set(value) {
        println("Running the custom set")
        field = value
    }
}

val MY_CONSTANT = 100

fun main() {
    val emp = Employee("John")
    println(emp.firstName)
    println(emp.fullTime)
    emp.fullTime = false
    println(emp.fullTime)

    println("======")

    val emp2 = Employee("Joe")
    println(emp2.firstName)
    println(emp2.fullTime)

    println("======")

    val emp3 = Employee("Jane", false)
    println(emp3.firstName)
    println(emp3.fullTime)

    println(MY_CONSTANT)
}




