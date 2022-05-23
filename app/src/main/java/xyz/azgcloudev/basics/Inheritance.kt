package xyz.azgcloudev.basics


// Super CLass, Parent Class, Base class
open class Car(name: String, brand: String) {
    open var range: Double = 0.0

    fun extendedRange(amount: Double) {
        if (amount > 0) {
            range += amount
        }
    }

    open fun drive(distance: Double) {
        println("Drove for $distance km")
    }
}

// SUb Class, child class or derived class from Car class
class ElectricCar(name: String, brand: String, batteryLife: Double) : Car(name,brand) {
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
    var teslaY = ElectricCar("Y", "Tesla", 85.0)
    var merGTR = Car("GTR", "Mercedez Benz")

    merGTR.drive(200.0)
    teslaY.drive(400.0)
}