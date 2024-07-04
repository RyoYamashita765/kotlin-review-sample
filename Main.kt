public class Main {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println("Hello, World!")

            println("--------------------")
            val sub = Sub();
		    sub.main(args);
            println("--------------------")
        }
    }
}
