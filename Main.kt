fun main(args: Array<String>) {
    if (args.size < 1) {
        println("Hello, Kotlin!");
    } else {
        println("Hello, " + args[0] + "!");
        val answer = 42
        println("The answer is $answer")
    }
}
