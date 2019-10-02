
class Generic<T> (credit: T) {
    init {
        println("Credit: $credit" )
    }
}

fun <T> display(process: T) {
    println("Process: $process")
}

fun main() {
    Generic("Cheng")
    Generic(12345)
    Generic(1234.5)

    display(33)
    display("String")
}

