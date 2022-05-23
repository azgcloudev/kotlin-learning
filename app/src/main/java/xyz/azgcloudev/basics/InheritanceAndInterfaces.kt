package xyz.azgcloudev.basics

//INTERFACES

interface Driveable {
    val maxSpeed: Double
    fun drive() : String
    fun brake(): String {
        return "Driveable is breaking!"
    }
}

// Super CLass, Parent Class, Base class
open class Car(val name: String, val brand: String, override val maxSpeed: Double) : Driveable {

    open var range: Double = 0.0

    fun extendedRange(amount: Double) {
        if (amount > 0) {
            range += amount
        }
    }

    open fun drive(distance: Double) {
        println("Drove for $distance km")
    }

    override fun drive() : String {
        return "Drivable is driving"
    }
}



// SUb Class, child class or derived class from Car class
class ElectricCar(name: String, brand: String, batteryLife: Double, maxSpeed: Double) : Car(name,brand, maxSpeed) {
    //**This class can use the function drive from the Super Class**

    // Override a parent class variable
    override var range: Double = batteryLife * 4 // the variable must be open in the parent class

    //Override a function (must be open in the parent class)
    override fun drive(distance: Double) {
        println("Drove for $distance KM on electricity")
    }
}
// Any class inherits from the Any Class

fun main() {
    var teslaY = ElectricCar("Y", "Tesla", 85.0, 250.0)
    var merGTR = Car("GTR", "Mercedez Benz", 300.0)

    merGTR.drive(200.0)
    teslaY.drive(400.0)

    println(merGTR.drive())
    println(teslaY.brake())
}