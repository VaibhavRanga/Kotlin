package com.vaibhavranga.kotlin

data class Question<T>(
    val questionText: String,
    val answer: T,
    val difficulty: Difficulty
)

enum class Difficulty {
    EASY, MEDIUM, HARD
}

interface ProgressPrintable {
    val progressText: String

    fun printProgressBar()
}

class Quiz : ProgressPrintable {
    override val progressText: String
        get() = "$answered of $total answered"

    override fun printProgressBar() {
        repeat(Quiz.answered) { print("▓") }
        repeat(Quiz.total - Quiz.answered) { print("▒") }
        println()
        println(progressText)
    }

    companion object StudentProgress {
        var total = 10
        var answered = 3
    }

    val question1 = Question<String>("Quoth the raven ___", "nevermore", Difficulty.MEDIUM)
    val question2 = Question<Boolean>("The sky is green. True or false", false, Difficulty.EASY)
    val question3 = Question<Int>("How many days are there between full moons?", 28, Difficulty.HARD)


    //Let scope function: Replace long object names with 'it'

    fun printQuizQuestion() {
        question1.let {
            println(it.questionText)
            println(it.answer)
        }
    }

    //We can call an object's methods without a variable using apply()
}


/*//Class extension
val Quiz.StudentProgress.progressText: String
    get() = "$answered of $total answered"

fun Quiz.StudentProgress.printProgressBar() {
    repeat(answered) { print("▓") }
    repeat(total - answered) { print("▒") }
    println()
    println(Quiz.progressText)
}

fun main() {
    println(Quiz.printProgressBar())            //No need to create an object of the class
}*/

fun main() {
    println(Quiz().printProgressBar())          //With interface, an object of the class has to be created to access the class functions
}