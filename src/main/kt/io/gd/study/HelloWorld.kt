package io.gd.study

typealias EmployeeSet = Set<Employee2>

fun main() {
    val number: Int
    number = 12
    println(number)

    val employee1 = Employee2(1, "GD")
    println(employee1)

    val change = 4.22
    println("your change is $")
    println("\$$change")

    println("The employee1's id is ${employee1.id}")

    val testStr = """dsgasdgsdgsdgsdg
        |sgasdgsadg
        |sdgasdgasdg
        |sdgasdgasdg
        |sadgsadgasdg
        |sadgasdgsdgsdg
        |sdgasgsag
    """.trimMargin()
    println(testStr)
}

class Employee2(val id: Int, var name: String) {
    override fun toString(): String {
        return "Employee(name=$name, id=$id)"
    }
}

