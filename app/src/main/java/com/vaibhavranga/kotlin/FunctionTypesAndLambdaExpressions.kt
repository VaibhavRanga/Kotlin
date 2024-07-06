package com.vaibhavranga.kotlin

fun main() {

    val treatFunction = trickOrTreat(false) {"$it quarters"}
    val trickFunction = trickOrTreat(true, null)

    treatFunction()
    trickFunction()

    val sumOfTwoNumbers = sumOrSub(sum = true)
    val difference = sumOrSub(sum = false)

    val aSum = sumOfTwoNumbers(1, 3)
    println(aSum)

    println(sumOfTwoNumbers(20, 15))
    println(difference(100, 50))
}

fun trickOrTreat(isTrick: Boolean, extraTreat: ((Int) -> String)?): () -> Unit {
    return if (isTrick) {
        trick
    } else {
        if (extraTreat != null)
            println(extraTreat(5))
        treat
    }
}

val trick = {
    println("No treats!")
}

val treat = {
    println("Have a treat!")
}

val sumOfNumbers = { i1: Int, i2: Int ->
    val a = i1 * 2
    val b = i2 * 2
    (a + b).toString()
    a.toString()
}

val subOfNumbers = { i1: Int, i2: Int ->
    (i1 - i2).toString()
}

fun sumOrSub(sum: Boolean): (Int, Int) -> String {
    return if (sum)
        sumOfNumbers
    else
        subOfNumbers
}
