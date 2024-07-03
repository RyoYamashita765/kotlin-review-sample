fun main() {
    val answer = 42
    when (answer - 1) {
        41 -> {
            println(answer + 1)
        }
        else -> println("The answer is not 42.")
    }
}
