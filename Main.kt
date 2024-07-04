fun main(args: Array<String>) {
    println("Hello World!")

    for (i in 1..(args.size)) {
        println("Argument $i: ${args[i - 1]}")
    }
}
