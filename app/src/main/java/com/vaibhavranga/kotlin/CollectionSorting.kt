package com.vaibhavranga.kotlin

fun main() {


    val people = listOf<Person>(
        Person(firstName = "Anil", lastName = "Kumar", age = 25, country = "India"),
        Person(firstName = "Vaibhav", lastName = "Ranga", age = 48, country = "India"),
        Person(firstName = "David", lastName = "Jones", age = 15, country = "America"),
        Person(firstName = "George", lastName = "Cooper", age = 12, country = "England"),
        Person(firstName = "Paul", lastName = "Hudson", age = 52, country = "England")
    )

    val cities = listOf<String>("Delhi", "Mumbai", "Kolkata", "Chennai", "Mahabaleshwar", "Bangalore")



    //Sorting
    println(cities.sorted())
    println(cities.sortedDescending())

    people.sortedBy { it.age }.forEach { println(it) }

    println("------------------------")
    people.sortedWith(compareBy { it.firstName }).forEach { println(it) }       //compareBy is a custom comparator

    println("--------------------------")


    //Reversed
    people.sortedWith(compareBy { it.firstName }).reversed().forEach { println(it) }

    println(cities.asReversed())

    println("----------------------------")


    //Shuffle
    println(cities.shuffled())

    println("-----------------------------")

    val sortWithChennaiAndMahabaleshwarFirst = cities.sortedWith(compareBy({ it != "Chennai" }, { it != "Mahabaleshwar" }, { it }))
    println(sortWithChennaiAndMahabaleshwarFirst)
}
