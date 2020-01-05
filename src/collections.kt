fun main() {
    val items = listOf("apple", "banana", "kiwifruit", "avocado")
    forCollection(items)
    whenCollection(items)
    filterCollection(items)
}
// iterating over a collection
fun forCollection(items: List<String>) {
    for (items in items) {
        println(items)
    }
}
//  checking if a collection an object using in operator
fun whenCollection(items: List<String>) {
    when {
        "orange" in items -> println("juicy")
        "apple" in items -> println("apple is fine too")
    }
}

// using lambda expressions to filter and map collections
fun filterCollection(items: List<String>) {
    items
        .filter { it.startsWith("a") }
        .sortedBy { it }
        .map { it.toUpperCase() }
        .forEach { println(it) }
}