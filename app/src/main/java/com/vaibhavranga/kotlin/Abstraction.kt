package com.vaibhavranga.kotlin

fun main () {

}

abstract class ClassE {

    var name: String = "John"

    //An abstract variable cannot be initialized
    abstract var branch: String

    fun add (num1: Int, num2: Int): Int {
        return num1 + num2
    }

    //An abstract function cannot have a body while an interface can
    abstract fun operate (num1: Int, num2: Int): Int

}

//All the abstract functions will have to be overridden
class ClassF: ClassE () {
    override var branch: String = "Sam"

    override fun operate(num1: Int, num2: Int): Int {
        return num1 * num2
    }
}