package com.vaibhavranga.kotlin

fun main() {
    var num = 150
    if (num > 100) {
        println("Number is greater")
    } else {
        println("Number is smaller")
    }
    //another way of using the if else statements
    var msg = ""
    msg = if (num > 100) "Number is greater" else "Number is smaller"
    println(msg)

    //if else-if

    if (num > 100) {
        println("Number is greater")
    } else if (num > 70) {
        println("Number is greater too")
    } else {
        println("Number is smaller")
    }

    // when statement

    when (num) {
        100 -> {}       //if num == 100 this will get executed
        150 -> {}       //if num == 150 this will get executed
        in 1..10 -> {}   //if num is in the range of 1 to 10 this will get executed
        is Int -> {}     //if num is of type Int this will get executed
        !is Int -> {}    //if num is not of type Int this will get executed
        200, 300, 400 -> {} //if num is 200 or 300 or 400 this will get executed
        else -> {}
    }

    //another way of using when

    when {
        num > 150 -> {}

        num == 150 -> {}

        num > 70 -> {}

        else -> {}
    }
}
