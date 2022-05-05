package xyz.azgcloudev.basics

fun main() {

    var name : String = "Aldair"

    //    name = null --> COmpilation error

    var nullableName : String? = "Aldair"
    nullableName = null

    // Get the length of a variable and check if it is null first

    if (nullableName != null) {
        var len1 = nullableName.length
        println(len1)
    } else {
        //return null
        null
    }

    // New method to determine if variable is null or not
//    var len2 = nullableName?.length
//    println(len2)

}