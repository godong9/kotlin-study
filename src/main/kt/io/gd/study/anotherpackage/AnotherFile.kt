package io.gd.study.anotherpackage

import io.gd.study.communications.CompanyCommunications as Comm
import io.gd.study.communications.Department.*
//import io.gd.study.communications.topLevel as tp

fun main() {
//    tp("Hello from AnotherFile")
    println(Comm.getCopyrightLine())
    println(IT.getDeptInfo())
    println(SALES.getDeptInfo())
}