package kotlin_apprentice.chapter_08_arrays_and_lists

fun addList(input: List<Int>): Int {
    /***
     * Write a function that takes a list of integers as its input and returns the sum of its elements:
     */

    var sum = 0
    input.forEach { sum += it }
    return sum
}


/***
 * Mini-exercise
 * Write a for loop that prints the players’ names and scores.
 */
fun phoneAndScore(phones: List<String>, scores: List<Int>) {
   /* for ((index, phone) in phones.withIndex()) {
        println("$phone score: ${scores[index]}")
    }*/

    phones.forEachIndexed {index, phone ->
        println("$phone's score is ${scores[index]}")
    }
}
fun main() {
    val phones = listOf("Samsung", "Tecno", "Infinix", "Itel", "Iphone")
    val scores = listOf(2, 2, 8, 6, 1)

    for (phone in phones) {
        println(phone)
    }
    println("\n")

    for (phone in phones) {
        println("${phones.indexOf(phone) + 1}. $phone")
    }

    println("\nwithIndex() function")
    for ((index, phone) in phones.withIndex())  {
        println("$index. $phone")
    }

    println("\nforEachIndexed {}")
    phones.forEachIndexed { index, phone ->
        println("$index. $phone")
    }

    println("\nThe sum of $scores is ${addList(scores)}")

    println("\n")
    phoneAndScore(phones, scores)
}