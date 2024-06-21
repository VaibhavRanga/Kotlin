package com.vaibhavranga.kotlin

fun main() {
    val listOfNumbers = listOf<Int>(23, 45, 89, 83, 103, 3)
    val listOfNames = listOf<String>("Vaibhav", "Dinesh", "Karuna")
    val finder = Finder(list = listOfNames)
    finder.findItem(element = "Dimpy") {
        println(it)
    }
}

class Finder<T>(private val list: List<T>) {
    fun findItem(element: T, itemFound: (element: T?) -> Unit) {
        val foundItemList = list.filter {
            element == it
        }
        if (foundItemList.isNotEmpty()) itemFound(foundItemList.first()) else itemFound(null)
    }
}
