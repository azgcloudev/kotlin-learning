package xyz.azgcloudev.basics

fun main() {

    // lambda expression to sum two numbers
    var sum:(Int, Int) -> Int = {a: Int, b: Int -> a + b}
    println(sum(4,6))

    //another syntax
    var sum1 = {a: Int, b: Int -> println(a+b)}

    println(add2numbers(4,5))
}

// regular function to sum two numbers

fun add2numbers(a: Int, b: Int) : Int {
    return a + b
}