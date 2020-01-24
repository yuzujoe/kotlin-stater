package function
//　Lambda expressions can create objects more concisely than anonymous functions
//  If the type of the type is clear, the type can be omitted.
fun main() {
    println(calc { i1, i2 -> i1 * i2 })

//    If the lambda expression has only one return value, you can omit the argument and specify it instead of that value
    val numbers = listOf(180, 120, 200, 250, 300)
    println(numbers.filter { it < 250 })
}

fun calc(operation: (Int, Int) -> Int) {
    val result = operation(3,4)
    print(result)
}