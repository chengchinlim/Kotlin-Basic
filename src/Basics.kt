import java.util.*

fun main() {
    val name = "Cheng"
    println("My name is $name")

    // declare name: String? if want null in the beginning
    // but when call it use name!! to throw exception if it is null (not assigned)
    // !! means should not be null

//    val text: String = readLine()!!.toString()
//    println("The text is $text")

    // debug condition, if condition meets then debug

    println(Calendar.getInstance().get(Calendar.YEAR))

    val grade = 77
    // below both run, it's inclusive both ways
    if (grade in 72..77) {
        println("B")
    }
    if (grade in 77..80) {
        println("B+")
    }

    // when -> switch case in Java
//    when (readLine()!!.toInt()) {
//        1 -> {
//            println("It is 1")
//        }
//        2  -> {
//            println("It is 2")
//        }
//        else -> {
//            println("Nothing")
//        }
//    }
}