package io.gd.study

fun main() {
    val immutableMap = mapOf<Int, CarMap>(1 to CarMap("green", "Toyota", 2015),
            2 to CarMap("red", "Ford", 2016),
            3 to CarMap("silver", "Honda", 2013),
            17 to CarMap("red", "BMW", 2015),
            8 to CarMap("green", "Ford", 2010))

    println(immutableMap.asSequence().filter { it.value.model == "Ford" }.map { it.value.color })

    listOf("Mary", "Jane", "Joe").asSequence()
            .filter { println("filtering $it"); it[0] == 'J' }
            .map { println("mapping $it"); it.toUpperCase() }
            .find { it.endsWith('E') }
}