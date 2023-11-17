package kotlin_apprentice.chapter_04_basic_control_flow.challenges

/**
 * 4. Given the coefficients a, b, and c, calculate the solutions to a quadratic equation with these coefficients. Take
 *      into accounts the different number of solutions (0, 1, or 2). If you need a math refresher, this Wikipedia
 *      article on the quadratic equation will help: https://en.wikipedia.org/wiki/Quadratic_formula.
 *  Note: Add import kotlin.math.sqrt to the top of your file to access the sqrt operation.
 */

import kotlin.math.*
fun quadraticEquation(a: Double, b: Double, c: Double): String {
    var (a, b, c) = Triple(a, b, c)
    // when a = 0: undefined.
    if (a == 0.0) return "undefined."

    // Solve for +:
    val plus = (-(b) + sqrt(b.pow(2) - 4 * a * c)) / (2 * a)
    val minus = (-(b) - sqrt(b.pow(2) - 4 * a * c)) / (2 * a)

    return "x1: $plus and x2: $minus"
}

fun main() {
    print("Enter a: ")
    val a = readLine()!!.toDouble()
    print("Enter b: ")
    val b = readLine()!!.toDouble()
    print("Enter c: ")
    val c = readLine()!!.toDouble()

    println(quadraticEquation(a, b, c))
}