
// class to only hold data without other methods
data class DataClass(val name: String, val id: Int)

fun main() {
    val data = DataClass("Cheng", 1)
    println(data.name)
    println(data.id)

}