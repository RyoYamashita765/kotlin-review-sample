class Main {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println("Hello, World!")
        }
    }
}

interface Printer {
    fun print()

    fun printMessage(message: String)

    fun printMessageWithPrefix(message: String, prefix: String) {
        println("[$prefix] $message")
    }
}
