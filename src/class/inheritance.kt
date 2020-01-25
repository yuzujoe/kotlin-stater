package `class`
// Class without open cannot be inherited
open class Animal(val name: String) {
    open fun sleep() = print("$name sleeps")
}
//
class Cat(name: String) : Animal(name) {
    fun mew() = print("mew!")
    override fun sleep() = print("$name had a good sleep")
}

fun main() {
    val milk = Cat("Milk")
    print(milk.sleep())
}