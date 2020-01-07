package `basic-syntax`

//A reference must be explicitly marked as nullable when null value is possible.

fun parseInt(str: String): Int? {
    return str.toIntOrNull()
}

fun printProduct(arg1: String, arg2: String) {
    val x = parseInt(arg1)
    val y = parseInt(arg2)

    if (x != null && y != null) {
        println(x * y)
    } else {
        println("'$arg1' or '$arg2' is not a number")
    }
}

fun printArg(arg1: String, arg2: String) {
    val x = parseInt(arg1)
    val y = parseInt(arg2)

    if (x == null) {
        println("Wrong number format in arg1: '$arg1'")
        return
    }

    if (y == null) {
        println("Wrong number format in arg2: '$arg2'")
    }
}

fun  main() {
    printProduct("6", "7")
    printProduct("a", "7")
    printProduct("a", "b")

    printArg("6", "7")
    printArg("a", "7")
    printArg("99", "b")
}