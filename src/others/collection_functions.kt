package others

data class Fruit(val name: String, val price: Int)

fun main() {
    val fruits = listOf(Fruit("apple", 100), Fruit("orange", 120), Fruit("grape", 400))
//  The filter function selects only collections whose functions return true, and returns them as a new collection
    fruits.filter { it.price <= 200 }
        .forEach { println("$it") }
//  map function applies the passed function to each element of the collection to create another collection
    println(fruits.map { (it.price * 1.08).toInt() })
//  map and filter functions can be combined
    println(fruits.filter { it.price < 200 }
        .sortedBy { it.name }
        .map { "${it.name}:${it.price}" })

    println(fruits.maxBy { it.price })
    println(fruits.minBy { it.price })
//  find is a nullable type
    println(fruits.find { it.name == "orange" })

    fruits.forEach { println("$it") }
}