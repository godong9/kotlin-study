package io.gd.study

fun main() {
    val setInts = setOf(10, 15, 19, 5, 3, -22)

    println(setInts.filter { it % 2 != 0 })

    val immutableMap = mapOf<Int, CarMap>(1 to CarMap("green", "Toyota", 2015),
            2 to CarMap("red", "Ford", 2016),
            3 to CarMap("silver", "Honda", 2013),
            17 to CarMap("red", "BMW", 2015),
            8 to CarMap("green", "Ford", 2010))

//    println(immutableMap.filter { it.value.year == 2016 })

    println(immutableMap.all { it.value.year > 2014 })
    println(immutableMap.any { it.value.year > 2014 })
    println(immutableMap.count { it.value.year > 2014 })
    val cars = immutableMap.values
    println(cars.find { it.year > 2014 })
    println(cars.groupBy { it.color })

    println(immutableMap.filter { it.value.model == "Ford" }
            .map { it.value.color })

    println(immutableMap.map { it.value.year })

//    val mutableMap = mapOf<Int, CarMap>(1 to CarMap("green", "Toyota", 2015),
//            2 to CarMap("red", "Ford", 2016),
//            3 to CarMap("silver", "Honda", 2013))
//
//    println(mutableMap.filter { it.value.color == "silver" })
//    println("The filters map is $mutableMap")

    val ints = arrayOf(1, 2, 3, 4, 5)
//    val add10List: MutableList<Int> = mutableListOf()
//    for (i in ints) {
//        add10List.add(i + 10)
//    }
//    println(add10List)
    val add10List = ints.map { it + 10 }
    println(add10List)


}