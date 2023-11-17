package kotlin_apprentice.chapter_05_advanced_control_flow.mini_exercises

import kotlin.math.*

//mini exercises on for loop:

val range = 1..10
/**
 * 1. Create a constant named range and set it equal to a range starting at 1 and
 * ending with 10 inclusive. Write a for loop which iterates over this range and
 * prints the square of each number
 */
fun numberOne() {

    for (n in range) {
        println("$n^2 = ${n*n}")
    }
}


/**
 * 2. Write a for loop to iterate over the same range as in the exercise above and print
 * the square root of each number. You’ll need to type convert your loop constant
 */

fun numberTwo() {
    for (n in range) {
        println("√$n = " + "%.4f".format(sqrt(n.toDouble())) )
    }
}

fun main() {
    numberTwo()
}