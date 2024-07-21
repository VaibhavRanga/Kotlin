package com.vaibhavranga.kotlin

fun main() {
//    listFeatures()
//    setFeatures()
    mapFeatures()
}

fun listFeatures() {
    //Lists: Ordered collection of data that can contain duplicate elements

    //Immutable list
    val immutableListExample = listOf(1, 2, 3, 4, 5)

    //Mutable lists: arrayListOf, mutableListOf, arraylist
    val mutableListExample = mutableListOf(1, 2, 3, 4, 5)

    mutableListExample.add(8)
    mutableListExample.add(3, 10)
    mutableListExample[6] = 14
    mutableListExample.remove(5)
    mutableListExample.removeAt(1)

    val mutableListExample2 = immutableListExample + mutableListExample
    val mutableListExample3 = immutableListExample - mutableListExample

    println(mutableListExample2)
    println(mutableListExample3)

    for (i in mutableListExample.indices) {
        println("Num: ${mutableListExample[i]}")
    }

    mutableListExample.forEach {
        println("Number is: $it")
    }

    immutableListExample.forEachIndexed { index, value ->
        println("Number at index $index is $value")
    }

    println("Does the list contains 4: ${immutableListExample.contains(4)}")

    if (10 in mutableListExample) {
        println("10 exists")
    }

    immutableListExample.isNotEmpty()
    immutableListExample.isEmpty()
    println("${immutableListExample.size}")
}



fun setFeatures() {

    //Sets: Unordered collection of data which can't contain duplicate elements

    //Immutable set: setOf

    //Mutable set: mutableSetOf, hashSetOf

    val setNames = setOf("A", "B", "C", "D", "E", "C", "A")
    val otherSetNames = setOf("C", "F", "B")

    val mutableSetOfNumbers = mutableSetOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    mutableSetOfNumbers.add(50)
    mutableSetOfNumbers.remove(10)

    mutableSetOfNumbers.forEach {
        println("Number is: $it")
    }

    mutableSetOfNumbers.forEachIndexed { index, value ->
        println("Number at index $index is $value")
    }

    println("Size: ${setNames.size}")
    println("Indices: ${setNames.indices}")
    println("Element at index 2: ${setNames.elementAt(2)}")
    println(setNames)

    val newSetNames1 = setNames + otherSetNames
    val newSetNames2 = setNames - otherSetNames

    println(newSetNames1)
    println(newSetNames2)

    if (mutableSetOfNumbers.contains(7)) {
        println("The set contains integer 7")
    }

    mutableSetOfNumbers.isNotEmpty()
}




fun mapFeatures() {
    //Unordered key- value pair without duplicate keys

    //Immutable map: mapOf

    //Mutable map: mutableMapOf, hashMapOf

    val immutableMapOfNames = mapOf("city" to "Jaipur", "capital" to "New Delhi", "name" to "Bhim", "name" to "Ram")  //Here only the "name" to "Ram" pair will be used as it is the latest value of key "name"

    println(immutableMapOfNames)

    val mutableMapOfNumbers = mutableMapOf("one" to 1, "three" to 3, "two" to 2)

    mutableMapOfNumbers["four"] = 4
    mutableMapOfNumbers.remove("two")

    println(mutableMapOfNumbers)

    immutableMapOfNames.forEach {
        println("Key: ${it.key}, value: ${it.value}")
    }

    println("Size of map: ${mutableMapOfNumbers.size}")

    println(mutableMapOfNumbers.containsKey("three"))
    println(mutableMapOfNumbers.containsValue(1))

    println("Sorted map: ${mutableMapOfNumbers.toSortedMap()}")

    immutableMapOfNames.filter {
        it.key.contains("city")
    }.forEach { println("Key: ${it.key}, value: ${it.value}") }
}
