package `basic-syntax`

//Read-only local variables are defined using the keyword val. They can be assigned a value only once.
fun readOnlyVal() {
    val a: Int = 1  // immediate assignment
    val b = 2   // `Int` type is inferred
    val c: Int  // Type required when no initializer is provided
    c = 3       // deferred assignment
    println("a = $a, b = $b, c = $c")
}

//Variables that can be reassigned use the var keyword:
fun reassginVal() {
    var x = 5 // `Int` type is inferred
    x += 1
    println("x = $x")
}

// Top Level variables
fun topLevelVal() {
    var pi = 3.14
    var x = 0

    fun incrementX() {
        x += 1
    }

    println("x = $x; PI = $pi")
    incrementX()
    println("x = $x; PI = $pi")
}

fun main() {
    readOnlyVal()
    reassginVal()
    topLevelVal()
}