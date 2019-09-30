package car

class MiniCar: Car {
    var size: Int? = 0
    var type: String? = null
    constructor(name: String, price: Int, size: Int)
            : super(name, price) {
        this.size = size
    }
    constructor(name: String, price: Int, size: Int, type: String)
            : super(name, price) {
        this.size = size
        this.type = type
    }

    override fun getSecondHandPrice(): Int {
        return price!! / 3
    }
}

fun main() {
    val miniCar1 = MiniCar("Cooper", 50000, 1)
    val miniCar2 = MiniCar("I3", 60000, 2, "electric")
    println(miniCar1.size)
    println(miniCar2.getSecondHandPrice())
}