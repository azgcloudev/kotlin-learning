package xyz.azgcloudev.basics

import kotlin.math.max


abstract class Mammal(private val name: String, private val weight: Double, private val origin: String) {

    // Abstract property (Must be overridden by Subclasses)
    abstract var maxSpeed: Double

    // Abstract Methods (Must be implemented by Subclasses)
    abstract fun run()
    abstract fun breath()

    // Concrete (non abstract) method
    fun displayDetails() {
        println("Name; $name, Origin: $ $origin, Weight: $weight, " + "Max Speed: ${maxSpeed}")
    }
}

class Human2(name: String, weight: Double, origin: String, override var maxSpeed: Double) : Mammal(name,  weight, origin) {

    override fun run() {
        println("Run with 2 legs")
    }

    override fun breath() {
        println("Breath with trunk")
    }
}

class Horse(name: String, weight: Double,origin: String, override var maxSpeed: Double) : Mammal(name, weight, origin) {

    override fun run() {
        println("Run with 4 legs")
    }

    override fun breath() {
        println("Breath with nose")
    }

}



fun main() {
    var horse = Horse("Mack", 103.0, "US", 60.0)

    var aldair = Human2("Aldair", 72.0, "CR", 20.5)

    horse.run()
    aldair.run()
    aldair.breath()
    horse.breath()
}