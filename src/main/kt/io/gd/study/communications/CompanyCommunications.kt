package io.gd.study.communications

import java.time.Year

fun main() {
    topLevel("I'm private")

    println(CompanyCommunications.getTagLine())
    println(CompanyCommunications.getCopyrightLine())

    println(SomeClass.accessPrivateVar())

    val someClass1 = SomeClass.justAssign("this is the string as is")
    val someClass2 = SomeClass.upperOrLowerCase("this isn't the string as is", false)
    println(someClass1.someString)
    println(someClass2.someString)

//    val someClass3 = SomeClass()

    var thisIsMutable = 45

    wantsSomeInterface(object : SomeInterface {
        override fun mustImplement(num: Int): String {
            thisIsMutable++
            return "This is from mustImplement: ${num * 100}"
        }
    })
    println(thisIsMutable)

    println(Department.ACCOUNTING.getDeptInfo())
}

object CompanyCommunications {
    val currentYear = Year.now().value

    fun getTagLine() = "Our company rocks!"
    // Only visible in same module
    internal fun getCopyrightLine() = "Copyright \u00A9 $currentYear Our Company. All rights reserved"
}

// Factory pattern
class SomeClass private constructor(val someString: String) {
//    val someString: String
//
//    constructor(str: String) {
//        someString = str
//    }
//
//    constructor(str: String, lowerCase: Boolean) {
//        if (lowerCase) {
//            someString = str.toLowerCase()
//        } else {
//            someString = str.toUpperCase()
//        }
//    }

    companion object {
        private var privateVar = 6

        fun accessPrivateVar() = "I'm accessing privateVar: $privateVar"

        fun justAssign(str: String) = SomeClass(str)
        fun upperOrLowerCase(str: String, lowerCase: Boolean): SomeClass {
            if (lowerCase) {
                return SomeClass(str.toLowerCase())
            } else {
                return SomeClass(str.toUpperCase())
            }
        }
    }
}

interface SomeInterface {
    fun mustImplement(num: Int): String
}

fun wantsSomeInterface(si: SomeInterface) {
    println("Printing from wantsSomeInterface ${si.mustImplement(22)}")
}

// Only visible in same file
private fun topLevel(str: String) = println("Top level function: $str")