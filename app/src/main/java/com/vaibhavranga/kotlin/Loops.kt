package com.vaibhavranga.kotlin

fun main (args: Array<String>) {
    var num = 0

//The loop will run 11 times i.e., from 0 to 10
    /*for (i in 0..10) {
        println(num++)
    }*/

//The loop will run from 0 to 9
    /*for (i in 0 until 10) {
        println(num++)
    }*/

//The loop will run from 10 to 0 with steps of 2 i.e., the loop will run 6 times
    /*for (i in 10 downTo 0 step 2) {
        println(num++)
    }*/

//            Using for loop with array
    /*val arrNo = ArrayList<Int>()
        arrNo.add(4)
        arrNo.add(5)
        arrNo.add(6)
        arrNo.add(7)
        arrNo.add(1)
        arrNo.add(2)
        arrNo.add(3)

    for (i in arrNo) {
        println(i)
    }*/

    /*val names: List<String> = listOf("Vaibhav", "Karuna", "Dinesh")

    println(names.size)

    for (i in names) {
        println(i)
    }*/

    /*val fruits : List<String> = listOf("Banana", "Apple", "Orange")

    fruits.forEach {
        println(it)
    }*/


// While loops

    /*while (num < 10) {
        println(num)
        num++
    }*/

//Do-While loop
    /*do {
        println(num)
        num++
    } while (num < 10)*/
}
