package com.vaibhavranga.kotlin

fun main() {

    val people = listOf<Person>(
        Person(firstName = "Anil", lastName = "Kumar", age = 25, country = "India"),
        Person(firstName = "Vaibhav", lastName = "Ranga", age = 48, country = "India"),
        Person(firstName = "David", lastName = "Jones", age = 15, country = "America"),
        Person(firstName = "George", lastName = "Cooper", age = 12, country = "England"),
        Person(firstName = "Paul", lastName = "Hudson", age = 52, country = "England")
    )

    val cities = listOf<String>("Delhi", "Mumbai", "Kolkata", "Chennai", "Bangalore")


    //Filter
    val filteredPeople = people.filter { it.country == "India" }


    //FilterIndexed
    val filteredPeopleIndexed = people.filterIndexed { index, person -> index % 2 == 0 }


    //Partition
    val peoplePartition = people.partition { it.country == "England" }.second


    //Any, All, None: Return boolean based on condition checked for
    val any = people.any { it.country == "England" }
    val all = people.all { it.age > 10 }
    val none = people.none { it.country == "England" }
}
