package xyz.azgcloudev.basics.challanges

import kotlin.properties.Delegates

fun main() {
    var battery1: MobilePhone = MobilePhone("iOS", "Apple", "iPhone")
    battery1.chargeBattery(30)
}

class MobilePhone(osName: String, brand: String, model: String) {

    var battery: Int = 50

    init {
        println("The phone $model from $brand uses $osName as its Operating System")
    }

    constructor(osName: String, brand: String, model: String, battery: Int) :  this(osName, brand,model) {
        this.battery = battery
    }

    fun chargeBattery(newChargeAmount: Int) {
        //battery before charge
        println("The battery before charge was: $battery.")

        //operation for new charge
        var newBatCharge = battery + newChargeAmount

        // battery charged amount
        var batCharged = newBatCharge - battery
        println("The amount of battery charged was: $batCharged.")

        // new battery amount
        println("New battery charge is $battery.")
    }

}