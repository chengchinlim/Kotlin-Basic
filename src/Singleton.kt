
class Singleton private constructor() {
    var name: String? = null

    init {
        println("Instance is created")
    }
    companion object {
        // lazy means if the instance is already created
        // then reuse the same instance
        val instance:Singleton by lazy { Singleton() }
    }
}

fun main() {
    val s1 = Singleton.instance
    s1.name = "Cheng"
    println(s1.name)

    val s2 = Singleton.instance
    println(s2.name)
}