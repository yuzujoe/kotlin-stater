package function

fun main() {
    val fruits = listOf("apple", "orange", "grape")
    print(fruits.joinToString(prefix = "FRUIT: "))
}