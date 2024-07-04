public class Main {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println("Hello, World!")

            val subClass = Sub();
		    subClass.main(args);
        }
    }
}
