public class Main {
    val siteUrl = "https://www.exmaple.com"
    private val userRepository = UserRepository()

    companion object {
        @JvmStatic
        fun main() {
            val circleRadius = 5.0
            val circleArea = 3.141592 * circleRadius * circleRadius
            println("Circle area is $circleArea")
        }
    }
}

class UserRepository {
    fun getUserById(id: Int): User {
        return User(id, "John Doe")
    }
}
