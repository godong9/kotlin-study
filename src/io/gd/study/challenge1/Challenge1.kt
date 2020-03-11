package io.gd.study.challenge1

fun main() {
    val hello1 = "Hello"
    val hello2 = "Hello"

    println("hello1 is referentially equal to hello2: ${hello1 === hello2}")
    println("hello1 is structural equal to hello2: ${hello1 == hello2}")

    var num: Int = 2988

    val text: Any = "The Any type is the root of the Kotlin class hierarchy"
    if (text is String) {
        println(text.toUpperCase())
    }

    val ones = """   1
        |  11
        | 111
        |1111  
    """.trimMargin()
    println(ones)

}