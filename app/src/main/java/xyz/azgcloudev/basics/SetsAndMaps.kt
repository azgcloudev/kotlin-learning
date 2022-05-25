package xyz.azgcloudev.basics

fun main() {

    // Sets removes duplicates (is not ordered)

    val fruits = setOf("Orange","Apple","Grape","Apple","Orange")
    println(fruits.size)
    println(fruits.toSortedSet())

    val newFruits = fruits.toMutableList()
    newFruits.add("Mango")
    newFruits.add("Watermelon")

    println(newFruits)
    println(newFruits.elementAt(3))



    // Maps hold data in key/value pairs
    val daysOfWeek = mapOf(1 to "Monday", 2 to "Tuesday", "wed" to "Wednesday", 4 to "Thursday", 'F' to "Friday")
    println(daysOfWeek['F']) // Prints the value of the Key: F
    println(daysOfWeek[2])

    for (key in daysOfWeek.keys) {
        println("$key is to ${daysOfWeek[key]}")
    }

    var myFruits = mapOf("Favorite" to Fruit("Orange",3.0), "OK" to Fruit("Apple", 2.0))
    println(myFruits["Favorite"])

    println(myFruits.size)
}

data class Fruit(val name: String, val price: Double)