package kotlin_apprentice.chapter_02_expressions_variables_constants.challenges

/**
 * Declare two constants a and b of type Double and assign both a value. Calculate the average of a and b and store the
 * result in a constant named average.
 */
fun main() {
    val (a, b) = Pair(4.0, 9.0)
    val average = (a + b) / 2
    println(average)
}