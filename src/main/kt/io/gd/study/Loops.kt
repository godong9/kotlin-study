package io.gd.study

fun main() {
    val range = 1..5
    for (i in range) {
        println(i)
    }
    for (i in 1..5) {
        println(i)
    }
    for (num in 1..20 step 4) {
        println(num)
    }
    for (i in 20 downTo 10 step 5) {
        println(i)
    }

    for (i in 1 until 10) {
        println(i)
    }

    val s = "goodbye"
    val sRange = 0..s.length
    for(ss in sRange) {
        println(ss)
    }

    val charRange = 'a'..'z'
    val stringRange = "ABC".."XYZ"

    val str = "Hello"
    for (c in str) {
        println(c)
    }

    println(1 in range)
    println(5 in range)
    println(3 in range)
    println('q' in charRange)
    println("CCC" in stringRange)
    println("CCCCC" in stringRange)
    println("ZZZZZ" in stringRange)

    val backwardRange = 5.downTo(1)
    println(5 in backwardRange)
    val stepRange = 3..15
    val stepThree = stepRange.step(3)
    for (i in stepThree) {
        println(i)
    }
    val reversedRange = range.reversed()
    for (i in reversedRange) {
        println(i)
    }

    val seasons = arrayOf("spring", "summer", "fall", "winter")
    for (season in seasons) {
        println(season)
    }
    for (index in seasons.indices) {
        println("${seasons[index]} is season number $index")
    }

    seasons.forEach { println(it) }
    seasons.forEachIndexed { index, value -> println("$value is season number $index") }

    val notASeason = "whatever" !in seasons
    println(notASeason)

    val notInRange = 32 !in 1..10
    println(notInRange)

    val str2 = "Hello"
    println('e' in str2)
    println('e' !in str2)

    for (i in 1..3) {
        println("i = $i")
        jloop@ for (j in 1..4) {
            println("j = $j")
            for (k in 5..10) {
                println("k = $k")
                if (k == 7) {
                    // break@jloop
                    continue@jloop
                }
            }
        }
    }
}