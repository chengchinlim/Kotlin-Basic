
class MyThread(): Thread() {
    var threadName: String? = null
    constructor(tName: String): this() {
        this.threadName = tName
    }
    override fun run() {
        var count = 0
        while (count < 10) {
            println("$threadName Count: $count")
            count++
            sleep(1000)
        }
    }
}

fun main() {
    val t1 = MyThread("t1")
    t1.start()
    println("t1 starts")
    val t2 = MyThread("t2")
    t2.start()
    println("t2 starts")
    val t3 = MyThread("t3")
    t3.start()
    println("t3 starts")
    t3.join() // this lines makes sure the below line executes after t3 finished everything
    println("This executes last")
}