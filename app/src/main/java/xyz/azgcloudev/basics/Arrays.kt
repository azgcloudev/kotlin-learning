package xyz.azgcloudev.basics

fun main() {

    val numbers: IntArray = intArrayOf(1, 2, 3, 4, 5, 6, 7)
    // var numbers = intArrayOf(1,2,3,4,5,6,7)
    // var numbers = arrayOf(1,2,3,4,5,6,7)

    println(numbers.contentToString()) // prints: [1, 2, 3, 4, 5, 6, 7] the array as a String

    for (element in numbers) {
        print("$element ")
    }

    // modify the element of an specific index
    numbers[0] = 100
    numbers[3] = 34

    println("\n${numbers.contentToString()}")

    var days = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    println(days.contentToString())

    var fruits = arrayOf(Fruits("Apple", 3.5), Fruits("Banana", 1.99))
    println(fruits.contentToString())
    println(fruits[0].name)
    for (fruit in fruits) {
        println(fruit.name)
    }
}

data class Fruits(var name: String, var price: Double)