package `class`

fun main() {
    val text : String? = null
//  The Elvis operator can be used in combination with a safe call in the sense that it determines a and returns b if a is null
    val length = text?.length ?: -1
    println(length)
}