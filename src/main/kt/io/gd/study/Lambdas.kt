package io.gd.study

fun main(args: Array<String>) {
    //run { println("I'm in a lambda!") }

    val employees = listOf(LambdasEmployee("John", "Smith", 2012),
            LambdasEmployee("Jane", "Wilson", 2015),
            LambdasEmployee("Mary", "Johnson", 2010),
            LambdasEmployee("Mike", "Jones", 2002))

    //println(employees.minBy(Employee::startYear))

//    var num = 10
//    run {
//        num += 15
//        println(num)
//    }

//    run(::topLevel)

//    println(countTo100())

    findByLastName(employees, "Wilson")
    findByLastName(employees, "Smithson")

    "Some String".apply somestring@ {
        "Another String".apply {
            println(toLowerCase())
            println(toUpperCase())
            println(this@somestring.toUpperCase())
        }
    }
}

fun findByLastName(employees: List<LambdasEmployee>, lastName: String) {
//    for (employee in employees) {
//        if (employee.lastName == lastName) {
//            println("Yes, there's an employee with the last name $lastName")
//            return
//        }
//    }

//    employees.forEach returnBlock@ {
//        if (it.lastName == lastName) {
//            println("Yes, there's an employee with the last name $lastName")
//            return@returnBlock
//        }
//    }

    employees.forEach {
        if (it.lastName == lastName) {
            println("Yes, there's an employee with the last name $lastName")
            return
        }
    }

    println("Nope, there's no employee with the last name $lastName")
}

fun topLevel() = println("I'm in a function!")

fun useParameter(employees: List<LambdasEmployee>, num: Int) {
    employees.forEach {
        println(it.firstName)
        println(num)
    }
}

fun countTo100() =
        StringBuilder().apply() {
            for (i in 1..99) {
                append(i)
                append(", ")
            }
            append(100)
        }.toString()

//fun countTo100() =
//    with(StringBuilder()) {
//        for (i in 1..99) {
//            append(i)
//            append(", ")
//        }
//        append(100)
//        toString()
//    }

//fun countTo100(): String {
//    val numbers = StringBuilder()
//    for (i in 1..99) {
//        numbers.append(i)
//        numbers.append(", ")
//    }
//    numbers.append(100)
//    return numbers.toString()
//}

data class LambdasEmployee(val firstName: String, val lastName: String, val startYear: Int) {

}