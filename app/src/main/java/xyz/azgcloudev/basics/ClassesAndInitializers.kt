package xyz.azgcloudev.basics

fun main() {
    var aldair: Person = Person("Aldair", "Zamora") // Variable is assigned to the type 'Person'
    var defaultName: Person = Person()
    var onlyLastname: Person = Person(lastName = "Sykes")

    // Exercise 1
    var samsungS20Ultra: MobilePhone = MobilePhone("Android", "Samsung", "Galaxy S20 Ultra")
    var iphone13ProMax: MobilePhone = MobilePhone("iOS", "Apple", "iPhone 13 Pro Max")
}


// --- Classes ---

class Person (firstName: String = "John", lastName: String = "Doe") { // Parameters can have a predefined default value
    // this is the initializer block
    init {
        println("Person initilized with the firstname $firstName and the lastname $lastName")
    }
}

// Exercise 1

class MobilePhone (osName: String, brand: String, model: String) {

    init {
        println("This $brand phone has been initilized and the model is $model and is running the OS $osName !")
    }
}