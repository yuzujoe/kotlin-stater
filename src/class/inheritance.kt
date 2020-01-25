package `class`
// Class without open cannot be inherited
open class Animal(val name: String) {
    fun sleep() = print("$name sleeps")
}
//
class Cat(name: String) : Animal(name) {
    fun mew() = print("mew!")
}

fun main() {
    val milk = Cat("Milk")
    print(milk.sleep())
}