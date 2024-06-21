package com.vaibhavranga.kotlin

fun main () {

    val classB = ClassB()
    val classA = ClassA()

    println("The name is: " + classB.name + ", " + classA.name)
    println("The sum is: " + classB.add(5,6) + ", " + classA.add(5,6))
}

//Parent/ Super class
open class ClassA {
    open var name = "John"

    open fun add (a: Int, b: Int) : Int {
        return a + b
    }
}
//Child/ Sub-class
class ClassB: ClassA() {
    override var name = "Harry"
    override fun add(a: Int, b: Int): Int {         //Runtime Polymorphism
        val sum = super.add(a, b)
        val square = sum * sum
        return square
    }
}