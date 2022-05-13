package xyz.azgcloudev.basics

//Member variables - Properties

fun main() {
    var aldair: Human = Human("Aldair", "Zamora")
    println(aldair.stateHobby())
    aldair.age = 26
    println(aldair.age)
}

class Human(firstName : String, lastName: String) {
    var age: Int? = null
    var hobby: String = "reading"

    var firstName: String? = null
    var lastName: String? = null

    init {
        this.firstName = firstName
        this.lastName = lastName
    }
    //Member constructors
    constructor (firstName: String, lastName: String, age: Int) : this(firstName, lastName) {
        this.age = age
    }

    // Member function
    fun stateHobby() {
        println("The hobby of $firstName\'s is $hobby")
    }

}