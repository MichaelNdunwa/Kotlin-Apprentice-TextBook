package kotlin_apprentice.chapter_04_basic_control_flow.challenges

import kotlin.math.pow

/***
 * 7. Print a table of the first 10 powers of 2.
 */

fun first10PowerOf2() {
    var power = 1
    for (p in 0..10) {
        if (p == 0) {
            println("2^$p => 1.")
        } else {
            power *= 2
            println("2^$p => $power.")
        }


    }
}

fun main() {
    first10PowerOf2()
}