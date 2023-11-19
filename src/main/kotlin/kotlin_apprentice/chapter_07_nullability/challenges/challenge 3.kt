package kotlin_apprentice.chapter_07_nullability.challenges

/***
 * Challenge 3: Refactor and reduce
 * The code you wrote in the last challenge used if statements. In this challenge,
 * refactor that code to use the Elvis operator. This time, make it print "It divides X
 * times" in all cases, but if the division doesn’t result in a whole number, then X
 * should be 0
 */

private fun divideIfWhole(value: Int, divisor: Int): Int? {
    return if (value % divisor == 0) value / divisor else null
}

fun main() {
    val answer = divideIfWhole(10, 2) ?: 0
    println("It divides $answer times.")
}