package com.vaibhavranga.kotlin

fun main (args: Array<String>) {
// Pair can store a pair of items. Nesting is also possible.
    val (a, b) = Pair("Vaibhav", 1)

    println("$a $b")

    val name = Pair("Rama", Pair("Karuna", "Dinesh"))
    println(name.second)

//Triple

//It can store 3 values, nesting is also possible

    val (x, y, z) = Triple("Abcd", "Efgh", "Ijkl")
    println("$x, $y, $z")

    val numbers = Triple("Hello", "World", Triple(10, 50, false))
    println(numbers.third.second)
}
