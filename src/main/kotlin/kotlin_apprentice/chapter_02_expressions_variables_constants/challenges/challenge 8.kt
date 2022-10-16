package kotlin_apprentice.chapter_02_expressions_variables_constants.challenges

/**
 * A circle is made up of 2π radians, corresponding with 360 degrees. Declare a constant degrees of type Double and
 * assign it an initial value. Calculate the corresponding angle in radians and store the result in a constant named
 * radians.
 */

import kotlin.math.*
fun main() {
    val degrees: Double = 28.0
    val radians = (PI * degrees) / 180
    println("$degrees to radians is $radians")
}