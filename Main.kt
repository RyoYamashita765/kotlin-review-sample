fun main(args: Array<String>) {
    println("Arguments: ${args.joinToString()}")
    println("Environments: ${System.getenv().size}")
    println("Properties: ${System.getProperties().size}")

    println("Hello World!")

    val name = "kotlin"
    println("Hello, $name!")
    println("Hello, ${name.uppercase()}!")
}
