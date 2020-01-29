package others

fun main() {
    val str : String? = "aiueo"
    str?.let { printLength(str) }
}

fun printLength(text: String): Unit = print(text.length)