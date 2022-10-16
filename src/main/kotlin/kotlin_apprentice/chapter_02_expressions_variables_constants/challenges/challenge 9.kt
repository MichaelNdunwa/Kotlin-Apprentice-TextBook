package kotlin_apprentice.chapter_02_expressions_variables_constants.challenges

import kotlin.math.*

/**
 * Declare four constants named x1, y1, x2 and y2 of type Double. These constants represent the two-dimensional
 * coordinate of two points. Calculate the distance between these two points and store the result in a constants named
 * distance.
 */

fun main() {
    val x1 = 4.0
    val y1 = 8.0
    val x2 = 2.0
    val y2 = 6.0
    val dx = x2 - x1
    val dy = y2 - y1
    val distance = sqrt(dx * dx + dy * dy)
    println(distance)
}