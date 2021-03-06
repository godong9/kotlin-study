package io.gd.study.challenge5

fun main() {
    val joe = Person("Joe", "Jones", 45)
    val jane = Person("Jane", "Smith", 12)
    val mary = Person("Mary", "Wilson", 70)
    val john = Person("John", "Adams", 32)
    val jean = Person("Jean", "Smithson", 66)

    val people = mapOf("Jones" to joe,
            "Smith" to jane,
            "Wilson" to mary,
            "Adams" to john,
            "Smithson" to jean)

    println(people.filter { it.value.lastName.startsWith('S') }.count())
    val namePairs = people.map { Pair(it.value.firstName, it.value.lastName) }
    println(namePairs)

    val firstNames = people.map { it.value.firstName }
    val lastNames = people.map { it.value.lastName }
    val namePairs2 = firstNames.zip(lastNames)
    println(namePairs2)

    people.also {
        it.map { println("${it.value.firstName} is ${it.value.age} years old") }
    }

    val (fName, lName, age) = joe
    println("fName = $fName, lName = $lName, age = $age")

    val list1 = listOf(1, 4, 9, 15, 33)
    val list2 = listOf(4, 55, -83, 15, 22, 101)
    val list3 = list1.filter { list2.contains(it) }
//    val list3 = list1.filter { it in list2 }
    println("list3 = $list3")


    var regularPaper = Box<Regular>()
    var paper = Box<Paper>()
//    paper = regularPaper

    // bad!
//    paper.addPaper(Premium())

    regularPaper = paper

    // bad!
    //val sheet: RegularPaper = regularPaper.takePaper()
}

data class Person(val firstName: String, val lastName: String, val age: Int) {

}

//class Person(val firstName: String, val lastName: String, val age: Int) {
//    operator fun component1() = firstName
//    operator fun component2() = lastName
//    operator fun component3() = age
//}

class Box<in T> {
//    fun takePaper(): T {
//
//    }

    fun addPaper(paper: T) {

    }
}

open class Paper {

}

class Regular: Paper() {

}

class Premium: Paper() {

}