package kotlin_apprentice.chapter_04_basic_control_flow.challenges


class Challenge3() {

    init {
        // In each of the following statements, what is the value of the Boolean answer constant?

        val answer1 = true && true  // true
        val answer2 = false || false // false
        val answer3 = (true && 1 != 2) || (4 > 3 && 100 < 1)  // true (the idea of short-circuiting
        val answer4 = ((10 / 2) > 3) && ((10 % 2) == 0)  // true

        println("""
            answer1 = $answer1
            answer2 = $answer2
            answer3 = $answer3
            answer4 = $answer4
        """.trimIndent())
    }
}

fun main() {
    Challenge3()

}