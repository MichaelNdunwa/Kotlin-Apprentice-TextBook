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

fun numberThree() {
    /***
     * 3. Above, you saw a for loop which iterated over only the even rows like so:
     *
     * sum = 0
     * for (row in 0 until 8) {
     *      if (row % 2 == 0) {
     *          continue
     *      }
     *      for (column in 0 until 8) {
     *          sum += row * column
     *      }
     * }
     *
     * Change this to use a step clause on the first for loop to skip even rows instead of
     * using continue. Check that the sum is 448 as in the initial example.
     */

    var sum = 0
    for (row in 1 until 8 step 2) {
        println(row)
        for (column in 0 until 8) {
            sum += row * column
        }
    }
    println("sum is $sum")
}

fun main() {
    numberThree()
}