package io.gd.study.challenge4

fun main() {
    // 5, 10, 15, 20, 25, ..., 5000
//    for (i in 5..5000 step 5) {
//        println(i)
//    }

//    for (i in -500..0) {
//        println(i)
//    }

    // 0, 1, 1, 2, 3, 5, 8... print the first 15 numbers in the Fibonacci sequence
//    var first = 0
//    var second = 1
//    println(first)
//    println(second)
//    for (i in 1..13) {
//        val result = first + second
//        println(result)
//        first = second
//        second = result
//    }

    // Modify the following code so that it prints the following,
    // each number on a separate line
    // 1, 11, 100, 99, 98, 2
    iloop@ for (i in 1..5) {
        println(i)
        if (i == 2) {
            break
        }
        for (j in 11..20) {
            println(j)
            for (k in 100 downTo 90) {
                println(k)
                if (k == 98) {
                    continue@iloop
                }
            }
        }
    }

    // Declare a variable called dnum (double) and assign it as follows:
    // if num > 100, assign dnum -234.567
    // if num < 100, assign dnum 4444.555
    // if num == 100, assign dnum 0.0
    // do all of the above (declaring dnum and assigning
    // it) in one statement/expression
    val num = 10
    val dnum = when {
        num > 100 -> -234.567
        num < 100 -> 4444.555
        num == 100 -> 0.0
        else -> 0.0
    }
    println(dnum)
}