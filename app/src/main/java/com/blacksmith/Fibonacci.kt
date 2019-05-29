package com.blacksmith

fun main(args: Array<String>) {

    // ::::::::::: Up to limit int
    val limit = 34
    var n0 = 0
    var n1 = 1

    print("Until $limit: ")
    while (n0 <= limit) {
        print("$n0 + ")

        val sum = n0 + n1
        n0 = n1
        n1 = sum
    }

    println(" ")
    // ::::::::::: With for loop

    val n = 10
    var f0 = 0
    var f1 = 1

    print("First $n loops: ")
    for (i in 1..n) {
        print("$f0 + ")

        val sum = f0 + f1
        f0 = f1
        f1 = sum
    }

    println("")
    fun fibonacciSequence(): Sequence<Int> {
        return generateSequence(Pair(0, 1), { Pair(it.second, it.first + it.second) }).map { it.first }
    }

    println("Sequence: " + fibonacciSequence().take(10).toList())
}

