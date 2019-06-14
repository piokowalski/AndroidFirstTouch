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

    //Ranges

    val i:Int  = 11
    for (j in 1..4)
        println(j) // prints "1234"

    if (i in 1..10) { // equivalent of 1 < = i && i < = 10
        println("Your number is: "+i)
    }               else {
        println("Your number is not in a range :(")
    }

    //if - else syntax

    fun ifElse() {
            val a:Int = 5
            val b:Int = 2
            var max: Int

            if (a > b) {
                max = a
            } else {
                max = b
            }
            print("Maximum of a or b is " +max+"\n")
    }
    println(ifElse())

    //lambda

    val myLambda :(String)->Unit  = {
        s:String->print(s)
    }
    val v:String = "First Kotlin lambda."
    myLambda(v)



}