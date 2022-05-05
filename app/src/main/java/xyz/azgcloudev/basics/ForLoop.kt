package xyz.azgcloudev.basics

fun main() {

    //Prints from 1 to 10
    for (num in 1..10) {
        print(num)
    }

    print("\n") //line added for spacing

    //print from 11 to 20
    for (num in 11 until 20) {
        print("$num ")
    }

    print("\n")

    //Print from 30 to 21
    print("30 down to 21: ")
    for (num in 30 downTo 21) {
        print("$num ")
    }

    print("\n")

    //printing number in steps of 3
    for (i in 50..70 step 3) { // alternative: for (i in 50.until(70).step(3) )
        print("$i ")
    }

    print("\n")

    //Practice 1
    println("____Practice number 1____")
    for (i in 0..10000) {
        if ( i > 9000)
            print("IT'S OVER 9000!!!")
    }

    print("\n")

    //Practice 2
    var humidityLevel: Double = 80.0
    var humidity: String = "humid"

    while (humidity == "humid") {
        if ( humidityLevel >= 60) {
            println("Humidity level decrease")
            humidityLevel -= 5
        } else {
            println("It's comfy now")
            humidity = "comfy"
        }
    }

}