package com.vaibhavranga.kotlin

import java.util.Scanner

fun main() {
    val scan = Scanner(System.`in`)

    println("Enter a number")
    val num1 = scan.nextFloat()
    println("Enter another number")
    val num2 = scan.nextFloat()

    addition(num1, num2)
    subtraction(num1, num2)
    multiplication(num1, num2)
    division(num1, num2)
}

fun addition(num1: Float, num2: Float) {
    println("Addition: ${num1 + num2}")
}

fun subtraction(num1: Float, num2: Float) {
    println("Subtraction: ${num1 - num2}")
}

fun multiplication(num1: Float, num2: Float) {
    println("Multiplication: ${num1 * num2}")
}

fun division(num1: Float, num2: Float) {
    val div = num1 / num2
    val divTwoDigits = String.format("%.2f", div)
    println("Division: $divTwoDigits")
}
