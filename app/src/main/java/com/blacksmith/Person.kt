package com.blacksmith

class Person(val firstName:String, var age:Int) {
    val message:String = "Hi "+"${firstName}"
}