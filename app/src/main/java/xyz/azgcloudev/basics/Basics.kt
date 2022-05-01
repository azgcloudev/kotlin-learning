package xyz.azgcloudev.basics

fun main() {

    // variable with var (is a mutable variable)
    var myName = "Aldair"
    //reassign a variable
    myName = "Antonio"

    //val variables are inmutable
    val lastName = "Zamora"


    // print
    print("hello kotlin " + myName)


    /* INTEGER TYPES */
    // Byte (8 bits); Short (16 bits); Int (32 bits); Long (64 bits)
    var myByte: Byte = 127
    var myShort: Short = 32767
    var myInt: Int = 2147483647
    var myLong: Long = 9_223_372_036_854_775_807 // underscore use to separate number blocks



    /* Floting points (Decimals) */
    // Float (32 bits); Double (64 bits)
    var myFloat: Float = 10.55F
    var myDouble: Double = 3.14152154523312



    /* Booleans */
    var isOriginal: Boolean = true
    isOriginal = false


    /* Character (char) */
    var myChar: Char = '$' //use single quotes


    /* Strings */
    val myString: String = "Hello World!"
    var firstCharacter: Char = myString[0]
    var lastCharacter: Char = myString[myString.length - 1]
    println("")
    println("First character is \"" + firstCharacter + "\"")
    println("The last character is: $lastCharacter")
    println("$myString.length is ${myString.length}")


    /* Arirthmetic operators
        + - * / %
    * */
    var sumResult: Long = 5 + 2
    var division: Double = sumResult / 2.0
    println(division)
    var multi: Long = sumResult * sumResult
    println(multi)
    println(division % 2)


    /* Comparison Operators */

}
