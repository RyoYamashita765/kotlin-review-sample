class Main {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println("Hello, World!")
            val printer = Printer();
        }
    }
}

class Printer {
    fun print() {
        println("Hello, World!")
        println("(from Printer)")
    }
}
