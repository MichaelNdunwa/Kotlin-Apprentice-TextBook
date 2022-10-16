package kotlin_apprentice.chapter_02_expressions_variables_constants.challenges

/**
 * Consider the following code:
 *      val a: Int = 46
 *      val b: Int = 10
 *  Work out what answer when you add the following lines of code:
 */
fun main() {
    val a: Int = 46
    val b: Int = 10
    // 1
    val answer1: Int = (a * 100) + b // (46 * 100) + 10 = 4_600
    // 2
    val answer2: Int = (a * 100) + (b * 100) // (46 * 100) + (10 * 100) = 5_600
    // 3
    val answer3: Int = (a * 100) + (b / 10) // (46 * 100) + (10 / 10) = 4_601
}