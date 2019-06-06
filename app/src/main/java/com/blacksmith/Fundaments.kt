package com.blacksmith

fun main(args: Array<String>) {
    println("Kotlin basics here")

    var a = 1
    var b = 4
    println(a+b)

    println("Data types:")

    val data1: String = "hi" + " there!"
    val data2: String = """
        hi

        $data1
        """

    println(data2)

}