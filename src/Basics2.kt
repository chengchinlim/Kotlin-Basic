fun main() {
    var isKind = false
    var gpa = 3.3
    var isQualified = if (isKind && gpa > 3.0) 0 else 1
    println("isQualified: $isQualified")
    isQualified = when(gpa) {
        4.0 ->  {
            1
        }
        else -> 0
    }
    println("isQualified: $isQualified")

    for (i in 0..10 step 3) { // increment
        print("$i ") // 0 3 6 9
    }
    println()

    for (i in 10 downTo 0 step 2) { // decrement
        print("$i ") // 10 8 6 4 2 0
    }
    println()

    cheng@ for (i in 10 downTo 0 step 2) { // break outer loop with @
        for (j in 10 downTo 0 step 1) {
            if (j == 7) {
                break@cheng
            }
            println("i is $i j is $j")
        }
    }
}