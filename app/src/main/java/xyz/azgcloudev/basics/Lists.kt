package xyz.azgcloudev.basics

fun main() {

    //lists are inmutable
    val months = listOf("January","February","March")
    val anyTypes = listOf(1,2,3,true,false,"String")
    println(anyTypes.size)

    // COnvert to a mutable list
    val additionalMoths = months.toMutableList()
    val newMonths = arrayOf("April","May","June")
    additionalMoths.addAll(newMonths)
    additionalMoths.add("Juy")
    additionalMoths.add("August")
    println(additionalMoths)

    // Mutable list of a type
    val days = mutableListOf<String>("Monday", "Tuesday", "Wednesday")
    days.addAll(arrayOf("Thursday","Friday"))
    println(days)

    days.removeAt(2) // remove Wednesday
    println(days)

    // remove all
    days.removeAll(days) // remove all days (can specify another array with the elements to remove in the list
    println(days)
}