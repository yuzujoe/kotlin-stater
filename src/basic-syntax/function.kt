package `basic-syntax`

//Function having two Int parameters with Int return type:
fun sum(a: Int, b: Int): Int {
    return a + b
}
//Function with an expression body and inferred return type:
fun inferredSum(a: Int, b: Int) = a + b

//Function returning no meaningful value:
fun printSum(a: Int, b: Int): Unit {
    println("`basic-syntax`.sum of $a and $b is ${a + b}")
}

//Unit return type can be omitted:
fun printOmitSum(a: Int, b: Int) {
    println("`basic-syntax`.sum of $a and $b is ${a + b}")
}


fun main() {
    print("`basic-syntax`.sum of 3 and 5 is ")
    println(sum(2, 3))
    println("`basic-syntax`.sum of 19 and 23 is ${inferredSum(19, 23)}")
    printSum(-1, 8)
    printOmitSum(-1, 8)
}