fun main() {
    val x = 10
    val y = 9
    if (x in 1..y+1) {
        println("fits in range")
    }

    val list = listOf<String>("a", "b", "c")

    if (-1 !in 0..list.lastIndex) {
        println("-1 is out of range")
    }

    if (list.size !in list.indices) {
        println("list size is out of valid list indices range, too")
    }
//    Iterating over a range:
    for (z in 1..5) {
        print(z)
    }

//  or over a progression:
    for (g in 1..10 step 2) {
        print(g)
    }
    println()
    for (g in 9 downTo 0 step 3) {
        print(g)
    }
}