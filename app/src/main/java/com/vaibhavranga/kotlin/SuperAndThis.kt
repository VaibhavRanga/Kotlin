package com.vaibhavranga.kotlin

fun main() {

    val audi = Audi(7777)

    audi.interior(12345)
}

open class Car(chassisNum: Int) {

    init {
        println("Chassis number is: $chassisNum")
    }
    fun gearShifted(gear: Int) {
        println("Gear shifted to $gear")
    }
    fun carAccelerated(speed: Int) {
        println("Car accelerated to speed $speed Kmph")
    }
    fun brakesApplied() {
        println("Brakes applied and car stopped")
    }
}

class Audi(chassisNum: Int): Car(chassisNum) {

    var chassisNum = 10000

    init {
        println("Audi created")
        super.gearShifted(1)
        super.carAccelerated(10)
        super.gearShifted(2)
        super.carAccelerated(25)
        super.brakesApplied()
    }

    fun interior(chassisNum: Int) {
        println("Chassis number is: $chassisNum")     //Chassis number- 12345 will be printed
        println("Chassis number is: " + this.chassisNum)    //Chassis number- 10000 will be printed
    }
}
