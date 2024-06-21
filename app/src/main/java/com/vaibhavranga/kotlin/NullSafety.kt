package com.vaibhavranga.kotlin

fun main() {

    //The variable text1 can have null value by typing ? in front of the data type

    var text1: String? = null
//    text1 = "The value of variable text1 is not null"

    //By typing ? before .length function we make sure that if the text1 is null the length of the
    //variable text1 will be printed as null and there won't be a null pointer exception
    //else if the value of variable text1 is not null the length of text1 will be printed

    println(text1?.length)

    //By typing !! before .length function we mean that if the value of text1 is null then there
    //will be a null pointer exception error eLse the length of text1 will get printed

    //println(text1!!.length)

    //By typing Elvis operator ?: we make sure that if the value of variable text1 is null then the
    //value after Elvis operator will be assigned to the variable text2 else if the variable text1
    //is not null then the value of text1 will be assigned to text2

    val text2 = text1 ?: "The value of variable text1 is null"

    println(text2)
}
