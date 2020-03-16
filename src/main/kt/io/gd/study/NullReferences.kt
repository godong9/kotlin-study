package io.gd.study

fun main() {
    val str: String? = "This isn't null"
    val str4 = str!!.toUpperCase()
//    if (str == null) {
//        throw exception
//    } else {
//        str.toUpperCase()
//    }

    str?.toUpperCase()

    val nullStr: String? = null
//    val str5 = nullStr!!.toUpperCase()
    println("What happens: ${nullStr?.toUpperCase()}")
//    if (nullStr == null) {
//        null
//    } else {
//        nullStr.toUpperCase()
//    }

    val str2 = nullStr ?: "This is the default value"
    println(str2)
//    if (nullStr == null) {
//        str2 = "this is the default value"
//    } else {
//        str2 = str
//    }

//    val country = bankBranch?.address?.country ?: "US"

    val something: Any = arrayOf(1, 2, 3, 4)
    val str3 = something as? String
    println(str3)

    println(str3?.toUpperCase())

    val testStr: String? = "This isn't null"
//    printText(testStr!!)

    testStr?.let { printText(it) }
//    if (testStr != null) {
//        printText(testStr)
//    }

    val testStr4 : String? = null
    val anotherStr = "This isn't nullable"
    println(testStr4 == anotherStr)

    val testStr2 = testStr!!
    val testStr3 = testStr2.toUpperCase()

    // Don't do like below
    // val countryCode = bankBranch!!.address!!.country!!

    println("=========================")
    val nullableInts = arrayOfNulls<Int?>(5)
    for (i in nullableInts) {
        println(i)
    }
    println(nullableInts[3])
}

fun printText(text: String) {
    println(text)
}