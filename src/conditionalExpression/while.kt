package conditionalExpression

fun main() {
    val condition = false
    while (condition) {
        print("while")
    }

    do {
        print("do-while")
    }while (condition)
}