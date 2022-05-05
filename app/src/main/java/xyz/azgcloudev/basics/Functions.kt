package xyz.azgcloudev.basics

fun main() {
    myFunction()
    myFunction()
    var result: Int = addUp(4, 7)
    println(result)
    println("The average of is: " + numAverage(32.toDouble(), 53.toDouble()))

}


fun addUp(a: Int, b: Int) : Int {
    return a + b
}

fun myFunction() {
    println("From my function")
}

//function average of 2 values
fun numAverage(n1: Double, n2: Double) : Double {
    return (n1 + n2) / 2
}