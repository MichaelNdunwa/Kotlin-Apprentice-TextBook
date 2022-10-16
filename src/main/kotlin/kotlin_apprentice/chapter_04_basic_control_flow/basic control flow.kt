package kotlin_apprentice.chapter_04_basic_control_flow

fun main() {
    val yes = true
    val no = false

    // Boolean Operators:
    val doesOneEqualTwo = (1 == 2)
    val doesOneNotEqualTwo = (1 != 2)
    val alsoTrue = !(1 == 2)

    val isOneGreaterThanTwo = (1 > 2)
    val isOneLessThanTwo = (1 < 2)

    val and = true && true
    val or = true || false

    val andTrue = 1 < 2 && 4 > 3
    val andFalse = 1 < 2 && 3 > 4

    val orTrue = 1 < 2 || 3 > 4
    val orFalse = 1 == 2 || 3 == 4

    val andOr = (1 < 2 && 3 > 4) || 1 < 4

    // String Equality
    val guess = "dog"
    val dogEqualsCat = guess == "cat"
    val order = "cat" < "dog"

    // The if expression

    if (2 > 1 ) {
        println("Yes, 2 is greater than 1.")
    }

    // The else expression

    val animal = "Fox"
    if (animal == "Cat" || animal == "Dog") {
        println("$animal is a house pet.")
    } else {
        println("$animal is not a house pet.")
    }

    val a = 5
    val b = 10

    val min: Int = if (a < b) a else b

    val max: Int = if (a > b) a else b

    // The else-if expression:

    val hourOfDay = 12
    val timeOfDay = if (hourOfDay < 6) {
        "Early morning"
    } else if (hourOfDay < 12) {
        "Morning"
    } else if (hourOfDay < 17) {
        "Afternoon"
    } else if (hourOfDay < 20) {
        "Evening"
    } else if (hourOfDay < 24) {
        "Late evening"
    } else {
        "INVALID HOUR!"
    }
    println(timeOfDay)
}