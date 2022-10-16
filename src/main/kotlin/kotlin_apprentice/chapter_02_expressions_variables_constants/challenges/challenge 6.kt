package kotlin_apprentice.chapter_02_expressions_variables_constants.challenges

/**
 * A temperature expressed in ℃ can be converted to ℉ by multiplying 1.8 then incrementing
 * by 32. In this challenge, do the reverse: convert a temperature from ℉ to ℃. Declare a
 * constant named fahrenheit of type Double and assign it a value. Calculate the corresponding
 * temperature in ℃ and store the result in a constant named celcius.
 */

fun main() {
    val fahrenheit = 4.0
    val celcius = (fahrenheit - 32) / 1.8

    println(celcius)
}