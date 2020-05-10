package io.gd.study

fun main() {
    val immutableMap = mapOf<Int, CarMap>(1 to CarMap("green", "Toyota", 2015),
            2 to CarMap("red", "Ford", 2016),
            3 to CarMap("silver", "Honda", 2013))
    println(immutableMap.javaClass)
    println(immutableMap)

//    val mutableMap = mutableMapOf<String, CarMap>("John's car" to CarMap("red", "Range Rover", 2010),
//            "Jane's car" to CarMap("blue", "Hyundai", 2012))
//    println(mutableMap.javaClass)
//    println(mutableMap)

    val mutableMap = hashMapOf<String, CarMap>("John's car" to CarMap("red", "Range Rover", 2010),
            "Jane's car" to CarMap("blue", "Hyundai", 2012))
    println(mutableMap.javaClass)
    println(mutableMap)
    mutableMap.put("Mary's car", CarMap("red", "Corvette", 1965))
    println(mutableMap)

//    for (entry in mutableMap) {
//        println(entry.key)
//        println(entry.value)
//    }
    for ((k, v) in mutableMap) {
        println(k)
        println(v)
    }

    val pair = Pair(10, "ten")
//    val firstValue = pair.first
//    val secondValue = pair.second
    val (firstValue, secondValue) = pair
    println(firstValue)
    println(secondValue)

    val car = CarMap("blue", "Corvette", 1959)
    val (color, model, year) = car
    println("color = $color, model = $model, and year = $year")
}

//class CarMap(val color: String, val model: String, val year: Int) {
//    operator fun component1() = color
//    operator fun component2() = model
//    operator fun component3() = year
//}
data class CarMap(val color: String, val model: String, val year: Int)