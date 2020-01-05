

//The is operator checks if an expression is an instance of a type. If an immutable local variable or property is checked for a specific type, there's no need to cast it explicitly:

fun getStringLength(obj: Any): Int? {
    if (obj is String) {
        // `obj` is automatically cast to `String` in this branch
        return obj.length
    }
    return null
}
//or
//fun getStringLength(obj: Any): Int? {
//    if (obj !is String) return null
//
//    // `obj` is automatically cast to `String` in this branch
//    return obj.length
//}

//or even
//fun getStringLength(obj: Any): Int? {
//    // `obj` is automatically cast to `String` on the right-hand side of `&&`
//    if (obj is String && obj.length > 0) {
//        return obj.length
//    }
//
//    return null
//}

fun main() {
    fun printLength(obj: Any) {
        println(message = "'$obj' string length is ${getStringLength(obj) ?: "...err, not a sting"}")
    }
    printLength("Incomprehensibilities")
    printLength(1000)
    printLength(listOf(Any()))
}