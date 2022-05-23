package xyz.azgcloudev.basics

// Always need to have one parameter at least
data class User(val id: Long, var name: String)

fun main() {
    var user1 = User(1, "Aldair")
    println(user1)
    println(user1.name)
    //data class can be edited
    user1.name = "Antonio"
    println(user1.name)

    //copy data class
    var user2 = user1.copy(name = "Jared")

    //equals function
    println(user1.equals(user2)) // can also be write: user1 == user2

    //Access data using components as per order
    println(user2.component2())
}