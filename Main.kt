object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        var result = ""
        if (args.size == 0) {
            result = "Hello, World!"
        } else {
            result = "Hello, ${args[0]}!"
        }
        println(result)
    }
}
