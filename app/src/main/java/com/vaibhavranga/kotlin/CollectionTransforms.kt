package com.vaibhavranga.kotlin

data class Person(
    val firstName: String,
    val lastName: String,
    var age: Int,
    var country: String
)

fun main() {

    val people = listOf<Person>(
        Person(firstName = "Anil", lastName = "Kumar", age = 25, country = "India"),
        Person(firstName = "Vaibhav", lastName = "Ranga", age = 48, country = "India"),
        Person(firstName = "David", lastName = "Jones", age = 15, country = "America"),
        Person(firstName = "George", lastName = "Cooper", age = 12, country = "England"),
        Person(firstName = "Paul", lastName = "Hudson", age = 52, country = "England")
    )

    val cities = listOf<String>("Delhi", "Mumbai", "Kolkata", "Chennai", "Bangalore")


    // Map
    val firstNames = people.map { it.firstName}
    val firstNamesWithIndex = people.mapIndexed { index, person -> "$index - ${person.firstName}" }
    val firstNamesWithCountry = people.map { if (it.country != "England") it.country else null }
    val firstNamesWithCountryNotNull = people.mapNotNull { if (it.country != "England") it.country else null }


    // Zip
    val cityPeopleZip = cities.zip(people)
//    println(cityPeopleZip.first())
    val unzippedCityPeopleList = cityPeopleZip.unzip()
//    println(unzippedCityPeopleList.second)


    //Associate and AssociateBy
    val peopleAssociate = people.associate { Pair(it.firstName, it) }
//    println(peopleAssociate)
//    peopleAssociate.forEach { (first, second) -> println("$first --> $second")}
    val peopleAssociateBy = people.associateBy { it.firstName }
//    println(peopleAssociateBy)


    //Flatten
    val list1 = listOf("A", "B", "C")
    val list2 = listOf("D", "E", "F")
    val list3 = listOf("G", "H", "I")

    val list4 = listOf(list1, list2, list3)
//    println(list4.flatten())


    //String Presentation
//    println(cities.joinToString(separator = " | ", prefix = "Starts here ", postfix = " Ends here"))


    //Plus, minus
//    println(list1 - "B")
//    println(list1 + list2 - list3)
}
