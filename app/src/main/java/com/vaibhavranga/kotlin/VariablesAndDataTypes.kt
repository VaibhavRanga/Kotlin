package com.vaibhavranga.kotlin

fun main() {

    val name1: String = "Vaibhav"
    println("Hello $name1, welcome to Kotlin")

    var name2 = "Karuna"
    name2 = "Dinesh"
    println("Hello $name2")

//val stands for final value while var states variable


    val tvSpeakers = TVSpeakers()

    tvSpeakers.speakerVolume1 = 500
    println(tvSpeakers.speakerVolume3)

    tvSpeakers.speakerVolume2 = 1000
    println(tvSpeakers.speakerVolume2)

    tvSpeakers.speakerVolume3 = 1022
    println(tvSpeakers.speakerVolume3)
}


//get and set


class TVSpeakers {

    //actual 'var' property internal structure
    var speakerVolume1 = 2
        get() = field
        set(value) {
            field = value
        }


    //custom 'var' property
    var speakerVolume2 = 20
        get() = field
        set(value) {
            if (value in 0..100) {
                field = value
            }
        }


    //another custom 'var' property
    var speakerVolume3 = 40
        get() = field
        set(value) {
            if (value < 0) {
                field = 0
            } else if (value > 100) {
                field = 100
            }
        }


    //these two are have same functionality
    var age1 = 10
        private set


    var age2 = 20
        private set(value) {
            field = value
        }
}
