package `class`
//　data class cannot be inherited
data class User(val id: String, val name: String, val age: Int)

fun main() {
    val user1 = User("id-1", "Tarou", 30)
    val user2 = User("id-1", "Tarou", 30)
    println(user1 == user2)

    val user3 = User("id-2", "Hanako", 20)
    println(user3)
}