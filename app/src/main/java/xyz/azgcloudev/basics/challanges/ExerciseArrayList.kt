package xyz.azgcloudev.basics.challanges

fun main() {

    // Initialize the array list
    var numList: ArrayList<Double> = ArrayList<Double>()

    // list that contains the numbers to be added to the array list
    val numbers: List<Double> = listOf(2.0,45.6,2.6,5.3,84.2)

    // add the list to the arraylist
    numList.addAll(numbers)

    var averageSum: Double = 0.0

    for (number in numList) {
        averageSum += number
    }


    var result: Double = averageSum / numList.size

    println("The average of the numbers in $numList is $result")
}