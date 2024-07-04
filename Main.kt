import java.util.HashMap
import java.util.ArrayList

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val list = ArrayList<String>()
        list.add("Hello")
        list.add("World")
        list.add("!")

        val map = HashMap<String, String>()
        map["Hello"] = "World"
        map["Kotlin"] = "Java"
    }
}
