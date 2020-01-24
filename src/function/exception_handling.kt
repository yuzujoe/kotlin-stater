package function

import java.lang.NumberFormatException

fun main() {
    divide(5,0)
    toInt("123a")
}
//You can throw in an if expression
fun divide(left: Int, right: Int) : Int =
    if (right != 0)
        left / right
    else
        throw IllegalAccessException("can not divide by zero")

fun toInt(numberText: String) =
    try {
        Integer.parseInt(numberText)
    } catch (e: NumberFormatException) {
        println(null)
    }