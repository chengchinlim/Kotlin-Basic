
fun main() {
    val timesTwo = { x: Int ->
        println("Execute whatever")
        x * 2
    }
    println(timesTwo(5)) // 10

    val list = (1..10).toList()
    fun Int.even() = this % 2 == 0
    println(list.filter { it.even() }) // 'it' iterates the elements in the loop

    fun Int.addOne() = this + 1
    println(list.map{ it.addOne() }) // apply to each element

    val nestedList = listOf(
        (1..10).toList(),
        (11..20).toList(),
        (21..30).toList()
    )

    println(nestedList.map { it.sortedDescending() })

    // all elements in sub-lists are combined to become a list
    println(nestedList.flatMap { it.sortedDescending() })

    println(list.take(3)) // 1,2,3
    println(list.drop(3)) // 4,5 ... 10

    val myList = listOf("Hi", "Cheng", "Yay", "Hahaha")
    println(myList.zip(myList.map { it.length > 4 })) // combine two data sets into pairs

    val data = mapOf(
        "users1.csv" to listOf(32, 45, 17, -1, 34),
        "users2.csv" to listOf(19, -1, 67, 22),
        "users3.csv" to listOf(),
        "users4.csv" to listOf(56, 32, 18, 44)
    )

    // Challenge
    println(data.flatMap { it.value }.filter { it > 0 }.average()) // find average

    val hasFault = { intList: List<Int> ->
        intList.size != intList.filter { it > 0 }.size
    }
    println(data.filter { hasFault(it.value) }.keys)

    println(data.flatMap { it.value }.filter { it < 0 }.count())
}