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

    //Strings

    var rawString : String  = "I am Raw String!"
    val escapedString : String  = "I am escaped String!\n"

    println("Hello!"+escapedString)
    println("Hey!!"+rawString)

}