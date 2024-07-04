fun main(args: Array<String>) {
    println("Arguments: ${args.joinToString()}")
    println("Environment: ${System.getenv().map { (k, v) -> "$k=$v" }.joinToString(", ")}")
    println("Properties: ${System.getProperties().map { (k, v) -> "$k=$v" }.joinToString(", ")}")

    println("Hello World!")

    val name = "kotlin"
    println("Hello $name!")
    println("Hello ${name.uppercase()}!")
}
