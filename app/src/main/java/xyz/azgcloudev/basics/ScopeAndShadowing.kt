package xyz.azgcloudev.basics

var c = 11

fun main() {
    myFunction(5)
    // b = 10  --> this cannot be done because b is not in the same block (inside curly brackets)
    println(c) // 'c' is accessible by all functions because is outside and in the main file
}

// This 'a' is a parameter and not a variable
fun myFunction(a: Int) {
    // a = 6 --> a cannot be reassigned to 6 since it is not a variable
    println(a) // here the parameter is printed
    var a = a // variable is assigned with the value of the parameter 'a'
    a = 10
    var b: Int = 101
    println(a)
}