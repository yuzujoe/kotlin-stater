package function

fun main() {
    print(combine("&", "apple", "orange", "grape"))
}
// If wanna be increase the string to be concatenated,  can use vararg
fun combine(separator: String, vararg strings: String) : String {
    val builder = StringBuilder()

    for (str in strings) {
        builder.append(str).append(separator)
    }

    return  builder.removeSuffix(separator).toString()
}

// this case is occur error no value passed for parameter separator
fun combine2( vararg strings: String, separator: String,) : String {
    val builder = StringBuilder()

    for (str in strings) {
        builder.append(str).append(separator)
    }

    return  builder.removeSuffix(separator).toString()
}