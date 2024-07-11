public class Main {
    val siteUrl = "https://www.exmaple.com"
    private val userRepository = UserRepository()

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val circleRadius = 5.0
            val circleArea = 3.141592 * circleRadius * circleRadius
            println("Circle area is $circleArea")
        }
    }
}

class UserRepository {
    fun processUserProfile(profile: UserProfile) {
        println(profile.name.length)
    }
}

class UserProfile {
    var name: String? = null
}
