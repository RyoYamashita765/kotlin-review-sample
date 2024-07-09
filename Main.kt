fun processNames(names: List<String>): List<String> {
    val processedNames = mutableListOf<String>()
    for (name in names) {
        val processed = name.replaceFirstChar { it.uppercase() }.trim()
        processedNames.add(processed)
    }
    return processedNames
}

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val names = listOf("john ", " alice", "bob  ", "  carol")
        val result = processNames(names)
        println(result)
    }
}
