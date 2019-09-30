
// decorator pattern
fun ArrayList<Int>.findMean(): Int {
    var sum = 0
    for (item in this)
        sum += item
    return sum / this.size
}

fun main() {
    val list = ArrayList<Int>()
    list.add(1)
    list.add(2)
    list.add(3)
    println("Mean is ${list.findMean()}")
}