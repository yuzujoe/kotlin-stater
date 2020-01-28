package `class`

// Class properties need to be initialized when an instance is created using a constructor or initializer,
// but they must be null-checked for each property reference, resulting in unreadable code.
// A mechanism for delaying the timing of initializing properties that cannot be initialized by instantiation
// by using the lateinit qualifier by using lazy initialization.
// However, note that you can only use mutable properties.
// Cannot be used for primitive properties such as Int type or Boolean
class Foo {
   lateinit var bar : String

    fun onCallBack(text : String) {
        bar = text
    }
}

//　!! operator should not be used in principle because it is a non-nullable type
fun countText(text: String?) = text!!.length

fun main() {
    val foo = Foo()
    println(foo.onCallBack("string"))

    countText(null)
}

