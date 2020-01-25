package `class`

class Person(val name: String, var age: Int) {
    fun isAdult() = age >= 20
    val initial get() = name.first()
//  custom setter
    var mailAddress : String = ""
        set(account: String) {
            field = "$account@yahoo.co.jp"
        }
}

fun main() {
    val p = Person("Tarou", 29)
    println(p.isAdult())
}