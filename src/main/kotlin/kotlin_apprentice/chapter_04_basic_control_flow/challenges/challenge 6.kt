package kotlin_apprentice.chapter_04_basic_control_flow.challenges

import kotlin.math.log2

/***
 * 6. Given a number as a Double value, determine if this number is a power of 2.
 *
 * Hint: You can use log2(number) to find the base 2 logarithm of number.
 * log2(number) will return a whole number if number is a power of two. Add
 * import kotlin.math.log2 to the top of your file to use log2.
 * You can also solve the problem using a loop and no logarithm.
 */


// There are several ways to determine if a number is a power of 2.
// Division by 2,
// Binary Representation,
// Bitwise Operation,
// Logarithm.


class Challenge6(val number: Double) {

    // Division by 2:
    fun divisionBy2(): String {
        var counter = 0
        var calculate = number
        if (number < 0.0) return "$number is not a power of 2."
        for (n in 0..number.toInt()) {
            calculate /= 2.0
            counter++
            if (calculate == 1.0) return "$number is a power of 2, 2^$counter"
        }
        return "$number is not a power of 2."
    }

    // Binary Representation
    fun binaryRepresentation(): String {
        val inputValue = number
        if (inputValue <= 0) return "$inputValue is not a power of 2."

        val digits = mutableListOf<Int>()
        var number = number.toInt()
        while (number > 0) {
            digits.add(number % 2)
            number /= 2
        }

        val binary = digits.reversed()
        if (binary[0] != 1) return "$inputValue is not a power of 2."
        for (i in 1 until binary.size) {
            if (binary[i] != 0) return "$inputValue is not a power of 2."
        }
        return "$inputValue is a power of 2."

    }

    // Using bitwise operations:
    fun bitwise(): String {
        val number = number.toInt()
        if (number <= 0) return "$number is not a power of 2."
        return if (number and (number - 1) == 0) {
           "$number is a power of 2."
        } else {
           "$number is not a power of 2."
        }
    }

    // Logarithm Method:
    fun logarithm(): String {
        val log = log2(number)
        return if (log == log.toInt().toDouble()) {
            "$number is a power of 2, i.e 2^${log.toInt()}"
        } else {
            "$number is not a power of 2."
        }
    }
}

fun main() {
    val number = 8.0

    val divisionBy2Method = Challenge6(number).divisionBy2()
    println(divisionBy2Method)

    val binaryRepresentation = Challenge6(number).binaryRepresentation()
    println(binaryRepresentation)

    val bitwise = Challenge6(number).bitwise()
    println(bitwise)

    val logarithm = Challenge6(number).logarithm()
    println(logarithm)
}