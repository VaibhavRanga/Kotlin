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




//Abstraction means to hide the implementation details from the user.
//It is achieved by creating abstract methods in a class. Then the class has to be marked as abstract too.
//Objects of an abstract class can't be created but it can be inherited from.
//On inheriting, all the abstract members need to be overridden in the sub-class.
//If all the members of an abstract class are abstract then it is better suited to create it as an interface as multiple inheritance is not possible.