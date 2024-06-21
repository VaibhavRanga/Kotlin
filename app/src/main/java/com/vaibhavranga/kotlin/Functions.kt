package com.vaibhavranga.kotlin

fun main(args: Array<String>) {
    println("The sum is ${sum(10,20)}")
}
fun sum(num1 : Int, num2 : Int) : Int {
    return num1 + num2
}

//method overloading
fun sum(num1 : Int, num2 : Int, num3 : Int) : Int {
    return num1 + num2 + num3
}

//if return type is Any, we can return any type of value
