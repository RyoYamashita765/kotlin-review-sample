fun main(args: Array<String>) {
    println("Hello World!")

    when (args.size + 1) {
        0 -> {
            println("No arguments")
        }
        2 -> {
            println("One argument")
            println("Argument: ${args[0]}")
        }
        else -> {
            println("More than one argument")
            println("Arguments: ${args.joinToString()}")
        }
    }
}
