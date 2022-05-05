package xyz.azgcloudev.basics

fun main() {
    var monthNumber: Int = 5

    when (monthNumber) {
        1 -> println("January")
        6 -> println("June")
        8 -> println("August")
        11 -> println("November")
        else -> println("Month not available")
    }


    //Validation  of ages
    var age: Int = 27

    when (age) {
        in 21..150 -> println("Now you may drink in the US")
        18,19,20 -> println("You may vote")
        16,17 -> println("You may drive")
        in 0..15 -> println("You're to young")
        else -> println("Incorrect age")
    }
}