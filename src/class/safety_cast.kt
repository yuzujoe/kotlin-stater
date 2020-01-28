package `class`
//　Check the property type with the is operator before casting
fun printText(text: CharSequence) {
    if (text is String) {
        val s : String = text as String
        println(s)
    }
}

//　 as? operation check the property type
fun printCase(text: CharSequence) {
    val s : String = text as? String ?: return
    print(s)
}