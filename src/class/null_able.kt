package `class`

fun main() {
//  Null is allowed by adding? To the type
    val nullable : String? = "nullable property"
//  To use a method that accesses a nullable type variable, it is necessary to perform a null check
//  If a null check is performed, it can be treated as a non-nullable type
    if (nullable != null) {
        println(nullable.length)
    }
//  This form is the same as the previous form and is called the safe call operator.
    val test : String? = "orange"
    println(test?.length?.plus(1))
}