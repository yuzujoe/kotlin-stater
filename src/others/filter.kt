package others

data class Fruit(val name: String, val price: Int)

fun main() {
    val fruits = listOf(Fruit("apple", 100), Fruit("orange", 120), Fruit("grape", 400))
//    The filter function selects only collections whose functions return true, and returns them as a new collection
    println(fruits.filter { it.price <= 200 })
}