package kotlin_apprentice.chapter_02_expressions_variables_constants.challenges

import kotlin.math.PI

/**
 * A circle is made up of 2π radians, corresponding with 360 degrees. Declare a constant degrees of type Double and
 * assign it an initial value. Calculate the corresponding angle in radians and store the result in a constant named
 * radians.
 */

// convert degree to radian:
fun Double.radian(): Double {
    val degree = this
    return degree * (PI / 180)
}

// convert radian to degree:
fun Double.degree(): Double {
    val radian = this
    return radian * (180 / PI)
}

fun main() {
    val degree = 60
    val radian = degree.toDouble().radian()
    println("${degree}° to Radian: ${"%.4f".format(radian)}rad")
    println("${radian}rad to Degree: ${degree}°")

    println("%.4f".format(1.0472.degree()))
}