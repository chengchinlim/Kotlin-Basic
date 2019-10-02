import java.io.FileReader
import java.io.FileWriter
import java.lang.Exception

fun writeToFile(str: String) {
    try {
        val fw = FileWriter("output.txt")
        fw.write(str)
        fw.close()
    } catch (e: Exception) {
        e.printStackTrace()
    }
}

fun readFromFile() {
    try {
        val fr = FileReader("output.txt")
        var c: Int?
        do {
            c = fr.read()
            print(c.toChar())
        } while (c != 1)
    } catch (e: Exception) {
        e.printStackTrace()
    }
}

fun main() {
//    writeToFile("Cheng")
    readFromFile()
}