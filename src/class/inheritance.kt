package `class`
// Class without open cannot be inherited
open class Animal(val name: String) {
    open fun sleep() = print("$name sleeps")
}
//The open qualifier is not required because the interface methods and properties are assumed to be overridden.
//Override method must have override qualifier
interface Pet {
    val name : String
    fun feed(food: String) = print("$name eats $food")
}

class Cat(name: String) : Animal(name), Pet {
    fun mew() = print("mew!")
    override fun sleep() = print("$name had a good sleep")
    override fun feed(food: String) = print("$name eats a lot of $food")
}
//If an abstract method has a default implementation, it does not necessarily need to be overridden. In that case, the process defined in the default implementation will be implemented
class Dog(override val name: String) : Pet

fun main() {
    val milk = Cat("Milk")
    println(milk.sleep())

    val shiro = Dog("Shiro")
    println(shiro.feed("beef"))
}