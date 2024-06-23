package com.vaibhavranga.kotlin

fun main() {


    val cities = listOf<String>("Delhi", "Mumbai", "Kolkata", "Chennai", "Mahabaleshwar", "Bangalore")


    //ElementAt
    println(cities.elementAt(3))
    println(cities.elementAtOrNull(10))
    println(cities.elementAtOrElse(10) { index -> "Index $index is out of bounds" })

    //First and last
    println("First element: ${cities.first()}")
    println("First element starting with 'M': ${cities.first { it.startsWith("M")}}")
    println("Last element starting with 'M': ${cities.last { it.startsWith("M")}}")
    println("First element ending with 'a': ${cities.first { it.endsWith("a")}}")

    //Find
    println("Find New Delhi: ${cities.find { it == "Delhi" }}")
    println("Find city with letters more than 8: ${cities.find { it.length > 8 }}")         //First element with the asked length will be returned and if no element has the asked length then null will be returned

    //Random
    println("Random name from the collection: ${cities.random()}")

    //Contains
    println("Check if Mumbai is there in the collection: ${cities.contains("Mumbai")}")

    //isEmpty or isNotEmpty
    println("Check if the collection is empty: ${cities.isEmpty()}")
    println("Check if the collection is not empty: ${cities.isNotEmpty()}")
}
