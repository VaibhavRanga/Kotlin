package com.vaibhavranga.kotlin

fun main() {
    val classC = ClassC()
    val classD = ClassD()

    println("The numbers are " + classC.number + " and " + classD.number)
    println("The sums of two numbers are " + classC.sum(5,6) + " and " + classD.sum(5,6))
    println("The sums of three numbers are " + classC.sum(5,6,7) + " and " + classD.sum(5,6,7))
}
//Variables and functions are abstract in Interface
//Multiple interfaces can be inherited by a class while multiple classes can't be inherited by a class.

interface Add {
    var number: Int

    fun sum(num1: Int, num2: Int): Int

    fun sum(num1: Int, num2: Int, num3: Int): Int {
        return num1 * num2 * num3
    }
}

class ClassC: Add {
    override var number = 12

    override fun sum(num1: Int, num2: Int): Int {
        return num1 + num2
    }

    override fun sum(num1: Int, num2: Int, num3: Int): Int {
        return num1 + num2 + num3
    }
}

class ClassD: Add {
    override var number = 21

    override fun sum(num1: Int, num2: Int): Int {
        return 2 * (num1 + num2)
    }

    override fun sum(num1: Int, num2: Int, num3: Int): Int {
        return 3 * (num1 + num2 + num3)
    }
}