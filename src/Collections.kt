
fun main() {
    val array:Array<String> = Array(3){""} // init array of strings
    array[0] = " Abraham"
    array[1] = "Cheng"
    array[2] = "Kim"
    for (i in 0..2) {
        print("${array[i]} ")
    }
    val msg = "${array[0]}, ${array[1]}" // string manipulation
    println(msg[2]) // print r
    println(msg.trim()) // remove space before the first word

    // immutable
    var imList = listOf("Cheng", "Kim")
    // imList.add(...) -> error
    var imMap = mapOf(1 to "Cheng", 2 to "Kim")
    // imMap[3] = "Abraham" -> error

    // mutable
    var list = mutableListOf("Cheng", "Abraham")
    list.add("Kim") // ok
}