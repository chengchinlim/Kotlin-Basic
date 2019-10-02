package car

import java.util.*

open class Car(): Comparable<Car> {

    override fun compareTo(other: Car): Int {
        return this.name!!.compareTo(other.name!!)
    }

    var name: String? = null
    var price: Int? = 0

    constructor(name: String): this() { // this() means the initialization above
        this.name = name
    }

    // secondary constructor
    constructor(name:String, price:Int): this() {
        this.name = name
        this.price = price
    }

    init { // executes when an obj is created
        println("Car is created")
    }

    // need open to be override or inherited
    open fun getSecondHandPrice(): Int {
        return price!! / 2
    }
}

fun main() {
    val car1 = Car("Ford", 30000)
    val car2 = Car("Mazda")
    val car3 = Car("BMW")
    println(car2.name)
    println("Second hand price: ${car1.getSecondHandPrice()}")

    val list = arrayListOf(car1, car2, car3)
    list.sort()
    for (car in list) {
        println(car.name)
    }
}

