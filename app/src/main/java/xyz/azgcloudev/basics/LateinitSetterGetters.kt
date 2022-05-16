package xyz.azgcloudev.basics


fun main() {
    var aldairBike: Motorcycle = Motorcycle()

    aldairBike.tyreBrand = "Michelin"
    println("Tyre brand is: ${aldairBike.tyreBrand}")
    println(aldairBike.brand)
    println(aldairBike.year)
    aldairBike.year = 2015
    println(aldairBike.year)
    println("The type of 'year' is: ${aldairBike.year::class.simpleName}")
}

class Motorcycle() {

    // lateinit = create a variable and then it can be initialize later
    lateinit var tyreBrand: String

    // getter
    var brand: String = "HONDA"
    get() {
        return field.lowercase()
    }

    var year: Int = 2012
        get() = field
        set(value) {
            value.toInt()
            field = value
        }
}