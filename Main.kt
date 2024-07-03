fun main(args: Array<String>) {
    when (args.size + 1) {
        1 -> println("No arguments")
        else -> {
            println("Arguments:")
            for (arg in args)
                println(arg)
        }
    }
}
