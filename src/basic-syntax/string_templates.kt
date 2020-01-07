package `basic-syntax`

import kotlin.text.replace as replace1

fun main() {
    var a = 1
    // simple name in template:
    val s1 = "a is $a"
    println(s1)

    a = 2
    // arbitrary expression in template:
    val s2 = "${s1.replace1("is", "was")}, but now is $a"
    println(s2)
}