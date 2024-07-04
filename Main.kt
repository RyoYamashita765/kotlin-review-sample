class Main {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println("Hello, World!")
        }
    }
}

class Dummy {
}

class Cache {
    val cache = mutableMapOf<String, String>()
    fun set(key: String, value: String) {
        cache[key] = value
    }
}

class Printer {
    fun print() {
        println("Hello, World!")
    }
}
