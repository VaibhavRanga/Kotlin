package com.vaibhavranga.kotlin

import java.util.*

class CodingQuestions2 {
}




//Checks integer for palindrome

/*fun main() {
    println("Enter a number")
    val number = Scanner(System.`in`).nextInt()
    var tempNumber = number
    var sum = 0
    var remainder = 0
    while (tempNumber > 0) {
        remainder = tempNumber % 10
        sum = sum * 10 + remainder
        tempNumber /= 10
    }
    if (number == sum) {
        println("$number is a palindrome")
    } else {
        println("$number is not a palindrome")
    }
}*/





//Checks a string for palindrome

/*fun main() {
    println("Enter a word")
    val word = Scanner(System.`in`).next()
    var reverseWord = ""
    val length = word.length
    for (item in length - 1 downTo 0) {
        reverseWord += word[item]
    }
    if (word == reverseWord) {
        println("It's a palindrome")
    } else {
        println("Not a palindrome")
    }
}*/







//Checks a string for palindrome (not working)

/*fun main() {
    println("Enter a word")
    val word = Scanner(System.`in`).next()
    var reverseWord = word
    val length = reverseWord.length
    var i = 0
    while (i <= (length / 2) - 1) {
        val temp = reverseWord[i]
        reverseWord[i] = reverseWord[length - i - 1]
        reverseWord[length - i - 1] = temp
        i++
    }
    if (word == reverseWord) {
        println("It's a palindrome")
    } else {
        println("Not a palindrome")
    }
}*/







//Finds the largest number in a list

/*fun main() {
    val scan = Scanner(System.`in`)
    val list = ArrayList<Int>()
    println("Enter the size of the array")
    val size = scan.nextInt()
    println("Enter the elements of the array")
    for (item in 0 until  size) {
        list.add(scan.nextInt())
    }
    println("The largest number in the list is: ${list.sortedDescending()[0]}")
}*/







//Calculates the average of elements of a list

/*fun main() {
    val scan = Scanner(System.`in`)
    val list = ArrayList<Int>()
    println("Enter the size of the array")
    val size = scan.nextInt()
    println("Enter the elements of the array")
    var sumOfElements = 0.0f
    for (item in 0 until  size) {
        list.add(scan.nextInt())
        sumOfElements += list[item]
    }
    val averageOfElements = sumOfElements / size
    println("The average of the elements is: $averageOfElements")
}*/







//Checks for leap year

/*fun main() {
    println("Enter a year")
    val year = Scanner(System.`in`).nextInt()
    if (checkLeapYear(year)) {
        println("$year is a leap year")
    } else {
        println("$year is not a leap year")
    }
}
fun checkLeapYear(year: Int): Boolean {
    var isLeap = false
    if (year % 100 == 0) {
        if (year % 400 == 0) {
            isLeap = true
        }
    } else if (year % 4 == 0) {
        isLeap = true
    }
    return isLeap
}*/







//Prints the table of a number and also stores it in a list, a set and a map

/*fun main() {
    println("Enter a number")
    val num = Scanner(System.`in`).nextInt()
    val list = mutableListOf<Int>()
    val set = mutableSetOf<Int>()
    val map = mutableMapOf<Int, Int>()

    for (i in 1 .. 10) {
        println("$num * $i = ${num * i}")
        list.add(num * i)
        set.add(num * i)
        map[i] = num * i
    }

    println("List: $list")
    println("Set: $set")
    println("Map: $map")
}*/






//Calculates factorial of a number

/*fun main() {
    println("Enter a number to calculate the factorial")
    val num = Scanner(System.`in`).nextInt()
    var factorial = 1
    for (i in 1 .. num) {
        factorial *= i
    }
    println("Factorial of $num is: $factorial")
}*/
