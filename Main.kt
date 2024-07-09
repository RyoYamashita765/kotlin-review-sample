class UserService(private val userRepository: UserRepository) {

    fun getUserById(id: Long) = userRepository.findById(id)

    fun createUser(name: String, email: String) {
        val user = User(name = name, email = email)
        userRepository.save(user)
    }

    fun updateUserEmail(id: Long, newEmail: String) =
        userRepository.findById(id)?.let { user ->
            user.email = newEmail
            userRepository.save(user)
        }

    fun deleteUser(id: Long) = userRepository.deleteById(id)

    fun searchUsers(query: String) = userRepository.search(query)
}
