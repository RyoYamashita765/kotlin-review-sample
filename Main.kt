fun main(args: Array<String>) {
    when (args.size + 1) {
        1 -> println("No arguments")
        else -> {
            println("One or more arguments")
            println("arguments size: ${args.size}")
            println("arguments[0]: ${args[0]}")
        }
    }
}
