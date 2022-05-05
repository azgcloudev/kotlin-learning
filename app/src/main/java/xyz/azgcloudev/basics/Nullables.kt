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
        println(null)
    }

    // New method to determine if variable is null or not
    //Using the safe call operator
    var len2 = nullableName?.length
    println(len2)

    //Another option to do it is
    nullableName?.let {
//        println(it.length)
    }

    // The Elvis Operator
    // Assign a nullable variable to a non nullable one
    var newName = nullableName?: "default" // if nullableName is 'null' then newName will be 'default'; if it is not 'null' then the string will be assigned to newName
    println("newName value is: $newName")

    // non null assertion
    //it converts any value into non null type, if it is empty will throw an exception
    /* println(nullableName!!.lowercase()) */
}