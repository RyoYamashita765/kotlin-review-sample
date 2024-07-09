open class Logger {
    fun log(message: String) {
        println("Logging: $message")
    }
}

class FileLogger : Logger() {
    fun saveToFile(fileName: String) {
        println("Saving to file: $fileName")
    }
}

class NetworkLogger : Logger() {
    fun sendToServer(url: String) {
        println("Sending to server: $url")
    }
}

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val fileLogger = FileLogger()
        fileLogger.log("File log message")
        fileLogger.saveToFile("log.txt")

        val networkLogger = NetworkLogger()
        networkLogger.log("Network log message")
        networkLogger.sendToServer("http://example.com")
    }
}
