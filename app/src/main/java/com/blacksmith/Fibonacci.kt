package com.blacksmith

fun main(args: Array<String>) {

    val limit = 21
    var n0 = 0
    var n1 = 1

    print("Until $limit: ")
    while (n0<= limit) {
        print("$n0 + ")

        val sum = n0 + n1
        n0 = n1
        n1 = sum
    }

}
