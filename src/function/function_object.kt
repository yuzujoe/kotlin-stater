package function

fun multiply(i1: Int, i2: Int) = i1 * i2

fun main() {
    // function object is a function object, and a reference to a defined function can be obtained with the :: operator and stored in a variable.
    val fl = ::multiply
    println(fl(2,3))

//    Anonymous functions can also be assigned to variables and are called function literals
    val f2 = fun (i1: Int, i2: Int) = i1 + i2
    println(f2(2, 3))
}