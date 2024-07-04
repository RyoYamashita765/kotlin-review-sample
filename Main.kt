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

    fun get(key: String): String? {
        return cache[key]
    }
}

class Printer {
}
