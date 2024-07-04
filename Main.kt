import java.sql.DriverManager
import java.sql.SQLException
import java.util.function.Consumer

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val bookDatabase = BookDatabase("jdbc:mysql://localhost:3306/test", "admin", "pass")
        val result = bookDatabase.selectAllBooks()
        result.forEach(Consumer { x: Map<String, String>? -> println(x) })
    }
}

open class DatabaseManager(private val url: String, private val username: String, private val password: String) {
    fun select(query: String?): List<Map<String, String>> {
        val output: MutableList<Map<String, String>> = ArrayList()
        try {
            DriverManager.getConnection(url, username, password).use { connection ->
                connection.createStatement().use { statement ->
                    statement.executeQuery(query).use { resultSet ->
                        val metaData = resultSet.metaData
                        while (resultSet.next()) {
                            val row: MutableMap<String, String> = HashMap()
                            for (i in 1..metaData.columnCount) {
                                row[metaData.getColumnName(i)] = resultSet.getString(i)
                            }
                            output.add(row)
                        }
                    }
                }
            }
        } catch (e: SQLException) {
            e.printStackTrace()
        }
        return output
    }
}

class BookDatabase(url: String, username: String, password: String) : DatabaseManager(url, username, password) {
    fun selectAllBooks(): List<Map<String, String>> {
        return select("SELECT * FROM books")
    }
}
