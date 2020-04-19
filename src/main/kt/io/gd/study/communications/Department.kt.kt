package io.gd.study.communications

enum class Department(val fullName: String, val numEmployees: Int) {
    HR("Human Resources", 5),
    IT("Information Technology", 10),
    ACCOUNTING("Accounting", 3),
    SALES("SALES", 20);

    fun getDeptInfo() = "The $fullName department has $numEmployees employees"
}