package io.gd.study

import java.math.BigDecimal

fun main() {
    val mixedList: List<Any> = listOf("string", 1, BigDecimal(22.5), "fall", BigDecimal(-325.353))
    val bigDecimalsOnly = getElementsOfType<BigDecimal>(mixedList)
    for (item in bigDecimalsOnly) {
        println(item)
    }

    val stringsOnly = getElementsOfType<String>(mixedList)
}

inline fun <reified T> getElementsOfType(list: List<Any>): List<T> {
    var newList: MutableList<T> = mutableListOf()
    for (element in list) {
        if (element is T) {
            newList.add(element)
        }
    }

    return newList
}
