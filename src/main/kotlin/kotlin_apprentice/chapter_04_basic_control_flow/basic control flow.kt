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

    // Encapsulating Variables:
    /***
     * Imagine you want to calculate the fee to charge your client. Here's the deal you've made:
     *      You earn $25 for every hour up to 40 hours, and $50 for every hour thereafter.
     */
    var hoursWorked = 45
    var price = 0
    if (hoursWorked > 40) {
        val hoursOver40 = hoursWorked - 40
        price += hoursOver40 * 50
        hoursWorked -= hoursOver40
    }
    price += hoursWorked * 25
    println("After calculating the hours you have worked i will pay you $${price}")


    // While Loops:
    var sum = 1
    while (sum < 1000) {
        sum += sum + 1
    }

    // Repeat-While Loops
    // do-while loop:
    sum = 1
    do {
        sum += sum + 1
    } while (sum < 1000)

    // Breaking out of a loop
    sum = 1
    while (true) {
        sum += sum + 1
        if (sum >= 1000) {
            break
        }
    }
}