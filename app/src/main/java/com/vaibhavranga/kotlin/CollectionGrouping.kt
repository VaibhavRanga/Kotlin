package com.vaibhavranga.kotlin

fun main() {

    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val numbersInDouble = listOf<Double>(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0)
    val numArray = IntArray(5)

    for (i in numArray.indices) {
        numArray[i] = i
    }

    val names = listOf("Vaibhav", "Karuna", "Dinesh")
    val name = "James"



    //Fold
    val sumByFold = numbers.fold(0) { acc, i -> acc + i }
    val sumOfNames = names.fold("Names: ") { acc, s -> acc + s }
    val editedName = name.fold("") { acc, c -> acc + "i" + c }
    val numArraySum = numArray.fold(0) { acc, i -> acc + i }

    //Reduce
    val sumByReduce = numbers.reduce { acc, i -> acc + i }
    val sumByReduce2 = numbersInDouble.reduce { acc, i -> acc + i }


    //min, max, sum, avg, count
    val min = numbers.min()
    val max = numbers.max()
    val sum = numbers.sum()
    val avg = numbers.average()
    val count = numbers.count()

}
