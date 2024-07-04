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

    fun get(key: String): String? {
        return cache[key]
    }
}

class Printer {
    fun print(message: String) {
        println(message)
    }
}
