package kotlin_apprentice.chapter_07_nullability.challenges

/***
 * Challenge 2: Divide and conquer
 * First, create a function that returns the number of times an integer can be divided by
 * another integer without a remainder. The function should return null if the division
 * doesn’t produce a whole number. Name the function divideIfWhole.
 * Then, write code that tries to extract the nullable result of the function. There should
 * be two cases: upon success, print "Yep, it divides $answer times", and upon
 * failure, print "Not divisible :[".
 *
 * Finally, test your function:
 * 1. Divide 10 by 2. This should print "Yep, it divides 5 times"
 * 2. Divide 10 by 3. This should print "Not divisible :["
 *
 * Hint 1: Use the following as the start of the function signature:
 *      fun divideIfWhole(value: Int, divisor: Int)
 * You’ll need to add the return type, which will be a nullable!
 *
 * Hint 2: You can use the modulo operator (%) to determine if a value is divisible by
 * another; recall that this operation returns the remainder from the division of two
 * numbers. For example, 10 % 2 = 0 means that 10 is divisible by 2 with no
 * remainder, whereas 10 % 3 = 1 means that 10 is divisible by 3 with a remainder of 1.
 */

private fun divideIfWhole(value: Int, divisor: Int): Int? {
    if (value % divisor == 0) return value / divisor
    return null
}


fun main() {
    val answer: Int? = divideIfWhole(10, 3)
    if (answer != null) {
        println("Yep, it divides $answer times.")
    } else {
        println("Not divisible 🙁")
    }
}

fun divideIfWholeA(value: Int, divisor: Int): String {
    return if ((value % divisor) == 0) {
        "Yep, it divides ${value / divisor} times."
    } else {
        "Not divisible :["
    }
}