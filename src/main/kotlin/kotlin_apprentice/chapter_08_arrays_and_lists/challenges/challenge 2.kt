package kotlin_apprentice.chapter_08_arrays_and_lists.challenges

/***
 * 2. Write a function that removes the first occurrence of a given integer from a list of
 * integers. This is the signature of the function:
 *
 * fun removeOne(item: Int, list: List<Int>): List<Int>
 */

fun removeOne(item: Int, list: List<Int>): List<Int> {
    var list = list
    list -= item
    return list
}

fun main() {
    println(removeOne(1, listOf(3, 4, 5, 1, 3, 1, 4)).joinToString())
}