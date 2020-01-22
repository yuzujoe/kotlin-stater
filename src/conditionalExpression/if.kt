package conditionalExpression

fun main() {
    val age = 20
    if (age >= 18) {
        print("you can vote for this election")
    } else {
        print("you con't vote for this election")
    }

    val number = 15
    val isEven = if (number % 2 == 0) "even" else "odd"
    print(isEven)
}