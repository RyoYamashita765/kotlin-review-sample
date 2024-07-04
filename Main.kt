fun main(args: Array<String>) {
    println("Hello World!")

    if (args.size >= 1) {
        println("Args: ${args.size}")
        println("Hello, [${args[0]}]!")
    }
}
