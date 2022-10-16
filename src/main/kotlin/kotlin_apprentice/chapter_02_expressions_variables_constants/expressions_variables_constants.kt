package kotlin_apprentice.chapter_02_expressions_variables_constants

import kotlin.math.*
fun main() {
    // String:
    println("Hello, Kotlin Apprentice reader!")

    // Expressions:
    println("2 + 6 = ${2 + 6}")
    println("10 - 2 = ${10 - 2}")
    println("2 * 4 = ${2 * 4}")
    println("24 / 3 = ${24 / 3}")

    // Decimal Numbers:
    println("22 / 7 ${22.0 / 7.0}")

    // The Remainder Operation:
    println("28 % 10 = ${28 % 10}")

    // using format specifier:
    println("28.0 % 10.0 = " + "%.0f".format(28.0 % 10.0))

    // Shift Operations:
    println("1 shift left 3 = ${1 shl 3}")
    println("32 shift right = ${32 shr 2}")

    // Increment and Decrement
    var counter: Int = 0
    println("counter is $counter")
    counter += 1
    println("counter is now $counter")
    counter -= 1
    println("counter is now $counter")
}