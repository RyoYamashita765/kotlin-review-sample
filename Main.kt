fun main(args: Array<String>) {
    println("Hello World!")

    for (i in 0..(args.size - 1)) {
        println("Argument $i: ${args[i]}")
    }
}
