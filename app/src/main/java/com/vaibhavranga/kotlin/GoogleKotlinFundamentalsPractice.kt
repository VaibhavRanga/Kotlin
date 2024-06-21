package com.vaibhavranga.kotlin


// movie ticket price

/*
fun main() {
    val child = 5
    val adult = 28
    val senior = 87

    val isMonday = true

    println("The movie ticket price for a person aged $child is \$${ticketPrice(child, isMonday)}.")
    println("The movie ticket price for a person aged $adult is \$${ticketPrice(adult, isMonday)}.")
    println("The movie ticket price for a person aged $senior is \$${ticketPrice(senior, isMonday)}.")
}

fun ticketPrice(age: Int, isMonday: Boolean): Int {
    return when (age) {
        in 0 .. 12 -> 15
        in 13 .. 60 -> if (isMonday) 25 else 30
        in 61 .. 100 -> 20
        else -> -1
    }
}*/




// temperature converter

/*
fun main() {
    printFinalTemperature(initialMeasurement = 27.0, initialUnit = "Celsius", finalUnit = "Fahrenheit") {
        (9.0 * it) / 5.0 + 32.0
    }
}


fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double) -> Double
) {
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement)) // two decimal places
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}*/






// Song catalog

/*fun main() {
    val song = Song(title = "Title", artist = "Artist", yearPublished = 1000, playCount = 1000)
    song.songDescription()
}

class Song(
    val title: String,
    val artist: String,
    val yearPublished: Int,
    val playCount: Int,
) {
    val isPopular: Boolean
        get() = playCount >= 1000

    fun songDescription() {
        println("$title, performed by $artist, was released in $yearPublished and isPopular: $isPopular")
    }
}*/





//Internet profile



/*fun main() {
    val amanda = Person("Amanda", 33, "play tennis", null)
    val atiqah = Person("Atiqah", 28, "climb", amanda)

    amanda.showProfile()
    atiqah.showProfile()
}


class Person(val name: String, val age: Int, val hobby: String?, val referrer: Person?) {
    fun showProfile() {
        println("Name: $name")
        println("Age: $age")
        if (hobby != null)
            print("Likes to $hobby. ")
        if (referrer != null) {
            if (referrer.hobby != null)
                println("Has a referrer named ${referrer.name}, who likes to ${referrer.hobby}.")
            else
                println("Has a referrer named ${referrer.name}.")
        } else
            println("Doesn't have a referrer.")
    }
}*/





//Foldable phones



/*open class Phone(var isScreenLightOn: Boolean = false){
    open fun switchOn() {
        isScreenLightOn = true
    }

    fun switchOff() {
        isScreenLightOn = false
    }

    fun checkPhoneScreenLight() {
        val phoneScreenLight = if (isScreenLightOn) "on" else "off"
        println("The phone screen's light is $phoneScreenLight.")
    }
}

class FoldablePhone(var isFolded: Boolean = true) : Phone() {

    override fun switchOn() {
        isScreenLightOn = !isFolded
    }

    fun fold() {
        isFolded = true
    }

    fun unfold() {
        isFolded = false
    }
}


fun main() {
    val newFoldablePhone = FoldablePhone()

    newFoldablePhone.switchOn()
    newFoldablePhone.checkPhoneScreenLight()
    newFoldablePhone.unfold()
    newFoldablePhone.switchOn()
    newFoldablePhone.checkPhoneScreenLight()
}*/





//Special auction




/*fun main() {
    val winningBid = Bid(5000, "Private Collector")

    println("Item A is sold at ${auctionPrice(winningBid, 2000)}.")
    println("Item B is sold at ${auctionPrice(null, 3000)}.")
}

class Bid(val amount: Int, val bidder: String)

fun auctionPrice(bid: Bid?, minimumPrice: Int): Int {
    return bid?.amount ?: minimumPrice
}*/
