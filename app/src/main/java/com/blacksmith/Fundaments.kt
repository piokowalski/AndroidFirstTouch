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
    val escapedString : String  = "I am escaped String!\nHowdy!"

    println("Hello!"+escapedString)
    //Escaped string adding extra space below
    println("Hey!!"+rawString+"\n")

    //Arrays

    val numbers: IntArray = intArrayOf(1, 2, 3, 4, 5)
    println("Hey!! I am array "+numbers[2]+"\n")

    //Collections

    val items = listOf(1, 2, 3, 4)
    println("First Element of our list = "+items.first())
    println("Last Element of our list = "+items.last())
    println("Even Numbers of our List = "+items.
            filter { it % 2 == 0 })   // returns [2, 4]

    val readWriteMap = hashMapOf("foo" to 1, "bar" to 2)
    println(readWriteMap["foo"])  // prints "1"

    val strings = hashSetOf("a", "b", "c", "c")
    println("My Set Values are "+strings+"\n")
}