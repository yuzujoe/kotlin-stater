package conditionalExpression

fun main() {
    val score = 75
    when {
        score < 50 -> print("faling")
        score < 65 -> print("passing")
        score < 80 -> print("good")
        else -> print("excellent")
    }

    val fruit = "grape"
    val plant = when (fruit) {
        "potato", "carrot", "radish" -> "vegetable"
        "grape", "apple", "orange" -> {
            "fruit"
        }
        else -> "unknown"
    }

    print(plant)

    val fruits = Fruit.GRAPE
    val fruitName = when(fruits) {
        Fruit.APPLE -> "apple"
        Fruit.ORANGE -> "orange"
        Fruit.GRAPE -> "grape"
    }
    print(fruitName)

    val number = -10
    val type = when {
        number > 0 && number % 2 == 0 -> "positive even number"
        number < 0 && number % 2 == 0 -> "negative even number"
        number == 0 -> "zero"
        else -> "others"
    }

    print(type)
}

enum class Fruit {
    APPLE, ORANGE, GRAPE
}