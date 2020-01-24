package function

fun main() {
    print(combine("apple", "orange"))
    print(combine("grape", "peach", "/"))
}

fun combine(str1: String, str2: String, separator: String= ","): String {
    return str1 + separator + str2
}