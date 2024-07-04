object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        if (args.size > 0) {
            if (args.size > 1) {
                if (args.size > 2) {
                    println("Too many arguments")
                } else {
                    println("Two arguments")
                }
            } else {
                println("One argument")
            }
        } else {
            println("No arguments")
        }
    }
}
