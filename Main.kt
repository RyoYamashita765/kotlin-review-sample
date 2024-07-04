class Main {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println("Printer:")
            val printer = Printer();
        }
    }
}

class Printer {
    fun print() {
        println("Hello, Kotlin World!")
        println("(from Printer)")
    }
}
