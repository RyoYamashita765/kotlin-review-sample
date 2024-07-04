public class Main {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println("Hello, World!")

            val sub = Sub();
		    sub.main(args);
        }
    }
}
