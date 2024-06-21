package com.vaibhavranga.kotlin

import java.util.*

class CodingQuestions1 {
}




//Checks whether a given number is an armstrong number or not

/*fun main() {
    val scan = Scanner(System.`in`)
    println("Enter a positive integer to check for armstrong")
    val number = scan.nextInt()
    val numberOfDigits = number.toString().length
    var i = 10
    var digit = 0
    var power = 0
    var numberOfZeros = 1
    for (j in 1 .. numberOfDigits) {
        numberOfZeros *= 10
    }
    while (i <= numberOfZeros) {
        if (i == 10) {
            digit = number % i
        } else {
            var tempDigit = number % i
            tempDigit = (tempDigit - digit) * 10 / i
            digit = tempDigit
        }
        power += (digit.toDouble().pow(numberOfDigits)).toInt()
        i *= 10
    }
    if (number == power) {
        println("It is an armstrong number")
    } else {
        println("It is not an armstrong number")
    }
}*/






//Checks whether a given number is an armstrong number or not

/*fun main() {
    println("Enter a positive number")
    val number = Scanner(System.`in`).nextInt()
    var tempNumber = number
    var count = 0
    var result = 0
    while (tempNumber > 0) {
        tempNumber /= 10
        count++
    }
    tempNumber = number
    while (tempNumber > 0) {
        val remainder = tempNumber % 10
        result += (remainder.toDouble().pow(count)).toInt()
        tempNumber /= 10
    }
    if (number == result) {
        println("It is an armstrong number")
    } else {
        println("It is not an armstrong number")
    }
}*/






//Prints armstrong numbers in a range

/*fun main() {
    println("Enter the number from which you want to get the armstrong numbers (greater than 0")
    val numStart = Scanner(System.`in`).nextInt()
    println("Enter the number up to which you want to get the armstrong numbers")
    val numEnd = Scanner(System.`in`).nextInt()
    if (numStart in 0..numEnd) {
        for (number in numStart .. numEnd) {
            var tempNumber = number
            var count = 0
            var result = 0
            while (tempNumber > 0) {
                tempNumber /= 10
                count++
            }
            tempNumber = number
            while (tempNumber > 0) {
                val remainder = tempNumber % 10
                result += (remainder.toDouble().pow(count)).toInt()
                tempNumber /= 10
            }
            if (number == result) {
                println(number)
            }
        }
    } else {
        println("Invalid range")
    }
}*/







//Prints armstrong numbers in a range

/*fun main() {
    println("Enter the start of range (greater than 0)")
    val scan = Scanner(System.`in`)
    val rangeStart = scan.nextInt()
    println("Enter the end of range (greater than 0)")
    val rangeEnd = scan.nextInt()
    if (rangeStart in 1 .. rangeEnd) {
        val arrayOfArmstrong = ArrayList<Int>()
        for (number in rangeStart .. rangeEnd) {
            if (checkArmstrong(number)) {
                arrayOfArmstrong.add(number)
            }
        }
        println(arrayOfArmstrong)
    } else {
        println("Invalid range")
    }
}
fun checkArmstrong(number: Int): Boolean {
    var tempNumber = number
    var count = 0
    while (tempNumber > 0) {
        tempNumber /= 10
        count++
    }
    tempNumber = number
    var remainder = 0
    var sum = 0
    while (tempNumber > 0) {
        remainder = tempNumber % 10
        sum += remainder.toDouble().pow(count).toInt()
        tempNumber /= 10
    }
    return number == sum
}*/








//Prints first n armstrong numbers

/*fun main() {
    println("Enter how many armstrong numbers you want to print")
    val numberOfTerms = Scanner(System.`in`).nextInt()
    var numCount = 0
    var current = 1
    while (current > 0) {
        var result = 0
        var count = 0
        var tempNumber = current
        while (tempNumber > 0) {
            tempNumber /= 10
            count++
        }
        tempNumber = current
        while (tempNumber > 0) {
            val remainder = tempNumber % 10
            result += (remainder.toDouble().pow(count)).toInt()
            tempNumber /= 10
        }
        if (current == result ) {
            println(current)
            numCount++
        }
        if (numCount == numberOfTerms) {
            break
        }
        current++
    }
}*/







//Prints first n armstrong numbers

/*fun main() {
    println("Enter n")
    val requiredTerms = Scanner(System.`in`).nextInt()
    var currentTerm = 1
    var number = 1
    val arrayOfArmstrong = ArrayList<Int>()
    while (currentTerm <= requiredTerms) {
        if (checkArmstrong(number)) {
            arrayOfArmstrong.add(number)
            currentTerm++
        }
        number++
    }
    println(arrayOfArmstrong)
}
fun checkArmstrong(number: Int): Boolean {
    var tempNumber = number
    var count = 0
    while (tempNumber > 0) {
        tempNumber /= 10
        count++
    }
    tempNumber = number
    var remainder: Int
    var sum = 0
    while (tempNumber > 0) {
        remainder = tempNumber % 10
        sum += remainder.toDouble().pow(count).toInt()
        tempNumber /= 10
    }
    return number == sum
}*/







//Calculator

/*
fun main() {
    val scan = Scanner(System.`in`)
    do {
        println("Enter 1 for addition, 2 for subtraction, 3 for multiplication or 4 for division")
        val operator = scan.nextInt()

        println("Enter first number")
        val num1 = scan.nextFloat()
        println("Enter second number")
        val num2 = scan.nextFloat()

        when (operator) {
            1 -> println("Addition result: ${num1 + num2}")
            2 -> println("Subtraction result: ${num1 - num2}")
            3 -> println("Multiplication result: ${num1 * num2}")
            4 -> println("Division result: ${num1 / num2}")
        }
        println("Enter 1 to continue or any other key to stop")
        val choice = scan.next()
        var run = false
        if (choice == "1") {
            run = true
        }
    } while (run)
}*/








//Prints the fibonacci series up to a number

/*fun main() {
    println("Enter the number up to which you want the Fibonacci series")
    val numEnd = Scanner(System.`in`).nextInt()
    var num1 = 0
    var num2 = 1
    if (numEnd >= 1) {
        when (numEnd) {
            1 -> {
                println(num1)
                println(num2)
                println(num2)
            }
            else -> {
                println(num1)
                println(num2)
                while (true) {
                    val temp = num1
                    num1 = num2
                    num2 = num1 + temp
                    if (num2 > numEnd) {
                        break
                    }
                    println(num2)
                }
            }
        }
    } else {
        println("Invalid input")
    }
}*/







//Prints first n terms of fibonacci series

/*fun main() {
    println("Enter the number of terms of fibonacci series you want to print")
    val numberOfTerms = Scanner(System.`in`).nextInt()
    var num1 = 0
    var num2 = 1
    var count = 3
    when (numberOfTerms) {
        1 -> {
            println(num1)
        }
        2 -> {
            println(num1)
            println(num2)
        }
        else -> {
            println(num1)
            println(num2)
            while (count <= numberOfTerms) {
                val temp = num1
                num1 = num2
                num2 = temp + num1
                println(num2)
                count++
            }
        }
    }
}*/








//Prints odd or even numbers in a range

/*fun main() {
    println("Enter 1 for even numbers or 2 for odd numbers")
    val choice = Scanner(System.`in`).nextInt()
    when (choice) {
        1 -> {
            evenNumbers()
        }
        2 -> {
            oddNumbers()
        }
        else -> {
            println("Invalid choice")
        }
    }
}
fun evenNumbers() {
    println("Enter the number from which you want to get the even numbers\n" +
            "(should be greater than 0)")
    val numStart = Scanner(System.`in`).nextInt()
    println("Enter the number up to which you want to get the even numbers")
    val numEnd = Scanner(System.`in`).nextInt()
    if (numStart in 1 .. numEnd) {
        for (number in numStart..numEnd) {
            if (number % 2 == 0) {
                println(number)
            }
        }
    } else {
        println("Invalid range")
    }
}
fun oddNumbers() {
    println("Enter the number from which you want to get the odd numbers\n" +
            "(should be greater than 0)")
    val numStart = Scanner(System.`in`).nextInt()
    println("Enter the number up to which you want to get the odd numbers")
    val numEnd = Scanner(System.`in`).nextInt()
    if (numStart in 1 .. numEnd) {
        for (number in numStart..numEnd) {
            if (number % 2 != 0) {
                println(number)
            }
        }
    } else {
        println("Invalid range")
    }
}*/






//Prints first n even or odd numbers

/*fun main() {
    println("Enter 1 for even numbers or 2 for odd numbers")
    val choice = Scanner(System.`in`).nextInt()
    when (choice) {
        1 -> {
            evenNumbers()
        }
        2 -> {
            oddNumbers()
        }
        else -> {
            println("Invalid choice")
        }
    }
}
fun evenNumbers() {
    println("Enter the number of terms you want e.g. 10")
    val numberOfTerms = Scanner(System.`in`).nextInt()
    val infinity = Int.MAX_VALUE
    var count = 0
    for (num in 1.. infinity) {
        if (num % 2 == 0) {
            println(num)
            count++
        }
        if (count >= numberOfTerms) {
            break
        }
    }
}
fun oddNumbers() {
    println("Enter the number of terms you want e.g. 10")
    val numberOfTerms = Scanner(System.`in`).nextInt()
    val infinity = Int.MAX_VALUE
    var count = 0
    for (num in 1.. infinity) {
        if (num % 2 != 0) {
            println(num)
            count++
        }
        if (count >= numberOfTerms) {
            break
        }
    }
}*/







//Checks whether a number is prime or not

/*fun main() {
    println("Enter a positive integer to check for prime")
    val number = Scanner(System.`in`).nextInt()
    if (number <= 0) {
        println("Invalid input")
    } else if (number == 1) {
        println("Not a prime number")
    } else {
        var isPrime = true
        for (i in 2 .. number / 2) {
            if (number % i == 0) {
                isPrime = false
                break
            }
        }
        if (isPrime) println("Prime number") else println("Not a prime number")
    }
}*/






//Prints prime numbers in a range

/*fun main() {
    println("Enter the number from which you want to get the prime numbers\n(should be greater than 1)")
    val numStart = Scanner(System.`in`).nextInt()
    println("Enter the number up to which you want to get the prime numbers")
    val numEnd = Scanner(System.`in`).nextInt()
    if (numStart in 2 .. numEnd) {
        for (num in numStart .. numEnd) {
            var isPrime = true
            for (i in 2 .. num / 2) {
                if (num % i == 0) {
                    isPrime = false
                    break
                }
            }
            if (isPrime) {
                println(num)
            }
        }
    } else {
        println("Invalid range")
    }
}*/






//Prints prime numbers in a range

/*fun main() {
    println("Enter start of range (greater than 1)")
    val scan = Scanner(System.`in`)
    val rangeStart = scan.nextInt()
    println("Enter the end of range (greater than 1)")
    val rangeEnd = scan.nextInt()
    if (rangeStart in 2 .. rangeEnd) {
        val arrayOfPrimes = ArrayList<Int>()
        for (i in rangeStart..rangeEnd) {
            if (checkPrime(i)) {
                arrayOfPrimes.add(i)
            }
        }
        println(arrayOfPrimes)
    } else {
        println("Invalid range")
    }
}
fun checkPrime(currentNumber: Int): Boolean {
    var isPrime = true
    for (i in 2 .. currentNumber / 2) {
        if (currentNumber % i == 0) {
            isPrime = false
            break
        }
    }
    return isPrime
}*/








//Prints first n prime numbers

/*fun main() {
    println("Enter how many prime numbers you want")
    val numberOfTerms = Scanner(System.`in`).nextInt()
    val infinity = Int.MAX_VALUE
    var count = 1
    for (current in 2 .. infinity) {
        var isPrime = true
        for (i in 2 .. current / 2) {
            if (current % i == 0) {
                isPrime = false
                break
            }
        }
        if (count > numberOfTerms) {
            break
        }
        if (isPrime) {
            count++
            println(current)
        }
    }
}*/







//Prints first n prime numbers

/*fun main() {
    println("Enter n")
    val requiredCount = Scanner(System.`in`).nextInt()
    var currentCount = 1
    var number = 2
    val arrayOfPrimes = ArrayList<Int>()
    while (currentCount <= requiredCount) {
        if (checkPrime(number)) {
            arrayOfPrimes.add(number)
            currentCount++
        }
        number++
    }
    println(arrayOfPrimes)
}
fun checkPrime(currentNumber: Int): Boolean {
    var isPrime = true
    for (i in 2 .. currentNumber / 2) {
        if (currentNumber % i == 0) {
            isPrime = false
            break
        }
    }
    return isPrime
}*/
