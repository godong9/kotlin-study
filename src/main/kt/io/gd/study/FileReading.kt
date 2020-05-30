package io.gd.study

import java.io.File

fun main() {
//    val lines = File("testfile.txt").reader().readLines()
    File("testfile.txt").reader().forEachLine { println(it) }
    val lines = File("testfile.txt").bufferedReader().use { it.readText() }
    println(lines)
}