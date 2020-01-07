package `basic-syntax`
fun maxOf(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}

//In Kotlin, if can also be used as an expression:
//fun `basic-syntax`.maxOf(a: Int, b: Int) = if (a > b) a else b

fun main() {
    println("max of 0 and 42 is ${maxOf(0, 42)}")
    println("max of 42 and 0 is ${maxOf(42, 0)}")
}