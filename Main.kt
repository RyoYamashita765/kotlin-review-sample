fun main(args: Array<String>) {
    println("Hello World!")

    when (args.size) {
        0 -> {
            println("No arguments")
        }
        1 -> {
            println("One argument")
        }
        else -> {
            println("More than one argument")
        }
    }
}
