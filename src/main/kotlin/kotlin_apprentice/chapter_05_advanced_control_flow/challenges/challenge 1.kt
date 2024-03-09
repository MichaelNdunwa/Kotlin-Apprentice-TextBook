package kotlin_apprentice.chapter_05_advanced_control_flow.challenges

/***
 * 1. In the following for loop, what will be the value of sum, and how many
 *  iterations will happen?
 */

fun main() {
    var iteration = 0
    var sum = 0
    for (i in 0..5) {
        sum += i
        iteration++
    }
    println("sum = $sum and  $iteration iterations.")
}