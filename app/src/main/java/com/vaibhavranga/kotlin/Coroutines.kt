package com.vaibhavranga.kotlin

/*
import kotlinx.coroutines.*

fun main() {
    GlobalScope.launch {
        task2()
    }
    task1()
    Thread.sleep(6000)
    println("!!")
}

fun task1() {
    println("Hello")
    println(Thread.currentThread().name)
}

suspend fun task2() {
    withContext(Dispatchers.IO) {
        delay(3000)
        println("World")
        println(Thread.currentThread().name)
    }
}
*/





//Asynchronous

/*
import kotlinx.coroutines.*

fun main() {
    runBlocking {
        println("Weather forecast")
        launch {
            printForecast()
        }
        launch {
            printTemperature()
        }
    }
}

suspend fun printForecast() {
    delay(1000)
    println("Sunny")
}

suspend fun printTemperature() {
    delay(1000)
    println("30\u00b0C")
}
*/





// async await

/*
import kotlinx.coroutines.*

fun main() {
    runBlocking {
        println("Weather")
        println(getWeatherReport())
        println("Printed")
    }
}

suspend fun getWeatherReport() = coroutineScope {
    val weather: Deferred<String> = async { getWeather() }
    val temperature: Deferred<String> = async { getTemperature() }
    "${weather.await()} ${temperature.await()}"
}

suspend fun getWeather(): String {
    delay(2000)
    return "Sunny"
}

suspend fun getTemperature(): String {
    delay(2000)
    return "30"
}
*/




