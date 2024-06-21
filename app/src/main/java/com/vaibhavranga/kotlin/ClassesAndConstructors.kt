package com.vaibhavranga.kotlin

fun main() {

    val number = ClassesAndConstructors(100)
    println("The number is " + number.num)
    println("The sum is " + number.sum(30, 50))

    val product = AnotherClass(3,9,15)

    println("Difference is: " + AnotherClass.difference(1000, 500))
//    Companion class lets us use variables or methods without creating objects
}

//Custom values can also be assigned to the variables of the constructors
class ClassesAndConstructors (a: Int) {
    //This is a primary constructor. It's not mandatory but if used will get executed first.
    init {
        println("Hello there")   //init code will get executed when the class is used
    }

    val num = 10

    fun sum (num1: Int, num2: Int): Int {
        return num1 + num2
    }
}

//Custom/ secondary constructor: used when more than 1 constructors are required
//If we use multiple constructors then we can't use primary constructor
class AnotherClass {

    //The below two constructors will be called as per the input values.
    //If there are two values provided while calling the constructor then the below constructor will be called.
    constructor (num3: Int, num4: Int) {
        val product = num3 * num4
        println("The product of two numbers is $product")
    }
    //If there are three values provided while calling the constructor then the below constructor will be called.
    constructor(num5: Int, num6 : Int, num7: Int) {
        val product = num5 * num6 * num7
        println("The product of three numbers is $product")
    }
    fun multiply () {}

//    Companion object is used to declare variables that are required to be accessed directly without creating any object.
    companion object {
        fun difference (number2: Int, number3: Int): Int {
            return number2 - number3
        }
    }
}
