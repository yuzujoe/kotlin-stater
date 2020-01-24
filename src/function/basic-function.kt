package function

fun main() {
    print( add(1, 2))
}

fun add(num: Int, num2: Int) : Int {
    return  num + num2
}
// or　single function can omit return type
fun add2(num: Int, num2: Int) = num + num2
