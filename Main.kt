class UserService {
    private val userRepository = UserRepository()
    private val emailService = EmailService()

    fun registerUser(username: String, email: String) {
        if (userRepository.isEmailTaken(email)) {
            throw IllegalArgumentException("Email is already registered")
        }

        val user = User(username, email)
        userRepository.save(user)
        emailService.sendWelcomeEmail(email)
    }
}

class UserRepository {
    fun isEmailTaken(email: String): Boolean {
        val user = SampleDatabase.findUserByEmail(email)
        return user != null
    }

    fun save(user: User) {
        SampleDatabase.saveUser(user)
    }
}

class EmailService {
    fun sendWelcomeEmail(email: String) {
        SampleClient.sendEmail(email, "Welcome to our service!")
    }
}

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val userService = UserService()
        userService.registerUser("johndoe", "john@example.com")
    }
}
